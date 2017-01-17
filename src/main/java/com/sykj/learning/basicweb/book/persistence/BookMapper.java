package com.sykj.learning.basicweb.book.persistence;

import com.sykj.learning.basicweb.book.model.Book;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Book mybatis mapper.
 *
 * @author Yang XuePing
 */
@Component
public interface BookMapper {
    @Select("select id, name, created_time, updated_time from books order by created_time desc")
    @ResultMap("BookResult")
    List<Book> findAll();
}
