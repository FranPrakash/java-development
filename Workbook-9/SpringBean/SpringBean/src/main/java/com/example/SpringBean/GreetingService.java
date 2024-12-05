package com.example.SpringBean;

import org.springframework.stereotype.Component;
//1- Exercise
//Create a GreetingService Bean using @Component:
//Create a class GreetingService and annotate it with @Component to make it a Spring-managed bean.

@Component //Spring bean annotation
public class GreetingService {

    //Give it a method getGreeting that returns a String with a greeting.
    public String getGreeting() {
        return "Hello SpringBoot!";
    }



}
