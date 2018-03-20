package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        int a = Integer.parseInt(sA);
       /* if (a>0)
            System.out.println("Ok");
        else
        {
            System.out.println("не Ок");
            return;
        }*/
        String sB = reader.readLine();
        int b = Integer.parseInt(sB);
       /* if (b>0)
            System.out.println("Ok");
        else
        { System.out.println("не Ок");
            return;}*/
        String sC = reader.readLine();
        int c = Integer.parseInt(sC);
        if (a==b&&b==c)
        System.out.println(a+" "+ b+" "+c);
        else
        {
            if (a == b)
                System.out.println(a + " " + b);
            else
            {
                if (a == c)
                    System.out.println(a + " " + c);
                else
                {
                    if (b == c)
                        System.out.println(b + " " + c);
                }
            }
        }
       /* ВОТ ТАК БЕЗ СКОБОК
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        int a = Integer.parseInt(sA);

        String sB = reader.readLine();
        int b = Integer.parseInt(sB);

        String sC = reader.readLine();
        int c = Integer.parseInt(sC);
        if (a == b && b == c)
            System.out.println(a + " " + b + " " + c);
        else if (a == b)
            System.out.println(a + " " + b);
        else if (a == c)
            System.out.println(a + " " + c);
        else if (b == c)
            System.out.println(b + " " + c); */


        // напишите тут ваш код

    }
}