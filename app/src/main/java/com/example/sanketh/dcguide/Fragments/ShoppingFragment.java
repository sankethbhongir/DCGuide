package com.example.sanketh.dcguide.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.sanketh.dcguide.Activities.ShoppingDetailsActivity;
import com.example.sanketh.dcguide.Adapters.ShoppingAdapter;
import com.example.sanketh.dcguide.R;
import com.example.sanketh.dcguide.Utils.Utils;
import com.example.sanketh.dcguide.models.Shopping;

import java.util.List;

/**
 * {@link Fragment} that displays a list of restaurants.
 */
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View rootView = inflater.inflate(R.layout.list,container, false);

        final List<Shopping> shoppingList = new Utils().getShoppingData(getActivity());

        ShoppingAdapter shoppingAdapter = new ShoppingAdapter(getActivity(), shoppingList);

        ListView listView = rootView.findViewById(R.id.list_view);

        listView.setAdapter(shoppingAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(getActivity(), ShoppingDetailsActivity.class).putExtra("shoppingData", shoppingList.get(position)));
            }
        });
        return rootView;
    }

}
