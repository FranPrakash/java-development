package com.pluralsight;

import java.sql.*;
import java.util.Scanner;
import org.apache.commons.dbcp2.BasicDataSource;


public class MainExercise3 {
    public static void main(String[] args) {

        // Get the username and password
        String username = "root";
        String password = "yearup";

        // Create the datasource
        BasicDataSource dataSource = new BasicDataSource ();

        // Configure the datasource
        dataSource.setUrl("jdbc:mysql://localhost:3306/northwind");
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        String userPrompt = """
                What do you want to do?
                1) Display all products
                2) Display all customers
                3) Display all categories
                0) Exit
                Select an option:""";
        while (true) {
            System.out.println(userPrompt);
            Scanner myscanner = new Scanner(System.in);
            String userChoice = myscanner.nextLine();
            switch (userChoice) {
                case "1":
                    getProducts(dataSource);
                    break;
                case "2":
                    getCustomers(dataSource);
                    break;
                case "3":
                    getCategories(dataSource);
                    break;
                case "0":
                    myscanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public static void getCategories(BasicDataSource dataSource) {
        // Create the connection and prepared statement
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement =
                     connection.prepareStatement(
                             "SELECT * from categories order by CategoryID");
        ) {
            // execute the query - also declare the ResultSet within
            // a try-with-resources block
            try (
                    ResultSet resultSet = preparedStatement.executeQuery();
            ) {
                // loop through the results
                while (resultSet.next()) {
                    String categoryID = resultSet.getString("CategoryID");
                    String categoryName = resultSet.getString("CategoryName");
                    System.out.println("Category ID:   " + categoryID);
                    System.out.println("Category Name: " + categoryName);
                    System.out.println("--------------------");
                }
            }
        } catch (SQLException e) {
            // This will catch all SQLExceptions occurring in the
            // block including those in nested try statements
            e.printStackTrace();
        }
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter category id to see all products in that category.");
        String userChoice = myScanner.nextLine();
        getProductsByCategory(dataSource,Integer.parseInt(userChoice));
    }

    public static void getProductsByCategory(BasicDataSource dataSource, int categoryID) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement =
                     connection.prepareStatement(
                             "SELECT * FROM products WHERE CategoryID = ?");
        ) {
            // Set any required parameters
            preparedStatement.setInt(1, categoryID);

            // execute the query - also declare the ResultSet within
            // a try-with-resources block
            try (
                    ResultSet resultSet = preparedStatement.executeQuery()
            ) {
                // loop through the results
                while (resultSet.next()) {
                    String productName = resultSet.getString("ProductName");
                    int productId = resultSet.getInt("ProductID");
                    double unitPrice = resultSet.getDouble("UnitPrice");
                    int unitInStock = resultSet.getInt("UnitsInStock");
                    System.out.println("Product Id:    " + productId);
                    System.out.println("Product Name:  " + productName);
                    System.out.println("Product Price: " + unitPrice);
                    System.out.println("Stock:         " + unitInStock);
                    System.out.println("------------------");
                }
            }
        } catch (SQLException e) {
            // This will catch all SQLExceptions occurring in the
            // block including those in nested try statements
            e.printStackTrace();
        }
    }

    public static void getCustomers(BasicDataSource dataSource) {// Create the connection and prepared statement
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement =
                     connection.prepareStatement(
                             "SELECT * FROM customers ORDER by country;");
        ) {
            // execute the query - also declare the ResultSet within
            // a try-with-resources block
            try (
                    ResultSet resultSet = preparedStatement.executeQuery()
            ) {
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
            }
        } catch (SQLException e) {
            // This will catch all SQLExceptions occurring in the
            // block including those in nested try statements
            e.printStackTrace();
        }
    }

    public static void getProducts(BasicDataSource dataSource) {
        // Create the connection and prepared statement
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement =
                     connection.prepareStatement(
                             "SELECT * FROM products");
        ) {
            // execute the query - also declare the ResultSet within
            // a try-with-resources block
            try (
                    ResultSet resultSet = preparedStatement.executeQuery()
            ) {
                // loop through the results
                while (resultSet.next()) {
                    String productName = resultSet.getString("ProductName");
                    int productId = resultSet.getInt("ProductID");
                    double unitPrice = resultSet.getDouble("UnitPrice");
                    int unitInStock = resultSet.getInt("UnitsInStock");
                    System.out.println("Product Id:    " + productId);
                    System.out.println("Product Name:  " + productName);
                    System.out.println("Product Price: " + unitPrice);
                    System.out.println("Stock:         " + unitInStock);
                    System.out.println("------------------");
                }
            }
        } catch (SQLException e) {
            // This will catch all SQLExceptions occurring in the
            // block including those in nested try statements
            e.printStackTrace();
        }
    }

}
