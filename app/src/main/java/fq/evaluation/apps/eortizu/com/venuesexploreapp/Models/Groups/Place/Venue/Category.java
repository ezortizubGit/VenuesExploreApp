package fq.evaluation.apps.eortizu.com.venuesexploreapp.Models.Groups.Place.Venue;


import java.io.Serializable;

import fq.evaluation.apps.eortizu.com.venuesexploreapp.Models.Icon;

public class Category implements Serializable {

    private String id;
    private String name;
    private String pluralName;
    private String shortName;
    private Icon icon;
    private boolean primary;

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

    public String getPluralName() {
        return pluralName;
    }

    public void setPluralName(String pluralName) {
        this.pluralName = pluralName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public boolean isPrimary() {
        return primary;
    }

    public void setPrimary(boolean primary) {
        this.primary = primary;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pluralName='" + pluralName + '\'' +
                ", shortName='" + shortName + '\'' +
                ", icon=" + icon +
                ", primary=" + primary +
                '}';
    }
}
