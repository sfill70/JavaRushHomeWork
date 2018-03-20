package com.javarush.test.level04.lesson10.task04;

import java.io.*;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int i = 1;
        while (i <= 10)
        {
            int n = 1;
            while (n <= 10)
            {
                System.out.print("S");

                if (n == 10)
                    System.out.print("\n");
                n++;

            }

            i++;
        }

        // Перевести каретку можно так
       /* int i = 1;
        while (i <= 10)
        {
            int n = 1;
            while (n <= 10)
            {
                System.out.print("S");


                n++;

            }
            System.out.print("\n"); // или просто System.out.println();
            i++;
        }    */   // пишите тут ваш код

    }
}
