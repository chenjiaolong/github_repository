package com.along.controller;

import com.along.mapper.UserMapper;
import com.along.pojo.JsonObject;
import com.along.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.util.StringUtils;

/**
 * @author along
 * @version 1.0
 * @date 2020/1/10 0:11
 */
//成功//完成
@RestController
public class RegisterInterface {//这是用户注册的接口 用户填写信息
                                //向数据库里查询是否有重复的 没重复的就加入数据库 否则返回具体错误信息

    @Autowired
    UserMapper userMapper;
    @RequestMapping("/register")
    public JsonObject Register(
            @RequestParam("userPhone")String userPhone,
            @RequestParam("userEmail")String userEmail,
            @RequestParam("userPassword")String userPassword1,
            @RequestParam("userName")String userName,
            @RequestParam("userSection")String userSection,
            @RequestParam("userJob")int userJob
                               ){
//        String userPhone="17485296312",userEmail="456123789@qq.com",userPassword1="aaa123456",userPassword2="aaa123456",userName="阿江",userSection="财务部";
//        int userJob=2;   测试数据
        JsonObject jsonObject=new JsonObject();
        Integer id_phone=userMapper.returnIdByuserPhone(userPhone);//这里查询手机号
        Integer id_email=userMapper.returnIdByuserEmail(userEmail);//这里查询邮箱号
        System.out.println("userPhone："+userPhone);
        System.out.println(userEmail);
        System.out.println(id_phone);
        System.out.println(id_email);
        if(userMapper.selectUserById(id_phone)!=null){
            jsonObject.setMsg("duplicated_phone");
        }
        else if(userMapper.selectUserById(id_email)!=null){
            jsonObject.setMsg("duplicated_email");
        }
        else  {//否则注册成功  向前端返回成功信息
            User user=new User(userPhone,userEmail,userPassword1,userName,userSection,userJob);
            userMapper.addUser(user);
            Integer id=userMapper.returnIdByuserEmail(userEmail);
            User user1=new User();
            user1=userMapper.selectUserById(id);
            jsonObject.setUser(user1);
            jsonObject.setMsg("register_success");
        }
        return jsonObject;
    }
}