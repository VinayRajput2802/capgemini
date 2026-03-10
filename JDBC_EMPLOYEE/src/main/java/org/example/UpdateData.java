package org.example;


import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateData {

    public void updateAgeByName(String name, int newAge) {

        String query = "UPDATE student SET age = ? WHERE name = ?";

        try (Connection con = JDBC.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setInt(1, newAge);
            ps.setString(2, name);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student updated successfully!");
            } else {
                System.out.println("No student found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
