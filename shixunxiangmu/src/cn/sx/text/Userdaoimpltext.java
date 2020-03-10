package cn.sx.text;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;


import cn.sx.dao.*;
import cn.sx.dao.impl.*;
import cn.sx.entity.*;

public class Userdaoimpltext {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void testgetAll() {
		Userdao userdao=new Userdaoimpl();
		List<User> user=userdao.getAll();
		for (User user1 : user) {
			System.out.println(user1);
		}
	}
		/*@Test
		public void testgetById() {
			Userdao userdao=new Userdaoimpl();
			User user=userdao.getById("17371253060");
			System.out.println(user.getUserName());
		}
*/
		/*@Test
		public void testeditUser() {
			Userdao userdao=new Userdaoimpl();
			User user=userdao.getById("17371253060");//
			user.setUserName("zheshibaba");
			int count=userdao.editUser(userinfo);
			if(count>0){
				System.out.println("�޸ĳɹ�");
			}else{
				System.out.println("�޸Ĵ���");
			}		
		}
			
		*/
	

}
