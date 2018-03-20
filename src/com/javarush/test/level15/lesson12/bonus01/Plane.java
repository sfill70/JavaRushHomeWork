package com.javarush.test.level15.lesson12.bonus01;

/**
 * Created by Sfill on 21.12.2016.
 */
public class Plane implements Flyable
{
    public int numberOfPassengers;
    public Plane(int numberOfPassengers)
    {
        this.numberOfPassengers = numberOfPassengers;
    }

    public void fly(){}


}
