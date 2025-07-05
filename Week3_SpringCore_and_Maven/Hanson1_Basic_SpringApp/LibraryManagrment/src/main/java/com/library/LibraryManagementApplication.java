package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        System.out.println("Loading Spring context...");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("Spring context loaded.");

        BookService bookService = ctx.getBean("bookService", BookService.class);
        bookService.addBook("Spring in Action");
    }
}
