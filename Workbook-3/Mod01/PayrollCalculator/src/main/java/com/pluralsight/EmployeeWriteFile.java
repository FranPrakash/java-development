package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EmployeeWriteFile {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        // Prompt the user to provide the input file name
        System.out.println("Enter the name of the file employee file to process: ");
        String inputFileName = myScanner.nextLine();

        // Prompt the user to provide the output file name
        System.out.println("Enter the name of the payroll file to create: ");
        //accept the filename and store it in a String variable
        String outputFileName = myScanner.nextLine();


        try {
            // open the output file
            FileWriter writer = new FileWriter(outputFileName);

            // write header row to the file
            writer.write("id|name|gross pay\n");

            // create a FileReader object connected to the File
            FileReader fileReader = new FileReader(inputFileName);

            // create a BufferedReader to read one line at time
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

                // write to the file
                writer.write(employeeObject.getEmployeeId() +"|"+ employeeObject.getName() + "|"+ employeeObject.getGrossPay()+"\n");



            }
            bufReader.close();

            // close the file when you are finished using it
            writer.close();

        } catch (IOException e) {
            // Display an error message to the user
            System.out.println("ERROR: An unexpected error occurred");
            e.printStackTrace();

        }

    }
}
