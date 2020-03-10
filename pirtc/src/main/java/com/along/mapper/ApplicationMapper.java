package com.along.mapper;

import com.along.pojo.Application;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author along
 * @version 1.0
 * @date 2020/1/10 2:31
 */

@Mapper
@Repository
public interface ApplicationMapper {

    //选择全部申请
    public List<Application> ApplicationList();
    //根据id选择申请
    public Application selectApplicationById(Integer applicationId);
    //添加一条申请
    public int addApplication(Application application);
    //更新一条申请
    public int updateApplication(Application application);
    //删除一条申请
    public int deleteApplication(Integer applicationId);
    //更加用户id返回申请id
    public Integer returnIdByusernId(Integer userId);

    public  List<Application> selectApplicationByuserId(Integer userId);


}
