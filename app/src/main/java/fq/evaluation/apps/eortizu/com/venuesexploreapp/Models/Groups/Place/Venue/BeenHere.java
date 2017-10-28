package fq.evaluation.apps.eortizu.com.venuesexploreapp.Models.Groups.Place.Venue;

import java.io.Serializable;

public class BeenHere implements Serializable {
    private int count;
    private boolean marked;
    private int lastCheckExpiredAt;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isMarked() {
        return marked;
    }

    public void setMarked(boolean marked) {
        this.marked = marked;
    }

    public int getLastCheckExpiredAt() {
        return lastCheckExpiredAt;
    }

    public void setLastCheckExpiredAt(int lastCheckExpiredAt) {
        this.lastCheckExpiredAt = lastCheckExpiredAt;
    }

    @Override
    public String toString() {
        return "BeenHere{" +
                "count=" + count +
                ", marked=" + marked +
                ", lastCheckExpiredAt=" + lastCheckExpiredAt +
                '}';
    }
}
