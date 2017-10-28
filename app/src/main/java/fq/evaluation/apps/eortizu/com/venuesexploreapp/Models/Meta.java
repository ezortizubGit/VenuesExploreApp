package fq.evaluation.apps.eortizu.com.venuesexploreapp.Models;

import java.io.Serializable;

public class Meta implements Serializable {
    private int code;
    private String requestId;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public String toString() {
        return "Meta{" +
                "code=" + code +
                ", requestId='" + requestId + '\'' +
                '}';
    }
}
