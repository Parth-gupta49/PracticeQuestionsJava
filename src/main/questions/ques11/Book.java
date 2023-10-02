package main.questions.ques11;

public class Book {
    String title;
    String author;
    int isbn;

    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public void displayBookDetails(){
        System.out.println(isbn + "\t|" + author + "\t|" + title);
    }
}
