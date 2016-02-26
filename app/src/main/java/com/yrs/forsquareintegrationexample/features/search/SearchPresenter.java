package com.yrs.forsquareintegrationexample.features.search;

import android.util.Log;

import com.yrs.forsquareintegrationexample.BuildConfig;
import com.yrs.forsquareintegrationexample.models.Venue;
import com.yrs.forsquareintegrationexample.networking.connectors.ForsquareConnector;
import com.yrs.forsquareintegrationexample.networking.responses.SearchVenuesNearPlaceResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by yaros on 26/02/16.
 */
public class SearchPresenter implements SearchContract.ActionListener {

    private SearchContract.View searchView;
    private ForsquareConnector forsquare;

    public SearchPresenter(SearchContract.View searchView, ForsquareConnector forsquare) {
        this.searchView = searchView;
        this.forsquare = forsquare;
    }

    @Override
    public void getVenues(String near, String query) {
        String limit = "10";

        Call<SearchVenuesNearPlaceResponse> searchCall = forsquare.searchVenuesNearPlace(
                BuildConfig.FORSQUARE_ID,
                BuildConfig.FORSQUARE_SECRET,
                BuildConfig.FORSQUARE_VERSION,
                near,
                limit,
                query);

        searchCall.enqueue(new Callback<SearchVenuesNearPlaceResponse>() {
            @Override
            public void onResponse(Call<SearchVenuesNearPlaceResponse> call, Response<SearchVenuesNearPlaceResponse> response) {

                Log.d(BuildConfig.DEV_TAG, "Response code " + response.code());
                if(response.isSuccess()) {

                    SearchVenuesNearPlaceResponse body = response.body();

                    List<Venue> venuesList = response.body().getResponse().getVenueList();
                    for(Venue v: venuesList) {
                        Log.d(BuildConfig.DEV_TAG, ": " + v);
                    }


                } else {
                    Log.d(BuildConfig.DEV_TAG, "Response error " + response);
                }

            }

            @Override
            public void onFailure(Call<SearchVenuesNearPlaceResponse> call, Throwable t) {
                Log.d(BuildConfig.DEV_TAG, "Response failed");
            }
        });
    }


}
