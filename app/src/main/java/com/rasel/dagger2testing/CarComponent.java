package com.rasel.dagger2testing;

import dagger.Component;

@Component
public interface CarComponent {

    Car getCar();

    Engine getEngine();

    void inject(MainActivity mainActivity);
}