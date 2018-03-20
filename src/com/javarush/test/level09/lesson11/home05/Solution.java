package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in) );
        String line= reader.readLine();

       line=line.replaceAll(" ", ""); //[\s]
        // String array[] = line.split("");
        char[] chArray = line.toCharArray();
        ArrayList<Character> listVowel = new ArrayList<>();
        ArrayList<Character> listConsonant = new ArrayList<>();
        char q = 32;
        for (int i = 0; i <chArray.length ; i++)
        {
            if ( Solution.isVowel(chArray[i]))
            {  listVowel.add(chArray[i]);
            listVowel.add(q);
            }

            else
            {  listConsonant.add(chArray[i]);
                listConsonant.add(' ');
            }
        }
        for (Character s: listVowel)
        {System.out.print(s);}
        System.out.println();
        for (Character s: listConsonant)
        {System.out.print(s);}
        System.out.println();
        char r = new Character(' ');
        int w = r;
        System.out.println(w);
  /*      System.out.println(chArray.length);
        System.out.println(chArray[4]);
        char r = 'a';     //напишите тут ваш код
        System.out.println(isVowel(chArray[4]));
        System.out.println(chArray[4]==r);
        System.out.println(listVowel.size());
        System.out.println(listConsonant.size());*/
    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }

        return false;
    }
}
