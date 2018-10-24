package com.example.sanketh.dcguide.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Hotels implements Parcelable {

    public static final Creator<Hotels> CREATOR = new Creator<Hotels>() {
        @Override
        public Hotels createFromParcel(Parcel in) {
            return new Hotels(in);
        }

        @Override
        public Hotels[] newArray(int size) {
            return new Hotels[size];
        }
    };
    private String hotelName;
    private String hotelInfo;
    private String hotelLocation;
    private String hotelContact;
    private String hotelBooking;
    private String hotelSite;
    private int hotelPhoto;

    public Hotels(String hotelName, String hotelInfo, String hotelLocation, String hotelContact, String hotelBooking, String hotelSite, int hotelPhoto) {
        this.hotelName = hotelName;
        this.hotelInfo = hotelInfo;
        this.hotelLocation = hotelLocation;
        this.hotelContact = hotelContact;
        this.hotelBooking = hotelBooking;
        this.hotelSite = hotelSite;
        this.hotelPhoto = hotelPhoto;
    }

    protected Hotels(Parcel in) {
        hotelName = in.readString();
        hotelInfo = in.readString();
        hotelLocation = in.readString();
        hotelContact = in.readString();
        hotelBooking = in.readString();
        hotelSite = in.readString();
        hotelPhoto = in.readInt();
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getHotelInfo() {
        return hotelInfo;
    }

    public String getHotelLocation() {
        return hotelLocation;
    }

    public String getHotelContact() {
        return hotelContact;
    }

    public String getHotelSite() {
        return hotelSite;
    }

    public int getHotelPhoto() {
        return hotelPhoto;
    }

    public String getHotelBooking() {
        return hotelBooking;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(hotelName);
        dest.writeString(hotelInfo);
        dest.writeString(hotelLocation);
        dest.writeString(hotelContact);
        dest.writeString(hotelBooking);
        dest.writeString(hotelSite);
        dest.writeInt(hotelPhoto);
    }
}
