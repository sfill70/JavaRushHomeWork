package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int pos = 0;
        int neg = 0;

      int a;
        for (int i = 0; i < 3; i++)
        {
            a = Integer.parseInt(reader.readLine());
            if (a > 0)
                pos++;
            else
                neg++;
        }
      //Так массивом

     /* int[] arr = new int[3];
        for (int i = 0; i < 3; i++)
        {
            arr[i] = Integer.parseInt(reader.readLine());
            if (arr[i] > 0)
                pos++;
            else
                neg++;
        } */
        System.out.println("количество отрицательных чисел: " + neg);
        System.out.println("количество положительных чисел: " + pos);

        //напишите тут ваш код

    }
}
