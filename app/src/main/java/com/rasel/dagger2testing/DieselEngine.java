package com.rasel.dagger2testing;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    private static final String TAG = "rsl";

    @Inject
    public DieselEngine() {

    }

    @Override
    public void start() {
        Log.d(TAG, "Diesel engine started");
    }
}
