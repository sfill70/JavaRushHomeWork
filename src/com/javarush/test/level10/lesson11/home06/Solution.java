package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String name;
        String lastName;
        int age;
        public boolean sex ;
        String fromCountry;
        int namberPassport;

        public Human(String name)
        {
            this.name = name;
        }
        public Human(String name, String lastName)
        {
            this.name = name;
            this.lastName = lastName;
        }

        public Human(String name, String lastName, int age)
        {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
        }

        public Human(String name, String lastName, int age, boolean sex)
        {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, String lastName, int age, boolean sex, String fromCountry)
        {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
            this.fromCountry = fromCountry;
        }

        public Human(String name, String lastName, int age, boolean sex, String fromCountry, int namberPassport)
        {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
            this.fromCountry = fromCountry;
            this.namberPassport = namberPassport;
        }

        public Human(String name, int namberPassport)
        {
            this.name = name;
            this.namberPassport = namberPassport;
        }

        public Human(String name, boolean sex, String fromCountry)
        {
            this.name = name;
            this.sex = sex;
            this.fromCountry = fromCountry;
        }

        public Human(String name, String lastName, int age, String fromCountry)
        {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.fromCountry = fromCountry;
        }

        public Human(String name, String lastName, boolean sex, int namberPassport)
        {
            this.name = name;
            this.lastName = lastName;
            this.sex = sex;
            this.namberPassport = namberPassport;
        }
        //напишите тут ваши переменные и конструкторы
    }
}
