package com.itheima.dao;

import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: 哈拉少本少
 * @Date: 2023/03/22/14:42
 * @Description:
 */
@Repository
public interface BookDao {
    /**
     * 添加操作
     * @param book
     * @return
     */
    @Insert("insert into tbl_book (type, name, description) values (#{type},#{name},#{description});")
    int save(Book book);

    /**
     * 删除操作
     */
    @Delete("delete from tbl_book where id=#{id};")
    int delete(int id);

    /**
     * 修改操作
     */
    @Update("update tbl_book set type =#{type},name=#{name},description=#{description}  where id=#{id};")
    int update(Book book);

    /**
     * 查询全部
     */
    @Select("select * from tbl_book;")
    List<Book>findAll();

    /**
     * 根据id查询
     */
    @Select("select * from tbl_book where id=#{id};")
    Book findById(int id);
}
