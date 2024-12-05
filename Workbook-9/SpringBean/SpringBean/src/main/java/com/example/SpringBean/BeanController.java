package com.example.SpringBean;

//Exercise 4
//Create a BeanController class that uses GreetingService and MessageService.
//They have to be injected via the controller.
//Create two endpoints: one returns the String from getGreeting, the other returns the String from getMessage.

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanController {

    private GreetingService greetingService;
    private MessageService messageService;

    @Autowired//Constructor
    public BeanController(GreetingService greetingService, MessageService messageService) {
        this.greetingService = greetingService;
        this.messageService = messageService;
    }

    @RequestMapping(path="/message", method= RequestMethod.GET)//The message endpoint will return the message from MessageService.
    public String getMessage() {
        return messageService.getMessage();
    }

    @RequestMapping(path="/greeting", method=RequestMethod.GET)//The greeting endpoint will return the message from GreetingService.
    public String getGreeting() {
        return greetingService.getGreeting();
    }


}
