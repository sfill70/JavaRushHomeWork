package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста.
 А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    //напишите тут ваш код
    String name;
    int age = 5;
    int weight = 3;
    String color;
    String address;

    public void initialize(String name)
    {
        this.name = name;
    }
    public void initialize(String name,int weight, int age)
    {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public void initialize(String name, int age)
    {
        this.name = name;
        weight = 3;
        this.age = age;
    }
   // public void initialize(String color,double weight)
   public void initialize (int weight, String color)
    {

        this.color = color;
        this.weight = weight;
    }
    public void initialize (int weight,String color, String address)
    {

        this.color = color;
        this.weight = weight;
        this.address = address;
    }

  /*  public static void main(String[] args)
    {
        Cat cat3 =  new Cat ("rad", 4);
        System.out.println(cat3.address);

    }*/


    //напи
}
