package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class WriteData {

    public void insertStudent(Employee employee) {

        String query = "INSERT INTO employee_table(name,salary,dob,id) VALUES (?, ?,? , ?)";

        try (Connection con = JDBC.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            String name = employee.getName();
            String dob = employee.getDob();
            String id = employee.getId();
            int salary  = employee.getSalary();


            ps.setString(1, name);
            ps.setInt(2, salary);
            ps.setString(3,dob);
            ps.setString(4,id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student inserted successfully!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}