package com.example.SpringBean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;


//Print the beans in the Application Context:


@SpringBootApplication
public class SpringBeanApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext myContext = SpringApplication.run(SpringBeanApplication.class, args);
		for ( Bean b : myContext.getBean()){
			System.out.println(b);
		}
	}

}
