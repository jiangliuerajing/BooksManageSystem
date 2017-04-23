package com.wncg.service;

import net.sf.json.JSONObject;

/**
 * Created by jing on 2017/3/29.
 */
public interface ManagerService {

    JSONObject loginIn(String manager,String password);

    JSONObject addManager(String manager,String password);

    JSONObject updataPassword(String manager,String newPassword);

    void deleteUser(int userid);

}
