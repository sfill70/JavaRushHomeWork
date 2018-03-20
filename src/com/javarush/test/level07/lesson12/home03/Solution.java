package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer[]array = new Integer[20];



        for (int i = 0; i<20; i++){
            array[i] = Integer.parseInt(reader.readLine());
        }
   //     Arrays.sort(array, Collections.reverseOrder());
        int  maximum = array [0] ;
        int  minimum = array[0];

        for (int i = 0; i<array.length; i++)
        {
            maximum = maximum > array[i] ? maximum : array[i];
            minimum = minimum < array[i] ? minimum : array[i];
        }



        //напишите тут ваш код


        System.out.println(maximum);
        System.out.println(minimum);
    }
}
