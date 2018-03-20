package com.javarush.test.level04.lesson04.task08;

/* Треугольник
Ввести с клавиатуры три числа а, b, c – стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам. Результат вывести на экран в следующем виде:
"Треугольник существует." - если треугольник с такими сторонами существует.
"Треугольник не существует." - если треугольник с такими сторонами не существует.
Подсказка: Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше суммы двух других, то треугольника с такими сторонами не существует.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        int a = Integer.parseInt(sA);
        if (a>0)
            System.out.println("Ok");
        else
        {
            System.out.println("не Ок");
            return;
        }

        String sB = reader.readLine();
        int b = Integer.parseInt(sB);
        if (b>0)
            System.out.println("Ok");
        else
        { System.out.println("не Ок");
            return;}
        String sC = reader.readLine();
        int c = Integer.parseInt(sC);
        /* if (c>0)
            System.out.println("Ok");
        else
        {System.out.println("не Ок");
        return;} */

        if ((a<b+c)&&(b<a+c)&&(c<a+b))
            System.out.println("Треугольник существует.");
        else
            System.out.println("Треугольник не существует.");

        //напишите тут ваш код

    }
}