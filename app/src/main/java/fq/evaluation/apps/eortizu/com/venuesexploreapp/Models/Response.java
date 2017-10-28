package fq.evaluation.apps.eortizu.com.venuesexploreapp.Models;

import java.io.Serializable;
import java.util.ArrayList;


import fq.evaluation.apps.eortizu.com.venuesexploreapp.Models.Groups.Group;

public class Response implements Serializable{
    private Warning warning;
    private int suggestedRadius;
    private String headerLocation;
    private String headerFullLocaton;
    private String headerLocationGranularity;
    private String query;
    private int totalResults;
    private SuggestedBound suggestedBounds;
    private ArrayList<Group> groups;

    public Warning getWarning() {
        return warning;
    }

    public void setWarning(Warning warning) {
        this.warning = warning;
    }

    public int getSuggestedRadius() {
        return suggestedRadius;
    }

    public void setSuggestedRadius(int suggestedRadius) {
        this.suggestedRadius = suggestedRadius;
    }

    public String getHeaderLocation() {
        return headerLocation;
    }

    public void setHeaderLocation(String headerLocation) {
        this.headerLocation = headerLocation;
    }

    public String getHeaderFullLocaton() {
        return headerFullLocaton;
    }

    public void setHeaderFullLocaton(String headerFullLocaton) {
        this.headerFullLocaton = headerFullLocaton;
    }

    public String getHeaderLocationGranularity() {
        return headerLocationGranularity;
    }

    public void setHeaderLocationGranularity(String headerLocationGranularity) {
        this.headerLocationGranularity = headerLocationGranularity;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public SuggestedBound getSuggestedBounds() {
        return suggestedBounds;
    }

    public void setSuggestedBounds(SuggestedBound suggestedBounds) {
        this.suggestedBounds = suggestedBounds;
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Response{" +
                "warning=" + warning +
                ", suggestedRadius=" + suggestedRadius +
                ", headerLocation='" + headerLocation + '\'' +
                ", headerFullLocaton='" + headerFullLocaton + '\'' +
                ", headerLocationGranularity='" + headerLocationGranularity + '\'' +
                ", query='" + query + '\'' +
                ", totalResults=" + totalResults +
                ", suggestedBounds=" + suggestedBounds +
                ", groups=" + groups +
                '}';
    }
}
