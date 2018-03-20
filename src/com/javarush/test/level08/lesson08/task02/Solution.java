package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
   /* public static void main(String[] args)
    {


        //removeAllNumbersMoreThan10(createSet());
     //   System.out.println(createSet());
     //  System.out.println(removeAllNumbersMoreThan10(createSet()));
     //   HashSet set = createSet();
     //   System.out.println(set.contains(3));

    } */

    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(12);
        set.add(2);
        set.add(21);
        set.add(11);
        set.add(-1);
        set.add(31);
        set.add(-31);
        set.add(41);
        set.add(42);
        set.add(4);
        set.add(-4);
        set.add(54);
        set.add(5);
        set.add(-5);
        set.add(65);
        set.add(6);
        set.add(16);
        set.add(76);
        set.add(7);
        return set;
        //напишите тут ваш код

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()){

            Integer x = iterator.next();
            if (x>10)
                iterator.remove();


        }


       /* outer:
        for (Integer x: set)
               {
            if (x >10) {
               set.remove(x);
               continue outer;
           }
        }*/
        return set;
        //напишите тут ваш код

    }
}
