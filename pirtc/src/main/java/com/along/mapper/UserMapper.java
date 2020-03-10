package com.along.mapper;

import com.along.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author along
 * @version 1.0
 * @date 2020/1/1 1:19
 */
@Mapper
@Repository
public interface UserMapper {
    //@Insert("insert into user(username,password,tel,department,email,sex) values (#{username},#{password},#{tel},#{department},#{email},#{sex})")

    //选择全部用户
     public List<User> Userlist();
    //根据id选择用户
    public User selectUserById(Integer userId);
    //添加一个用户
    public int addUser(User user);
    //修改一个用户
    public int updateUser(User user);
    //根据id删除用户
    public int deleteUser(int userId);

    public  Integer returnIdByuserPhone(String userPhone);

    public  Integer returnIdByuserEmail(String userEmail );
}
