package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    int left = 0;
    int top = 0;
    int width = 0;
    int height = 0;

    public Rectangle(int left, int top, int width, int height)
    {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int left, int top)
    {
        this.left = left;
        this.top = top;
    }

    public Rectangle(int left, int top, int width)
    {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = width;
    }


    public Rectangle(Rectangle rectangle)
    {
        this.left = rectangle.left;
        this.top = rectangle.top;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public static void main(String[] args)
    {
      Rectangle rc1 = new Rectangle(3,4,5,7);
        System.out.println(rc1.width + " " + rc1.getWidth());
       int a = 11;
        rc1.setWidth(a);
        System.out.println(rc1.width + " "+ rc1.getWidth());
        rc1.setWidth(rc1.height);
        System.out.println(rc1.width);
    }
    //напишите тут ваш код

}
