package com.along.controller;

import com.along.mapper.UserMapper;
import com.along.pojo.JsonObject;
import com.along.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.OutputStream;

/**
 * @author along
 * @version 1.0
 * @date 2020/1/9 11:30
 */
//成功//完
@RestController
public class LoginInterface {

    @Autowired
    UserMapper userMapper;
    @RequestMapping("/login")
    public JsonObject login(

            @RequestParam("userEmail")String userEmail,
            @RequestParam("userPassword")String userPassword
    )
    {

//        String userEmail="456123789@qq.com",userPassword="aaa123456";//测试数据
        System.out.println(userPassword);
        System.out.println(userEmail);
        JsonObject jsonObject=new JsonObject();
        Integer id=userMapper.returnIdByuserEmail(userEmail);

        User user=userMapper.selectUserById(id);
        if(id==null){
            jsonObject.setMsg("email_wrong");
            jsonObject=null;
        }
        else {
            if(user.getUserPassword().equals(userPassword)){
                jsonObject.setUser(user);
            }
            else {
                jsonObject.setMsg("password_wrong");
                jsonObject.setUser(null);
            }
        }
        System.out.println(jsonObject);
        return jsonObject;
    }
}
