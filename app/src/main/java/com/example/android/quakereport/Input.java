package com.example.android.quakereport;

public class Input {
    private double mMagnitude;
    private String mLocationName;
    private String mDate;


    public Input(double vMagnitude, String vLocationName, String vDate) {
        mMagnitude = vMagnitude;
        mLocationName = vLocationName;
        mDate = vDate;
    }

    public String getMagnitude() {return Double.toString(mMagnitude);}
    public String getLocationName() {
        return mLocationName;
    }
    public String getDate() {
        return mDate;
    }
}
