package com.example.sanketh.dcguide.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sanketh.dcguide.R;
import com.example.sanketh.dcguide.models.Restaurants;

import java.util.List;

/**
 * {@link RestaurantsAdapter} is a {@link ArrayAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Restaurants} objects.
 */
public class RestaurantsAdapter extends ArrayAdapter<Restaurants> {

    public RestaurantsAdapter(Context context, List<Restaurants> restaurants) {
        super(context, 0, restaurants);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder = new ViewHolder();

        if (convertView == null) {

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

            viewHolder.restaurantImage = convertView.findViewById(R.id.cover);
            viewHolder.restaurantTitle = convertView.findViewById(R.id.title);
            convertView.setTag(viewHolder);

        } else
            viewHolder = (ViewHolder) convertView.getTag();

        Restaurants currentRestaurant = getItem(position);

        if (currentRestaurant != null) {

            viewHolder.restaurantImage.setImageResource(currentRestaurant.getRestaurantPhoto());
            viewHolder.restaurantTitle.setText(currentRestaurant.getRestaurantName());
        }

        return convertView;
    }

    public static class ViewHolder {
        ImageView restaurantImage;
        TextView restaurantTitle;

    }
}
