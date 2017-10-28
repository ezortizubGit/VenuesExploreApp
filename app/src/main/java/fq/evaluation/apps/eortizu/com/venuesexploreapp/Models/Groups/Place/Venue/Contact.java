package fq.evaluation.apps.eortizu.com.venuesexploreapp.Models.Groups.Place.Venue;

import java.io.Serializable;

public class Contact implements Serializable {
    private String phone;
    private String formattedPhone;
    private String facebook;
    private String facebookUserName;
    private String facebookName;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFormattedPhone() {
        return formattedPhone;
    }

    public void setFormattedPhone(String formattedPhone) {
        this.formattedPhone = formattedPhone;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getFacebookUserName() {
        return facebookUserName;
    }

    public void setFacebookUserName(String facebookUserName) {
        this.facebookUserName = facebookUserName;
    }

    public String getFacebookName() {
        return facebookName;
    }

    public void setFacebookName(String facebookName) {
        this.facebookName = facebookName;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "phone='" + phone + '\'' +
                ", formattedPhone='" + formattedPhone + '\'' +
                ", facebook='" + facebook + '\'' +
                ", facebookUserName='" + facebookUserName + '\'' +
                ", facebookName='" + facebookName + '\'' +
                '}';
    }
}
