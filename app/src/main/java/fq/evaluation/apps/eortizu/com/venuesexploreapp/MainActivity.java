package fq.evaluation.apps.eortizu.com.venuesexploreapp;
//libraries
import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;
import fq.evaluation.apps.eortizu.com.venuesexploreapp.Adapters.PlacesListAdapter;
import fq.evaluation.apps.eortizu.com.venuesexploreapp.Models.ObjectResponse;
import fq.evaluation.apps.eortizu.com.venuesexploreapp.Services.ResponseApiAdapter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements LocationListener, Callback<ObjectResponse> {
    //fields

    public static final String KEY_LAT="LAT";
    public static final String KEY_LON="LON";
    public static final String KEY_OBJECT_RESPONSE ="KEY_OBJECT_RESPONSE" ;

    private final int LOCATION_PERMISSION=1;
    private LocationManager locationManager;
    private String provider;
    private double latitude;
    private double longitude;
    private RecyclerView recyclerView;
    private ObjectResponse objectResponse;
    private PlacesListAdapter recyclerViewAdapter;
    private boolean menuButtonFlag;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        verifingPermissions();
        //Checking if device has internet connection
        if(isNetworkAvailable()) {
            setContentView(R.layout.activity_main);
            recyclerViewCreate();
            menuButtonFlag=true;//flag to set menu button enabled
        }else {

            Toast.makeText(this, String.valueOf(R.string.noInternetText), Toast.LENGTH_LONG).show();
            setContentView(R.layout.activity_no_info_obtained);
            menuButtonFlag=false;
        }
        //getting response from API
        gettingDataFromApi();

    }

    private boolean isNetworkAvailable(){
        ConnectivityManager connectivityManager=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo=connectivityManager.getActiveNetworkInfo();

        return networkInfo!=null && networkInfo.isConnected();

    }
    //setting the view to show the places info
    private void recyclerViewCreate() {

        recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerViewAdapter=new PlacesListAdapter();
        recyclerView.setAdapter(recyclerViewAdapter);


    }

    @Override
     public boolean onCreateOptionsMenu(Menu menu){


        getMenuInflater().inflate(R.menu.bar_menu,menu);
        return super.onCreateOptionsMenu(menu);
     }
     @Override
     public boolean onOptionsItemSelected(MenuItem menuItem){


         switch (menuItem.getItemId()){
             case R.id.show_map_menu_button:
                 if(!menuButtonFlag){
                     menuItem.setEnabled(false);
                 }
                 else {
                     showMap();
                 }
                 return true;
             default:
                 return super.onOptionsItemSelected(menuItem);
         }

     }

     //Method to start maps activity
    private void showMap(){
        Intent intent = new Intent(MainActivity.this, MapsActivity.class);
        //giving objects to use in Maps activity
        Bundle bundle=new Bundle();
        bundle.putSerializable(KEY_OBJECT_RESPONSE,objectResponse.getResponse());
        bundle.putDouble(KEY_LAT,latitude);
        bundle.putDouble(KEY_LON,longitude);

        intent.putExtras(bundle);

        startActivity(intent);
    }
    //Check permissions for access Location
    //if permissions are not granted, request the user for get them
    private void verifingPermissions() {
        if(ActivityCompat.checkSelfPermission(this,Manifest.permission.ACCESS_FINE_LOCATION)==PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(this,Manifest.permission.ACCESS_COARSE_LOCATION)==PackageManager.PERMISSION_GRANTED){
            startLocationManager();
            getLocation();
        }
        else
        {
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION,Manifest.permission.ACCESS_COARSE_LOCATION},
                    LOCATION_PERMISSION);
        }
    }
    //getting data from Fourquare API
    private void gettingDataFromApi() {
        String ll = String.format(String.valueOf(latitude) + "," + String.valueOf(longitude));
        Call<ObjectResponse> response =
                ResponseApiAdapter.getApiService().getResponseObject(ll,
                        "arts",
                        "100",
                        getResources().getString(R.string.CLIENT_ID),
                        getResources().getString(R.string.CLIENT_SECRET));

        response.enqueue(this);
    }

    //Location permissions are verified here
    //if they are granted, get the Location
    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String permissions[], int[] grantResults) {
        super.onRequestPermissionsResult(requestCode,permissions,grantResults);
        if(requestCode==LOCATION_PERMISSION)
        {
            if(grantResults.length==1 && grantResults[0]==PackageManager.PERMISSION_GRANTED)
            {
                startLocationManager();
                getLocation();
                //Toast.makeText(this,"Permissions Granted",Toast.LENGTH_SHORT).show();
                //Toast.makeText(this, "Lg: " + longitude + " La: " + latitude, Toast.LENGTH_LONG).show();
            }
        }
    }

    public void startLocationManager() {
        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        Criteria criteria = new Criteria();
        criteria.setAccuracy(Criteria.ACCURACY_FINE);
        provider = locationManager.getBestProvider(criteria, true);


        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            locationManager.requestLocationUpdates(provider, 10000, 10, this);
        }else
        {
            Toast.makeText(this,String.valueOf(R.string.noLocalizationPermissions), Toast.LENGTH_SHORT).show();
        }

    }
    // getting latitude and longitude from the location provider GPS or Network
    public void getLocation() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        Location location = locationManager.getLastKnownLocation(provider);
        if(location!=null){
            latitude=location.getLatitude();
            longitude=location.getLongitude();
        }
    }

    //when location changed, get the new current location
    @Override
    public void onLocationChanged(Location location) {
        if(location!=null){
            latitude=location.getLatitude();
            longitude=location.getLongitude();
        }
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }

    //methods onResponse and onFailure when response is successful
    //get the models and set the object response and the recycler view up with the information
    @Override
    public void onResponse(Call<ObjectResponse> call, Response<ObjectResponse> response) {
        if(response.isSuccessful()){
            objectResponse=response.body();
            recyclerViewAdapter.setPlaces(objectResponse.getResponse().getGroups().get(0).getPlaces());

        }
    }
    //if response fail show a message with the error
    @Override
    public void onFailure(Call<ObjectResponse> call, Throwable t) {
        Toast.makeText(this,t.getMessage(),Toast.LENGTH_SHORT).show();
    }
}
