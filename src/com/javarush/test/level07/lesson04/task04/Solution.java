package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;


/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Integer [] arrayInt = new Integer[10];
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i<10; i ++){
            arrayInt [i] = Integer.parseInt(reader.readLine()) ;
        }

       /* int tmp;
        for (int i = 0; i < arrayInt.length/2; ++i) {
            tmp = arrayInt[i];
           arrayInt[i] = arrayInt[arrayInt.length -1- i ];
            arrayInt[arrayInt.length -1- i ] = tmp;
        } */

        Arrays.sort(arrayInt , Collections.reverseOrder()); // ЗАМЕНЯЕТ ЦИКЛ ДАННЫЕ В МАССИВЕ  Integer !!

        for (int i =0; i<arrayInt.length; i++){
            System.out.println(arrayInt[i]);
        }


               //напишите тут ваш код

    }
}
