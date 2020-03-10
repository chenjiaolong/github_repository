package com.along.controller;

import com.along.mapper.ApplicationMapper;
import com.along.mapper.UserMapper;
import com.along.pojo.AandUJson;
import com.along.pojo.Application;
import com.along.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author along
 * @version 1.0
 * @date 2020/1/10 19:43
 */
//成功/wancheng
@RestController
public class ShowAandUInfoInterface {
    @Autowired
    ApplicationMapper applicationMapper;
    @Autowired
    UserMapper userMapper;
    @RequestMapping("/ShowAandUInfo")
     public AandUJson ShowAandUInfo(
             @RequestParam("applicationId") int applicationId
    )
     {
//        int applicationId=1;
         System.out.println(applicationId);
         AandUJson andUJson=new AandUJson();
         Application application=new Application();
         User user=new User();
         application=applicationMapper.selectApplicationById(applicationId);
         user=userMapper.selectUserById(application.getUserId());
         andUJson.setUser(user);
         andUJson.setApplication(application);
         System.out.println("jinlaile");
         return  andUJson;
     }

}
