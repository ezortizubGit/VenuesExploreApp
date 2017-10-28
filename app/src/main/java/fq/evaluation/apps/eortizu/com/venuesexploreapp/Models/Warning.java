package fq.evaluation.apps.eortizu.com.venuesexploreapp.Models;


import java.io.Serializable;

public class Warning implements Serializable{
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Warning{" +
                "text='" + text + '\'' +
                '}';
    }
}
