package com.yourcompany.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    // SQLite connection URL
    private static final String URL = "jdbc:sqlite:library.db";

    // Method to establish a connection to the SQLite database
    public static Connection getConnection() throws SQLException {
        try {
            // Load the SQLite JDBC driver
            Class.forName("org.sqlite.JDBC");
            // Establish the connection
            return DriverManager.getConnection(URL);
        } catch (ClassNotFoundException e) {
            // Handle ClassNotFoundException (driver not found)
            System.err.println("SQLite JDBC driver not found");
            e.printStackTrace();
            throw new SQLException("SQLite JDBC driver not found", e);
        }
    }
}
