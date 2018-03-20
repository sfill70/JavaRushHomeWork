package com.javarush.test.level04.lesson04.task09;

/* Светофор
Работа светофора для пешеходов запрограммирована следующим образом: в начале каждого часа в течение трех минут горит зеленый сигнал,
затем в течение одной минуты — желтый, а потом в течение одной минуты — красный, затем опять зеленый горит три минуты и т. д.
Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
Определить, сигнал какого цвета горит для пешеходов в этот момент.
Результат вывести на экран в следующем виде:
"зеленый" - если горит зеленый цвет, "желтый" - если горит желтый цвет, "красный" - если горит красный цвет.
Пример для числа 2.5:
зеленый
Пример для числа 3:
желтый
Пример для числа 4:
красный
Пример для числа 5:
зеленый
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sT = reader.readLine();
        double t = Double.parseDouble(sT);
        if ((t % 5 < 3) || (t < 3 && t >= 0))
            System.out.println("зеленый");
        else if ((t % 5 >= 3) && (t % 5 < 4) || (t >= 3 && t < 4))
            System.out.println("желтый");
        else if ((t % 5 >= 4) && (t % 5 < 5) || (t >= 4 && t < 5))
            System.out.println("красный");

        metoda(t);
    }
    //напишите тут ваш код

    // Или через FOR
    public static void metoda(double t)
    {
        if (t < 0 || t > 60)
            System.out.println("Неверное число");
        else

            for (int i = 0; i < 12; i++)
            {
                if (t >= i * 5 && t < i * 5 + 3)
                    System.out.println("G");
                else if (t >= i * 5 + 3 && t < i * 5 + 4)
                    System.out.println("Y");
                else if (t >= i * 5 + 4 && t < i * 5 + 5)
                    System.out.println("R");
            }
    }
}
