package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine()); //короткий аналог записи ввода
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        String sD = reader.readLine();               // длинная запись ввода
        int d = Integer.parseInt(sD);
        if (a >= b && a >= c && a >= d)
            System.out.println(a);
        else if (b >= a && b >= c && b >=d)
            System.out.println(b);
        else if (c >= a && c >= b && c >= d)
            System.out.println(c);
        else if (d>=a&&d>=b&&d>=c)
            System.out.println(d);

        System.out.println(max4(a,b,c,d)); // ИЛИ так с помощю методов
        //напишите тут ваш код

    }


    public static int max4 (int a, int b, int c, int d){
        int i=max2(a,b);
        int n=max2(c,d);
        int m = max2(i,n);
        return m;
            }

    public static int max2 (int a, int b){
       /* int c=(a>=b) ? a : b;   // КАК ВАРИАНТ
       return c; */
        if (a>=b)
            return a;
        else
        return b;
    }
    //  public static int vvod () throws Exception {
    //  for (int i = 0; i < 4; i++)
    // int a;
    //      //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    //  String sA = reader.readLine();
    //    int a = Integer.parseInt(sA);
    //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    // int (a+"i") = Integer.parseInt(reader.readLine());}
    //  }
}
