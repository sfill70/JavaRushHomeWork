package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
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
        int n = 0;

        if (a > 0)
            n = n + 1;
        if (b > 0)
            n = n + 1;
        if (c > 0)
            n = n + 1;
        System.out.println(n);


        //Так массивом и циклом

    /*  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        int sum = 0;
        for (int i = 0; i < 3; i++)
        {
            arr[i] = Integer.parseInt(reader.readLine());
            if (arr[i] > 0)
            {
                sum++;
            }
        }
        System.out.println(sum); */

        //напишите тут ваш код

    }
}
