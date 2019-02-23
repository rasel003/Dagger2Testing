package com.rasel.dagger2testing;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject Car car;
    private Engine engine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.create();
        component.inject(this);

       // car = component.getCar();

        engine = component.getEngine();
        engine.run();

        car.drive();
    }
}
