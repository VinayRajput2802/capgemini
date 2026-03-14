package com.cg.bean;

public class Librarian {
    private int librarianId;
    private String libarianName;
    private Book book;

    public Librarian(int librarianId, String liberarianName, Book book) {
        this.librarianId = librarianId;
        this.libarianName = liberarianName;
        this.book = book;
    }

    public Librarian(){}

    public String getLibarianName() {
        return libarianName;
    }

    public void setLibarianName(String liberarianName) {
        this.libarianName = liberarianName;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getLibrarianId() {
        return librarianId;
    }

    public void setLibrarianId(int librarianId) {
        this.librarianId = librarianId;
    }

    public void issueBook(){
        System.out.println("Librarian Name: "+this.libarianName);
        book.DisplayBookDetails();
    }
}
