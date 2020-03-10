package com.along.controller;

import com.along.mapper.UserMapper;
import com.along.pojo.JsonObject;
import com.along.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author along
 * @version 1.0
 * @date 2020/1/10 2:03
 */

@RestController
public class ShowUserInfoInterface {//显示某一个用户的信息，可以通过邮箱或者手机号查询
                                    //具体按什么查询看前端用什么  可以再修改
    @Autowired
    UserMapper userMapper;
    @RequestMapping("/ShowUserInfo")
    public JsonObject ShowUserInfo(
            @RequestParam("userId")int userId

    ){

//        String userEmail="1234554@qq.com",userPhone="12359746647";测试数据
        User user=userMapper.selectUserById(userId);
        JsonObject jsonObject=new JsonObject();
        jsonObject.setUser(user);
        return jsonObject;
    }
}
