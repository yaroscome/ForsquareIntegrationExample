package com.yrs.forsquareintegrationexample.models;

/**
 * Created by yaros on 26/02/16.
 */
public class Meta {
    Integer code;
    String requestId;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
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
