package com.example.android.quakereport;

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private long mTimeInSeconds;
    private String mUrl;

    public Earthquake(double magnitude, String location, long timeInSeconds, String url){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInSeconds = timeInSeconds;
        mUrl = url;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeInSeconds() {
        return mTimeInSeconds;
    }

    public String getUrl() {
        return mUrl;
    }
}
