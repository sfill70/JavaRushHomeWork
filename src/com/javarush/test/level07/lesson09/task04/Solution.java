package com.javarush.test.level07.lesson09.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
Пример:
роза
лира
лоза
Выходные данные:
лира
лоза
лоза
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();

     /*   while (true)
        {
            String s = bis.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        } */

      list.add("роза"); //0
        list.add("лира"); //1
        list.add("лоза"); //2

        list.add("коза");
        list.add("хрень");
        list.add("лоскут");
        list.add("кот");
        list.add("кларнет");
        list.add("лорнет");





        fix(list);

        for (String s : list)
        {
            System.out.println(s);
            //System.out.println(list.size());
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list)
    {
      /*  for (int i = 0; i < list.size(); )
        {
            if (list.get(i).contains("р") &&!( list.get(i).contains("л")) ) list.remove(i);
            else
                i++;
        }


        for (int i = 0; i <list.size(); i++)
        {
            if (list.get(i).contains("л")  && !(list.get(i).contains("р")) ){ list.add(i+1, list.get(i));
            i++;}
        }*/
        //напишите тут ваш код
        //Так лучше не надо лишнего ЦИКЛА.

        for (int i = 0; i < list.size();      ){
          //  System.out.println(i);                //Это для
          //  System.out.println(list.get(i)+1);    //контроля

            if (list.get(i).contains("р") &&!( list.get(i).contains("л")) ) {list.remove(i);}
            else {
            if (list.get(i).contains("л")  && !(list.get(i).contains("р")) ){ list.add(i+1, list.get(i)); i++;}
            i++;}
        }







        return list;
    }
}