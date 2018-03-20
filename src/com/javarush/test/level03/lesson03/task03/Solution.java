package com.javarush.test.level03.lesson03.task03;

/* 10 процентов
Реализуйте метод addTenPercent, который увеличивает переданное целое число на 10%.
Исправьте ошибку в сигнатуре метода.
Подсказка: подумайте, какие у этого метода входные и выходные данные.
*/
public class Solution
{
    public  static double  addTenPercent(double i)
    {
        double a;
       // if (i>=0)
        a = i+i * 0.1; // правильно так, не учитываются отрицательные числа
        // else a = i-i*0.1;
         return a;
        //напишите тут ваш код
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(10));
    }
}
