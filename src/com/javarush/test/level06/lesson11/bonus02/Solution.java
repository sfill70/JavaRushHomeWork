package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку(папин папа), бабушку(мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Cat.cats.add (0,null);

        String name0 = reader.readLine();
        Cat cat0 = new Cat(name0 );
            Cat.cats.add (Cat.countCat,cat0);

        String name1 = reader.readLine();
        Cat cat1 = new Cat(name1);
            Cat.cats.add (Cat.countCat,cat1);

        String name2 = reader.readLine();
        Cat cat2 = new Cat(name2,Cat.cats.get(Cat.countCat-1), null );
            Cat.cats.add (Cat.countCat,cat2);

        String name3 = reader.readLine();
        Cat cat3 = new Cat(name3,null, Cat.cats.get(Cat.countCat-1) );
        Cat.cats.add (Cat.countCat,cat3);

        String name4 = reader.readLine();
        Cat cat4 = new Cat(name4, Cat.cats.get(Cat.countCat-1),Cat.cats.get(Cat.countCat) );
        Cat.cats.add (Cat.countCat,cat4);

        String name5 = reader.readLine();
        Cat cat5 = new Cat(name5, Cat.cats.get(Cat.countCat-2),Cat.cats.get(Cat.countCat-1) );
        Cat.cats.add (Cat.countCat,cat5);

        for (int i = 1; i <= Cat.countCat; i++)  // ИЛИ ТАК
        {
            System.out.println(Cat.cats.get(i));
        }

      //      System.out.println(Cat.cats);


     //   Cat.cats.add (Cat.countCat+1,null);
      //  System.out.println(Cat.cats.get(Cat.countCat+1));

   //     System.out.println(catMother);
    //    System.out.println(catChild);

    }

    public static class Cat
    {
        public static ArrayList<Cat> cats = new ArrayList<Cat>();
        static int countCat=0;
        private String name;
        private Cat mother;
        private Cat father;
      //  private Cat parent;

        Cat(String name)
        {
            this.name = name;
            countCat++;
        }

     /*   Cat(String name, Cat parent)
        {
            this.name = name;
            this.parent = parent;
            countCat++;
        }*/

        Cat(String name, Cat father,Cat mother )
        {
            this.name = name;
            this.mother = mother;
            this.father = father;
            countCat++;

        }


        @Override
        public String toString()
        {
            if (mother == null&&father == null)
                return "Cat name is " + name + ", no mother" + ", no father";
            if  (mother!= null &&father == null)
                return "Cat name is " + name + ", mother is " + mother.name + ", no father";
            if  (mother== null &&father != null)
                return "Cat name is " + name + ", no mother" + ", father is " +father.name;
            else  //(mother!= null &&father != null)
                return "Cat name is " + name + ", mother is " + mother.name + ", father is " +father.name;
        }
    }

}
