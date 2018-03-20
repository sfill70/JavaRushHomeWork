package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
   //    int max;
  //    int min;
   //         int mid;

    public static void main(String[] args) throws Exception
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine()); //короткий аналог записи ввода
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        inDecOrd(a, b, c);
        inDecOrd2(a, b, c);// 2 Метод

        //напишите тут ваш код
    }

    public static void inDecOrd(int a, int b, int c)
    {
        int n = max2(max2(a, b), c); // Минимум можно найти записав так же.
        int i2 = min2(a, b);
        int n2 = min2(i2, c);
        int m = a + b + c - n - n2;
        System.out.println(n + " " + m +
                " " + n2);

    }

    public static int max2(int a, int b)
    {
       /* int c=(a>=b) ? a : b;   // КАК ВАРИАНТ
       return c; */
        if (a >= b)
            return a;
        else
            return b;
    }

    public static int min2(int a, int b)
    {
       /* int c=(a>=b) ? a : b;   // КАК ВАРИАНТ
       return c; */
        if (a <= b)
            return a;
        else
            return b;
    }

    public static void inDecOrd2(int a, int b, int c)
    {
        int max=0;
      int min=0;
        int mid=0;
        // System.out.println (max + min +mid);

        if (a >= b && a >= c)
        {
            max = a;
            if (b > c)
            {
                mid = b;
                min = c;
            } else
            {
                mid = c;
                min = b;
            }

        }
        else if (b >= a && b >= c)
        {
            max = b;
            if (a > c)
            {
                mid = a;
                min = c;
            } else
            {
                mid = c;
                min = a;
            }

        }
        else if (c >= a && c >= b)
        {
            max = c;
            if (a > b)
            {
                mid = a;
                min = b;
            } else
            {
                mid = b;
                min = a;
            }
        }

        System.out.println( max+" "+mid+ " " + min);
               //System.out.println (max );
    }

}
