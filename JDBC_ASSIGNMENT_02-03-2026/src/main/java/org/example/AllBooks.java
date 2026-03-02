package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AllBooks {
    public static void All(){
        try (Connection con = JDBC_CON.getConnection()){
            String query = "SELECT * FROM testdb.BOOK";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                System.out.println(rs.getString(2)+"  "+rs.getLong(1)+"  "+rs.getInt(3));
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
