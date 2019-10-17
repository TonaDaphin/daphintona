
package com.example.daphintona.models;

import com.example.daphintona.BuildConfig;
import com.google.gson.annotations.Expose;

import org.parceler.Parcel;

@Parcel

public class Region {

    @Expose
    private Center center;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Region() {
    }

    /**
     * 
     * @param center
     */
    public Region(Center center) {
        super();
        this.center = center;
    }

    public Center getCenter() {
        return center;
    }

    public void setCenter(Center center) {
        this.center = center;
    }

    public static class Constants {
        public static final String YELP_BASE_URL = "https://api.yelp.com/v3/";
        public static final String YELP_API_KEY = BuildConfig.YELP_API_KEY;

    }
}
