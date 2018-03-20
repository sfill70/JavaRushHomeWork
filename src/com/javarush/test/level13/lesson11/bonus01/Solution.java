package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        InputStream inStream = new FileInputStream( file);
        ArrayList<Integer> listInt = new ArrayList<Integer>();
        String st = new String();
        char ch = 'a';
        while (inStream.available() > 0)
        {
            int data = inStream.read(); //читаем один байт из потока для чтения

            if ((char) data == '1' || (char) data == '2' || (char) data == '3' || (char) data == '4' || (char) data == '5' || (char) data == '6' || (char) data == '7' || (char) data == '8' || (char) data == '9' || (char) data == '0' || (char) data == '-')
            {
                if ((char) data == '-' &&  (ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9' || ch == '0'))
                {listInt.add(Integer.parseInt(st));

                    ch = (char) data;
                    st="" + ch;
                }
                else
                { st = st + (char) data;
                    ch = (char) data;}
                if (inStream.available() == 0 && (char) data != '-') // Последний байт, который теряется
                {
                listInt.add(Integer.parseInt(st));
             }
            }
            else
            {
                if (ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9' || ch == '0')
                {
                    listInt.add(Integer.parseInt(st));
                    st = "";
                    ch = 'a';
                }
            }
        }

        inStream.close();
        reader.close();
        System.in.close();

        for (int i = 0; i < listInt.size(); i++)// удаляем не четные числа, не забыть i = i - 1;
        {
            if (listInt.get(i) % 2 != 0)
            {
                listInt.remove(i);
                i = i - 1;
            }
        }

        Collections.sort(listInt);
        for (Integer i : listInt)
        {
            System.out.println(i);
        }

        System.out.println(Integer.parseInt("111"));
        // напишите тут ваш код
    }
}
