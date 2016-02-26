package com.yrs.forsquareintegrationexample;

import android.app.Application;

import com.yrs.forsquareintegrationexample.commons.SimpleInjection;

/**
 * Created by yaros on 26/02/16.
 */
public class AppEnvironment extends Application {

    public final SimpleInjection injection = new SimpleInjection();

    public SimpleInjection getInjection() {
        return injection;
    }
}
