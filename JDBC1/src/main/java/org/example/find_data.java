package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class find_data {

    public void findByName(String name) {
        try (Connection con = JDBC.getConnection();
             PreparedStatement ps = con.prepareStatement(
                     "SELECT * FROM student WHERE name = ?")) {

            ps.setString(1, name);

            ResultSet rs = ps.executeQuery();

            boolean found = false;

            while (rs.next()) {
                found = true;
                System.out.println(
                        rs.getInt("id") + " "
                                + rs.getString("name") + " "
                                + rs.getInt("age")
                );
            }

            if (!found) {
                System.out.println("No student found.");
            }

            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}