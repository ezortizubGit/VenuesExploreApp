package fq.evaluation.apps.eortizu.com.venuesexploreapp.Models.Groups.Place.Venue;

import java.io.Serializable;

public class Stat implements Serializable {

    private int checkinsCount;
    private int usersCount;
    private int tipCount;

    public int getCheckinsCount() {
        return checkinsCount;
    }

    public void setCheckinsCount(int checkinCount) {
        this.checkinsCount = checkinCount;
    }

    public int getUsersCount() {
        return usersCount;
    }

    public void setUsersCount(int usersCount) {
        this.usersCount = usersCount;
    }

    public int getTipCount() {
        return tipCount;
    }

    public void setTipCount(int tipCount) {
        this.tipCount = tipCount;
    }

    @Override
    public String toString() {
        return "Stat{" +
                "checkinsCount=" + checkinsCount +
                ", usersCount=" + usersCount +
                ", tipCount=" + tipCount +
                '}';
    }
}
