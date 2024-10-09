package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EmployeeFile {

    public static void main(String[] args) {
        try {

            //FileReader object
            FileReader fileReader = new FileReader("employees.csv");

            //BufferedReader
            BufferedReader bufReader = new BufferedReader(fileReader);

            String input; // / Create a String variable to store each line of data from the file.

            // Read the header row
            bufReader.readLine();

            // read until there is no more data
            while ((input = bufReader.readLine()) != null) {

                // Split the line using | character as delimiter and save the result in a string array
                String[] tokens = input.split("\\|");

                // Take the first element and convert it to integer and save to employeeId variable
                int employeeId = Integer.parseInt(tokens[0]);
                // Take the second element and save to name variable
                String name = tokens[1];
                // Take the 3rd element and convert it to double and save to hoursWorked variable
                double hoursWorked = Double.parseDouble(tokens[2]);
                // Take the 4th element and convert it to double and save to payRate variable
                double payRate = Double.parseDouble(tokens[3]);

                //Create an instance (object) 'employeeObject' of type 'Employee'(Class) and initiate it using the constructor
                Employee employeeObject = new Employee(employeeId, name, hoursWorked, payRate);

                // Display the employee details
                System.out.println(employeeObject.getEmployeeId() + " " + employeeObject.getName() + " " + employeeObject.getGrossPay());



            }
            bufReader.close();
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}


