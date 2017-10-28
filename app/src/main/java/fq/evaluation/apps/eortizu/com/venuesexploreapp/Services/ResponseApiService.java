package fq.evaluation.apps.eortizu.com.venuesexploreapp.Services;


import java.util.List;

import fq.evaluation.apps.eortizu.com.venuesexploreapp.Models.ObjectResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.Query;

//service for the Foursquare api
public interface ResponseApiService {

    @GET("v2/venues/explore?v=20141016")
    Call<ObjectResponse> getResponseObject(@Query("ll") String lat,

                                                 @Query("typesection") String typeSection,
                                                 @Query("limit") String limit,
                                                 @Query("client_id") String CLIENT_ID,
                                                 @Query("client_secret") String CLIENT_SECRET);
}
