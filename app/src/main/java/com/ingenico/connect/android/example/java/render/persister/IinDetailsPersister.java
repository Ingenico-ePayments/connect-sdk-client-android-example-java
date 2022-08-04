/*
 * Copyright (c) 2022 Global Collect Services B.V
 */

package com.ingenico.connect.android.example.java.render.persister;

import com.ingenico.connect.gateway.sdk.client.android.sdk.model.iin.IinDetailsResponse;
import com.ingenico.connect.gateway.sdk.client.android.sdk.model.paymentproduct.BasicPaymentItem;

import java.io.Serializable;
import java.util.List;

/**
 * Will persist IinDetails information
 *
 */
public class IinDetailsPersister implements Serializable {

    private static final long serialVersionUID = -5586773582374607503L;

    private IinDetailsResponse iinDetailsResponse;

    private List<BasicPaymentItem> paymentProducts;

    public void setIinDetailsResponse(IinDetailsResponse iinDetailsResponse) {
        this.iinDetailsResponse = iinDetailsResponse;
    }

    public IinDetailsResponse getIinDetailsResponse() {
        return iinDetailsResponse;
    }

    public List<BasicPaymentItem> getPaymentProducts() {
        return paymentProducts;
    }

}
