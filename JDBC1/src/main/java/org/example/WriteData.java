package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class WriteData {

    public void insertStudent(String name, int age) {

        String query = "INSERT INTO student(name, age) VALUES (?, ?)";

        try (Connection con = JDBC.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, name);
            ps.setInt(2, age);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student inserted successfully!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}