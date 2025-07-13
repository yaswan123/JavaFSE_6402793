package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SpringBootApplication
public class SpringLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {
    	ApplicationContext context = SpringApplication.run(SpringLearnApplication.class, args);
    	displayCountry();
    }

    public static void displayCountry() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Country.xml");
        Country country = context.getBean("Country", Country.class);
        LOGGER.info("Country : {}", country.toString());
        context.close(); 
    }


}