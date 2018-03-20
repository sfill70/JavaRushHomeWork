package com.javarush.test.level14.lesson08.bonus01;


import java.io.FileInputStream;
import java.lang.reflect.GenericSignatureFormatError;
import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try{Object fis = new FileInputStream("c:/10.txt");

        }catch(Exception e)
        {
            exceptions.add(e);
        }
        try{
            List<Integer>list=new ArrayList<>();
            for (int i = 0; i <3 ; i++)
            {
             list.add(i);
            }
            list.get(5);
        }catch(Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            List<Number>list=new ArrayList<Number>();
            float s = 2;
            list.add(s);
            int v = (int)list.get(0);

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
           String s = "1234567890987654321";
            int l = Integer.parseInt(s);
        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            String s = null;
            String m = s.toLowerCase();
        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            throw new IllegalArgumentException() ;

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            throw new IllegalAccessException () ;

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
    {
        throw new NoSuchMethodException () ;

    } catch (Exception e)
    {
        exceptions.add(e);
    }
        try
        {
            throw new UnsupportedOperationException () ;

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            throw new IllegalFormatCodePointException(2);

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        //Add your code here

    }
}
