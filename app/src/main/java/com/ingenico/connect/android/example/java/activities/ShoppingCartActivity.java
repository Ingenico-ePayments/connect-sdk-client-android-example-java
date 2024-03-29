/*
 * Copyright (c) 2022 Global Collect Services B.V
 */

package com.ingenico.connect.android.example.java.activities;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

import androidx.fragment.app.FragmentActivity;

import com.ingenico.connect.android.example.java.configuration.Constants;
import com.ingenico.connect.android.example.java.model.ShoppingCart;
import com.ingenico.connect.android.example.java.view.HeaderViewImpl;
import com.ingenico.connect.gateway.sdk.client.android.ConnectSDK;
import com.ingenico.connect.android.example.java.R;
/**
 *  Toggles the shoppingcart details when its clicked
 *
 */
public class ShoppingCartActivity extends FragmentActivity {

    private HeaderViewImpl view;

    private ShoppingCart shoppingCart;

    // Boolean to prevent multiple renders of the shoppingcart
    private boolean rendered = false;

    public void initialize(Activity activity) {

        view = new HeaderViewImpl(activity, R.id.header_layout);

        Intent intent = getIntent();
        shoppingCart = (ShoppingCart) intent.getSerializableExtra(Constants.INTENT_SHOPPINGCART);
    }

    @Override
    public void onStart() {
        super.onStart();
        if (!rendered) {
            view.renderShoppingCart(shoppingCart, ConnectSDK.INSTANCE.getPaymentConfiguration().getPaymentContext());
            rendered = true;
        }
    }

    public void showShoppingCartDetailView(View v) {
        view.showDetailView();
    }

    public void hideShoppingCartDetailView(View v) {
        view.hideDetailView();
    }
}
