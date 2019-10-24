
package com.example.daphintona.models;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;

public class YelpBusinessesSearchResponse {

    @Expose
    private Integer total;
    @Expose
    private List<Business> businesses = null;
    @Expose
    private Region region;

    /**
     * No args constructor for use in serialization
     * 
     */
    public YelpBusinessesSearchResponse() {
    }

    /**
     * 
     * @param region
     * @param total
     * @param businesses
     */
    public YelpBusinessesSearchResponse(Integer total, ArrayList<Business> businesses, Region region) {
        super();
        this.total = total;
        this.businesses = businesses;
        this.region = region;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<Business> getBusinesses() {
        return businesses;
    }

    public void setBusinesses(List<Business> businesses) {
        this.businesses = businesses;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

}
