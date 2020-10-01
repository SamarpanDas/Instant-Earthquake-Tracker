package com.example.android.quakereport;

public class Input {
    private String mMagnitude;
    private String mLocationName;
    private String mDate;
    private String mTime;


    public Input(String vMagnitude, String vLocationName, String vDate, String vTime) {
        mMagnitude = vMagnitude;
        mLocationName = vLocationName;
        mDate = vDate;
        mTime = vTime;
    }

    public String getMagnitude() {return mMagnitude;}
    public String getLocationName() {
        return mLocationName;
    }
    public String getDate() {
        return mDate;
    }
    public String getTime() {return mTime;}
}
