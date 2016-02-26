package com.yrs.forsquareintegrationexample.features.search;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.yrs.forsquareintegrationexample.AppEnvironment;
import com.yrs.forsquareintegrationexample.R;
import com.yrs.forsquareintegrationexample.base.BaseActivity;
import com.yrs.forsquareintegrationexample.ui.SearchAutocompleteTextView;

public class SearchActivity extends BaseActivity implements SearchContract.View {

    private SearchAutocompleteTextView searchAutocompleteTextView;
    private AppEnvironment app;
    private SearchContract.ActionListener actionListener;
    private ImageButton searchImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        app = (AppEnvironment) getApplication();
        actionListener = new SearchPresenter(this, app.getInjection().getForsquareConnector());
        searchImageButton = (ImageButton) findViewById(R.id.search_button_imagebutton);
        searchAutocompleteTextView = (SearchAutocompleteTextView) findViewById(R.id.venue_search_searchAutocompleteEditText);

        searchAutocompleteTextView.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                return false;
            }
        });
    }


    public void doSearchQuery(View view) {
        actionListener.getVenues("London", searchAutocompleteTextView.getText().toString());
        
    }




    @Override
    public void showResults() {

    }
}
