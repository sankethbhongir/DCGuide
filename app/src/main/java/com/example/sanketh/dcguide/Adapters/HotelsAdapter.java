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
import com.example.sanketh.dcguide.models.Hotels;

import java.util.List;

/**
 * {@link HotelsAdapter} is a {@link ArrayAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Hotels} objects.
 */
public class HotelsAdapter extends ArrayAdapter<Hotels> {

    public HotelsAdapter(Context context, List<Hotels> hotels) {
        super(context, 0, hotels);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder viewHolder = new ViewHolder();

        if (convertView == null) {

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

            viewHolder.hotelImage = convertView.findViewById(R.id.cover);
            viewHolder.hotelTitle = convertView.findViewById(R.id.title);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Hotels currentPlace = getItem(position);

        if (currentPlace != null) {
            viewHolder.hotelImage.setImageResource(currentPlace.getHotelPhoto());
            viewHolder.hotelTitle.setText(currentPlace.getHotelName());
        }


        return convertView;
    }

    private static class ViewHolder {
        ImageView hotelImage;
        TextView hotelTitle;
    }

}
