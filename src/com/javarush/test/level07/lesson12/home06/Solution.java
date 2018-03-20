package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human h1 = new Human("Дед1",true,  72, null, null );
        Human h2 = new Human("Дед2",true,  70, null, null );
        Human h3 = new Human("Баба1",false,  68, null, null );
        Human h4 = new Human("Баба2",false,  66, null, null );
        Human h5 = new Human("Отец",true,  40, h1, h3 );
        Human h6 = new Human("Мать",false,  38, h2, h4 );
        Human h7 = new Human("Сын",true,  18, h5, h6 );
        Human h8 = new Human("Дочь",false,  16, h5, h6 );
        Human h9 = new Human("Сын2",true,  14, h5, h6 );


        System.out.println(h1 + "\n" + h2 + "\n"+h3+"\n"+ h4+"\n"+h5 + "\n"+h6 + "\n"+ h7+ "\n"+h8 + "\n"+h9);
        //напишите тут ваш код
    }

    public static class Human
    {


        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        String name;
       public boolean sex ;
        int age;
        Human father;
        Human mother;


        //напишите тут ваш код

        @Override
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }


}
