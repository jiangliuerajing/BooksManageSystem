package com.wncg.service.impl;

import com.wncg.dao.ManagerMapper;
import com.wncg.po.Manager;
import com.wncg.service.ManagerService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jing on 2017/4/6.
 */
@Service
public class ManagerServiceImpl implements ManagerService{

    @Autowired
    ManagerMapper managerMapper;

    public JSONObject loginIn(String manager,String password){

        JSONObject result=new JSONObject();

        List<Manager> managers=managerMapper.loginIn(manager);
        if(managers.isEmpty()) {
            result.put("error","管理员不存在");
        }
            Manager manager1 = managers.get(0);
            String psw = manager1.getPassword();
            if (psw == password) {
                result.put("success", manager1);
             }
              result.put("error", "密码错误");
            return result;
    }

    public JSONObject addManager(String manager,String password){
        JSONObject result=new JSONObject();

        List<Manager> managers=managerMapper.loginIn(manager);
        if(managers.isEmpty()){
          managerMapper.addManager(manager,password);
          result.put("success","已注册");
        }
        else
            result.put("error","重新输入账号");
        return result;
    }

    public JSONObject updataPassword(String manager,String newPassword){
        JSONObject result=new JSONObject();
        try {
            managerMapper.updataPassword(manager, newPassword);
            result.put("success","修改成功");
        }catch (Exception e){
            result.put("error",e.getMessage());
        }
        return result;
    }

    public void deleteUser(int userid){
        try {
            managerMapper.deleteUser(userid);
        }catch (Exception e){
            System.out.println("删除失败");
        }
    }

}
