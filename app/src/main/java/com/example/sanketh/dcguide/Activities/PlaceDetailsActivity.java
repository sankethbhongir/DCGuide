package com.example.sanketh.dcguide.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sanketh.dcguide.R;
import com.example.sanketh.dcguide.models.Places;

public class PlaceDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_details);
        if (getActionBar() != null)
            getActionBar().setDisplayHomeAsUpEnabled(true);
        ImageView placeImage = findViewById(R.id.place_cover);
        TextView placeHeadlineText = findViewById(R.id.place_head_line_text_view);
        TextView placeSubHead1Text = findViewById(R.id.place_sub_head_1_text_view);
        TextView placeSubHead1InfoText = findViewById(R.id.place_sub_head_1_info_text_view);
        TextView placeSubHead2Text = findViewById(R.id.place_sub_head_2_text_view);
        TextView placeSubHead2InfoText = findViewById(R.id.place_sub_head_2_info_text_view);

        Bundle bundle = getIntent().getExtras();

        Places places = null;

        if (bundle != null) {
            places = bundle.getParcelable("placeData");
        }

        if (places != null) {
            setTitle(places.getPlaceTitle());
            placeImage.setImageResource(places.getPlacePhoto());
            placeHeadlineText.setText(places.getPlaceHeadLine());
            placeSubHead1Text.setText(places.getPlaceSubHead1());
            placeSubHead1InfoText.setText(places.getPlaceSubHead1Info());
            placeSubHead2Text.setText(places.getPlaceSubHead2());
            placeSubHead2InfoText.setText(places.getPlaceSubHead2Info());
        }


    }
}
