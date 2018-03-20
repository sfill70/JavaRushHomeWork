package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;
import java.util.*;


public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        OutputStream outStream = new FileOutputStream(reader.readLine());
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            list.add(s);
            if (s.equals("exit"))
            {
                break;}

        }
       for (String s : list)
        {
            byte[] data = (s +"\r\n").getBytes(); //читаем массив байт из потока для чтения "\r\n" -символ конца строки
            byte[] lineSeparator = System.lineSeparator().getBytes(); // другой вариант перевода строки
            outStream.write(data);
         //   outStream.write(data,0,data.length); - перегруженный метод write
          //  outStream.write(lineSeparator);

        }
        outStream.close();//закрываем потоки ЛУЧШЕ в ПОРЯДКЕ ОБРАТНОМ ОТКРЫТИЮ
        reader.close();
        System.in.close();
/*  for (String s : list)
        {
            System.out.println(s);
        }*/
    }


}



