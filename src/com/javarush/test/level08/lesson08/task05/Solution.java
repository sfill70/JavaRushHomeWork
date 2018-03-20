package com.javarush.test.level08.lesson08.task05;

import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap map = createMap();
        System.out.println(map);
        System.out.println(map.values());

        removeTheFirstNameDuplicates(map);

         System.out.println(map);

    }

    public static HashMap<String, String> createMap()
    {
        HashMap <String,String> map = new HashMap<>();

        map.put("Иванов", "Иван");
        map.put("Сидоров", "Петр");
        map.put("Петров", "Сидор");
        map.put("Дункан", "Иссидора");
        map.put("Козлов", "Хрен");
        map.put("Иванов", "Стефан");
        map.put("Пупкин", "Иван");
        map.put("Бобров", "Феофан");
        map.put("Арманьяков", "Петр");
        map.put("Хренов", "Илюмжин");

        return map ;
         //напишите тут ваш код

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {

        ArrayList <String> list = new ArrayList<>(map.values()); // Создаем ArrayList из values map"ы
        String[] myArray = {}; // конвертируем ArrayList в массив
        myArray = list.toArray(new String[list.size()]);
        Arrays.sort(myArray);
        System.out.println(myArray[3]);
        for (String name:myArray)
        System.out.println(name);
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (getCountTheSameFirstName(copy,pair.getValue())>1) // вызываем метод который считает сколько раз value (значение) повторяется в Мар -  если больше одного удаляем, ArrayList не нужн.
           // if ( Collections.frequency(list, pair.getValue())>1) //используя метод frequency считаем сколько раз элемент повторятся в Коллекции (ArrayList'е)
            {
                removeItemFromMapByValue(map,pair.getValue()); // если больше одного удаляем.
            }


        }


        //напишите тут ваш код

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
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
}
