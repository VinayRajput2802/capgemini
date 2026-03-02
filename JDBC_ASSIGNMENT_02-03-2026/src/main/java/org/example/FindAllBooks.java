package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FindAllBooks {
    public void findByName(String Fname,String Mname,String Lname){

        try(Connection con=JDBC_CON.getConnection()) {
            String query = "SELECT BOOK.title,BOOK.PRICE FROM testdb.AUTHOR JOIN testdb.BOOK on AUTHOR.ID=BOOK.ISBN where Author.first_name=? and Author.mid_name=? and Author.last_name=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1,Fname);
            ps.setString(2,Mname);
            ps.setString(3,Lname);

            ResultSet rs = ps.executeQuery();
            boolean found = false;
            while (rs.next()){
                found = true;
                System.out.println(rs.getString("title")+"---"+rs.getInt("price")+"Rs");
            }
            if (!found){
                System.out.println("No Record Found");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    public void findById(Integer id){
        try(Connection con = JDBC_CON.getConnection()){
            String query = "SELECT BOOK.TITLE,BOOK.PRICE FROM testdb.BOOK INNER JOIN testdb.AUTHOR ON AUTHOR.ID=BOOK.ISBN WHERE AUTHOR.ID=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            boolean found = false;
            while (rs.next()){
                found = true;
                System.out.println(rs.getString("title")+"---->"+rs.getInt("price")+"Rs");
            }
            if (!found){
                System.out.println("No Record Found");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
