package com.example.sanketh.dcguide.Activities;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.button.MaterialButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.sanketh.dcguide.R;
import com.example.sanketh.dcguide.models.Hotels;

import java.util.List;


public class HotelDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_details);
        TextView timing = findViewById(R.id.details_timing_text_view);
        timing.setVisibility(View.GONE);


        if (getActionBar() != null)
            getActionBar().setDisplayHomeAsUpEnabled(true);

        ImageView hotelImage = findViewById(R.id.details_cover_image);
        TextView hotelInfoText = findViewById(R.id.details_info_text_view);
        MaterialButton hotelContactButton = findViewById(R.id.details_contact_button);
        MaterialButton hotelLocationButton = findViewById(R.id.details_location_button);
        MaterialButton hotelBookingButton = findViewById(R.id.details_booking_button);
        MaterialButton hotelSiteButton = findViewById(R.id.details_site_button);

        hotelBookingButton.setIconResource(R.drawable.baseline_hotel_white_24dp);
        hotelBookingButton.setText(R.string.book_now);

        Bundle bundle = getIntent().getExtras();
        Hotels hotels = null;
        if (bundle != null)
            hotels = bundle.getParcelable("hotelData");

        if (hotels != null) {

            setTitle(hotels.getHotelName());
            hotelImage.setImageResource(hotels.getHotelPhoto());
            hotelInfoText.setText(hotels.getHotelInfo());

            final Hotels finalHotels = hotels;
            hotelContactButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + finalHotels.getHotelContact()));
                    if (verifyIntent(callIntent))
                        startActivity(callIntent);

                }
            });

            hotelLocationButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=" + finalHotels.getHotelName() + ", " + finalHotels.getHotelLocation()));
                    if (verifyIntent(mapIntent))
                        startActivity(mapIntent);
                }
            });

            hotelBookingButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent bookingWebPageIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(finalHotels.getHotelBooking()));
                    if (verifyIntent(bookingWebPageIntent))
                        startActivity(bookingWebPageIntent);
                }
            });

            hotelSiteButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent webPageIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(finalHotels.getHotelSite()));
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
