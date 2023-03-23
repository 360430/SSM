package com.itheima.controller;

import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: 哈拉少本少
 * @Date: 2023/03/22/14:59
 * @Description:
 */
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookservice;
    @PostMapping
    public Result save(@RequestBody Book book){
        boolean flag = bookservice.save(book);
        int code = flag ? Code.SAVE_OK : Code.SAVE_ERR;
        String msg = flag  ? "" : "添加失败";
        return new Result(code,flag,msg);
    }
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable int id){
        boolean flag = bookservice.delete(id);
        int code = flag ? Code.DELETE_OK:Code.DELETE_ERR;
        String msg = flag  ? "" : "删除失败";
        return new Result(code,flag,msg);
    }
    @PutMapping
    public Result Update(@RequestBody Book book){
        boolean flag = bookservice.update(book);
        int code = flag ? Code.UPDATE_OK:Code.UPDATE_ERR;
        String msg = flag  ? "" : "修改失败";
        return new Result(code,flag,msg);
    }
    @GetMapping
    public Result findAll(){
        System.out.println("查询全部看没看见");
        List<Book> bookList = bookservice.findAll();
        int code = bookList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = bookList != null ? "" : "查询失败";
        return new Result(code,bookList,msg);
    }
    @GetMapping("/{id}")
    public Result findById(@PathVariable Integer id){
        System.out.println("查询单个信息看没看见");
        Book book = bookservice.findById(id);
        int code = book != null ? Code.GET_OK : Code.GET_ERR;
        String msg = book != null ? "" : "id查询失败";
        return new Result(code,book,msg);
    }
}
