package com.example.michaelmonty.first_android_app_monty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.location.Location;
import android.location.LocationManager;



public class MainActivity extends AppCompatActivity {

    private static final String DEBUG_TAG = "First-android-app-Monty";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(savedInstanceState != null){
            Log.d("STATE", savedInstanceState.toString());
        }
        Log.d("CREATION", "onCreate() is being executed");
        Log.i(DEBUG_TAG, "In the onCreate() method of the MyFirstAndroidAppActivity Class");

        getLocation();
        setContentView(R.layout.activity_main);
    }

    public void getLocation() {
    try {
        LocationManager locMgr = (LocationManager)
            this.getSystemService(LOCATION_SERVICE);
        Location recentLoc = locMgr.getLastKnownLocation(LocationManager.GPS_PROVIDER);
        Log.i(DEBUG_TAG, "loc: " + recentLoc.toString());
         }
    catch (Exception e) {
        Log.e(DEBUG_TAG, "Location failed", e);
    }
}


}
