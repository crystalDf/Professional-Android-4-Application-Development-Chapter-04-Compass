package com.star.compass;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;


public class CompassActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compass);

        CompassView compassView = (CompassView) findViewById(R.id.compassView);
        compassView.setBearing(45);
    }

}
