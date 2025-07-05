package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter for Spring's setter-based DI
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Injected BookRepository into BookService");
    }

    public void addBook(String title) {
        bookRepository.saveBook(title);
    }
}
