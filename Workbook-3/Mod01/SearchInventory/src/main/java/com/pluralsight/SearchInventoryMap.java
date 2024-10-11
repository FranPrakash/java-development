package com.pluralsight;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;


public class SearchInventoryMap {

    // HashMAp the key is the product id, the value is a product object
    static HashMap<Integer, Product> inventory = new HashMap<Integer, Product>();

     public static void main(String[] args) {

        // method loads product objects into inventory
        loadInventory();

        Scanner scanner = new Scanner(System.in);
        System.out.print("What item name are you interested in? ");
        int id = scanner.nextInt();
        Product matchedProduct = inventory.get(id); //MathecedProduct object of the type product
        if (matchedProduct == null) {
            System.out.println("We don't carry that product");
            return;
        }
         System.out.printf("We carry %s and the price is $%.2f",
                 matchedProduct.getName(), matchedProduct.getPrice()); // get from the Product class.

    }

    private static void loadInventory() {

        try {

            //create a FileInputStream object
            FileInputStream fis = new FileInputStream("inventory.csv");
            // create a Scanner to reference the file to be read
            Scanner scanner = new Scanner(fis);
            String line;
            String[] lineParts;
            // read until there is no more data

            while (scanner.hasNextLine()) {  // the while loop runs as long as there are lines remaining in the file

                line = scanner.nextLine();
                lineParts = line.split("\\|"); // splitting into 3 parts
                int id = Integer.parseInt(lineParts[0]); // Converting from string to integer
                String name = lineParts[1];
                float price = Float.parseFloat(lineParts[2]); // converting from string to float because price is float
                Product p = new Product(id, name, price); // declaring object named p of type product declared using a constructor
                inventory.put(id, p); //id key and p teh value of the HashMap inventory.

            }

            // close the scanner and release the resources
            scanner.close();
        } catch (IOException e) {
            // display stack trace if there was an error
            e.printStackTrace();


        }

    }
}