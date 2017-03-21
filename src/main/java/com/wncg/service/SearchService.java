package com.wncg.service;

import net.sf.json.JSONObject;

/**
 * Created by BZhao on 2017/3/14.
 */
public interface SearchService {

    void searchHistory(String bookName, String userId);

    JSONObject getSearchHistory(String userId);

    void delSearchRecord(String searchId);
}
