package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        int[] arrayBig = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++)
        {
            arrayBig[i] = Integer.parseInt(reader.readLine());
        }
        int[] arrayLittle1 = new int[10];
        int[] arrayLittle2 = new int[10];

       // ТАК ЦИКЛОМ

       for (int i = 0; i < arrayBig.length/2; i++)
        {

            arrayLittle1[i] = arrayBig[i];
            arrayLittle2[i] = arrayBig[arrayBig.length/2 + i];
        }

        // ЧЕРЕЗ arraycopy.

        System.arraycopy(arrayBig, 0, arrayLittle1, 0, 10);
        System.arraycopy(arrayBig, 10, arrayLittle2, 0, 10);

        for (int i = 0; i < 10; i++)
        {
            System.out.println(arrayLittle2[i]);
        }

        //напишите тут ваш код


    }
}
