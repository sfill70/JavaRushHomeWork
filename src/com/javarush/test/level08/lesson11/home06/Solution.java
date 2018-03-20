package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/


import java.util.ArrayList;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args)
    {
        Human h1 = new Human("Сын1",true,  14 );
        Human h2 = new Human("Дочь1",false,  11 );
        Human h3 = new Human("Сын2",true, 8 );
        Human h4 = new Human("Отец",true, 46, h1,h2,h3 );
        Human h5 = new Human("Мать",false, 42,h1,h2,h3);
        Human h6 = new Human("Дед1",true, 69, h4 );
        Human h7 = new Human("Баба1",false, 67,h4);
        Human h8 = new Human("Дед2",true, 71, h5 );
        Human h9 = new Human("Баба2",false, 68,h5);
        Human h10 = new Human("Прапра",false, 101,h6,h7,h8,h9);

        System.out.println(h1 + "\n" + h2 + "\n"+h3+"\n"+ h4+"\n"+h5 + "\n"+h6 + "\n"+ h7+ "\n"+h8 + "\n"+h9 + "\n"+h10);
        System.out.println(h10.children);

      //напишите тут ваш код
    }

    public static class Human
    {
        String name;
        public boolean sex ;
        int age;
        ArrayList<Human> children;// = new ArrayList<Human>();

        public Human(String name, boolean sex, int age,  Human ... args   )
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<Human>(Arrays.asList(args));//

            // Или так переносим args в ArrayList children
           /* this.children = new ArrayList<Human>();// Или так переносим args в ArrayList children/
            for (Human h : args){
                children.add(h);
            }*/
        }


     /*   public Human(String name, boolean sex, int age  )
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<Human>();

        }
        public Human(String name, boolean sex, int age, Human h  )
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<Human>();

            children.add(h);
        }
        public Human(String name, boolean sex, int age, Human h, Human hu  )
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<Human>();
            children.add(h);
            children.add(hu);
        }

        public Human(String name, boolean sex, int age, Human h, Human hu, Human hum  )
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<Human>();
         //   if (h!=null )
            children.add(h);
         //   if (hu!=null )
            children.add(hu);
         //   if (hum!=null )
            children.add(hum);
        }*/






        //напишите тут ваш код

        @Override
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
