package com.example.quakereport;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Earthquake {
    private double mMagnitude;
    private String mLocation;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    /** Website URL of the earthquake */
    private String mUrl;



    public Earthquake(double Magnitude, String Location, long TimeInMilliseconds, String url){
        mMagnitude=Magnitude;
        mLocation=Location;
        mTimeInMilliseconds=TimeInMilliseconds;
        mUrl = url;

    }
     

    public double getMagnitude() {
        return mMagnitude;
    }
    public String getLocation(){
        return mLocation;
    }
    public long getTimeInMilliseconds(){
        return mTimeInMilliseconds;
    }

    public String getUrl() {
        return mUrl;
    }

}
