package com.wncg.service;

import net.sf.json.JSONObject;

/**
 * Created by jing on 2017/3/29.
 */
public interface ManagerService {

    JSONObject loginIn(String manager,String password);

    JSONObject addManager(String manager,String password);

    JSONObject updatePassword(String manager,String newPassword);


}
