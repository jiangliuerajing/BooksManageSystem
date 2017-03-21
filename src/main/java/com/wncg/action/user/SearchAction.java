package com.wncg.action.user;

import com.wncg.factory.SearchFactory;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by BZhao on 2017/3/14.
 */
@Controller
public class SearchAction {

    @Resource(name = "searchFactory")
    SearchFactory searchFactory;

    /**
     * 通过userId得到搜索记录
     * @param userId
     * @return
     */
    @RequestMapping(value = "getHistory")
    @ResponseBody
    public JSONObject getSearchHistory(String userId){
        return searchFactory.searchService().getSearchHistory(userId);
    }

    /**
     * 删除搜所记录
     * @param searchId
     */
    @RequestMapping(value = "delRecord")
    @ResponseBody
    public void delSearchRecord(String searchId){
        searchFactory.searchService().delSearchRecord(searchId);
    }
}
