package com.javarush.test.level09.lesson11.home09;

import java.util.*;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        Map <String,Cat> map = new HashMap<String, Cat>();


     /*   for (int i = 0; i < 10; i++) {
            String name = "The Cat # " + i;
         //   String name2 = "Cat" + i;
            Cat cat = new Cat(name);
            map.put(cat.getName(), cat); */

        Cat cat1 = new Cat("qwe");
        Cat cat2 = new Cat("asd");
        Cat cat3 = new Cat("zxc");
        Cat cat4 = new Cat("poi");
        Cat cat5 = new Cat("lkj");
        Cat cat6 = new Cat("mnb");
        Cat cat7 = new Cat("yui");
        Cat cat8 = new Cat("ytr");
        Cat cat9 = new Cat("hjk");
        Cat cat10 = new Cat("hgf");
        map.put (cat1.getName(), cat1);
        map.put (cat2.getName(), cat2);
        map.put (cat3.getName(), cat3);
        map.put (cat4.getName(), cat4);
        map.put (cat5.getName(), cat5);
        map.put (cat6.getName(), cat6);
        map.put (cat7.getName(), cat7);
        map.put (cat8.getName(), cat8);
        map.put (cat9.getName(), cat9);
        map.put (cat10.getName(), cat10);


       return map;
               //напишите тут ваш код
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set < Cat> set= new HashSet< Cat> ();
        Iterator<Map.Entry<String, Cat>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, Cat> pair = iterator.next();
            set.add(pair.getValue());  //getValue
        }
    //    set.addAll(map.keySet());


        return set;
        //напишите тут ваш код
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        public String getName()
        {
            return name;
        }

        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
