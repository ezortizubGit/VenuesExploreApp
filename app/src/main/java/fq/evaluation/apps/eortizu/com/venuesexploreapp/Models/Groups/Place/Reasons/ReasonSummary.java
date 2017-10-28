package fq.evaluation.apps.eortizu.com.venuesexploreapp.Models.Groups.Place.Reasons;


import java.io.Serializable;

public class ReasonSummary implements Serializable {
    private String summary;
    private String type;
    private String reasonName;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReasonName() {
        return reasonName;
    }

    public void setReasonName(String reasonName) {
        this.reasonName = reasonName;
    }

    @Override
    public String toString() {
        return "ReasonSummary{" +
                "summary='" + summary + '\'' +
                ", type='" + type + '\'' +
                ", reasonName='" + reasonName + '\'' +
                '}';
    }
}
