package cn.sx.dao;

import java.util.List;

import cn.sx.entity.User;
import cn.sx.entity.UserInfo;

public interface Userdao {
	 List<User>  getAll();

	
     UserInfo getById(String userNo);
    
     
     /*int editUser(User user);*/

     int addUser(User user);

	 int addUserInfo(UserInfo userinfo);


	int editUser(UserInfo userinfo);
     
  
}
