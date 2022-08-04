/*
 * Copyright (c) 2022 Global Collect Services B.V
 */

package com.ingenico.connect.android.example.java.view.detailview;

import android.text.TextWatcher;

/**
 * Interface for a DetailInputView, that has extra functionality for rendering the Boleto Bancario
 * payment product
 *
 */
public interface DetailInputViewBoletoBancario extends DetailInputView {

    void initializeFiscalNumberField(TextWatcher textWatcher);

    void setBoletoBancarioPersonalFiscalNumber();

    void setBoletoBancarioCompanyFiscalNumber();
}
