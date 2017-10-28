package fq.evaluation.apps.eortizu.com.venuesexploreapp.Models.Groups.Place;

import java.io.Serializable;
import java.util.ArrayList;

public class Photo implements Serializable {
    private int count;
    ArrayList<PhotoGroup> groups;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public ArrayList<PhotoGroup> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<PhotoGroup> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "count=" + count +
                ", groups=" + groups +
                '}';
    }
}
