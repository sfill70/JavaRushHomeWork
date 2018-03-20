package com.javarush.test.level08.lesson11.home09;

import java.text.SimpleDateFormat;
import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        isDateOdd("JANUARY 1 2000");
      System.out.println(isDateOdd("JANUARY 1 2000"));
    }

    public static boolean isDateOdd(String date)
    {
       // String stringDateFormat = "MMMM dd yyyy";

      //  SimpleDateFormat format1 = new SimpleDateFormat("MMMM dd yyyy, Locale.US");
        Date d = new Date(date);
        d.setHours(0);
        d.setMinutes(0);
        d.setSeconds(0);


        Date nD = new Date();
        nD.setYear(d.getYear()) ;
        nD.setDate(1); // первое число
        nD.setHours(0);
        nD.setMinutes(0);
        nD.setSeconds(0);
        nD.setMonth(0);
        long msTimeDistance = d.getTime() - nD.getTime();
        long msDay = 24 * 60 * 60 * 1000;
        int dayCount = (int) (msTimeDistance/msDay);

       boolean chet = dayCount%2!=0 ? true : false;

        return chet;
    }
}
