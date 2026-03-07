package org.example;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Authors {

    @Id
    private int authorId;
    private String authorName;
    private String email;
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    List<Books> totalBooks;

    public Authors(){}

    public Authors(int authorId,String authorName, String email) {
        this.authorName = authorName;
        this.email = email;
        this.authorId = authorId;
    }

    public Authors(int authorId,String authorName, String email, List<Books> totalBooks) {
        this.authorName = authorName;
        this.email = email;
        this.totalBooks = totalBooks;
        this.authorId = authorId;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Books> getTotalBooks() {
        return totalBooks;
    }

    public void setTotalBooks(List<Books> totalBooks) {
        this.totalBooks = totalBooks;
    }
}
