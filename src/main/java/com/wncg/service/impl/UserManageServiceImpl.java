package com.wncg.service.impl;

import com.wncg.dao.ManagerMapper;
import com.wncg.service.UserManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jing on 2017/4/23.
 */
@Service
public class UserManageServiceImpl implements UserManageService {
    @Autowired
    ManagerMapper managerMapper;

    public void deleteUser(int userid){
        try {
            managerMapper.deleteUser(userid);
        }catch (Exception E){
            System.out.println("删除失败");
        }


    }



}
