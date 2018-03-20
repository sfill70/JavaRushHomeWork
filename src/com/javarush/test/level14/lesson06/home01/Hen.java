package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Sfill on 30.11.2016.
 */
public abstract class Hen implements Country
{
   public abstract int getCountOfEggsPerMonth();
    public String getDescription() {return "Я курица.";}

}
