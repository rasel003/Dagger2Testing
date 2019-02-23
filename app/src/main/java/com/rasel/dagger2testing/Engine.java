package com.rasel.dagger2testing;

import android.util.Log;

import javax.inject.Inject;

public class Engine {

    @Inject
    public Engine() {

    }

    public void run(){
        Log.d("rsl", "run: Engline running...");
    }
}
