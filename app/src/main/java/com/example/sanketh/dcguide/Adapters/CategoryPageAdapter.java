package com.example.sanketh.dcguide.Adapters;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.sanketh.dcguide.Fragments.HotelsFragment;
import com.example.sanketh.dcguide.Fragments.PlacesFragment;
import com.example.sanketh.dcguide.Fragments.RestaurantFragment;
import com.example.sanketh.dcguide.Fragments.ShoppingFragment;
import com.example.sanketh.dcguide.R;


/**
 * {@link CategoryPageAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link com.example.sanketh.dcguide.Utils.Utils} objects.
 */

public class CategoryPageAdapter extends FragmentPagerAdapter {

    private Context mContext;


    /**
     * Create a new {@link CategoryPageAdapter} object.
     *
     * @param context is the context of the app
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     *                across swipes.
     */
    public CategoryPageAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */

    @Override
    public Fragment getItem(int i) {

        Fragment fragment = null;
        switch (i) {
            case 0:
                fragment = new PlacesFragment();
                break;

            case 1:
                fragment = new HotelsFragment();
                break;
            case 2:
                fragment = new RestaurantFragment();
                break;
            case 3:
                fragment = new ShoppingFragment();
        }
        return fragment;
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }


    /**
     * Return the page title of the selected page.
     */
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        if (position == 0)
            return mContext.getString(R.string.Places);

        else if (position == 1)
            return mContext.getString(R.string.Hotels);

        else if (position == 2)
            return mContext.getString(R.string.Restaurants);
         else {
            return mContext.getString(R.string.shops);
        }
    }
}
