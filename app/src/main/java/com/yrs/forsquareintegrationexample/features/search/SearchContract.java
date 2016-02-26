package com.yrs.forsquareintegrationexample.features.search;

/**
 * Created by yaros on 26/02/16.
 */
public interface SearchContract {
    interface View {
        void showResults();

    }

    interface ActionListener {
        void getVenues(String near, String query);

    }
}
