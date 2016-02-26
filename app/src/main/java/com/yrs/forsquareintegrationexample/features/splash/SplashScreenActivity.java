package com.yrs.forsquareintegrationexample.features.splash;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yrs.forsquareintegrationexample.R;
import com.yrs.forsquareintegrationexample.base.BaseActivity;
import com.yrs.forsquareintegrationexample.features.search.SearchActivity;

public class SplashScreenActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


    }

    @Override
    protected void onStart() {
        super.onStart();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(SplashScreenActivity.this, SearchActivity.class);
                startActivity(intent);
                SplashScreenActivity.this.finish();
            }
        }, 1200);

    }
}
