package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int sum=0;
       boolean t = true;
        String s = "сумма";
        while (t){
            String Si = reader.readLine();

            if (Si.equals(s)){
                System.out.println(sum);
            break;}
            int i = Integer.parseInt(Si);
            sum = sum+i;


        }

        //напишите тут ваш код
    }
}
