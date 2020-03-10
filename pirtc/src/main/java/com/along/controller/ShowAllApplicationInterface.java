package com.along.controller;

import com.along.mapper.ApplicationMapper;
import com.along.pojo.Application;
import com.along.pojo.JsonApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author along
 * @version 1.0
 * @date 2020/1/10 15:37
 */
//成功、、完成
    //此接口只需输入http://localhost:8080/ShowAllApplication即可
@RestController
public class ShowAllApplicationInterface {


    @Autowired
    ApplicationMapper applicationMapper;
    @RequestMapping("/ShowAllApplication")
    public List<Application> ShowAllApplication(){

        List<Application> applications;
        applications=applicationMapper.ApplicationList();
        return applications;
    }


}

