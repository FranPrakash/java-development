package com.pluralsight.Streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    //1. Create a class named StreamExample with a main method.
    //In the main method, create a List of integers.

    public static void main(String[] args) {

        List<Integer> evenNumbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(evenNumbers.parallelStream()
                .filter(numbers -> numbers % 2 == 0) // Use the stream API to filter out even numbers
                .map(numbers -> numbers * numbers) // Next, square each remaining number. (map)
                .collect(Collectors.toList())); //Use collect to get the results in a new list or use toList()

    }
}