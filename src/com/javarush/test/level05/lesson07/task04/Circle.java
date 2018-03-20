package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    //напишите тут ваш код

    int centerX;
    int CenterY;
    int radius;
    int width;
    String color;

    public void initialize(int centerX, int centerY, int radius)
    {
        this.centerX = centerX;
        CenterY = centerY;
        this.radius = radius;
    }

    public void initialize(int centerX, int centerY, int radius, int width)
    {
        this.centerX = centerX;
        CenterY = centerY;
        this.radius = radius;
        this.width = width;
    }

    public void initialize(int centerX, int centerY, int radius, int width, String color)
    {
        this.centerX = centerX;
        CenterY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }
}
