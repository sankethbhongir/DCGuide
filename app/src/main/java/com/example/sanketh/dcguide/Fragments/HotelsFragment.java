package com.example.sanketh.dcguide.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.sanketh.dcguide.Activities.HotelDetailsActivity;
import com.example.sanketh.dcguide.Adapters.HotelsAdapter;
import com.example.sanketh.dcguide.R;
import com.example.sanketh.dcguide.Utils.Utils;
import com.example.sanketh.dcguide.models.Hotels;

import java.util.List;


/**
 * {@link Fragment} that displays a list of hotels.
 */
public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root_view = inflater.inflate(R.layout.list, container, false);

        final List<Hotels> hotelsList = new Utils().getHotelsData(getActivity());

        HotelsAdapter hotelsAdapter = new HotelsAdapter(getActivity(), hotelsList);

        ListView listView = root_view.findViewById(R.id.list_view);

        listView.setAdapter(hotelsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(getActivity(), HotelDetailsActivity.class).putExtra("hotelData", hotelsList.get(position)));
            }
        });
        return root_view;
    }

}
