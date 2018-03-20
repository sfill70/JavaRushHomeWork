package com.javarush.test.level06.lesson08.task03;
import java.io.*;
/* Класс Util
Реализовать статический метод double getDistance(x1, y1, x2, y2). Он должен вычислять расстояние между точками.
Используй метод double Math.sqrt(double a), который вычисляет квадратный корень переданного параметра
*/

public class Util
{
    public static double getDistance(int x1, int y1, int x2, int y2)
    {
       double x = x1-x2;
       double y = y1-y2;
     //   y = y>0 ? y : -y;
      // double z = Math.sqrt(x*x +y*y);
        return  Math.sqrt(x*x +y*y);
        //напишите тут ваш код

    }

   /* public static void main(String[] args)
    {


        System.out.println( getDistance(-8,-9,2,3));

    }*/



}


