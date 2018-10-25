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
import com.example.sanketh.dcguide.models.Shopping;

import java.util.List;

public class ShoppingDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_details);

        if (getActionBar() != null)
            getActionBar().setDisplayHomeAsUpEnabled(true);
        GridLayout gridLayout = findViewById(R.id.grid);
        ImageView shopImage = findViewById(R.id.details_cover_image);
        TextView shopInfoText = findViewById(R.id.details_info_text_view);
        TextView shopTimingText = findViewById(R.id.details_timing_text_view);
        MaterialButton shopLocationButton = findViewById(R.id.details_location_button);
        MaterialButton shopSiteButton = findViewById(R.id.details_site_button);
        gridLayout.removeAllViews();
        gridLayout.addView(shopSiteButton);
        gridLayout.addView(shopLocationButton);

        Bundle bundle = getIntent().getExtras();
        Shopping shops = null;
        if (bundle != null)
            shops = bundle.getParcelable("shoppingData");

        if (shops != null) {

            setTitle(shops.getShopName());
            shopImage.setImageResource(shops.getShopPhoto());
            shopInfoText.setText(shops.getShopInfo());
            shopTimingText.setText(shops.getShopTimings());

            final Shopping finalShops = shops;

            shopLocationButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=" + finalShops.getShopName() + ", " + finalShops.getShopLocation()));
                    if (verifyIntent(mapIntent))
                        startActivity(mapIntent);
                }
            });

            shopSiteButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent webPageIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(finalShops.getShopSite()));
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
