package com.example.sanketh.dcguide.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Shopping implements Parcelable {

    private String shopName;
    private String shopInfo;
    private String shopTimings;
    private String shopLocation;
    private String shopSite;
    private int shopPhoto;

    public Shopping(String shopName, String shopInfo, String shopTimings, String shopLocation, String shopSite, int shopPhoto) {
        this.shopName = shopName;
        this.shopInfo = shopInfo;
        this.shopTimings = shopTimings;
        this.shopLocation = shopLocation;
        this.shopSite = shopSite;
        this.shopPhoto = shopPhoto;
    }

    private Shopping(Parcel in) {
        shopName = in.readString();
        shopInfo = in.readString();
        shopTimings = in.readString();
        shopLocation = in.readString();
        shopSite = in.readString();
        shopPhoto = in.readInt();
    }

    public static final Creator<Shopping> CREATOR = new Creator<Shopping>() {
        @Override
        public Shopping createFromParcel(Parcel in) {
            return new Shopping(in);
        }

        @Override
        public Shopping[] newArray(int size) {
            return new Shopping[size];
        }
    };

    public String getShopName() {
        return shopName;
    }

    public String getShopInfo() {
        return shopInfo;
    }

    public String getShopTimings() {
        return shopTimings;
    }

    public String getShopLocation() {
        return shopLocation;
    }

    public int getShopPhoto() {
        return shopPhoto;
    }

    public String getShopSite() {
        return shopSite;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(shopName);
        dest.writeString(shopInfo);
        dest.writeString(shopTimings);
        dest.writeString(shopLocation);
        dest.writeString(shopSite);
        dest.writeInt(shopPhoto);
    }
}
