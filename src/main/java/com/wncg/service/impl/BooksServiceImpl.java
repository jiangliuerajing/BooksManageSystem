package com.wncg.service.impl;

import com.wncg.dao.BookMapper;
import com.wncg.po.BookWithBLOBs;
import com.wncg.service.BooksService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by BZhao on 2017/3/13.
 */
@Service
public class BooksServiceImpl implements BooksService {

    @Autowired
    BookMapper bookMapper;


    public JSONObject selectBooksByKeyWords(String bookName){
        JSONObject result = new JSONObject();
        List<BookWithBLOBs> books =  bookMapper.selectBooksByKeyWords(bookName);
        if (books.isEmpty()){
            result.put("error","没有查询到数据！");
            return result;
        }
        result.put("success",books);
        return result;

    }

    public JSONObject getBookByIsbn(String isbn) {
        JSONObject result = new JSONObject();
        try {
            List<BookWithBLOBs> book =  bookMapper.getBookByIsbn(isbn);
            result.put("result",book);
            return result;
        }
        catch (Exception e){
            result.put("error","获取书籍详情失败！");
            return result;
        }
    }
}
