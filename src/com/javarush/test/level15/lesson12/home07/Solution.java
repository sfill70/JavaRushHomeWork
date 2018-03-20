package com.javarush.test.level15.lesson12.home07;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/* Файл в статическом блоке
1. Инициализируй константу Constants.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
2. В статическом блоке считай из файла с именем Constants.FILE_NAME все строки и добавь их по-отдельности в List lines.
3. Закрой поток ввода методом close().
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        try//(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(Constants.FILE_NAME)))) //ТАК   тоже все работает
        {
           BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(Constants.FILE_NAME)));
            String line;
            while ((line=reader.readLine())!=null){
                lines.add(line);

                //     ДРУГОЙ ВАРИАНТ.

      /*  Scanner in = new Scanner("c:/1.txt");
          while (in.hasNextLine())
          lines.add(in.nextLine());
        */

        // САМЫЙ КОРОТКИЙ ВАРИАНТ !!!!!!
      //   lines = Files.readAllLines(Paths.get(Constants.FILE_NAME), StandardCharsets.UTF_8); //StandardCharsets.UTF_8 - Можно не писать.

            }


            reader.close();
           // in.close();
        }
        catch (Exception e) {}


    }
    public static void main(String[] args) {

       for (String line: lines){
            System.out.println(line);
        }
       System.out.println(lines);
    }
}
