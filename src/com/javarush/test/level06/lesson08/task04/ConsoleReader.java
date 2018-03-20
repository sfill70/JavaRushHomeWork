package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
boolean readBoolean() – читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false
Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода
*/

public class ConsoleReader
{
  // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String readString() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        return sA;
        //напишите тут ваш код

    }

    public static int readInt() throws Exception
    {
     //   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      // tring sA = reader.readLine();
     //int a = Integer.parseInt(sA);
       int a = Integer.parseInt(ConsoleReader.readString()); // Для чтения строки вызываем предыдущий метод(readString()) из этого класса ConsoleReader
        return a;                                             //НО ПО условию задачи это не верно "создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода"
        //напишите тут ваш код                                  Просто красиво как пример.

    }

    public static double readDouble() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
      /*  double a =*/ return Double.parseDouble(sA);  // Можно сразу return без дополнительной переменной.
     //   return a;
        //напишите тут ваш код

    }

    public static boolean readBoolean() throws Exception
    {BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        boolean a = Boolean.parseBoolean(sA);
        return a;
        //напишите тут ваш код

    }
}
