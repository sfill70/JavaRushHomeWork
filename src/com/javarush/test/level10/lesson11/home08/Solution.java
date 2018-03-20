package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;
import java.util.Random;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String array[] = letters.split("");
        Random random = new Random();
        ArrayList<String>[] arrayOfStringList = new ArrayList[10];
        for (int k = 0; k < 10; k++)
        {
            ArrayList<String> list = new ArrayList<String>();
            for (int i = 0; i < 10; i++)
            {
                String res = "";
                for (int j = 0; j < random.nextInt(20); j++)
                {
                    res += array[random.nextInt(array.length)];
                }
                list.add(res);
            }
            arrayOfStringList[k] = list;
        }
        //напишите тут ваш код

        return arrayOfStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list : arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}