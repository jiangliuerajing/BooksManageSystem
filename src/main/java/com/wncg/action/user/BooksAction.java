package com.wncg.action.user;

import com.wncg.factory.BooksFactory;
import com.wncg.factory.SearchFactory;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;


/**
 * Created by BZhao on 2017/3/12.
 */
@Controller
public class BooksAction {

    @Resource(name = "booksFactory")
    BooksFactory booksFactory;
    @Resource(name = "searchFactory")
    SearchFactory searchFactory;

    /**
     *通过关键词、全拼、首拼、isbn编号查询书籍信息并且保存搜索内容
     * @param bookName
     * @return
     */
    @RequestMapping(value = "selectBooks")
    @ResponseBody
    public JSONObject selectBooksByKeyWords(String bookName, String userId){

        JSONObject books = booksFactory.selectBooks().selectBooksByKeyWords(bookName);
        if(!userId.equals(null) || userId.length() > 0){
            searchFactory.searchService().searchHistory(bookName,userId);
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

        return booksFactory.selectBooks().getBookByIsbn(isbn);
    }

}
