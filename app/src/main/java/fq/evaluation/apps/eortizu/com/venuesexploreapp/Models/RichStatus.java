package fq.evaluation.apps.eortizu.com.venuesexploreapp.Models;

import java.io.Serializable;
import java.util.ArrayList;


public class RichStatus implements Serializable {
    private ArrayList<EntityResponse> entities;
    private String text;

    public ArrayList<EntityResponse> getEntities() {
        return entities;
    }

    public void setEntities(ArrayList<EntityResponse> entities) {
        this.entities = entities;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "RichStatus{" +
                "entities=" + entities +
                ", text='" + text + '\'' +
                '}';
    }
}
