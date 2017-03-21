package com.wncg.factory.impl;


import com.wncg.factory.BooksFactory;
import com.wncg.service.BooksService;
import com.wncg.service.impl.BooksServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 图书具体工厂
 * Created by BZhao on 2017/3/13.
 */
@Service("booksFactory")
 public class BooksFactoryImpl implements BooksFactory {
    @Autowired
    BooksServiceImpl booksServiceImpl;

    public BooksService selectBooks() {
        return booksServiceImpl;
    }

}
