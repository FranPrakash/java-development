package com.pluralsight.Streams;

import com.pluralsight.Course;

import java.util.List;

public class CompareDemo {

    public static void main(String[] args) {

       Course course1 = new Course(10,10,"Software Development");
       Course course2 = new Course(9,9,"Medicine");
       Course course3 = new Course(8,8,"History");

       List<Course> CourseList = List.of(course1,course2,course3);

        CourseList.stream()
                .sorted()
                .forEach(course -> System.out.println(course.getTitle()));

    }
}
