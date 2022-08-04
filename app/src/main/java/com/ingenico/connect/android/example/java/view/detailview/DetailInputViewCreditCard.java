/*
 * Copyright (c) 2022 Global Collect Services B.V
 */

package com.ingenico.connect.android.example.java.view.detailview;

import android.view.View;

import com.ingenico.connect.android.example.java.render.iinlookup.IinLookupTextWatcher;
import com.ingenico.connect.android.example.java.render.persister.InputValidationPersister;
import com.ingenico.connect.gateway.sdk.client.android.sdk.model.paymentproduct.BasicPaymentItem;

import java.util.List;

/**
 * Interface for the DetailInputView that has extra functionality for card payment products
 *
 */
public interface DetailInputViewCreditCard extends DetailInputView {
    void initializeCreditCardField(IinLookupTextWatcher iinLookupTextWatcher);

    void renderLuhnValidationMessage(InputValidationPersister inputValidationPersister);

    void renderNotAllowedInContextValidationMessage(InputValidationPersister inputValidationPersister);

    void removeCreditCardValidationMessage(InputValidationPersister inputValidationPersister);

    void renderPaymentProductLogoInCreditCardField(String logoUrl);

    void removeDrawableInEditText();

    void renderCoBrandNotification(List<BasicPaymentItem> paymentProductsAllowedInContext, View.OnClickListener listener);

    void removeCoBrandNotification();
}
