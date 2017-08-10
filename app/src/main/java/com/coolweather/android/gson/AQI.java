package com.coolweather.android.gson;

/**
 * Created by wkxxf on 2017/8/6.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
