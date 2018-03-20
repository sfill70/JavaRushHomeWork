package com.javarush.test.level15.lesson02.task04;

/* ООП - книги
1. Создайте public static класс MarkTwainBook, который наследуется от Book. Имя автора [Mark Twain]. Параметр конструктора - имя книги.
2. В классе MarkTwainBook реализуйте все абстрактные методы.
3. Для метода getBook расширьте тип возвращаемого результата.
4. Создайте по аналогии AgathaChristieBook. Имя автора [Agatha Christie].
5. В классе Book реализуйте тело метода getOutputByBookType так, чтобы он возвращал:
5.1. agathaChristieOutput для книг Агаты Кристи;
5.2. markTwainOutput для книг Марка Твена.
*/

import java.util.LinkedList;
import java.util.List;

public class Solution
{
    public static void main(String[] args)
    {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
     //   Book twin = new MarkTwainBook("dfghjk");
     //   System.out.println(twin.getName() +"    "+ ((MarkTwainBook)twin).getBook()+ "    " +    ((MarkTwainBook)twin).author);
    }

    public abstract static class Book
    {
       private String author;

       public Book()
        {
        }
        public Book(String author)
        {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getName();

        private String getOutputByBookType()
        {
            String agathaChristieOutput = getBook().author + ", " + getBook().getName() + " is a detective";
            String markTwainOutput = getBook().getName() + " book was written by " + getBook().author;
            String output = "111 ";
            if (this instanceof MarkTwainBook){
             output = markTwainOutput;}
            else if (this instanceof AgathaChristieBook){
               // (AgathaChristieBook)this;
                output = agathaChristieOutput;
            }
            //Add your code here

            return output;
        }

        public String toString()
        {
            return getOutputByBookType();
        }
    }

    public static class MarkTwainBook extends Book
    {
        public static String author = "Mark Twain"; //переменная static
        public String bookName;

        public MarkTwainBook(String bookName)
        {
          super(author);  //Можно так вызвать метод родительского класса.
            this.bookName = bookName;
        }


        public MarkTwainBook getBook()
        {
            return (MarkTwainBook) this;
        }

        public String getName()
        {
            return this.bookName;
        }

    }

    public static class AgathaChristieBook extends Book
    {
        public  String author = "Agatha Christie";
        public String bookName;

        public AgathaChristieBook(String name)
        {
            super("Agatha Christie"); //Можно так вызвать метод родительского класса, без переменной.
            this.bookName = name;
        }


     /*   public AgathaChristieBook(String bookName)
        {
           author=this.author;
            this.bookName = bookName;
        }*/

        public AgathaChristieBook getBook()
        {
            return this ;
        }

        public String getName()
        {
            return this.bookName;
        }
    }


}
