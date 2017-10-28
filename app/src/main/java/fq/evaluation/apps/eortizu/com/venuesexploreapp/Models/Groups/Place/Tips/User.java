package fq.evaluation.apps.eortizu.com.venuesexploreapp.Models.Groups.Place.Tips;

import java.io.Serializable;

import fq.evaluation.apps.eortizu.com.venuesexploreapp.Models.Groups.Place.Photo;

public class User implements Serializable {
    private String id;
    private String  firstName;
    private String gender;
    private Photo photo;
    private String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", gender='" + gender + '\'' +
                ", photo=" + photo +
                ", type='" + type + '\'' +
                '}';
    }
}
