package com.javarush.test.level05.lesson05.task04;

/* Создать три объекта типа Cat
В методе main создать три объекта типа Cat и заполнить их данными.
Использовать класс Cat из первой задачи. Класс Cat создавать не надо.
*/

public class Solution {
    public static void main(String[] args) {
        new Cat( "Tom", 3, 4,4) ;
        new Cat("Vasya",6, 3,5);
        new  Cat("Gav",2 ,2,4);
      //  Cat cat = new Cat("Osip", 4 , 2, 2);
     //   System.out.println(cat.count);
        //напишите тут ваш код
    }

    public static class Cat {

        public static int count = 0;
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }



    }

}
