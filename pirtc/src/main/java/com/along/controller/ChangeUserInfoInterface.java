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
 * @date 2020/1/10 1:53
 */
//成功//完成
@RestController
public class ChangeUserInfoInterface {//这是改变某一个用户的个人信息，通过邮箱或者手机号修改信息
    @Autowired
    UserMapper userMapper;
    @RequestMapping("/ChangeUserInfo")
    public JsonObject ChangeUserInfo(
            @RequestParam("userPhone") String userPhone,
            @RequestParam("userEmail")String userEmail,
            @RequestParam("userPassword")String userPassword,
            @RequestParam("userName")String userName,
            @RequestParam("userSection")String userSection

    ){
//       String userPhone="17364957425",userEmail="3456798765@qq.com",userPassword="1234567",userName="阿江",userSection="补给部";




        Integer id=userMapper.returnIdByuserEmail(userEmail);//这里通过邮箱查询到具体的用户 可以用其他的方法 具体看前端怎么传
        User user=userMapper.selectUserById(id);
        System.out.println(user);
        User user1=new User(id,userPhone,userEmail,userPassword,userName,userSection,user.getUserJob());
        userMapper.updateUser(user1);
        JsonObject jsonObject= new JsonObject();
        jsonObject.setUser(user1);
        jsonObject.setMsg("update_success");
        return jsonObject;
    }
}
