package com.wncg.action.user;

import com.wncg.service.SearchService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by BZhao on 2017/3/14.
 */
@Controller
public class SearchAction {
    @Autowired
    SearchService searchService;

    /**
     * 通过userId得到搜索记录
     * @param userId
     * @return
     */
    @RequestMapping(value = "getHistory")
    @ResponseBody
    public JSONObject getSearchHistory(String userId){
        return searchService.getSearchHistory(userId);
    }

    /**
     * 删除搜所记录
     * @param searchId
     */
    @RequestMapping(value = "delRecord")
    @ResponseBody
    public void delSearchRecord(String searchId){
        searchService.delSearchRecord(searchId);
    }
}
