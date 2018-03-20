package com.javarush.test.level15.lesson12.home09;
import java.io.*;
/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Solution {


    public static void main(String[] args) throws IOException {



        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        s=s.substring((s.indexOf("?"))+1);
      //  System.out.println(s);
        String [] array = s.split("&");

        for (int i = 0; i <array.length ; i++)
        {
            array [i]= array [i].replaceAll( "['?']","" );
            array [i]=array[i].replaceAll("&","");
            array [i]=array[i].replaceAll(" ","");
           // System.out.println(array[i].toCharArray()     );
        }
        System.out.println(array.length);

        List<String> list = new ArrayList<String>();
        for (int i = 0; i <array.length ; i++)
        {
            if (array[i].equals(null)||array[i].equals("")||array[i].equals(" ")||array[i].isEmpty()||array[i]==null)
            {
                System.out.println(i);

            }
            else {list.add(array[i]);}

        }
        System.out.println(list);

        for (String st:list){
            System.out.print(st + "  ");
        }
        System.out.println();

        for (String st:list){
            if (st.contains("="))
            {System.out.print((st.substring(0, st.indexOf("="))) + " ");}
            else {
                System.out.print(st+" ");
            }
        }
        System.out.println();

        System.out.println();
        for (String st:list){
            if (st.contains("=")&&(st.substring(0, st.indexOf("=")).equals("obj"))&&! (st.substring(st.indexOf("=")+1 )).isEmpty() )
            {

                try
                {
                    alert(Double.parseDouble(st.substring(st.indexOf("=")+1 )));
                }
                catch (Exception e){
                    alert(st.substring((st.indexOf("="))+1));
                }
            }
        }
        //add your code here
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
