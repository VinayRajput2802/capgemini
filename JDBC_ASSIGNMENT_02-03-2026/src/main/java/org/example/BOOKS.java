package org.example;

public class BOOKS {
    private String tile;
    private Long isbn;
    private Integer price;

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    public BOOKS(String title,Long isbn,Integer price){
        setIsbn(isbn);
        setPrice(price);
        setTile(title);
    }
}
