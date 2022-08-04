/*
 * Copyright (c) 2022 Global Collect Services B.V
 */

package com.ingenico.connect.android.example.java.view.detailview;

import android.graphics.Bitmap;

/**
 * Interface for a DetailInputView, that has extra functionality for rendering the BCMC
 * payment product
 *
 */
public interface DetailInputViewBCMC extends DetailInputView {


    void renderBCMCIntroduction(Bitmap qrCode);
}
