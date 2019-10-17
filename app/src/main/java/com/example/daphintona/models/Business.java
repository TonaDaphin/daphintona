
package com.example.daphintona.models;

import android.widget.Toast;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class Business {

    @SerializedName("rating")
    @Expose
    private Double rating;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("alias")
    @Expose
    private String alias;
    @SerializedName("is_closed")
    @Expose
    private Boolean isClosed;
    @SerializedName("categories")
    @Expose
    private List<Category> categories = null;
    @SerializedName("review_count")
    @Expose
    private Integer reviewCount;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("coordinates")
    @Expose
    private Coordinates coordinates;
    @SerializedName("image_url")
    @Expose
    private String image_url;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("distance")
    @Expose
    private Double distance;
    @SerializedName("transactions")
    @Expose
    private List<String> transactions = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public Business() {
    }

    /**
     *
     * @param transactions
     * @param phone
     * @param location
     * @param alias
     * @param image_url
     * @param url
     * @param id
     * @param distance
     * @param price
     * @param reviewCount
     * @param name
     * @param categories
     * @param rating
     * @param isClosed
     * @param coordinates
     */
    public Business(Double rating, String price, String phone, String id, String alias, Boolean isClosed, List<Category> categories, Integer reviewCount, String name, String url, Coordinates coordinates, String image_url, Location location, Double distance, List<String> transactions) {
        super();
        this.rating = rating;
        this.price = price;
        this.phone = phone;
        this.id = id;
        this.alias = alias;
        this.isClosed = isClosed;
        this.categories = categories;
        this.reviewCount = reviewCount;
        this.name = name;
        this.url = url;
        this.coordinates = coordinates;
        this.image_url = image_url;
        this.location = location;
        this.distance = distance;
        this.transactions = transactions;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Boolean getClosed() {
        return isClosed;
    }

    public void setClosed(Boolean closed) {
        isClosed = closed;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Integer getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(Integer reviewCount) {
        this.reviewCount = reviewCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public String getImageUrl() {
        return image_url;
    }

    public void setImageUrl(String image_url) {
        this.image_url = image_url;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public List<String> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }
}