package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//import jakarta.persistence.Id;

@Entity
public class BOOK {
    private int isbn;
    private int price;
    @Id
    private String title;

    public BOOK(){}

    public BOOK(int isbn, int price, String title) {
        this.isbn = isbn;
        this.price = price;
        this.title = title;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "BOOK{" +
                "isbn=" + isbn +
                ", price=" + price +
                ", title='" + title + '\'' +
                '}';
    }
}
