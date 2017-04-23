package com.wncg.action.manager;

import com.wncg.po.Manager;
import net.sf.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.support.SessionStatus;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by jing on 2017/4/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations =  "classpath*:applicationContext.xml")
public class BooksManageActionTest {
    @Resource
    BooksManageAction booksManageAction;
    Manager manager;
    ModelMap modelMap;


    @Test
    public void loginIn() throws Exception {
         manager=new Manager();
         manager.setManager("123");
         manager.setPassword("123");
         JSONObject test=booksManageAction.loginIn(manager,modelMap);
         System.out.println(test);
    }

    @Test
    public void logout() throws Exception{
        manager=new Manager();
        manager.setManager("123");
        manager.setPassword("123");
        SessionStatus sessionStatus=new SessionStatus() {
            public void setComplete() {
            }

            public boolean isComplete() {
                return false;
            }
        };
        booksManageAction.logout(manager,sessionStatus);
    }

    @Test
    public void addManager() throws Exception {
        JSONObject test=booksManageAction.addManager("123","123");
        System.out.println(test);
    }

    @Test
    public void updataPassword() throws Exception {
        JSONObject test=booksManageAction.updataPassword("123","1234");
        System.out.println(test);
    }

    @Test
    public void deleteUser() throws Exception{
        booksManageAction.deleteUser(123);
    }

}