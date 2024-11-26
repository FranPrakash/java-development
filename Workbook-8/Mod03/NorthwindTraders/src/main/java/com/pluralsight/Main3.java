package com.pluralsight;

import java.sql.*;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) throws SQLException {
        // load the MySQL Driver
        //Class.forName("com.mysql.cj.jdbc.Driver");

        // 1. open a connection to the database
        // use the database URL to point to the correct database
        Connection connection;
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/cardealership",
                "root",
                "yearup");
        displayAllVehicles(connection);

        //Q2. Prompt your user for which name of the dealership they want to see
        System.out.println("Enter the name of the dealership you want to see: ");
        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.nextLine();
        displayDealershipByName(connection, input);

        System.out.println("Do you want to see the cars in this dealership? Y/N");
        String inputCar = myScanner.nextLine();
        if (inputCar == "Y") {
            displayCarsBYDealership(connection, input);
        } else System.out.println("Bye");

        // 3. Close the connection
        connection.close();
    }

    private static void displayDealershipByName(Connection connection, String dealershipName) throws SQLException {

        // define your query
        String query = "SELECT * FROM dealerships WHERE Name LIKE ?";

        // create statement
        // the statement is tied to the open connection
        PreparedStatement statement = connection.prepareStatement(query);

        // set the parameters for the prepared statement
        statement.setString(1, dealershipName + "%");

        // 2. Execute your query
        ResultSet results = statement.executeQuery(query);

        // process the results
        while (results.next()) { // while loop to write
            String dealership = results.getString("Name");
            System.out.println(dealership);
        }
    }

    private static void displayCarsBYDealership(Connection connection, String dealershipName) throws SQLException {

        // define your query
        String query = """
                SELECT * FROM vehicles V
                INNER JOIN inventory I ON I.vin = V.vin
                INNER JOIN dealerships D ON D.dealership_ID = I.dealership_ID
                WHERE D.Name LIKE ?""";

        // create statement
        // the statement is tied to the open connection
        PreparedStatement statement = connection.prepareStatement(query);

        // set the parameters for the prepared statement
        statement.setString(1, dealershipName + "%");

        // 2. Execute your query
        ResultSet results = statement.executeQuery(query);

        // process the results
        while (results.next()) { // while loop to write
            String make = results.getString("make");
            System.out.println(make);
        }
    }

    //Q. Display all the cars that you have in the dealership
    private static void displayAllVehicles(Connection connection) throws SQLException {
        // create statement
        // the statement is tied to the open connection
        Statement statement = connection.createStatement();
        // define your query
        String query = "SELECT * FROM vehicles";

        // 2. Execute your query
        ResultSet results = statement.executeQuery(query);

        // process the results
        while (results.next()) { // while loop to write
            String make = results.getString("make");
            System.out.println(make);
        }
    }
}
