package com.wncg.action.manager;

import com.wncg.po.Manager;
import com.wncg.service.ManagerService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.support.SessionStatus;

/**
 * Created by jing on 2017/4/23.
 */

@Controller
public class ManagerAction {

    @Autowired
    ManagerService managerService;

    @RequestMapping(value = "loginIn")
    @ResponseBody
    public JSONObject loginIn(Manager manager, ModelMap modelMap){
        JSONObject result=managerService.loginIn(manager.getManager(),manager.getPassword());
        if(result.containsKey("success")){
            modelMap.addAttribute("manager",manager);
        }
        return result;
    }

    @RequestMapping(value = "logout")
    @ResponseBody
    public void logout(@ModelAttribute("manager")Manager manager, SessionStatus sessionStatus){
        sessionStatus.setComplete();
    }

    @RequestMapping(value = "addManager")
    @ResponseBody
    public JSONObject addManager(String manager,String password){
        JSONObject result=managerService.addManager(manager,password);
        return  result;
    }

    @RequestMapping(value = "updataPassword")
    @ResponseBody
    public JSONObject updatePassword(String manager,String newPassword){
        return managerService.updatePassword(manager,newPassword);
    }








}
