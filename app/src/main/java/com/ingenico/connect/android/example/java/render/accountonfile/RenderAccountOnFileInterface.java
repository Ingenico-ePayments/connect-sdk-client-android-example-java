/*
 * Copyright (c) 2022 Global Collect Services B.V
 */

package com.ingenico.connect.android.example.java.render.accountonfile;

import android.view.ViewGroup;

import com.ingenico.connect.gateway.sdk.client.android.sdk.model.paymentproduct.AccountOnFile;

/**
 * Defines the rendering of accounts on file interface
 *
 */
public interface RenderAccountOnFileInterface {
	
	
	/***
	 * Renders account on file by the data in the PaymentProduct.
	 * This AccountOnFile is added to the given parent
	 * 
	 * @param accountOnFile, AccountOnFile containing data for the account on file rendering
	 * @param productId, productId, marking the product belonging to the account on file
	 * @param parent, the ViewGroup to which the rendered account on file is added
	 */
	public void renderAccountOnFile(AccountOnFile accountOnFile, String productId, ViewGroup parent);
	
	
}
