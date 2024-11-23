package com.pluralsight;


import java.sql.*;

public class Main2 {
    public static void main(String[] args) throws SQLException {
        // load the MySQL Driver
        //Class.forName("com.mysql.cj.jdbc.Driver");

        // 1. open a connection to the database
        // use the database URL to point to the correct database
        Connection connection;
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/northwind",
                "root",
                "yearup");
        // create statement
        // the statement is tied to the open connection
        Statement statement = connection.createStatement();
        // define your query
        String query = "SELECT * FROM products";

        // 2. Execute your query
        ResultSet results = statement.executeQuery(query);
        // process the results
        while (results.next()) { // while loop to write
            String productName = results.getString("ProductName");
            //Exercise 2 starts here
            int productId = results.getInt("ProductID");
            double unitPrice = results.getDouble("UnitPrice");
            int unitInStock = results.getInt("UnitsInStock");
            System.out.println("Product Id:    " + productId);
            System.out.println("Product Name:  " + productName);
            System.out.println("Product Price: " + unitPrice);
            System.out.println("Stock:         " + unitInStock );
            System.out.println("------------------");
        }

        // 3. Close the connection
        connection.close();

    }

}