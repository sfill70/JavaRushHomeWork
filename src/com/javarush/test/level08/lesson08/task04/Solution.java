package com.javarush.test.level08.lesson08.task04;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{

  /*  public static void main(String[] args)
    {

      //  System.out.println(map);
        HashMap map = removeAllSummerPeople(createMap());
        System.out.println(map);

    } */


    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Cannelloni", new Date("Sep 6 1990"));
        map.put("Macaroni", new Date("April 10 1970"));
        map.put("Anellini", new Date("January 5 1975"));
        map.put("Lasagne", new Date("AUGUST 8 1985"));
        map.put("Capellini", new Date("JUNE 12 1995"));
        map.put("Fettuccine", new Date("March 25 1995"));
        map.put("Linguine", new Date("JUNE 25 1995"));
        map.put("Ravioli", new Date("November 15 1995"));
        map.put("Pizza", new Date("JULY 5 1975"));

        return map;
        //напишите тут ваш код

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
       // SimpleDateFormat format4 = new SimpleDateFormat("MM");
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, Date> pair = iterator.next();
          //  String key = pair.getKey();
            Date d =pair.getValue();
             //  if (format4.format(pair.getValue()).equals("06")||format4.format(pair.getValue()).equals("07")||format4.format(pair.getValue()).equals("08")) // Пипец надо пользоваться методами ДАТЫ
            if ( d.getMonth() > 4 && d.getMonth() < 8) // Месяцы считаются с 0, январь = 0
            { /*System.out.println(key + " " +format4.format(d));*/
            iterator.remove();
            }

        }
    //    return map;

        //напишите тут ваш код

    }
}
