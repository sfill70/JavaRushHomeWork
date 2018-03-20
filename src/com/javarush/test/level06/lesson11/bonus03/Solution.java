package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList num = new ArrayList();
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
       for (int i=0; i<5; i++)
       {
           int m = Integer.parseInt(reader.readLine());
           num.add(m);
       }
        Collections.sort(num);
        for (int i = 0; i<num.size(); i++) {
            System.out.println(num.get(i));
        }

      //  System.out.println(num.size());




        //напишите тут ваш код
    }
}
