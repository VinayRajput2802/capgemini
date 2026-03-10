package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteData {

    public void deleteByName(String name) {

        String query = "DELETE FROM student WHERE name = ?";

        try (Connection con = JDBC.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, name);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student deleted successfully!");
            } else {
                System.out.println("No student found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}