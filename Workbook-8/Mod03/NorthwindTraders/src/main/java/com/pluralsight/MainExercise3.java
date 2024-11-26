package com.pluralsight;

import java.sql.*;
import java.util.Scanner;
// Excercise 3
public class MainExercise3 {
    public static void main(String[] args) {
        String userPrompt = """
                What do you want to do?
                1) Display all products
                2) Display all customers
                0) Exit
                Select an option:""";
        while(true){
            System.out.println(userPrompt);
            Scanner myscanner = new Scanner(System.in);
            String userChoice = myscanner.nextLine();
            switch(userChoice) {
                case "1":
                    getProducts();
                    break;
                case "2":
                    getCustomers();
                    break;
                case "0":
                    myscanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public static void getCustomers() {
        // Establish the variables with null outside the try scope
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            // create the connection and prepared statement
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/northwind",
                    "root", "yearup");
            preparedStatement = connection.prepareStatement(
                    "SELECT * FROM customers ORDER by country;");

            // execute the query
            resultSet = preparedStatement.executeQuery();
            // loop through the results
            while (resultSet.next()) {
                String contactName = resultSet.getString("ContactName");
                String companyName = resultSet.getString("CompanyName");
                String city = resultSet.getString("City");
                String country = resultSet.getString("Country");
                String phoneNumber = resultSet.getString("Phone");
                System.out.println("Contact Name: " + contactName);
                System.out.println("Company Name: " + companyName);
                System.out.println("City:         " + city);
                System.out.println("Country:      " + country);
                System.out.println("Phone:        " + phoneNumber);
                System.out.println("------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // close the resources
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void getProducts() {
        // Establish the variables with null outside the try scope
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            // create the connection and prepared statement
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/northwind",
                    "root", "yearup");
            preparedStatement = connection.prepareStatement(
                    "SELECT * FROM products");

            // execute the query
            resultSet = preparedStatement.executeQuery();
            // loop through the results
            while (resultSet.next()) {
                String productName = resultSet.getString("ProductName");
                //Exercise 2 starts here
                int productId = resultSet.getInt("ProductID");
                double unitPrice = resultSet.getDouble("UnitPrice");
                int unitInStock = resultSet.getInt("UnitsInStock");
                System.out.println("Product Id:    " + productId);
                System.out.println("Product Name:  " + productName);
                System.out.println("Product Price: " + unitPrice);
                System.out.println("Stock:         " + unitInStock);
                System.out.println("------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // close the resources
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}