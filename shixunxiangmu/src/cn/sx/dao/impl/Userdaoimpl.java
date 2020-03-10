/**
 * 
 */
package cn.sx.dao.impl;


import cn.sx.dao.Userdao;
import java.util.List;
import cn.sx.entity.User;
import cn.sx.entity.UserInfo;
import cn.sx.util.JdbcUtils;
/**
 * @author along
 *
 */
public  class Userdaoimpl implements Userdao {

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
			String sql="select * from userinfo ";
			return JdbcUtils.getList(User.class, sql);//缁�
	}

	@Override
	public UserInfo getById(String userNo) {
		// TODO Auto-generated method stub
		System.out.println(userNo);
		String sql="select * from userinfo where userNo=?";
		return (UserInfo) JdbcUtils.getObjectById(UserInfo.class, sql, userNo);
	}
	@Override
	public int  editUser(UserInfo userinfo)   
	{
		String  sql="update userinfo set userName=?,userPsw=?,adderss=?,sex=?,userSign=? where userNo=?";
		
		
		int result = JdbcUtils.executeSQL(sql,userinfo.getUserName() ,userinfo.getUserPsw(),userinfo.getAdderss(),userinfo.getSex(),userinfo.getUserSign(),userinfo.getUserNo()); 
		System.out.println(result);
		
		return result;
	}
	
	public int addUser(UserInfo userinfo)
	{
		String sql="insert into userinfo (userinfo.userName,userinfo.userPsw,userinfo.userNo) values (?,?,?)";
	    return  JdbcUtils.executeSQL(sql, userinfo.getUserNo(),userinfo.getUserPsw(),userinfo.getUserName()); 
		
	}
	public int addUserInfo(UserInfo userinfo)
	{
		String sql="insert into userinfo (userNO,userName,userPsw,adderss,sex,userSign) values(?,?,?,?,?,?)";
        return JdbcUtils.executeSQL(sql, userinfo.getUserNo(),userinfo.getUserName(),userinfo.getUserPsw(),userinfo.getAdderss(),userinfo.getSex(),userinfo.getUserSign());	
	}

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
	
}
