package com.example.patientmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

    private static final String _URL = "jdbc:sqlserver://localhost\\sqlexpress";
    private static final String _USER = "sa";
    private static final String _PASSWORD = "blank";

    public static Connection conn;

    public DBConnect() {
        connection();
    }

    private void connection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(_URL,_USER,_PASSWORD);
            System.out.println("Connection to database successful!");
        }catch (SQLException sqlex)
        {
            System.out.println("Unable to connect to the database");
            sqlex.printStackTrace();
            System.exit(1);
        }catch (ClassNotFoundException classNotFoundException)
        {
            classNotFoundException.printStackTrace();
            System.exit(2);
        }
    }
}
