package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by Sfill on 26.01.2017.
 */
public class ImageReaderFactory
{
    public static ImageReader reader;

    public static ImageReader getReader(ImageTypes types)
    {


        if (types == ImageTypes.BMP)
        {
            reader = new BmpReader();
             return reader;
        }
        if (types == ImageTypes.JPG)
        {
            reader = new JpgReader();
              return reader;
        }
        if (types == ImageTypes.PNG)
        {
            reader = new PngReader();
              return reader;
        }

        /*if (types == null)
        {
            throw new IllegalArgumentException();
        } */
        else
        {
            System.out.println("Неизвестный тип картинки");
            throw new IllegalArgumentException();
            

        }



    }
}