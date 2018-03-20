package com.javarush.test.level07.lesson12.home04;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* Вводить с клавиатуры строки, пока пользователь не введёт строку 'end'
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введёт строку "end".  "end" не учитывать.
Вывести строки на экран, каждую с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <String>list = new ArrayList<String>();
        while (true){
            String s = reader.readLine();
            if (s.equals("end")) { break;}
            list.add(s);
               }

     //   OutputStream outStream = new FileOutputStream("c:/my-object-data.txt");



        for (String z : list)
        {
            System.out.println(z);

        }

        //напишите тут ваш код
    }
}
