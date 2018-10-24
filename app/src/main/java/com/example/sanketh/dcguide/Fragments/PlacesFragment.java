package com.example.sanketh.dcguide.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.sanketh.dcguide.Activities.PlaceDetailsActivity;
import com.example.sanketh.dcguide.Adapters.PlacesAdapter;
import com.example.sanketh.dcguide.R;
import com.example.sanketh.dcguide.Utils.Utils;
import com.example.sanketh.dcguide.models.Places;

import java.util.Collections;
import java.util.List;

/**
 * {@link Fragment} that displays a list of places.
 */
public class PlacesFragment extends Fragment {


    public PlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root_view = inflater.inflate(R.layout.list, container, false);

        final List<Places> placesList = new Utils().getPlacesData(getActivity());
        Collections.shuffle(placesList);

        PlacesAdapter placesAdapter = new PlacesAdapter(getActivity(), placesList);

        ListView listView = root_view.findViewById(R.id.list_view);

        listView.setAdapter(placesAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(getActivity(), PlaceDetailsActivity.class).putExtra("placeData", placesList.get(position)));
            }
        });

        return root_view;
    }

}
