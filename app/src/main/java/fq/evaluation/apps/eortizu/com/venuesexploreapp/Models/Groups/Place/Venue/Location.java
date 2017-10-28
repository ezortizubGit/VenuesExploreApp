package fq.evaluation.apps.eortizu.com.venuesexploreapp.Models.Groups.Place.Venue;



import java.io.Serializable;
import java.util.ArrayList;

import fq.evaluation.apps.eortizu.com.venuesexploreapp.Models.LabelLatLng;

public class Location implements Serializable {
    private  String adress;
    private String crossStreet;
    private double lat;
    private double lng;
    private ArrayList<LabelLatLng> labeledLatLngs;
    private int distance;
    private String postalCode;
    private String cc;
    private String city;
    private String state;
    private String country;
    private ArrayList<String> formattedAdress;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCrossStreet() {
        return crossStreet;
    }

    public void setCrossStreet(String crossStreet) {
        this.crossStreet = crossStreet;
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

    public ArrayList<LabelLatLng> getLabeledLatLngs() {
        return labeledLatLngs;
    }

    public void setLabeledLatLngs(ArrayList<LabelLatLng> labeledLatLngs) {
        this.labeledLatLngs = labeledLatLngs;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ArrayList<String> getFormattedAdress() {
        return formattedAdress;
    }

    public void setFormattedAdress(ArrayList<String> formattedAdress) {
        this.formattedAdress = formattedAdress;
    }

    @Override
    public String toString() {
        return "Location{" +
                "adress='" + adress + '\'' +
                ", crossStreet='" + crossStreet + '\'' +
                ", lat=" + lat +
                ", lng=" + lng +
                ", labeledLatLngs=" + labeledLatLngs +
                ", distance=" + distance +
                ", postalCode='" + postalCode + '\'' +
                ", cc='" + cc + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", formattedAdress=" + formattedAdress +
                '}';
    }
}
