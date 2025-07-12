package com.cognizant.springlearn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
        SpringApplication.run(SpringLearnApplication.class, args);
        LOGGER.info("Inside main");

        // Call the displayDate method
        displayDate();
    }

    public static void displayDate() {
        // Load Spring XML configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");

        // Get the SimpleDateFormat bean
        SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);

        try {
            // Parse the date string
            Date parsedDate = format.parse("31/12/2018");

            // Print the parsed date
            System.out.println("Parsed Date: " + parsedDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }