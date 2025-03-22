package com.steel.restapi.service;

import com.steel.restapi.model.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    Book findById(int id);
    void deleteById(int id);
}
