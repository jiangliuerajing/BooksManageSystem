package com.wncg.action;


import com.wncg.action.user.SearchAction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by BZhao on 2017/3/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext.xml")
public class SearchActionTest extends AbstractJUnit4SpringContextTests{
    @Resource
    SearchAction searchAction;


    /**
     * 测试得到搜索历史的方法
     */
    @Test
    public void testGetSearchHistory(){
        searchAction.getSearchHistory("1");
    }

}