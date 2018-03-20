package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        gcd(n, m);


    }


    public static void gcd(int m, int n)
    {
        n = n > 0 ? n : -n;
        m = m > 0 ? m : -m;
        if (n > m)
        {
            int tm;
            tm = m;
            m = n;
            n = tm;
        }
        int tmp = 0;
        while (n != 0)
        {
            tmp = m % n;
            m = n;
            n = tmp;
        }
        System.out.println(m);
    }

}
