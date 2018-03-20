package com.javarush.test.level04.lesson04.task04;

/* Время года
Реализовать метод checkSeason. По номеру месяца, метод должен определить время года (зима, весна, лето, осень) и вывести на экран.
Пример для номера месяца 2:
зима
Пример для номера месяца 5:
весна
*/

public class Solution
{
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
        //checkSeason(17);
      //  checkSeason(-21);
     //   checkSeason(5);
      //  checkSeason(51);

    }

    public static void checkSeason(int mount)
    {
        if (mount > 1)
        {
            if (mount < 3)
            {
                System.out.println("зима");
            } else
            {
                if (mount < 6)
                {
                    System.out.println("весна");
                } else
                {
                    if (mount < 9)
                    {
                        System.out.println("лето");
                    } else
                    {
                        if (mount < 12)
                        {
                            System.out.println("осень");
                        } else
                        {
                            if (mount < 13)
                            {
                                System.out.println("зима");
                            } else
                            {
                                // System.out.println("от 1 до 12");
                            }
                        }
                    }

                }
            }

        } else
        {
            // System.out.println("от 1 до 12");
        }
    }
       /* public static void checkSeason(int mount){ // ТАК ПРОЩЕ


            if ((mount >= 1) && (mount <= 2))
                System.out.println("зима");
            if ((mount >= 3) && (mount <= 5))
                System.out.println("весна");
            if ((mount >= 6) && (mount <= 8))
                System.out.println("лето");
            if ((mount >= 9) && (mount <= 11))
                System.out.println("осень");
            if (mount == 12)
                System.out.println("зима");
            if ((mount <= 0) || (mount >= 13))
                System.out.println("from 1-12");
        }*/

        //::CODE:

}