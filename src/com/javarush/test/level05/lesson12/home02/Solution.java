package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
       public static void main(String[] args)
    {
        Man man1 = new Man("Tom", 35, "st.Lenina 10");
        Man man2 = new Man("Dick", 31, " av.Sovetskaya 28");
        Woman woman1 = new Woman("Marfa", 22, "st.Mira 6");
        Woman woman2  = new Woman("Masha", 28, "sq.Pobedi 17");

        //создай по два объекта каждого класса тут

        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
        //выведи их на экран тут
    }

    public static class Man {
    String name;
    int age = 0;
    String address;

        public Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
    //добавьте тут ваши классы
}
