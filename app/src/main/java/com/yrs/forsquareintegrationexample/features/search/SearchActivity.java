package com.yrs.forsquareintegrationexample.features.search;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import com.yrs.forsquareintegrationexample.AppEnvironment;
import com.yrs.forsquareintegrationexample.R;
import com.yrs.forsquareintegrationexample.base.BaseActivity;
import com.yrs.forsquareintegrationexample.models.Venue;
import com.yrs.forsquareintegrationexample.ui.SearchAutocompleteTextView;

import java.util.List;

public class SearchActivity extends BaseActivity implements SearchContract.View {

    private SearchAutocompleteTextView searchAutocompleteTextView;
    private SearchListViewAdapter searchListViewAdapter;
    private AppEnvironment app;
    private SearchContract.ActionListener actionListener;
    private ImageButton searchImageButton;
    private ListView venuesListView;
    private List<Venue> venuesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        app = (AppEnvironment) getApplication();
        actionListener = new SearchPresenter(this, app.getInjection().getForsquareConnector());
        searchImageButton = (ImageButton) findViewById(R.id.search_button_imagebutton);
        searchAutocompleteTextView = (SearchAutocompleteTextView) findViewById(R.id.venue_search_searchAutocompleteEditText);
        venuesListView = (ListView) findViewById(R.id.venues_listView);
        venuesListView.setEmptyView(findViewById(R.id.venues_empty_list));
        //searchListViewAdapter =
        if(venuesList != null && !venuesList.isEmpty()) venuesListView.setAdapter(searchListViewAdapter);
//        searchAutocompleteTextView.setOnEditorActionListener(new TextView.OnEditorActionListener() {
//            @Override
//            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
//                return false;
//            }
//        });
    }


    public void doSearchQuery(View view) {
        actionListener.getVenues("London", searchAutocompleteTextView.getText().toString());
    }





    @Override
    public void showResults(List<Venue> venuesList) {
        if(venuesList != null && !venuesList.isEmpty()) {
            searchListViewAdapter = new SearchListViewAdapter(
                    this,
                    android.R.layout.simple_list_item_1,
                    venuesList);

            venuesListView.setAdapter(searchListViewAdapter);

            searchListViewAdapter.notifyDataSetChanged();
        }
    }
}
