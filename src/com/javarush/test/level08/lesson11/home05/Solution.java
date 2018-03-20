package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        char[]chArray =s.toCharArray();    // Преобразуем в массив char
        if(chArray[0]!= ' ')   // проверка на неравенство пробелу, вместо ' ' можно 32.
            chArray[0] = Character.toUpperCase (chArray[0]);
        for (int i = 1; i <chArray.length ; i++){
            if (chArray[i]!= 32&& chArray [i-1]==' ')
                chArray [i] = Character.toUpperCase (chArray[i]); // Делаем заглавнуб первую после пробела букву
        }

        for (char ch:chArray){
            System.out.print(ch);
        }
        System.out.println();


        ArrayList <Character> chList = new ArrayList<Character>();
        for (char ch:chArray){
            chList.add(ch);
        }
        if(chArray[0]!= ' ')
        for (int i = 0; i <chList.size() ; i++)

        {
        System.out.println(chList.get(i));}



        String fromChar = new String(chArray); // Преобразование массива char в переменную (объект) String
        System.out.println(fromChar);





        String array[] = s.split(" ");
        String str="";
        for (int i = 0; i <array.length ; i++)
        {
         //   String t = array[i].substring(0,1).toUpperCase() + array[i].substring(1);
            if  (array[i].equals(""))
               str = str +" ";
            else
            {
                if (i < array.length - 1)
                    str = str + array[i].substring(0, 1).toUpperCase() + array[i].substring(1) + " ";
                else
                    str = str + array[i].substring(0, 1).toUpperCase() + array[i].substring(1);
                //   array [i]=t;
            }
        }
        System.out.println(str);

      /*  for (String word:array) {
            System.out.print(word + " ");
        }*/
        //напишите тут ваш код
    }


}
