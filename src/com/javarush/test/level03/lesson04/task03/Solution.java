package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
      /*
      // заполнение классов
        Zerg a[] = new Zerg[10];
        for (int i=0;i<10;i++)
        {
            a[i]= new Zerg();
            a[i].name = "Zerg" + i;
        }
        Terran b[] = new Terran[12];
        for (int i=0;i<12;i++) {
            b[i] = new Terran();
            b[i].name ="Terran" + i;
        }
        Protos c[] = new Protos[5];
        for (int i=0;i<5;i++) {
            c[i] = new Protos();
            c[i].name = "Protos" + i;
        }
        System.out.println(b[0].name);
        System.out.println(b[0]);

        System.out.println(c[3].name);
        System.out.println(c[3]);

        System.out.println(a[3].name);
        System.out.println(a[3]);
*/
        Zerg zerg = new Zerg();
        zerg.name = "zerg";
        Zerg zerg1 = new Zerg();
        zerg.name = "zerg1";
        Zerg zerg2 = new Zerg();
        zerg.name = "zerg2";
        Zerg zerg3 = new Zerg();
        zerg.name = "zerg3";
        Zerg zerg4 = new Zerg();
        zerg.name = "zerg4";
        Zerg zerg5 = new Zerg();
        zerg.name = "zerg5";
        Zerg zerg6 = new Zerg();
        zerg.name = "zerg6";
        Zerg zerg7 = new Zerg();
        zerg.name = "zerg7";
        Zerg zerg8 = new Zerg();
        zerg.name = "zerg8";
        Zerg zerg9 = new Zerg();
        zerg.name = "zerg9";

        Protos protos = new Protos();
        protos.name = "protos";
        Protos protos1 = new Protos();
        protos.name = "protos1";
        Protos protos2 = new Protos();
        protos.name = "protos2";
        Protos protos3 = new Protos();
        protos.name = "protos3";
        Protos protos4 = new Protos();
        protos.name = "protos4";

        Terran terran = new Terran ();
        terran.name = "terran";
        Terran terran1 = new Terran ();
        terran.name = "terran1";
        Terran terran2 = new Terran ();
        terran.name = "terran2";
        Terran terran3 = new Terran ();
        terran.name = "terran3";
        Terran terran4 = new Terran ();
        terran.name = "terran4";
        Terran terran5 = new Terran ();
        terran.name = "terran5";
        Terran terran6 = new Terran ();
        terran.name = "terran6";
        Terran terran7 = new Terran ();
        terran.name = "terran7";
        Terran terran8 = new Terran ();
        terran.name = "terran8";
        Terran terran9 = new Terran ();
        terran.name = "terran9";
        Terran terran10 = new Terran ();
        terran.name = "terran10";
        Terran terran11 = new Terran ();
        terran.name = "terran11";





        //напишите тут ваш код

    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}