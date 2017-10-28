package fq.evaluation.apps.eortizu.com.venuesexploreapp.Models.Groups.Place.Venue;

import java.io.Serializable;

import fq.evaluation.apps.eortizu.com.venuesexploreapp.Models.RichStatus;

public class Hour implements Serializable {
    private String status;
    private RichStatus richStatus;
    private boolean isOpen;
    private boolean isLocalHoliday;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RichStatus getRichStatus() {
        return richStatus;
    }

    public void setRichStatus(RichStatus richStatus) {
        this.richStatus = richStatus;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public boolean isLocalHoliday() {
        return isLocalHoliday;
    }

    public void setLocalHoliday(boolean localHoliday) {
        isLocalHoliday = localHoliday;
    }

    @Override
    public String toString() {
        return "Hour{" +
                "status='" + status + '\'' +
                ", richStatus=" + richStatus +
                ", isOpen=" + isOpen +
                ", isLocalHoliday=" + isLocalHoliday +
                '}';
    }
}
