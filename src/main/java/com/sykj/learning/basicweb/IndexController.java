package com.sykj.learning.basicweb;

import com.sykj.learning.basicweb.book.model.Book;
import com.sykj.learning.basicweb.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * index controller.
 *
 * @author Yang XuePing
 */
@Controller
public class IndexController {
    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(HttpServletRequest request) {
        List<Book> books = bookService.getAll();
        request.setAttribute("books", books);
        return "index";
    }
}
