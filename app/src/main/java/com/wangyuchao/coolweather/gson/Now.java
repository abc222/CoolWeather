package com.wangyuchao.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by WangYuchao on 2017/10/28.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
