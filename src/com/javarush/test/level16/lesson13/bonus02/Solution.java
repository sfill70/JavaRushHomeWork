package com.javarush.test.level16.lesson13.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Клубок
1. Создай 5 различных своих нитей c отличным от Thread типом:
1.1. нить 1 должна бесконечно выполняться;
1.2. нить 2 должна выводить "InterruptedException" при возникновении исключения InterruptedException;
1.3. нить 3 должна каждые полсекунды выводить "Ура";
1.4. нить 4 должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться;
1.5. нить 5 должна читать с консоли цифры пока не введено слово "N", а потом вывести в консоль сумму введенных цифр.
2. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном порядке.
3. Нити не должны стартовать автоматически.
Подсказка: Нить 4 можно проверить методом isAlive()
*/

public class Solution
{
    public static List<Thread> threads = new ArrayList<Thread>(5);

    static
    {
        threads.add(new TheardInfinity());
        threads.add(new TheardIntExcept());
        threads.add(new TheardUra());
        threads.add(new TheardMessage());
        threads.add(new TheardReadNum());

    }

    public static class TheardInfinity extends Thread /*implements Runnable*/
    {
        public TheardInfinity()
        {
            super();
        }

        public void run()
        {
            while (!interrupted())
            {
            }
        }
    }


    public static class TheardIntExcept extends Thread /*implements Runnable*/
    {
        public TheardIntExcept()
        {
            super();
        }


        public void run()
        {

            try
            {

                while (!/*Thread.*/interrupted())
                {
                    System.out.println("ThE");
                    Thread.sleep(1000);

                }
                //    throw new InterruptedException();
            }
            catch (InterruptedException e)
            {
                System.out.println("InterruptedException");

            }

        }
    }


    public static class TheardUra extends Thread /*implements Runnable*/
    {

        public TheardUra()
        {
            super();
        }

        public void run()
        {

            try
            {
                while (!interrupted())
                {
                    System.out.println("Ура");
                    sleep(500);
                }
            }
            catch (InterruptedException e)
            {
                //e.printStackTrace();
            }
        }
    }

    public static class TheardMessage extends Thread implements Message  /*Runnable,*/
    {
        public TheardMessage()
        {
            super();
        }

        //   private static Thread current = Thread.currentThread();

        public void showWarning()
        {
            this.interrupt();
            try
            {
                this.join();
            }
            catch (Exception e)
            {
            }


        }

        public void run()
        {

            Thread current = Thread.currentThread();

            /*do
            {
                if (isInterrupted()){
                    System.out.println("Прощай, любимый мой, родной!");
                }
            }while (!isInterrupted());*/



            while (!current.interrupted())
            {
                 System.out.println("messege");
            }


           /* while (*//*!interrupted()*//* *//*!Thread.currentThread().isInterrupted()*//* !Thread.interrupted() ){
                System.out.println("RunMessage"+"--"+getName());

            }*/
        }


    }

    private static class TheardReadNum extends Thread /*implements Runnable*/
    {
        public TheardReadNum()
        {
            super();
        }

        /*public static volatile*/ BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        private String st;
        private int sum;

        public void run()
        {


            while (true)
            {
                try
                {
                    st = reader.readLine();
                    if (st.contains("N"))
                    {
                        System.out.println(sum);
                        return;
                    } else
                    {
                        sum = sum + Integer.parseInt(st);
                    }

                }
                catch (IOException e)
                {
                    // System.out.println(sum);
                    //  e.printStackTrace();
                }


            }
        }
    }

    public static void main(String[] args) throws InterruptedException
    {

        Thread q = threads.get(0);
        q.start();
        Thread.sleep(500);
        q.interrupt();
        Thread c = threads.get(1);
        c.start();
        Thread.sleep(50);
        c.interrupt();
        Thread d = threads.get(2);
        d.start();
        Thread.sleep(1000);
        d.interrupt();


        Thread t = threads.get(3);
        t.start();
        Message message = (Message) t;
        Thread.sleep(10);
        message.showWarning(); //Метод showWarning() анологичен следующем двум закоментированым строчкам.
        /*t.interrupt();
        t.join();*/

        System.out.println(t.interrupted() + "--" + Thread.currentThread().isInterrupted() + "--" + t.isInterrupted());
        System.out.println(t.isAlive());

        Thread f = threads.get(4);
        f.start();
    }


}

