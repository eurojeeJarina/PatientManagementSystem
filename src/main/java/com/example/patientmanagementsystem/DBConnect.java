package com.example.patientmanagementsystem;

import java.sql.*;
import java.util.ArrayList;

public class DBConnect {

    // Database Credentials

    private static final String _URL = "jdbc:sqlserver://localhost\\sqlexpress";
    private static final String _USER = "sa";
    private static final String _PASSWORD = "blank";

    public static Connection conn;

    // Database SQL Statements
    private static PreparedStatement browseAll;

    public DBConnect() {
        connection();
    }

    private void connection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            conn = DriverManager.getConnection(_URL,_USER,_PASSWORD); // establish connection to the database using the url, username, password;

            System.out.println("Connection to database successful!");

            // Insert the code here for sql queries
            final String _SELECTALL = "SELECT * FROM iactproject.dbo.Patient";

            browseAll = conn.prepareStatement(_SELECTALL);


        }catch (SQLException sqlex)
        {
            System.out.println("Unable to connect to the database");
            sqlex.printStackTrace();
            System.exit(1);
        }catch (ClassNotFoundException classNotFoundException)
        {
            System.err.println("Unable to load MySQL Driver!");
            classNotFoundException.printStackTrace();
            System.exit(2);
        }
    }
    private void close()
    {
        try{
            conn.close();
            System.out.println("Close Method Called;");
        } catch (SQLException sqlException)   {
            System.err.println("Couldn't close connection");
            sqlException.printStackTrace();
        }
    }

    /**********************
     * DISPLAY METHOD:
     * Get data from database store it in an ArrayList
     * Determine table is empty or not - using resultSet boolean
     */
    public void letsDisplayAllPatient(){
        ArrayList<Patient> patientsArrayList = null;
        ResultSet resultSet = null;

        try{

            resultSet = browseAll.executeQuery(); // we excute the
            patientsArrayList = new ArrayList<Patient>();

           // System.out.println(resultSet.next());
            System.out.println("Patient ID     Title     Firstname     Surname     Admission Date");
            while(resultSet.next()){
                System.out.println(resultSet.getInt("PatientId") + "     " + resultSet.getString("FirstName") +
                        "     " + resultSet.getString("LastName") + "     " + resultSet.getString("AdmissionDate"));
            }

        }catch (SQLException sqlEx1){
            System.err.println("Lost connection with the database, try later...");
            sqlEx1.printStackTrace();
        }finally {
            try{
                resultSet.close();
            }catch (SQLException sqlEx2){
                System.err.println("Something went wrong, closing connection...");
                close();
            }
        }

    }
}
