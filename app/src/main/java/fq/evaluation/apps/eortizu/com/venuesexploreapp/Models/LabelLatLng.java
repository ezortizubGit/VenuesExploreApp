package fq.evaluation.apps.eortizu.com.venuesexploreapp.Models;

import java.io.Serializable;

public class LabelLatLng implements Serializable {
    private String label;
    private double lat;
    private double lng;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

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
        return "LabelLatLng{" +
                "label='" + label + '\'' +
                ", lat=" + lat +
                ", lng=" + lng +
                '}';
    }
}
