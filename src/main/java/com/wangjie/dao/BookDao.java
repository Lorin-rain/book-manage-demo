package com.wangjie.dao;

import com.wangjie.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookDao {
    int save(Book book);

    int update(Book book);

    int delete(Integer id);

    Book getById(Integer id);

    List<Book> getAll();
}
