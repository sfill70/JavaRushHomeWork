package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 5; i++)
        {
            list.add(reader.readLine());
        }
        int tmp = 0;
        int max = 0;
        for (int i = 0; i < list.size(); i++)
        {
            if (tmp < list.get(i).length())
            {
                tmp = list.get(i).length();
                max = i;
            }
        }
        System.out.println(list.get(max));

        for (int i = 0; i < list.size(); i++){
            if (list.get(max).length() == list.get(i).length() && max!=i){
                System.out.println(list.get(i));
            }

        }
      //  System.out.println(list.get(1).length());
     //   System.out.println(list.get(4).length());
     //   int x = list.get(4).length() == list.get(1).length() ?1:0;
     //   System.out.println(x);

        //напишите тут ваш код

    }
}
