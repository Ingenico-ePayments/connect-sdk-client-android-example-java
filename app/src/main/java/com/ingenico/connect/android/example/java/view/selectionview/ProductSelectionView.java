/*
 * Copyright (c) 2022 Global Collect Services B.V
 */

package com.ingenico.connect.android.example.java.view.selectionview;

import android.content.DialogInterface.OnClickListener;

import com.ingenico.connect.android.example.java.view.GeneralView;
import com.ingenico.connect.gateway.sdk.client.android.sdk.model.paymentproduct.BasicPaymentItems;

/**
 * Interface for the Product selection view
 *
 */
public interface ProductSelectionView extends GeneralView {

    void renderDynamicContent(BasicPaymentItems paymentItems);

    void showLoadingIndicator();

    void hideLoadingIndicator();

    void showTechnicalErrorDialog(OnClickListener listener);

    void showNoInternetDialog(OnClickListener listener);

    void showSpendingLimitExceededErrorDialog(OnClickListener positiveListener, OnClickListener negativeListener);

    void hideAlertDialog();
}
