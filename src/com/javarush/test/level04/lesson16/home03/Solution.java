package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        boolean t = true;
        int sum=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int b;

        while (t)
        {   String Sb = reader.readLine();
            b = Integer.parseInt(Sb);
            sum=sum+b;

           //if (b== -1)
             if (Sb.equals("-1"))          {

               System.out.println(sum); //ИМЕЛИ ВВИДУ, ЧТО СУММУ ВЫОДИТЬ ПРИ ВВОДЕ -1
               break;}


        }


        //напишите тут ваш код
    }
}
