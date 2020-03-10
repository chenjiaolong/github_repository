package cn.sx.service.impl;

import java.util.List;

import cn.sx.entity.Buy;
import cn.sx.entity.Good;
import cn.sx.entity.User;
import cn.sx.entity.UserInfo;
import cn.sx.service.GoodService;
import cn.sx.util.*;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;





public class GoodServiceImpl implements GoodService {
	public List<Good> select(String sort) {
		// TODO Auto-generated method stub
		
		String sql="select * from goods where goodSort like '"+sort+"'";
		
		return JdbcUtils.getList(Good.class,sql);
	}
	
	/**
	 * 查询多个对象
	 * 
	 * @param clazz
	 *            要查询的对象类型
	 * @param sql
	 *            查询语句
	 * @return 查询出的对象组成的集合
	 */
	/*public static List getList2(Class clazz, String sql) {
		List list = new ArrayList();
		Connection conn = JdbcUtils.getConn();
		PreparedStatement st = null;
		ResultSet rs = null;
		

		try {
			st = conn.prepareStatement(sql);
			System.out.println(sql);
			rs = st.executeQuery();// 执行查询
			while (rs.next()) { // 遍历查询出的每个结果 并封装对象
				System.out.println("11");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}  finally {// 关闭
			JdbcUtils.close(rs, st, conn);
		}
		return list;
	}*/
	public List<Good> old(){
		
		String sql="select * from goods where eoy=\'Ershou\'";
		return JdbcUtils.getList(Good.class,sql);
		
	}
	public List<Good> heart(){
		String sql="select * from goods where eoy=\'Yimai\'";
		return JdbcUtils.getList(Good.class,sql);
	}
	public int addGood(Good good1,String userNo) {
		
		String sql="insert into goods (goodName,tel,goodPrice,eoy,goodDes,goodSort,userNo) values (?,?,?,?,?,?,?)";
	    return  JdbcUtils.executeSQL(sql, good1.getGoodName(),good1.getTel(),good1.getGoodPrice(),good1.getEoy(),good1.getGoodDes(),good1.getGoodSort(),userNo);
	}  
	
	public List<Buy> getAll(String userNo){
		
		String sql="select * from buyinfo where userNo='"+userNo+"'";
		return JdbcUtils.getList(Buy.class, sql);
		
	}
	public List<Good> getAll1(String userNo){
		
		String sql="select * from goods where userNo='"+userNo+"'";
		return JdbcUtils.getList(Good.class, sql);
		
	
	}
	public int  editseller(Good good,String userNo)   
	{
		String  sql="update goods set goodName=?,userNo=?,goodPrice=?,eoy=? ,goodDes=?,goodSort=?,tel=? where goodNo=?";
		
		
		int result = JdbcUtils.executeSQL(sql,good.getGoodName(),userNo,good.getGoodPrice(),good.getEoy(),good.getGoodDes(),good.getGoodSort(),good.getTel(),good.getGoodNo());
		
		return result;
	}
	public int addbuyinfo(Buy buy,String goodNo) {
	
		String sql1="insert into buyinfo (userNo,goodNo,goodName,goodPrice,tel) values(?,?,?,?,?)";
		JdbcUtils.executeSQL(sql1,buy.getUserNo(),buy.getTel(),buy.getGoodNo(),buy.getGoodName(),buy.getGoodPrice());
		String sql="delete from goods where goodNo=?";
		return JdbcUtils.executeSQL(sql,goodNo);
	}
	public int delete(Good good) {
		String sql1="insert into buyinfo (tel,goodNo,goodName,goodPrice) values(?,?,?,?)";
		JdbcUtils.executeSQL(sql1,good.getTel(),good.getGoodNo(),good.getGoodName(),good.getGoodPrice());
		String sql="delete from goods where goodNo=?";
		return JdbcUtils.executeSQL(sql,good.getGoodNo());
	}
	public Good getById(String goodNo) {
		String sql="select * from goods where goodNo=?";
		return (Good) JdbcUtils.getObjectById(Good.class, sql, goodNo);
	}

	public static void main(String[] args) {
		List<Good> gs=new  GoodServiceImpl().select("书");
		System.out.println(gs);
	}
	/*public List<Good> addsellinfo(Good good,String userNo) {
		String sql="insert into goods (goodNo,goodName,userNo,goodPrice,eoy,goodDes,goodSort,tel) values (?,?,?,?,?,?,?,?)";
	    return  JdbcUtils.executeSQL(sql,userNo, good.getGoodNo(),good.getGoodName(),good.getUserNo(),good.getGoodPrice(),good.getEoy(),good.getGoodDes(),good.getGoodSort());
	}
*/
}
