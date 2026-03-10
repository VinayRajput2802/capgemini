package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Update_Price_of_book {
    public void ChangePrice(Integer id,String book_title,Integer price){
        try(Connection con = JDBC_CON.getConnection()){
            String query = "UPDATE BOOK SET PRICE=? WHERE isbn=? and title=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1,price);
            ps.setInt(2,id);
            ps.setString(3,book_title);
            int rows = ps.executeUpdate();
            if (rows>0){
                System.out.println("Update Successfull");
            }
            else{
                System.out.println("No Book Found");
            }

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
