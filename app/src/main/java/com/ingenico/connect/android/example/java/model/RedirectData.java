/*
 * Copyright (c) 2022 Global Collect Services B.V
 */

package com.ingenico.connect.android.example.java.model;

/**
 * Pojo that contains redirection information for redirect payment products
 *
 */
public class RedirectData {

    private String redirectURL;
    private String RETURNMAC;

    public String getRedirectURL() {
        return redirectURL;
    }

    public void setRedirectURL(String redirectURL) {
        this.redirectURL = redirectURL;
    }

    public String getRETURNMAC() {
        return RETURNMAC;
    }

    public void setRETURNMAC(String RETURNMAC) {
        this.RETURNMAC = RETURNMAC;
    }
}
