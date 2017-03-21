package com.wncg.service;

import net.sf.json.JSONObject;

/**
 * Created by BZhao on 2017/3/12.
 */
public interface BooksService {

    JSONObject selectBooksByKeyWords(String bookName);

    JSONObject getBookByIsbn(String isbn);

}
