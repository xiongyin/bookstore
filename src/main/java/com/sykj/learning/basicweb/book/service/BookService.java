package com.sykj.learning.basicweb.book.service;

import com.sykj.learning.basicweb.book.model.Book;

import java.util.List;

/**
 * Book service.
 *
 * @author Yang XuePing
 */
public interface BookService {
    List<Book> getAll();
}
