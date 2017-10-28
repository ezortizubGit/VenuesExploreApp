package fq.evaluation.apps.eortizu.com.venuesexploreapp.Models.Groups.Place.Venue;


import java.io.Serializable;
import java.util.ArrayList;

public class HereNow implements Serializable {

    private int count;
    private String summary;
    private ArrayList<HereNowGroup> groups;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public ArrayList<HereNowGroup> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<HereNowGroup> groups) {
        this.groups = groups;
    }


    @Override
    public String toString() {
        return "HereNow{" +
                "count=" + count +
                ", summary='" + summary + '\'' +
                ", groups=" + groups +
                '}';
    }
}
