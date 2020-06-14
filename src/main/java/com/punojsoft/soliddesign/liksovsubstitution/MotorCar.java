package com.punojsoft.soliddesign.liksovsubstitution;

/**
 * As our code describes, we have an engine that we can turn on, and we can increase the power.
 * But wait, its 2019, and Elon Musk has been a busy man.
 * <p>
 * We are now living in the era of electric car
 */
public class MotorCar implements Car {

    private Engine engine;

    //Constructors, getters + setters

    public void turnOnEngine() {
        //turn on the engine!
        engine.on();
    }

    public void accelerate() {
        //move forward!
        engine.powerOn(1000);
    }
}