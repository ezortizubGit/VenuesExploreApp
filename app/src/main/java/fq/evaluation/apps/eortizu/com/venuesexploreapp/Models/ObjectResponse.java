package fq.evaluation.apps.eortizu.com.venuesexploreapp.Models;

import java.io.Serializable;

public class ObjectResponse implements Serializable{

    private Meta meta;
    private Response response;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "ObjectResponse{" +
                "meta=" + meta +
                ", response=" + response +
                '}';
    }
}
