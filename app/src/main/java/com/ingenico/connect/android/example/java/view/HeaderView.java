/*
 * Copyright (c) 2022 Global Collect Services B.V
 */

package com.ingenico.connect.android.example.java.view;

import com.ingenico.connect.android.example.java.model.ShoppingCart;
import com.ingenico.connect.gateway.sdk.client.android.sdk.model.PaymentContext;

/**
 * ViewInterface for the Header ShoppinCartView
 *
 */
public interface HeaderView extends GeneralView {

    void renderShoppingCart(ShoppingCart shoppingCart, PaymentContext paymentContext);

    void showDetailView();

    void hideDetailView();
}
