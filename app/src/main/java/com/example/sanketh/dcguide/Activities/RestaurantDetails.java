package com.example.sanketh.dcguide.Activities;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.button.MaterialButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sanketh.dcguide.R;
import com.example.sanketh.dcguide.models.Restaurants;

import java.util.List;

public class RestaurantDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_details);

        if (getActionBar() != null)
            getActionBar().setDisplayHomeAsUpEnabled(true);

        ImageView restaurantImage = findViewById(R.id.restaurant_cover);
        TextView restaurantInfoText = findViewById(R.id.restaurant_info_text_view);
        MaterialButton restaurantContactButton = findViewById(R.id.restaurant_contact_button);
        MaterialButton restaurantLocationButton = findViewById(R.id.restaurant_location_button);
        TextView restaurantTimingsText = findViewById(R.id.restaurant_timing_text_view);
        MaterialButton restaurantBookingButton = findViewById(R.id.restaurant_booking_button);
        MaterialButton restaurantSiteButton = findViewById(R.id.restaurant_site_button);

        Bundle bundle = getIntent().getExtras();
        Restaurants restaurants = null;
        if (bundle != null)
            restaurants = bundle.getParcelable("restaurantData");

        if (restaurants != null) {

            setTitle(restaurants.getRestaurantName());
            restaurantImage.setImageResource(restaurants.getRestaurantPhoto());
            restaurantInfoText.setText(restaurants.getRestaurantInfo());
            restaurantTimingsText.setText(restaurants.getRestaurantTimings());

            final Restaurants finalRestaurants = restaurants;
            restaurantContactButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + finalRestaurants.getRestaurantContact()));
                    if (verifyIntent(callIntent))
                        startActivity(callIntent);
                }
            });


            restaurantLocationButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=" + finalRestaurants.getRestaurantName() + ", " + finalRestaurants.getRestaurantLocation()));
                    if (verifyIntent(mapIntent))
                        startActivity(mapIntent);
                }
            });

            restaurantBookingButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent orderWebPageIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(finalRestaurants.getRestaurantBooking()));
                    if (verifyIntent(orderWebPageIntent))
                        startActivity(orderWebPageIntent);
                }
            });

            restaurantSiteButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent webPageIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(finalRestaurants.getRestaurantSite()));
                    if (verifyIntent(webPageIntent))
                        startActivity(webPageIntent);
                }
            });
        }
    }

    public boolean verifyIntent(Intent intent) {

        PackageManager packageManager = getPackageManager();
        List<ResolveInfo> activities = packageManager.queryIntentActivities(intent, 0);
        return activities.size() > 0;
    }
}
