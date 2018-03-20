package com.javarush.test.level09.lesson11.home01;

/* Деление на ноль
Создай метод public static void divisionByZero, в котором подели любое число на ноль и выведи на экран результат деления.
Оберни вызов метода divisionByZero в try..catch. Выведи стек-трейс исключения используя метод exception.printStackTrace()
*/

public class Solution {

    public static void main(String[] args) {


        try
        {
            divisionByZero();
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
           // exception.printStackTrace(System.out);
        }
        System.out.println("fgghj");
    }



public static void divisionByZero () {
    int a = 5;
    int b = a/0;
    System.out.println(b);
}
    /* public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }*/
}