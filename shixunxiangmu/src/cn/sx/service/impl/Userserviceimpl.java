/**
 * 
 */
package cn.sx.service.impl;

import cn.sx.service.Userservice;
import java.util.List;


import cn.sx.dao.Userdao;
import cn.sx.dao.impl.Userdaoimpl;
import cn.sx.entity.User;
import cn.sx.entity.UserInfo;
import cn.sx.service.Userservice;

/**
 * @author along
 *
 */
public   class Userserviceimpl implements Userservice {
      
	private Userdao userdao=new Userdaoimpl();

	public List<User> getAll() {
		return userdao.getAll();
	}
	@Override
	public boolean editUser(UserInfo userinfo) {
		System.out.print(userdao.editUser(userinfo));
		return userdao.editUser(userinfo)>0?true:false;
	}
	@Override
	public UserInfo getById(String userNo) {
		// TODO Auto-generated method stub
		return userdao.getById(userNo);
}
	public int addUser(User user) {
		return userdao.addUser(user);
	}
   public int addUserInfo(UserInfo userinfo) {
	   return userdao.addUserInfo(userinfo);
   }
@Override
public boolean editUser(User user) {
	// TODO Auto-generated method stub
	return false;
}



}
