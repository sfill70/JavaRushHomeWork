package com.javarush.test.level04.lesson13.task04;

import java.io.*;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {



        for(int i=1;i<=11;i++)
        {
            for(int k=1;k<=10;k++)
            {       if(i==1 || k==1 )
                System.out.print("8");
            }
            System.out.println();
        }

        //Так то же правильно но не красиво
      /*  int m = 10;
        //   int n = ;

        for (int i = 1; i <= m; i++)
        {
            for (int j = 1; j <= m; j++)
            {
                if (i == 1)
                {
                    System.out.print(8);
                }

            }
            System.out.println();
            System.out.print(8);
        }*/



        //напишите тут ваш код

    }
}
