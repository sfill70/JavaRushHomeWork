package com.javarush.test.level10.lesson11.home04;

/* Большая зарплата
Вывести на экран надпись «Я не хочу изучать Java, я хочу большую зарплату» 40 раз по образцу.
Образец:
Я не хочу изучать Java, я хочу большую зарплату
 не хочу изучать Java, я хочу большую зарплату
не хочу изучать Java, я хочу большую зарплату
е хочу изучать Java, я хочу большую зарплату
 хочу изучать Java, я хочу большую зарплату
хочу изучать Java, я хочу большую зарплату
…
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";

      //  System.out.println(s.indexOf(""));

        for (int i=0; i<40; i++){
           System.out.println(s.substring (i,s.length()));}


     /*   char[] chArray = s.toCharArray();   // Способ с помощю Char массива и метода remove внизу.
       char [] arr= new char [chArray.length];
        arr = chArray;
        for (int i=0; i<40; i++)
        { arr = remove(arr, 0);
        System.out.println(arr);}

        //  chArray.[0];
        //    System.out.println(chArray);*/
        //напишите тут ваш код
    }


        public static char[] remove ( char[] symbols, int index)
        {
            for (int i = 0; i < symbols.length; i++)
            {
                if (i == index)
                {
                    char[] copy = new char[symbols.length - 1];
                    System.arraycopy(symbols, 0, copy, 0, i);
                    System.arraycopy(symbols, i + 1, copy, i, symbols.length - i - 1);
                    return copy;
                }
            }
            return symbols;
        }


}
