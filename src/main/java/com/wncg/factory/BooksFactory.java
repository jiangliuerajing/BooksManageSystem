package com.wncg.factory;

import com.wncg.service.BooksService;

/**
 * 图书抽象工厂
 * Created by BZhao on 2017/3/13.
 */

public interface BooksFactory {

    BooksService selectBooks();

}
