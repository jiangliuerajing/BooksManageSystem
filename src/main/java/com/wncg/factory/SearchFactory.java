package com.wncg.factory;

import com.wncg.service.SearchService;

/**
 * 搜索抽象工厂
 * Created by BZhao on 2017/3/14.
 */
public interface SearchFactory {

    SearchService searchService();

}
