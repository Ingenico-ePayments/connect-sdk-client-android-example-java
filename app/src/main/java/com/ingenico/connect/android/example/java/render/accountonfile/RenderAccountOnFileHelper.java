/*
 * Copyright (c) 2022 Global Collect Services B.V
 */

package com.ingenico.connect.android.example.java.render.accountonfile;

import java.security.InvalidParameterException;

import android.view.ViewGroup;

import com.ingenico.connect.gateway.sdk.client.android.sdk.model.paymentproduct.AccountOnFile;


/**
 * Helper class for rendering the accounts on file on screen
 *
 */
public class RenderAccountOnFileHelper {
	
	
	// Default renderer for accountsonfile
	private RenderAccountOnFileInterface renderer = new RenderAccountOnFile();
	
	
	/**
	 * Registers a custom accountonfile renderer
	 * This renderer must implement the RenderAccountOnFileInterface interface
	 * 
	 * @param renderer, the custom renderer which will handle the show of accountonfiles
	 */
	public void registerCustomRenderer(RenderAccountOnFileInterface renderer) {
		
		if (renderer == null) {
			throw new InvalidParameterException("Error setting custom renderer, renderer may not be null");
		}
		this.renderer = renderer;
	}
	
	
	/**
	 * Renders the account on file with the default renderer, or with the custom renderer when that is set.
	 */
	public void renderAccountOnFile(AccountOnFile accountOnFile, String productId, ViewGroup parent) {
		renderer.renderAccountOnFile(accountOnFile, productId, parent);
	}
	
}
