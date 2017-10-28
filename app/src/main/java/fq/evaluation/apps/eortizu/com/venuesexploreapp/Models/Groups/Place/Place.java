package fq.evaluation.apps.eortizu.com.venuesexploreapp.Models.Groups.Place;

import java.io.Serializable;
import java.util.ArrayList;

import fq.evaluation.apps.eortizu.com.venuesexploreapp.Models.Groups.Place.Reasons.Reason;
import fq.evaluation.apps.eortizu.com.venuesexploreapp.Models.Groups.Place.Tips.Tip;
import fq.evaluation.apps.eortizu.com.venuesexploreapp.Models.Groups.Place.Venue.Venue;

public class Place implements Serializable {
    private Reason reasons;
    private Venue venue;
    private ArrayList<Tip> tips;
    private String referralId;


    public Reason getReason() {
        return reasons;
    }

    public void setReason(Reason reasons) {
        this.reasons = reasons;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public ArrayList<Tip> getTips() {
        return tips;
    }

    public void setTips(ArrayList<Tip> tips) {
        this.tips = tips;
    }

    public String getReferralId() {
        return referralId;
    }

    public void setReferralId(String referralId) {
        this.referralId = referralId;
    }

    @Override
    public String toString() {
        return "Place{" +
                "reasons=" + reasons +
                ", venue=" + venue +
                ", tips=" + tips +
                ", referralId='" + referralId + '\'' +
                '}';
    }
}
