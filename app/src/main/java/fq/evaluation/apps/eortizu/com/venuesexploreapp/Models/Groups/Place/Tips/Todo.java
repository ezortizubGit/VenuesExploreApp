package fq.evaluation.apps.eortizu.com.venuesexploreapp.Models.Groups.Place.Tips;

import java.io.Serializable;

public class Todo implements Serializable {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "count=" + count +
                '}';
    }
}
