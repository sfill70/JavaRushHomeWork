package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by Sfill on 07.12.2016.
 */
public class Singleton
{
    private Singleton () { }
    private static Singleton singleton = new Singleton();
    static Singleton getInstance() {return singleton;}
}
