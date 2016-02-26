package com.yrs.forsquareintegrationexample.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.ProgressBar;

/**
 * Created by yaros on 26/02/16.
 */
public class SearchAutocompleteTextView extends AutoCompleteTextView {

    private Context context;
    private ProgressBar loadingIndicator;

    public SearchAutocompleteTextView(Context context) {
        super(context);
    }

    public SearchAutocompleteTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SearchAutocompleteTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setLoadingIndicator(ProgressBar view) {
        loadingIndicator = view;
    }

    @Override
    protected void performFiltering(CharSequence text, int keyCode) {
        // the AutoCompleteTextview is about to start the filtering so show
        // the ProgressPager
        loadingIndicator.setVisibility(View.VISIBLE);
        super.performFiltering(text, keyCode);
    }

    @Override
    public void onFilterComplete(int count) {
        // the AutoCompleteTextView has done its job and it's about to show
        // the drop down so close/hide the ProgreeBar
        loadingIndicator.setVisibility(View.INVISIBLE);
        super.onFilterComplete(count);
    }
}
