package com.yrs.forsquareintegrationexample.features.splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yrs.forsquareintegrationexample.R;
import com.yrs.forsquareintegrationexample.features.search.SearchActivity;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
    }

    @Override
    protected void onStart() {
        super.onStart();
        try {
            Thread.sleep(3000);
            startActivity(new Intent(this, SearchActivity.class));
            finish();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
