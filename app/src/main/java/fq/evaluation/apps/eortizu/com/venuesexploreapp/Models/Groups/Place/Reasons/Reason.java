package fq.evaluation.apps.eortizu.com.venuesexploreapp.Models.Groups.Place.Reasons;


import java.io.Serializable;
import java.util.ArrayList;

public class Reason implements Serializable {
    private int count;
    private ArrayList<ReasonSummary> reasonSummaries;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public ArrayList<ReasonSummary> getReasonSummaries() {
        return reasonSummaries;
    }

    public void setReasonSummaries(ArrayList<ReasonSummary> reasonSummaries) {
        this.reasonSummaries = reasonSummaries;
    }

    @Override
    public String toString() {
        return "Reason{" +
                "count=" + count +
                ", reasonSummaries=" + reasonSummaries +
                '}';
    }
}
