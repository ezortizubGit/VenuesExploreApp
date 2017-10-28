package fq.evaluation.apps.eortizu.com.venuesexploreapp;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

import fq.evaluation.apps.eortizu.com.venuesexploreapp.Models.Groups.Place.Place;
import fq.evaluation.apps.eortizu.com.venuesexploreapp.Models.ObjectResponse;
import fq.evaluation.apps.eortizu.com.venuesexploreapp.Models.Response;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    public static final String KEY_LAT="LAT";
    public static final String KEY_LON="LON";
    public static final String KEY_OBJECT_RESPONSE ="KEY_OBJECT_RESPONSE" ;
    private GoogleMap mMap;
    private double latitude;
    private double longitude;
    private LatLng currentPosition;
    private Response response=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        //getting object from main activity
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            response= (Response) bundle.getSerializable(KEY_OBJECT_RESPONSE);
            latitude=(double) bundle.getDouble(KEY_LAT);
            longitude=(double) bundle.getDouble(KEY_LON);
        }

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        int status= GooglePlayServicesUtil.isGooglePlayServicesAvailable(getApplicationContext());
        if(status== ConnectionResult.SUCCESS){
            SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.map);
            mapFragment.getMapAsync(this);
        }
        else{
            Dialog dialog=GooglePlayServicesUtil.getErrorDialog(status,(Activity)getApplicationContext(),10);
            dialog.show();
        }



    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        //Toast.makeText(getApplicationContext(),"Lat: "+latitude+"Lon: "+longitude,Toast.LENGTH_LONG).show();
        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        UiSettings uiSettings=mMap.getUiSettings();
        uiSettings.setZoomControlsEnabled(true);

        currentPosition= new LatLng(latitude, longitude);
        long zoom=16;
        mMap.addMarker(new MarkerOptions().position(currentPosition).title(getString(R.string.current_position)));
        LatLng position;
        for(Place place:response.getGroups().get(0).getPlaces()){
            position=new LatLng(place.getVenue().getLocation().getLat(),place.getVenue().getLocation().getLng());
            mMap.addMarker(new MarkerOptions().position(position).title(place.getVenue().getName()).
                    icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        }

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(currentPosition,zoom));
    }
}
