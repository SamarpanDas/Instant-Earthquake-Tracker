package com.example.android.quakereport;

public class Input {
    private String mMagnitude;
    private String mLocationName;
    private String mDate;


    public Input(String vMagnitude, String vLocationName, String vDate) {
        mMagnitude = vMagnitude;
        mLocationName = vLocationName;
        mDate = vDate;
    }

    public String getMagnitude() {return mMagnitude;}
    public String getLocationName() {
        return mLocationName;
    }
    public String getDate() {
        return mDate;
    }
}
