package com.yrs.forsquareintegrationexample.features.search;

import com.yrs.forsquareintegrationexample.models.Venue;

import java.util.List;

/**
 * Created by yaros on 26/02/16.
 */
public interface SearchContract {
    interface View {
        void showResults(List<Venue> venuesList);

    }

    interface ActionListener {
        void getVenues(String near, String query);

    }
}
