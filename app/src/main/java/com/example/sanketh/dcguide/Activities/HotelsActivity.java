package com.example.sanketh.dcguide.Activities;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sanketh.dcguide.Fragments.HotelsFragment;
import com.example.sanketh.dcguide.R;


public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_container);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new HotelsFragment()).commit();
    }
}
