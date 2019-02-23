package com.rasel.dagger2testing;

import dagger.Component;

@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {

    Car getCar();

    Engine getEngine();

    void inject(MainActivity mainActivity);
}