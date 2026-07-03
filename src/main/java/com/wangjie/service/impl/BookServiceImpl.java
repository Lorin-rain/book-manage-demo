package com.wangjie.service.impl;

import com.wangjie.controller.Code;
import com.wangjie.dao.BookDao;
import com.wangjie.domain.Book;
import com.wangjie.exception.BusinessException;
import com.wangjie.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public boolean save(Book book) {
        return  bookDao.save(book) > 0;
    }

    @Override
    public boolean update(Book book) {
        return bookDao.update(book) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return bookDao.delete(id) > 0;
    }

    @Override
    public Book getById(Integer id) {
        if (id < 1) {
            throw new BusinessException(Code.BUSINESS_ERR, "业务错误，请检查输入值！");
        }

        return bookDao.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
