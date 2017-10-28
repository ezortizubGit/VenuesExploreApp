package fq.evaluation.apps.eortizu.com.venuesexploreapp.Services;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//API adapter
public class ResponseApiAdapter {
    //baseUrl of Foursquare venues recommendation api
    private static final String baseUrl="https://api.foursquare.com/";

    private static ResponseApiService API_SERVICE;


    public static ResponseApiService getApiService(){

        //HttpLoggingInterceptor loggingInterceptor=new HttpLoggingInterceptor();
        //loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        //OkHttpClient.Builder httpClient=new OkHttpClient.Builder();
        //httpClient.addInterceptor(loggingInterceptor);
        if(API_SERVICE==null){
            Retrofit retrofit=new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
          //          .client(httpClient.build())
                    .build();
            API_SERVICE=retrofit.create(ResponseApiService.class);
        }

        return API_SERVICE;

    }

}
