package com.javarush.test.level05.lesson05.task05;

/* Провести три боя  попарно между котами
Создать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat( "Tom", 3, 4,4) ;
        Cat cat2 = new Cat("Vasya",6, 3,6);
        Cat cat3 =  new  Cat("Gav",2 ,2,5);
        boolean t1 = cat1.fight(cat2);
        boolean t2 = cat1.fight(cat3);
        boolean t3 = cat2.fight(cat3);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

       //напишите тут ваш код
    }

    public static class Cat {

        public static int count = 0;
        public static int fightCount = 0;

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight1(Cat anotherCat) {
            fightCount++;

            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
        public boolean fight(Cat anotherCat)
        {
            int a;
            int b;

            a =  this.weight+this.strength*2 - aGe(this.age);
            b =  anotherCat.weight +anotherCat.strength*2 - aGe(anotherCat.age);

            return a>b;

             }
    private static  int aGe (int age)
    {
        int i=0;
        if (age <= 1 || (age > 10)&&(age<12))
            i= 2;
        if  (age > 1 && age < 3|| age>=5&&age<=10)
            i= 4;
        if (age >= 3 && age < 5)
            i= 6;
        if (age >= 12)
            i= 1;
        return i;
    }

    }
}
