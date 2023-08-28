package com.employeemanagement;
import java.sql.Connection;
import java.sql.DriverManager;

public class EmployeeDB {

    public static Connection  connectDb() {
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");

           Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx_ems","root","Kip10983M#");
           return connect;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
