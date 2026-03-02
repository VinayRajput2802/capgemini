package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertAuthorData {
    public void insertData(Author author_obj){
        String query = "INSERT INTO AUTHOR(first_name,mid_name,last_name,id,phone_no) VALUES(?,?,?,?,?)";


        try(Connection con = JDBC_CON.getConnection()){
            PreparedStatement ps = con.prepareStatement(query);
            String first_name = author_obj.getFirst_name();
            String mid_name = author_obj.getMid_name();
            String last_name = author_obj.getLast_name();
            int id = author_obj.getId();
            String phone_no = author_obj.getPhone_no();

            ps.setString(1,first_name);
            ps.setString(2,mid_name);
            ps.setString(3,last_name);
            ps.setInt(4,id);
            ps.setString(5,phone_no);

            int rows = ps.executeUpdate();
            if(rows>0){
                System.out.println("------- Data Store Successfully -------");
            }

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
