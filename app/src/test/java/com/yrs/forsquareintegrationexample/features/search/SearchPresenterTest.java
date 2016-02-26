package com.yrs.forsquareintegrationexample.features.search;

/**
 * Created by yaros on 26/02/16.
 */
import com.yrs.forsquareintegrationexample.commons.SimpleInjection;
import com.yrs.forsquareintegrationexample.models.Venue;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyListOf;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import org.mockito.MockitoAnnotations;

import java.util.List;

/**
 * Created by yaros on 26/02/16.
 */
public class SearchPresenterTest {

    private SimpleInjection injection;

    private SearchContract.ActionListener searchPresenter;

    @Mock
    private SearchContract.View searchView;

    @Before
    public void setupSearchPresenter() {
        MockitoAnnotations.initMocks(this);
        injection = new SimpleInjection();

        searchPresenter = new SearchPresenter(searchView, injection.getForsquareConnector());
    }

    @Test
    public void searchResults_showSearchResults() {
        searchPresenter.getVenues("London", "Coffee");

        verify(searchView, never()).showResults(anyListOf(Venue.class));
    }


}
