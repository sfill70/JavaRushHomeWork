package com.javarush.test.level04.lesson01.task01;

/* Shadowing variables
Подумайте, что делает программа.
Исправьте ошибку в программе чтобы переменная age объекта person изменила свое значение.
Подсказка: тщательно просмотрите метод adjustAge
*/
public class Solution
{
    public static void main(String[] args)
    {

        Person person = new Person();
        System.out.println("Age is: " + person.age);
        person.adjustAge(person.age);
        System.out.println("Adjusted Age is: " + person.age);
        System.out.println("SDF" + person.getAge());
        person.setAge(50);
        System.out.println(person.age);

    }

    public static class Person
    {
        public int getAge()
        {
            return age;
        }

        public void setAge(int age)
        {
            this.age = age;
        }


        public int age = 20;

        public void adjustAge(int a)
        {
            a = age + 20;
            System.out.println("The Age in adjustAge() is " + a);
            age = a;

        }
    }
}
