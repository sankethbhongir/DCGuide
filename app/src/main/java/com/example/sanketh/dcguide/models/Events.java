package com.example.sanketh.dcguide.models;

public class Events {

    private String eventName;
    private String eventInfo;
    private String eventTimings;
    private String eventLocation;
    private int eventPhoto;

    public Events(String eventName, String eventInfo, String eventTimings, String eventLocation, int eventPhoto) {
        this.eventName = eventName;
        this.eventInfo = eventInfo;
        this.eventTimings = eventTimings;
        this.eventLocation = eventLocation;
        this.eventPhoto = eventPhoto;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventInfo() {
        return eventInfo;
    }

    public String getEventTimings() {
        return eventTimings;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public int getEventPhoto() {
        return eventPhoto;
    }
}
