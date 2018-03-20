package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String name2 = reader.readLine();
        int lname = name.length();
        int lname2 = name2.length();

        if (name.equals(name2))
            System.out.println("Имена идентичны");
        else if (lname==lname2)
            System.out.println("Длины имен равны");
        //напишите тут ваш код

    }
}
