package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {

        ArrayList <String> arrMonth = new ArrayList<String>();
        arrMonth.add("January");        //напишите тут ваш код
        arrMonth.add("February");        //напишите тут ваш код
        arrMonth.add("March");        //напишите тут ваш код
        arrMonth.add("April");        //напишите тут ваш код
        arrMonth.add("May");        //напишите тут ваш код
        arrMonth.add("June");        //напишите тут ваш код
        arrMonth.add("July");        //напишите тут ваш код
        arrMonth.add("August");        //напишите тут ваш код
        arrMonth.add("September");        //напишите тут ваш код
        arrMonth.add("October");        //напишите тут ваш код
        arrMonth.add("November");        //напишите тут ваш код
        arrMonth.add("December");        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        for (int i = 0; i <arrMonth.size() ; i++)
        {   if (arrMonth.get(i).equals(month))
            System.out.println(month + " " + "is" + " " + (i+1)+ " " + "month"  );

        }

    }

}
