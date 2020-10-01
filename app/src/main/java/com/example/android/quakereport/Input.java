package com.example.android.quakereport;

public class Input {
    private String mMagnitude;
    private String mLocationName;
    private String mLocationMainName;
    private String mDate;
    private String mTime;


    public Input(String vMagnitude, String vLocationName, String vLocationMainName, String vDate, String vTime) {
        mMagnitude = vMagnitude;
        mLocationName = vLocationName;
        mLocationMainName = vLocationMainName;
        mDate = vDate;
        mTime = vTime;
    }

    public String getMagnitude() {return mMagnitude;}
    public String getLocationName() {
        return mLocationName;
    }
    public String getLocationMainName() {return mLocationMainName;}
    public String getDate() {
        return mDate;
    }
    public String getTime() {return mTime;}
}
