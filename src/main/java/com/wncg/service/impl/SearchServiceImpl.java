package com.wncg.service.impl;

import com.wncg.dao.SearchRecordMapper;
import com.wncg.po.SearchRecord;
import com.wncg.service.SearchService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by BZhao on 2017/3/14.
 */
@Service
public class SearchServiceImpl implements SearchService {
    @Autowired
    SearchRecordMapper searchMapper;

    public void searchHistory(String bookName, String userId) {
        List<SearchRecord> searchRecords = searchMapper.selectRecord(bookName,Integer.valueOf(userId));
        if(searchRecords.isEmpty()){
            try {
                searchMapper.insertSearchRecord(bookName,Integer.valueOf(userId));
            }catch (Exception e){
                e.getMessage();
            }
        }
    }

    public JSONObject getSearchHistory(String userId) {
        JSONObject result = new JSONObject();
        try {
            List<SearchRecord> records = searchMapper.selectByUserId(Integer.valueOf(userId));
            if (records.isEmpty()){
                result.put("None","没有搜索记录！");
                return result;
            }
            result.put("result",records);
            return result;
        }catch (Exception e){
            result.put("error",e.getMessage());
            return result;
        }
    }

    public void delSearchRecord(String searchId) {
        try {
            searchMapper.deleteByPrimaryKey(Integer.valueOf(searchId));
        }catch (Exception e){
            e.getMessage();
        }
    }

}
