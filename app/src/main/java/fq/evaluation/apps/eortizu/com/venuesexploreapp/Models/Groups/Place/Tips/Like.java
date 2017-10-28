package fq.evaluation.apps.eortizu.com.venuesexploreapp.Models.Groups.Place.Tips;


import java.io.Serializable;
import java.util.ArrayList;

public class Like implements Serializable {
    private int count;
    private ArrayList<LikeGroup> groups;
    private String summary;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public ArrayList<LikeGroup> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<LikeGroup> groups) {
        this.groups = groups;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
        return "Like{" +
                "count=" + count +
                ", groups=" + groups +
                ", summary='" + summary + '\'' +
                '}';
    }
}
