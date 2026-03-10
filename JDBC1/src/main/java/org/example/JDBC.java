package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC {

    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USERNAME = "vinay";
    private static final String PASSWORD = "root"; // 🔴 change this

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}