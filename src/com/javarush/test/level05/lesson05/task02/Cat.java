package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat()
    {
    }

    public boolean fight(Cat anotherCat)
    {
        int a;
        int b;

        a =  this.weight+this.strength*2 - aGe(this.age);
        b =  anotherCat.weight +anotherCat.strength*2 - aGe(anotherCat.age);

        return a>b;

       //напишите тут ваш код

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


