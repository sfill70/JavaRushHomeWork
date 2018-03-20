package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Sfill on 30.11.2016.
 */
public class RussianHen extends Hen
{
    public  int getCountOfEggsPerMonth() {return 22;}
    public String getDescription() {return super.getDescription() + " Моя страна - Russia. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";}
}
