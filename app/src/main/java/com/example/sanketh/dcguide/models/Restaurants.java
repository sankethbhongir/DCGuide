package com.example.sanketh.dcguide.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Restaurants implements Parcelable {

    public static final Creator<Restaurants> CREATOR = new Creator<Restaurants>() {
        @Override
        public Restaurants createFromParcel(Parcel in) {
            return new Restaurants(in);
        }

        @Override
        public Restaurants[] newArray(int size) {
            return new Restaurants[size];
        }
    };
    private String restaurantName;
    private String restaurantInfo;
    private String restaurantLocation;
    private String restaurantContact;
    private String restaurantBooking;
    private String restaurantSite;
    private String restaurantTimings;
    private String restaurantRating;
    private int restaurantPhoto;

    public Restaurants(String restaurantName, String restaurantInfo, String restaurantLocation, String restaurantContact, String restaurantBooking, String restaurantSite, String restaurantTimings, String restaurantRating, int restaurantPhoto) {
        this.restaurantName = restaurantName;
        this.restaurantInfo = restaurantInfo;
        this.restaurantLocation = restaurantLocation;
        this.restaurantContact = restaurantContact;
        this.restaurantBooking = restaurantBooking;
        this.restaurantSite = restaurantSite;
        this.restaurantTimings = restaurantTimings;
        this.restaurantRating = restaurantRating;
        this.restaurantPhoto = restaurantPhoto;
    }

    protected Restaurants(Parcel in) {
        restaurantName = in.readString();
        restaurantInfo = in.readString();
        restaurantLocation = in.readString();
        restaurantContact = in.readString();
        restaurantBooking = in.readString();
        restaurantSite = in.readString();
        restaurantTimings = in.readString();
        restaurantRating = in.readString();
        restaurantPhoto = in.readInt();
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getRestaurantInfo() {
        return restaurantInfo;
    }

    public String getRestaurantContact() {
        return restaurantContact;
    }

    public String getRestaurantSite() {
        return restaurantSite;
    }

    public String getRestaurantTimings() {
        return restaurantTimings;
    }

    public int getRestaurantPhoto() {
        return restaurantPhoto;
    }

    public String getRestaurantRating() {
        return restaurantRating;
    }

    public String getRestaurantBooking() {
        return restaurantBooking;
    }

    public String getRestaurantLocation() {
        return restaurantLocation;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(restaurantName);
        dest.writeString(restaurantInfo);
        dest.writeString(restaurantLocation);
        dest.writeString(restaurantContact);
        dest.writeString(restaurantBooking);
        dest.writeString(restaurantSite);
        dest.writeString(restaurantTimings);
        dest.writeString(restaurantRating);
        dest.writeInt(restaurantPhoto);
    }
}
