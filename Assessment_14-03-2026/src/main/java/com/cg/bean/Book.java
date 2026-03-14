package com.cg.bean;

public class Book {
    private String title;
    private int bookId;
    private String author;

    public Book(){};

    public Book(String title, int bookId, String author) {
        this.title = title;
        this.bookId = bookId;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void DisplayBookDetails(){
        System.out.println("Issue Book Details");
        System.out.println(bookId);
        System.out.println(title);
        System.out.println(author);
    }
}
