package fq.evaluation.apps.eortizu.com.venuesexploreapp.Models.Groups;

import java.io.Serializable;
import java.util.ArrayList;

import fq.evaluation.apps.eortizu.com.venuesexploreapp.Models.Groups.Place.Place;


public class Group implements Serializable {
    private String type;
    private String name;
    private ArrayList<Place> items;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Place> getPlaces() {
        return items;
    }

    public void setPlaces(ArrayList<Place> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Group{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", places=" + items +
                '}';
    }
}
