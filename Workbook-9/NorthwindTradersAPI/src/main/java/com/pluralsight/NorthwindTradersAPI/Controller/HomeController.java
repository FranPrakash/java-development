package com.pluralsight.NorthwindTradersAPI.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    // this method will respond to http://localhost:8080/
    @RequestMapping(path="/", method=RequestMethod.GET)
    public String index(
            //The user should be able to enter a url with a query string that includes country(http://localhost:8080?country=USA).
            @RequestParam(defaultValue="World") String country
    ) {
        return "Hello " + country + "!";
    }
}

