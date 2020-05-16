package com.example.android.quakereport;

public class Earthquake {

    private String mMagnitude;
    private String mLocation;
    private long mTimeInSeconds;

    public Earthquake(String magnitude, String location, long timeInSeconds){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInSeconds = timeInSeconds;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeInSeconds() {
        return mTimeInSeconds;
    }
}
