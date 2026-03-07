package org.example;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookId;
    private String title;
    private int price;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Authors author;

    public Books(){}

    public Books(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public Books(String title, int price, Authors author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Authors getAuthor() {
        return author;
    }

    public void setAuthor(Authors author) {
        this.author = author;
    }
}
