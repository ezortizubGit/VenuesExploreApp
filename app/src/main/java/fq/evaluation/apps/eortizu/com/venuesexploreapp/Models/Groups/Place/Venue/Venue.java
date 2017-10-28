package fq.evaluation.apps.eortizu.com.venuesexploreapp.Models.Groups.Place.Venue;




import java.io.Serializable;
import java.util.ArrayList;

import fq.evaluation.apps.eortizu.com.venuesexploreapp.Models.Groups.Place.Photo;

public class Venue implements Serializable {
    private String id;
    private String name;
    private Contact contact;
    private Location location;
    private ArrayList<Category> categories;
    private boolean verified;
    private Stat stats;
    private String url;
    private float rating;
    private String ratingColor;
    private int ratingSignals;
    private boolean allowMenuUrlEdit;
    private BeenHere beenHere;
    private Hour hours;
    private Photo photos;
    private String storeId;
    private HereNow hereNow;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public ArrayList<Category> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<Category> categories) {
        this.categories = categories;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public Stat getStats() {
        return stats;
    }

    public void setStats(Stat stats) {
        this.stats = stats;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getRatingColor() {
        return ratingColor;
    }

    public void setRatingColor(String ratingColor) {
        this.ratingColor = ratingColor;
    }

    public int getRatingSignals() {
        return ratingSignals;
    }

    public void setRatingSignals(int ratingSignals) {
        this.ratingSignals = ratingSignals;
    }

    public boolean isAllowMenuUrlEdit() {
        return allowMenuUrlEdit;
    }

    public void setAllowMenuUrlEdit(boolean allowMenuUrlEdit) {
        this.allowMenuUrlEdit = allowMenuUrlEdit;
    }

    public BeenHere getBeenHere() {
        return beenHere;
    }

    public void setBeenHere(BeenHere beenHere) {
        this.beenHere = beenHere;
    }

    public Hour getHours() {
        return hours;
    }

    public void setHours(Hour hours) {
        this.hours = hours;
    }

    public Photo getPhotos() {
        return photos;
    }

    public void setPhotos(Photo photos) {
        this.photos = photos;
    }

    public HereNow getHereNow() {
        return hereNow;
    }

    public void setHereNow(HereNow hereNow) {
        this.hereNow = hereNow;
    }

    @Override
    public String toString() {
        return "Venue{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", contact=" + contact +
                ", location=" + location +
                ", categories=" + categories +
                ", verified=" + verified +
                ", stats=" + stats +
                ", url='" + url + '\'' +
                ", rating=" + rating +
                ", ratingColor='" + ratingColor + '\'' +
                ", ratingSignals=" + ratingSignals +
                ", allowMenuUrlEdit=" + allowMenuUrlEdit +
                ", beenHere=" + beenHere +
                ", hours=" + hours +
                ", photos=" + photos +
                ", storeId='" + storeId + '\'' +
                ", hereNow=" + hereNow +
                '}';
    }
}
