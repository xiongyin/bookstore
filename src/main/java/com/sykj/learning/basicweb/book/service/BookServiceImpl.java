package com.sykj.learning.basicweb.book.service;

import com.sykj.learning.basicweb.book.model.Book;
import com.sykj.learning.basicweb.book.persistence.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * book service implement.
 *
 * @author Yang XuePing
 */
@Service
@Transactional
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> getAll() {
        return bookMapper.findAll();
    }
}
