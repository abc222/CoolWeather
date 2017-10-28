package com.wangyuchao.coolweather.gson;

import android.text.style.UpdateAppearance;

import com.google.gson.annotations.SerializedName;

/**
 * Created by WangYuchao on 2017/10/28.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
