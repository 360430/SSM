package com.itheima.service;

import com.itheima.domain.Book;

import java.util.List;

/**
 * @Author: 哈拉少本少
 * @Date: 2023/03/22/14:54
 * @Description:
 */
public interface BookService {
    public boolean save(Book book);
    public boolean delete(int id);
    public boolean update(Book book);
    public List<Book>findAll();
    public Book findById(int id);
}
