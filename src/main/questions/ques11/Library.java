package main.questions.ques11;

import java.util.ArrayList;

/*11. Write a Java program to create a class called "Library" with a collection of books and methods to add and remove books.*/
public class Library {
    private final ArrayList<Book> bookList;

    public Library() {
        bookList = new ArrayList<>();
    }
    public void addBook(Book obj){
        int check = 0;
        for (Book book : bookList) {
            if (book.isbn == obj.isbn) {
                check = 1;
                break;
            }
        }
        if (check==1)
            System.out.println("Book already present");
        else
            bookList.add(obj);
    }
    public void removeBook(Book obj){
        int check = 0;
        for (Book book : bookList) {
            if (book.isbn == obj.isbn) {
                check = 1;
                break;
            }
        }
        if (check==1)
            bookList.remove(obj);

        else
            System.out.println("Book not present");
    }
    public ArrayList<Book> returnBooks(){
        return bookList;
    }


}
