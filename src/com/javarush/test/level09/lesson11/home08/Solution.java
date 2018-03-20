package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        int[] arr1 = new int [5];



        for(int i = 0; i < arr1.length; i++){
            arr1[i] = (int)(Math.random()*100); // это случайными 100
        }

        int[] arr2 = new int [2];
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = (int)(Math.random()*98); // это случайными 100
        }

       int[] arr3 = new int [4];
        for(int i = 0; i < arr3.length; i++){
            arr3[i] = (int)(Math.random()*100); // это случайными 100
        }

        int[] arr4 = new int [7];
        for(int i = 0; i < arr4.length; i++){
            arr4[i] = (int)(Math.random()*100); // это случайными 100
        }

      /*  for (int x: arr4)
        {
            System.out.print(x);
        }*/
        int[] arr5 = new int [0];
             for(int i = 0; i < arr5.length; i++){
                arr5[i] = (int)(Math.random()*100); // это случайными 100
            }

        ArrayList <int[]> list = new ArrayList<int[]>();

        list.add(arr1);
        list.add(arr2);
        list.add(arr3);
        list.add(arr4);
        list.add(arr5);

        return list;
       /* for(int i = 0; i < arr1.length; i++){
            arr1[i] = (int)(Math.random()*100); // это случайными 100
        }*/
        //напишите тут ваш код
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
