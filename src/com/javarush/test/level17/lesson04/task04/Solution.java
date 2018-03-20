package com.javarush.test.level17.lesson04.task04;

/* Синхронизированный президент
И снова Singleton паттерн - синхронизация в статическом блоке
Внутри класса OurPresident в статическом блоке создайте синхронизированный блок.
Внутри синхронизированного блока инициализируйте president.
*/

public class Solution {
    public static class OurPresident {

        private static OurPresident president;


        static
        {

            try
            {
                synchronized (OurPresident.class) {

                    if(president==null){
                    president =new OurPresident();}
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }


        }

        private OurPresident() {
        }



        public static OurPresident getOurPresident() {
            return president;
        }
    }

    public static void main(String[] args)
    {
        System.out.println(OurPresident.getOurPresident());
    }
}
