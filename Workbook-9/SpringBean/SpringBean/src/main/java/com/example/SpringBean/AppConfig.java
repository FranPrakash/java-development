package com.example.SpringBean;

//Create a MessageService bean using the @Bean annotation inside a new configuration class AppConfig that is annotated with @Configuration.

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MessageService messageService(){
        return new MessageService();
    }

}
