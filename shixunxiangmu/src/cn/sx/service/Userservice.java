/**
 * 
 */
package cn.sx.service;
import java.util.List;

import cn.sx.entity.User;
import cn.sx.entity.UserInfo;
/**
 * @author along
 *
 */
public interface Userservice {
	  List<User>  getAll() ;

	
     UserInfo getById(String userNo);
   
    boolean editUser(User user);

    int addUser(User user);
    int addUserInfo(UserInfo userinfo);


	boolean editUser(UserInfo userinfo);


	
}
