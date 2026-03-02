package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertBookData {
    public void insertData(BOOKS book){
        String query = "INSERT INTO testdb.BOOK(ISBN,TITLE,PRICE) VALUES(?,?,?)";

        try(Connection con = JDBC_CON.getConnection()){
            PreparedStatement ps = con.prepareStatement(query);
            Long isbn = book.getIsbn();
            String title = book.getTile();
            Integer price = book.getPrice();
            ps.setLong(1,isbn);
            ps.setString(2,title);
            ps.setInt(3,price);

            int rows = ps.executeUpdate();
            if (rows > 0){
                System.out.println("Book Added Successfully");
            }

        }
        catch (Exception e){
            System.out.println(e.getStackTrace());
        }
    }
}
