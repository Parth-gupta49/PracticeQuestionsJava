package main.questions.ques11;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("C programming","kanika",101);
        Book book2 = new Book("C++ programming","Steve",102);
        Book book3 = new Book("Java","Tarai",103);
        Book book4 = new Book("Python for Dummies","Dummy",104);
        Library library = new Library();
        ArrayList<Book> list = library.returnBooks();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        for (Book book : list) {
            book.displayBookDetails();
        }
        library.removeBook(book4);
        Book book5 = new Book("Ruby on Rails","Jobs",105);
        library.addBook(book5);
        library.addBook(book3);
        for (Book book : list) {
            book.displayBookDetails();
        }
    }
}
