package com.example.sanketh.dcguide.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.sanketh.dcguide.Fragments.PlacesFragment;
import com.example.sanketh.dcguide.R;

public class PlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_container);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, new PlacesFragment()).commit();
    }
}
