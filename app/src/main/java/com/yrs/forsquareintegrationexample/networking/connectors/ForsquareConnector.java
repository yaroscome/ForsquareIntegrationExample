package com.yrs.forsquareintegrationexample.networking.connectors;

import com.yrs.forsquareintegrationexample.networking.responses.SearchVenuesNearPlaceResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by yaros on 26/02/16.
 */
public interface ForsquareConnector {

    @GET("search")
    Call<SearchVenuesNearPlaceResponse> searchVenuesNearPlace(
            @Query("client_id") String forsquare_id,
            @Query("client_secret") String forsquare_secret,
            @Query("v") String version,
            @Query("near") String near,
            @Query("limit") String limit,
            @Query("query") String query
    );

//    @GET("suggestcompletion")
//    Call<VenuesSuggestCompletionResponse> getSuggestCompletion(
//            @Query("client_id") String forsquare_id,
//            @Query("client_secret") String forsquare_secret,
//            @Query("v") String version,
//            @Query("near") String near,
//            @Query("query") String query
//    );
}
