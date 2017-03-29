package com.wncg.action.user;

import com.wncg.service.BooksService;
import com.wncg.service.SearchService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by BZhao on 2017/3/12.
 */
@Controller
public class BooksAction {

    @Autowired
    BooksService booksService;
    @Autowired
    SearchService searchService;

    /**
     *通过关键词、全拼、首拼、isbn编号查询书籍信息并且保存搜索内容
     * @param bookName
     * @return
     */
    @RequestMapping(value = "selectBooks")
    @ResponseBody
    public JSONObject selectBooksByKeyWords(String bookName, String userId){

        JSONObject books = booksService.selectBooksByKeyWords(bookName);
        if(!userId.equals(null) || userId.length() > 0){
            searchService.searchHistory(bookName,userId);
        }
        return books;
    }

    /**
     * 根据isbn或图书编号查看书籍详情
     * @param isbn
     * @return
     */
    @RequestMapping(value = "getBook")
    @ResponseBody
    public JSONObject getBookByIsbn(String isbn){

        return booksService.getBookByIsbn(isbn);
    }

}
