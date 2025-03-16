/*implement classes for a Library
There are diffrent type of books are available in the
library like Printed books, E books, and Audio books

You must use inhertance, polymorphism, encapuslation...
 */

 /*
  * 
  
  */
import java.util.*;
abstract class Book{
    String title;
    String author;
    int pages;

    Book(String title, String author, int pages){
        this.title=title;
        this.author=author;
        this.pages=pages;
    }

    public abstract void displayinfo();

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getPages(){
        return pages;
    }

}

class PrintedBook extends Book{
    private int year;
    public PrintedBook(String title, String author, int pages, int year){
        super(title, author, pages);
        this.year = year;
    }

    public void displayinfo(){
        System.out.println("Title: "+getTitle());
        System.out.println("Author: "+getAuthor());
        System.out.println("Pages: "+getPages());
        System.out.println("Year: "+year);
    }
}

class Ebook extends Book{
    private int size;
    public Ebook(String title, String author, int pages, int size){
        super(title, author, pages);
        this.size = size;
    }

    public void displayinfo(){
        System.out.println("Title: "+ getTitle());
        System.out.println("Author: "+ getAuthor());
        System.out.println("Pages: "+ getPages());
        System.out.println("Size: "+size);
    }
}

class AudioBook extends Book{
    private int duration;
    public AudioBook(String title, String author, int pages, int duration){
        super(title, author, pages);
        this.duration = duration;
    }

    public void displayinfo(){
        System.out.println("Title: "+ getTitle());
        System.out.println("Author: "+ getAuthor());
        System.out.println("Pages: "+ getPages());
        System.out.println("Duration: "+duration);
    }
}

class Library{
    private ArrayList<Book> books = new ArrayList<>();
    public void addBook(Book book){
        books.add(book);
    }

    public void displayBooks(){
        for(Book book:books){
            book.displayinfo();
        }
    }
}

public class exercise7 {
    public static void main(String[] args){
        Library library = new Library();
        library.addBook(new PrintedBook("Java", "Kamal", 200, 2020));
        library.addBook(new Ebook("Python", "Namal", 300, 20));
        library.addBook(new AudioBook("C++", "Sunil", 400, 10));

        library.displayBooks();

    }
}
