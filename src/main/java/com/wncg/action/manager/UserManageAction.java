package com.wncg.action.manager;

import com.wncg.dao.ManagerMapper;
import com.wncg.service.ManagerService;
import com.wncg.service.UserManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jing on 2017/4/23.
 */


@Controller
public class UserManageAction {

    @Autowired
    UserManageService userManageService;

    @RequestMapping(value = "deleteUser")
    @ResponseBody
    public void deleteUser(int userid){
        userManageService.deleteUser(userid);
    }











}
