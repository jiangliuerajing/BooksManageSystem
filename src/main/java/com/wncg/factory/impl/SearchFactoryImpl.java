package com.wncg.factory.impl;

import com.wncg.factory.SearchFactory;
import com.wncg.service.SearchService;
import com.wncg.service.impl.SearchServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 搜索具体工厂
 * Created by BZhao on 2017/3/14.
 */
@Service("searchFactory")
public class SearchFactoryImpl implements SearchFactory {
    @Autowired
    SearchServiceImpl searchServiceImpl;

    public SearchService searchService() {
        return searchServiceImpl;
    }
}
