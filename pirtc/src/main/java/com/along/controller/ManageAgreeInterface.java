package com.along.controller;

import com.along.mapper.ApplicationMapper;
import com.along.pojo.Application;
import com.along.pojo.JsonApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author along
 * @version 1.0
 * @date 2020/1/10 15:22
 */
//成功

@RestController
public class ManageAgreeInterface {//经理修改申请 1-审核通过
                                    //2-审核不通过

    @Autowired
    ApplicationMapper applicationMapper;
    @RequestMapping("/ManageAgree")
    public JsonApplication ManageAgree(
            @RequestParam("applicationId") Integer applicationId,
            @RequestParam("approvalStatus") Integer approval
    ){
//        Integer applicationId=1,approval=1;测试数据
        Application application=new Application();
        application=applicationMapper.selectApplicationById(applicationId);//通过申请表的id查到对应的申请
        application.setApprovalStatus(approval);//修改他的状态
        applicationMapper.updateApplication(application);
        JsonApplication jsonApplication=new JsonApplication();
        if(approval==1)
        {
            jsonApplication.setMsg("success");

        }
        else jsonApplication.setMsg("fail");
        jsonApplication.setApplication(application);//返回修改后的申请
        System.out.println(application);

        return jsonApplication;
    }
}
