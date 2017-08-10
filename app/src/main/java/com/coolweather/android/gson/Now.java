package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wkxxf on 2017/8/6.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
