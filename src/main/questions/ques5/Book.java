package main.questions.ques5;

import java.util.ArrayList;

/*5. Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a collection*/
public class Book {
    private final int isbn;
    private final String title;
    private final String author;
    private static final ArrayList <Book> bookList = new ArrayList<Book>();
    public static void displayDetails(){
        for (Book var : bookList) {
            System.out.println("Name - "+var.title+"\t\tAuthor - \t"+var.author+" \t\tISBN : "+var.isbn);
        }
    }
    public Book(int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;

    }
    public static void addd(Book book){
        bookList.add(book);
    }
    public static void removee(Book book){
        int bit = 0;
        for (Book i : bookList) {
            if (i.isbn==book.isbn) {
                System.out.println("Book {ISBN : "+book.isbn+ "}Successfully removed from the list");
                bit = 1;
            }
        }
        if (bit==1)
            bookList.remove(book);
        else
            System.out.println("Book {ISBN : "+book.isbn+ "}not found/may not be added");
    }

    public static void main(String[] args) {
        Book book1 = new Book(123,"Java Core Concepts","Tarai");
        Book.addd(book1);
        Book book2 = new Book(124,"C Core Concepts","Kanika");
        Book book3 = new Book(125,"Python Core Concepts","Dummies");
        Book book4 = new Book(129,"Python Core Concepts","Dummies");
        Book.addd(book2);
        Book.addd(book3);
        Book.displayDetails();

        Book.removee(book3);
        Book.removee(book4);
        System.out.println("After removing : ");
        Book.displayDetails();
    }
}
