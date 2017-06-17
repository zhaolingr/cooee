package com.cooeeui.brand.zenlauncher.wallpaper.util;

import java.net.URLEncoder;

/**
 * Created by Steve on 2015/7/21.
 */
public class QueryStringBuilder {


    private StringBuilder builder = new StringBuilder();

    public QueryStringBuilder add(
        String param,
        String value) {
        if (builder.length() != 0) {
            builder.append("&");
        }
        if (value == null) {
            value = "";
        }
        builder.append(param).append("=").append(URLEncoder.encode(value));
        return this;
    }

    public QueryStringBuilder add(
        String param,
        int value) {
        return add(param, Integer.toString(value));
    }

    @Override
    public String toString() {
        return builder.toString();
    }
}
