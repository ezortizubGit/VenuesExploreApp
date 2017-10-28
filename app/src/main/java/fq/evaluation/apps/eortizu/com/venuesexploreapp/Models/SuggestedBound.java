package fq.evaluation.apps.eortizu.com.venuesexploreapp.Models;

import java.io.Serializable;

public class SuggestedBound implements Serializable {
    private NE ne;
    private SW sw;

    public NE getNe() {
        return ne;
    }

    public void setNe(NE ne) {
        this.ne = ne;
    }

    public SW getSw() {
        return sw;
    }

    public void setSw(SW sw) {
        this.sw = sw;
    }

    @Override
    public String toString() {
        return "SuggestedBound{" +
                "ne=" + ne +
                ", sw=" + sw +
                '}';
    }
}
