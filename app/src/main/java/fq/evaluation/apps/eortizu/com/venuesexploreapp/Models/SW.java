package fq.evaluation.apps.eortizu.com.venuesexploreapp.Models;

import java.io.Serializable;

public class SW implements Serializable {
    private double lat;
    private double lng;

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    @Override
    public String toString() {
        return "SW{" +
                "lat=" + lat +
                ", lng=" + lng +
                '}';
    }
}
