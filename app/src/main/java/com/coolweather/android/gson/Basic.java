package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 泡泡 on 2017/11/26.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    //@SerializedName("update")
    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
