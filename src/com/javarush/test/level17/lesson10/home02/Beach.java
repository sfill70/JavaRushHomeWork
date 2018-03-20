package com.javarush.test.level17.lesson10.home02;

/* Comparable
Реализуйте интерфейс Comparable<Beach> в классе Beach, который будет использоваться нитями.
*/

import java.util.ArrayList;
import java.util.Objects;
import java.util.TreeSet;

public class Beach implements Comparable <Beach>
{
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality)
    {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName()
    {
        return name;
    }

    public synchronized void setName(String name)
    {
        this.name = name;
    }

    public synchronized float getDistance()
    {
        return distance;
    }

    public synchronized void setDistance(float distance)
    {
        this.distance = distance;
    }

    public synchronized int getQuality()
    {
        return quality;
    }

    public synchronized void setQuality(int quality)
    {
        this.quality = quality;
    }


    /*@Override   // Почему то прошла эта херня ?????
    public synchronized int compareTo(Beach obj)
    {
        int distIndex = (int) (distance - obj.getDistance());
        int qualIndex = quality - obj.getQuality();
        return 10000 * name.compareTo(obj.getName()) + 100 * distIndex + qualIndex;
    }*/

    @Override // ПРАВЕЛЬНЫЕ СРАВНЕНИЯ С ПОМОЩЬЮ МЕТОДА -- compare (d, o.d)
    public synchronized int compareTo(Beach obj)
    {
        Beach entry = (Beach) obj;

        int result;

        result = Integer.compare(obj.getQuality(),quality );
        if (result != 0) {return result;}

        result = Float.compare(distance,entry.getDistance()  );
        if (result != 0)
        {
            return result;
        }

        result = name.compareTo(entry.getName());
        if (result != 0)
        {
            return result;
        }
        return result;
    }

    public static void main(String args[])
    {
        Beach beach1 = new Beach("beach1", 44f, 3);
        Beach beach2 = new Beach("beach2", 19f, 2);
        Beach beach3 = new Beach("beach3", 30f, 3);
        Beach beach4 = new Beach("beach4", 20f, 6);
        Beach beach5 = new Beach("beach5", 22f, 2);

     //  Проверяется сортированным по убыванию списком TreeSet.
        TreeSet<Beach> beaches = new TreeSet<Beach>();
        beaches.add(beach1);
        beaches.add(beach2);
        beaches.add(beach3);
        beaches.add(beach4);
        beaches.add(beach5);

        System.out.println(Float.compare(beach1.distance, beach2.getDistance()));

        for (Beach x : beaches)
            System.out.println(x.getName() + ", distance = " + x.getDistance() + ", quality =  " + x.getQuality());
        for (Beach x : beaches)
            System.out.println( ", quality =  " + x.getQuality() + "    "+ x.getName() + ", distance = " + x.getDistance() );

        System.out.println(beach4.compareTo(beach2));

    }
}

