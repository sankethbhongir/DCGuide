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
import com.example.sanketh.dcguide.models.Places;

import java.util.List;

/**
 * {@link PlacesAdapter} is a {@link ArrayAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Places} objects.
 */
public class PlacesAdapter extends ArrayAdapter<Places> {


    public PlacesAdapter(Context context, List<Places> list) {
        super(context, 0, list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder viewHolder = new ViewHolder();

        if (convertView == null) {

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

            viewHolder.placeImage = convertView.findViewById(R.id.cover);
            viewHolder.placeTitle = convertView.findViewById(R.id.title);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Places currentPlace = getItem(position);

        if (currentPlace != null) {
            viewHolder.placeImage.setImageResource(currentPlace.getPlacePhoto());
            viewHolder.placeTitle.setText(currentPlace.getPlaceTitle());
        }


        return convertView;
    }

    static class ViewHolder {
        ImageView placeImage;
        TextView placeTitle;
    }
}
