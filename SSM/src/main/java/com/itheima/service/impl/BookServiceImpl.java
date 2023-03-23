package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 哈拉少本少
 * @Date: 2023/03/22/14:54
 * @Description:
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    @Override
    public boolean save(Book book) {
        int flag = bookDao.save(book);
        return flag>0;
    }

    @Override
    public boolean delete(int id) {
        int flag = bookDao.delete(id);
        return flag>0;
    }

    @Override
    public boolean update(Book book) {
        int flag = bookDao.update(book);
        return flag>0;
    }

    @Override
    public List<Book> findAll() {
        List<Book> all = bookDao.findAll();
        return all;
    }

    @Override
    public Book findById(int id) {
        Book byId = bookDao.findById(id);
        return byId;
    }
}
