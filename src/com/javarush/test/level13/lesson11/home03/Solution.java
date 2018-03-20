package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/
import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {

           BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           InputStream inStream = new FileInputStream(reader.readLine());
         //   OutputStream outStream = new FileOutputStream ("c:/2.txt");

           while (inStream.available() > 0)
           {
               int data = inStream.read(); //читаем один байт из потока для чтения
               System.out.print((char) data);
              //   outStream.write(data); //записываем прочитанный байт в другой поток.
           }



        inStream.close(); //закрываем потоки ЛУЧШЕ в ПОРЯДКЕ ОБРАТНОМ ОТКРЫТИЮ
      //  outStream.close();
        reader.close();
        System.in.close();

    }
        //add your code here
    }

