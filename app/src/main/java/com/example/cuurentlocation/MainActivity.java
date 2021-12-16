package com.example.cuurentlocation;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.locationupdate.BaseActivity;
import com.example.locationupdate.CurrentLocationListener;


public class MainActivity extends BaseActivity implements CurrentLocationListener {

    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        new BaseActivity(this);
    }

    @Override
    public void currentLocation(double latitude, double longitude) {
        textView.setText("Latitude: " + latitude + "\n" + "Longitude: " + longitude);
    }
}
