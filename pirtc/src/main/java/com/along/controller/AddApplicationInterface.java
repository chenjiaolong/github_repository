package com.along.controller;

import com.along.mapper.ApplicationMapper;
import com.along.mapper.UserMapper;
import com.along.pojo.Application;
import com.along.pojo.JsonApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.naming.IdentityNamingStrategy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;

/**
 * @author along
 * @version 1.0
 * @date 2020/1/10 14:43
 */
//c成功//完成
@RestController
public class AddApplicationInterface {


    @Autowired
    ApplicationMapper applicationMapper;
    @Autowired
    UserMapper userMapper;
    @RequestMapping("/AddApplication")
    public JsonApplication AddApplicationById(
            @RequestParam("userId")Integer userId,
            @RequestParam("hotelFees")Integer hotelFees,
            @RequestParam("travelFees")Integer travelFees,
            @RequestParam("destination")String destination,
            @RequestParam("approvalStatus")Integer approvalStatus


    ){
//
//        Integer userId=3,hotelFees=150,travelFees=368,approvalStatus=0;
//        String destination="北京";//测试
        Date approvalTime=new Date(System.currentTimeMillis());
        String note= userMapper.selectUserById(userId).getUserName();
        System.out.println(note);
        Application application=new Application(userId,hotelFees,travelFees,destination,approvalStatus,approvalTime,note);
        Application application1=new Application();
        applicationMapper.addApplication(application);
        JsonApplication jsonApplication= new JsonApplication();
        System.out.println(application);
        jsonApplication.setMsg("add_success");
        jsonApplication.setApplication(application);
        return jsonApplication;
    }
}
