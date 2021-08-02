package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Connection to database...");
        Connection connection = dbConn();

        System.out.println("Database Connected Successfully.");
    }
    public static Connection dbConn() {
        Connection connection = null;

        try {
//            Class.forName("org.mysql.")

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testrun", User.USERNAME.getValue(), User.PASSWORD.getValue());

        }catch (SQLException e) {
//           System.out.println("Unable to connect to database");
            e.printStackTrace();
        }
        return connection;
    }
}
