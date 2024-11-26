package com.pluralsight;

//Exercise 2 page 72 (Programming with java and SQL)

import org.apache.commons.dbcp2.BasicDataSource;
import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Get the username and password
        String username = "root";
        String password = "yearup";
        // Create the datasource
        BasicDataSource dataSource = new BasicDataSource ();
        // Configure the datasource
        dataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the last name of an actor you like.");
        String lastName = myScanner.nextLine();
        getActorsByLastName(new BasicDataSource(),lastName);

        System.out.println("Enter the first name of an actor you like.");
        String fName = myScanner.nextLine();
        System.out.println("Enter the last name of an actor you like.");
        String lName = myScanner.nextLine();
        //getMoviesByActor
    }

    private static void getActorsByLastName(BasicDataSource dataSource, String lastName) {
        //Create the connection and prepared statement
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement =
                     connection.prepareStatement("SELECT * FROM actor WHERE  last_name = ?");
        ) {
            //set any required parameters
            preparedStatement.setString(1, lastName);

            // Execute the query
            try (ResultSet resultSet =
                         preparedStatement.executeQuery();
            ) {
                //use the first call to next() to see if there are records
                if (resultSet.next()) {
                    System.out.println("Your matches are: \n");
                    do {
                        System.out.println(resultSet.getString("first-name") + " " + resultSet.getString("last_name"));
                    } while (resultSet.next());
                } else {
                    System.out.println("No matches");
                }
            }


        } catch (SQLException e ) {
            // This will catch all SQLExceptions occurring
            // in the try block, including those in nested
            // try statements
            e.printStackTrace();
        }
    }

    private static void getMoviesByActor(BasicDataSource dataSource, String fName, String lName) {
        // Create the connection and prepared statement
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement =
                     connection.prepareStatement(
                             """
                                     SELECT title FROM film F
                                     INNER JOIN film_actor FA ON F.film_id = FA.film_id
                                     INNER JOIN actor A ON FA.actor_id = A.actor_id
                                     WHERE A.first_name = ? AND A.last_name = ?""");
        ) {
            // Set any required parameters
            preparedStatement.setString(1, fName);
            preparedStatement.setString(2, lName);

            // Execute the query
            try (ResultSet resultSet =
                         preparedStatement.executeQuery();
            ) {
                // use the first call to next() to see if there are records
                if (resultSet.next()) {
                    System.out.println("Your matches are: \n");
                    do {
                        System.out.println(resultSet.getString("title"));
                    } while (resultSet.next());
                }
                else {
                    System.out.println("No matches!");
                }
            }
        }
        catch (SQLException e) {
            // This will catch all SQLExceptions occurring
            // in the try block, including those in nested
            // try statements
            e.printStackTrace();
        }
    }
}
