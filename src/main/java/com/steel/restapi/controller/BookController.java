package com.steel.restapi.controller;

import com.steel.restapi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public String home() {
        return "Welcome to the Book API!";
    }
    /*
    @GetMapping("/book/{id}")
    public Book findBookById(@PathVariable int id) {
        return bookService.findBookById(id);
    }

    @GetMapping("/book")
    public List<Book> findAllBooks() {
        return bookService.findAllBooks();
    }

    @DeleteMapping("/book/{id}")
    public String deleteAllBooks() {
        bookService.deleteAllBooks();
        return "All books have been deleted.";
    }*/
}
