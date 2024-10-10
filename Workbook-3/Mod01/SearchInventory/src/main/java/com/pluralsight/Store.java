package com.pluralsight;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Store {

    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f\n",
                    p.getId(), p.getName(), p.getPrice());
        }
    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();
        try {
            // create a FileInputStream object pointing to
            // a specific file
            FileInputStream fis = new FileInputStream("inventory.csv");
            // create a Scanner to reference the file to be read
            Scanner scanner = new Scanner(fis);
            String input;
            String[] tokens;
            // read until there is no more data
            while (scanner.hasNextLine()) {
                input = scanner.nextLine();
                tokens = input.split("\\|");
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                float price = Float.parseFloat(tokens[2]);
                Product p = new Product(id, name, price);
                inventory.add(p);
            }
            // close the scanner and release the resources
            scanner.close();
        } catch (IOException e) {
            // display stack trace if there was an error
            e.printStackTrace();
        }
        return inventory;
    }
}




