package com.javarush.test.level14.lesson08.home09;

/**
 * Created by Sfill on 05.12.2016.
 */
public class USD extends Money
{
   // private double amount;
    public USD (double amount) {
        super (amount);
    }

    public  String getCurrencyName() { return "USD";}
}
