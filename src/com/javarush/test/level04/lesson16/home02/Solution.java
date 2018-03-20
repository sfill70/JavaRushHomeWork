package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
       int i = min(min(a, b), min(b, c));
        int j = max(max(a,b),max(b,c));
        System.out.println(a+b+c-i-j);


        //напишите тут ваш код
    }

    public static int min (int a, int b){
        if (a<b)
            return a;
        else
            return b;
        }
    public static int max (int a, int b){
        if (a>b)
            return a;
        else
            return b;
    }


}
