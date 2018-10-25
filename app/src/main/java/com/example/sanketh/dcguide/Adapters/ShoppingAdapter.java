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
import com.example.sanketh.dcguide.models.Shopping;

import java.util.List;

/**
 * {@link ShoppingAdapter} is a {@link ArrayAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Shopping} objects.
 */
public class ShoppingAdapter extends ArrayAdapter<Shopping> {

    public ShoppingAdapter(Context context, List<Shopping> shops) {
        super(context, 0, shops);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder viewHolder = new ViewHolder();

        if (convertView == null) {

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

            viewHolder.ShopImage = convertView.findViewById(R.id.cover);
            viewHolder.ShopTitle = convertView.findViewById(R.id.title);
            convertView.setTag(viewHolder);

        } else
            viewHolder = (ViewHolder) convertView.getTag();

        Shopping currentShop = getItem(position);

        if (currentShop != null) {

            viewHolder.ShopImage.setImageResource(currentShop.getShopPhoto());
            viewHolder.ShopTitle.setText(currentShop.getShopName());
        }

        return convertView;
    }

    static class ViewHolder {
        ImageView ShopImage;
        TextView ShopTitle;
    }
}
