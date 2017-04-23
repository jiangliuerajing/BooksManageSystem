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
 * Created by jing on 2017/4/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext.xml")
public class ManagerActionTest {
    @Resource
    ManagerAction managerAction;

    @Test
    public void loginIn() throws Exception {
            Manager manager=new Manager();
            manager.setManager("123");
            manager.setPassword("123");
            ModelMap modelMap=new ModelMap();
           JSONObject A= managerAction.loginIn(manager,modelMap);
           System.out.println(A);
    }

    @Test
    public void logout() throws Exception {
        Manager manager=new Manager();
        SessionStatus sessionStatus=new SessionStatus() {
            public void setComplete() {
            }

            public boolean isComplete() {
                return false;
            }
        };
        managerAction.logout(manager,sessionStatus);
    }

    @Test
    public void addManager() throws Exception {
       JSONObject A=managerAction.addManager("123","123");
        System.out.println(A);
    }

    @Test
    public void updatePassword() throws Exception {
        managerAction.updatePassword("123","345");

    }

}