package com.example.sanketh.dcguide.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.sanketh.dcguide.Activities.RestaurantDetails;
import com.example.sanketh.dcguide.Adapters.RestaurantsAdapter;
import com.example.sanketh.dcguide.R;
import com.example.sanketh.dcguide.Utils.Utils;
import com.example.sanketh.dcguide.models.Restaurants;

import java.util.List;

/**
 * {@link Fragment} that displays a list of restaurants.
 */
public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root_view = inflater.inflate(R.layout.list, container, false);

        final List<Restaurants> restaurantsList = new Utils().getRestaurantsData(getActivity());

        RestaurantsAdapter restaurantsAdapter = new RestaurantsAdapter(getActivity(), restaurantsList);

        ListView listView = root_view.findViewById(R.id.list_view);

        listView.setAdapter(restaurantsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(getActivity(), RestaurantDetails.class).putExtra("restaurantData", restaurantsList.get(position)));
            }
        });

        return root_view;
    }

}
