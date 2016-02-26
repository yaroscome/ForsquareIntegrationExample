package com.yrs.forsquareintegrationexample.features.search;

import android.os.Bundle;

import com.yrs.forsquareintegrationexample.R;
import com.yrs.forsquareintegrationexample.base.BaseActivity;

public class SearchActivity extends BaseActivity implements SearchContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }

    @Override
    public void showResults() {

    }
}
