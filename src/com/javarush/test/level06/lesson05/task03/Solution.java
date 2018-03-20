package com.javarush.test.level06.lesson05.task03;

/* По 50 000 объектов Cat и Dog
Создать в цикле по 50 000 объектов Cat и Dog. (Java-машина должна начать уничтожать неиспользуемые, и метод finalize хоть раз да вызовется).
*/

public class Solution
{
    public static void main(String[] args)
    {
        for (int i=0; i<50000; i++){
            Cat cat = new Cat();
            Dog dog = new Dog();
        //    System.out.println(cat);

        }
        Cat cat = new Cat();                 // ЭТО К ДЕЛУ
        System.out.println(cat.catCount);     // НЕ
        System.out.println(cat.getCatCount());
        Cat.catCount = 100001;
        System.out.println(cat.catCount);
        cat.setCatCount(999);
        System.out.println(cat.catCount);
                                              //ОТНОСИТСЯ
        //напишите тут ваш код

    }
}
class Cat
{




    public static int catCount = 0;
    @Override
    protected void finalize() throws Throwable
    {
        super.finalize();
        System.out.println("Cat destroyed");
    }
    public Cat () {                       // ЭТО К ДЕЛУ
        this.catCount++;
    }
    public static int getCatCount()         // НЕ
    {
        return catCount;
    }
    public static void setCatCount(int catCount)
    {
        Cat.catCount = catCount;
    }
                                              //ОТНОСИТСЯ
}

class Dog
{
    @Override
    protected void finalize() throws Throwable
    {
        super.finalize();
        System.out.println("Dog destroyed");
    }
}