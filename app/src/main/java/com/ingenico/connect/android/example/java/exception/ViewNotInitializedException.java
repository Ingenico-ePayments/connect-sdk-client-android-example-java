/*
 * Copyright (c) 2022 Global Collect Services B.V
 */

package com.ingenico.connect.android.example.java.exception;

public class ViewNotInitializedException extends RuntimeException {

    private static final long serialVersionUID = -1281137185498064367L;

    public ViewNotInitializedException() {
        super();
    }

    public ViewNotInitializedException(String message) {
        super(message);
    }

    public ViewNotInitializedException(Throwable t) {
        super(t);
    }

    public ViewNotInitializedException(String message, Throwable t) {
        super(message, t);
    }
}
