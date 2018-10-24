package com.example.sanketh.dcguide.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Places implements Parcelable {

    public static final Creator<Places> CREATOR = new Creator<Places>() {
        @Override
        public Places createFromParcel(Parcel in) {
            return new Places(in);
        }

        @Override
        public Places[] newArray(int size) {
            return new Places[size];
        }
    };
    private String placeTitle;
    private String placeHeadLine;
    private String placeSubHead1;
    private String placeSubHead1Info;
    private String placeSubHead2;
    private String placeSubHead2Info;
    private String placeLocation;
    private int placePhoto;

    public Places(String placeTitle, String placeHeadLine, String placeSubHead1,
                  String placeSubHead1Info, String placeSubHead2, String placeSubHead2Info,
                  String placeLocation, int placePhoto) {
        this.placeTitle = placeTitle;
        this.placeHeadLine = placeHeadLine;
        this.placeSubHead1 = placeSubHead1;
        this.placeSubHead1Info = placeSubHead1Info;
        this.placeSubHead2 = placeSubHead2;
        this.placeSubHead2Info = placeSubHead2Info;
        this.placeLocation = placeLocation;
        this.placePhoto = placePhoto;
    }

    private Places(Parcel in) {
        placeTitle = in.readString();
        placeHeadLine = in.readString();
        placeSubHead1 = in.readString();
        placeSubHead1Info = in.readString();
        placeSubHead2 = in.readString();
        placeSubHead2Info = in.readString();
        placeLocation = in.readString();
        placePhoto = in.readInt();
    }

    public String getPlaceTitle() {
        return placeTitle;
    }

    public String getPlaceHeadLine() {
        return placeHeadLine;
    }

    public String getPlaceSubHead1() {
        return placeSubHead1;
    }

    public String getPlaceSubHead1Info() {
        return placeSubHead1Info;
    }

    public String getPlaceSubHead2() {
        return placeSubHead2;
    }

    public String getPlaceSubHead2Info() {
        return placeSubHead2Info;
    }

    public String getPlaceLocation() {
        return placeLocation;
    }

    public int getPlacePhoto() {
        return placePhoto;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(placeTitle);
        dest.writeString(placeHeadLine);
        dest.writeString(placeSubHead1);
        dest.writeString(placeSubHead1Info);
        dest.writeString(placeSubHead2);
        dest.writeString(placeSubHead2Info);
        dest.writeString(placeLocation);
        dest.writeInt(placePhoto);
    }


}
