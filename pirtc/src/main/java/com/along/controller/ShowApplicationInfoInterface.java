package com.along.controller;

import com.along.mapper.ApplicationMapper;
import com.along.pojo.Application;
import com.along.pojo.JsonApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author along
 * @version 1.0
 * @date 2020/1/10 2:45
 */
//成功
@RestController
public class ShowApplicationInfoInterface {//根据用户id返回他的申请

    @Autowired
    ApplicationMapper applicationMapper;
    @RequestMapping("/ShowApplicationInfo")
    public List<Application> ShowApplicationInfo(
            @RequestParam("userId") Integer userId
                                         ){
        //Integer userId=3;
        List<Application> applications;
        applications=applicationMapper.selectApplicationByuserId(userId);
        return applications;
    }
}
//返回list修改