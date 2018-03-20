package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.*;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(getCountTheSameFirstName(createMap(), "Иван"));
        System.out.println(getCountTheSameLastName(createMap(), "Хренов"));

      //  Prn (createMap());

    }


    public static HashMap<String, String> createMap()
    {
        HashMap <String,String> map = new HashMap<>();

        map.put("Иванов", "Иван");
        map.put("Сидоров", "Петр");
        map.put("Петров", "Сидор");
        map.put("Дункан", "Иссидора");
        map.put("Козлов", "Хрен");
        map.put("Хорьков", "Стефан");
        map.put("Пупкин", "Иван");
        map.put("Бобров", "Феофан");
        map.put("Арманьяков", "Коньяк");
        map.put("Хренов", "Иван");

        return map ;
        //напишите тут ваш код

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int Count = 0;
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(name))
               Count++;
              //  map.remove(pair.getKey());
        }


        /*Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, String> pair = iterator.next();
          //  String key = pair.getKey();            //ключ
           if (name.equals( pair.getValue()))
            {Count=Count+1;} //значение

                }*/
       return Count ;
        //напишите тут ваш код

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int Count = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, String> pair = iterator.next();
            //  String key = pair.getKey();            //ключ
            String key = pair.getKey();
            if (lastName.equals(key))
            Count=Count+1; //значение

        }
        return Count;
        //напишите тут ваш код
    }
   /* public static void Prn(HashMap<String, String> map){
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, String> pair = iterator.next();
            //  String key = pair.getKey();            //ключ
            System.out.println(pair.getValue()+" "+pair.getKey());


        }*/
    }

