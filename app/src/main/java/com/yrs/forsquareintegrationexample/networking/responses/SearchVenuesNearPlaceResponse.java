package com.yrs.forsquareintegrationexample.networking.responses;

import com.yrs.forsquareintegrationexample.models.Meta;
import com.yrs.forsquareintegrationexample.models.Response;

/**
 * Created by yaros on 26/02/16.
 */
public class SearchVenuesNearPlaceResponse {
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
}
