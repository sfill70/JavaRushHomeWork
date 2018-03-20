package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Sfill on 30.11.2016.
 */
public class BelarusianHen extends Hen
{
    public  int getCountOfEggsPerMonth() {return 20;}
    public String getDescription() {return super.getDescription() + " Моя страна - Belarus. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";}
}
