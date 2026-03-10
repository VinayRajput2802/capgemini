package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC_CON {

    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USERNAME = "vinay";
    private static final String PASSWORD = "root";

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
