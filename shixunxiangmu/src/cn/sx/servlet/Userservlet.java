  package cn.sx.servlet;

import java.io.IOException;
import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import cn.sx.entity.*;
import cn.sx.service.*;
import cn.sx.service.Userservice;
import cn.sx.service.impl.Userserviceimpl;


/**
 * Servlet implementation class Userservlet
 */
@WebServlet("/Userservlet")
public class Userservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public Userservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;Charset=UTF-8");
		String action=request.getParameter("action");
		System.out.println(action);
		Userservice userservice=new Userserviceimpl();
		switch(action) {
		case "getAll":
			getAll(request, response, userservice);
			break;
		
		/*case "toedit":
			toedit(request,response,userservice);
			break;*/
		
		/*case"grxx":
			grxx(request,response,userservice);break;*/
			default:
				break;
		}
		
	}
/*	private void grxx(HttpServletRequest request, HttpServletResponse response, Userservice userservice)
			throws ServletException, IOException {
		System.out.println("aaa");
		  response.setContentType("text/html;charset=UTF-8");
		   PrintWriter out = response.getWriter();
		   // 获取所有的cookie值
		  Cookie[] cookies = request.getCookies();
		   Cookie cookie = null;
		   for (int i = 0; i < cookies.length; i++) {
			   System.out.println("bbb");
		    cookie = cookies[i];
		    if (cookie.getName().equals("userNo")) {
		     out.println("用户名：" + cookie.getValue());
		     System.out.println("ccc");
		     request.getRequestDispatcher("/personal/Grxx.jsp").forward(request, response);
		    }
		 
		    
		   }
		   out.flush();
		   out.close();
		  }
	*/

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");*/
		/*String action = request.getParameter("action");// 瑕佹墽琛岀殑鍔ㄤ綔
		System.out.println(action);*/request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;Charset=UTF-8");
		String action=request.getParameter("action");
		System.out.println(action);
		Userservice userservice=new Userserviceimpl();
		switch(action) {
		case "edit":

		editUser(request, response, userservice);
		break;
		case "addUser":
			addUser(request,response,userservice);
	        break;	
		case "login":
			login(request,response,userservice);break;
		case "submit":
			submit(request,response,userservice);break;
			default:
				break;
		
		}
		
	}

	private void login(HttpServletRequest request, HttpServletResponse response, Userservice userservice)
			throws ServletException, IOException {
		String userNo=request.getParameter("userNo");
		String userPsw=request.getParameter("userPsw");
		System.out.println(userNo);
		UserInfo userinfo = userservice.getById(userNo);
		System.out.println(userinfo.getUserPsw());
		System.out.println(userinfo.getUserPsw());
		  if(userinfo.getUserPsw().equals(userPsw)) {
			System.out.println("登录成功");
			/*request.setAttribute("user", user);
			Cookie cookie1 = new Cookie("userNo", userNo);
			response.addCookie(cookie1);*/
			request.getSession().setAttribute("userNo", userNo);
			request.getSession().setAttribute("userinfo", userinfo);
			request.getRequestDispatcher("/goods/homepage.jsp").forward(request, response);
		     }
			else {
				System.out.println("重新登录");
				request.getRequestDispatcher("/login/index.jsp").forward(request, response);
		}
	
	}
	private void submit(HttpServletRequest request, HttpServletResponse response, Userservice userservice)
			throws ServletException, IOException {
	
		String userNo = request.getParameter("userNo");// 鑾峰彇瑕佷慨鏀圭殑瀛︾敓缂栧彿
		String userName = request.getParameter("userName");
		String userPsw = request.getParameter("userPsw");
		String adderss=request.getParameter("adderss");
		String sex=request.getParameter("sex");
		String userSign=request.getParameter("userSign");
		
		UserInfo userinfo=new UserInfo (userNo,userName,userPsw,adderss,sex,userSign);
		
		if(userNo!=null&&userName!=null&&userPsw!=null&&adderss!=null&&sex!=null&&userSign!=null)
		{ 
			
			int b=userservice.addUserInfo(userinfo);
		     System.out.println(b);

		     if(b==1) {
			
			System.out.println("成功");
	    	
			request.getRequestDispatcher("/personal/Personalpage.jsp").forward(request, response);
		}
		
		else
		{  
			System.out.println("提交失败，请重新填写");
			request.setAttribute("userinfo", userinfo);
			request.getRequestDispatcher("/personal/Grxx.jsp").forward(request, response);
		}
		
		}
	}
	/*private void toedit(HttpServletRequest request, HttpServletResponse response, Userservice userservice)
			throws ServletException, IOException {
		String userNo = request.getParameter("userNo");// 鑾峰彇瑕佷慨鏀圭殑瀛︾敓缂栧彿
		System.out.println(userNo);
		// 鏍规嵁缂栧彿 鏌ュ嚭瀛︾敓
		User user = userservice.getById(userNo);
		request.setAttribute("user", user);
		request.getRequestDispatcher("/seller/editpage.jsp").forward(request, response);
	}*/
   
	private void getAll(HttpServletRequest request, HttpServletResponse response, Userservice userservice) throws ServletException, IOException {
		// TODO Auto-generated method stubList<Student> stus = stuService.getAll();
		
		List<User> users = userservice.getAll();
		System.out.println(users);
		request.setAttribute("users", users);// 瀛樺偍鍒拌姹傚璞�
		// 杞彂鍒伴〉闈�
		request.getRequestDispatcher("/seller/Showsellerinfo.jsp").forward(request, response);
	}
	
	private void addUser(HttpServletRequest request, HttpServletResponse response, Userservice userservice)
			throws ServletException, IOException {	    	  
		response.setContentType("text/html;charset=UTF-8");
		String userNo=request.getParameter("userNo");
		String userName=request.getParameter("userName");
		String userPsw=request.getParameter("userPsw");
		String userPsw1=request.getParameter("userPsw1");
		String adderss=request.getParameter("adderss");
		String sex=request.getParameter("sex");
		String userSign=request.getParameter("userSign");
		
		UserInfo user2=new UserInfo(userNo,userName,userPsw,adderss,sex,userSign);
		if(userPsw.equals(userPsw1)&&userPsw!=null&&userNo!=null&&userName!=null)
		{ 
			int b=userservice.addUserInfo(user2);
		     System.out.println(b);
		if(b==1) {
			
			System.out.println("注册成功");
	    	  /*  Cookie cookie1 = new Cookie("userNo", userNo);
	    	    // cookie的有效期为1个月
	    	   cookie1.setMaxAge(24 * 60 * 60 * 30);
	    	    response.addCookie(cookie1); 
*/
			request.getRequestDispatcher("/login/index.jsp").forward(request, response);
		}
		}
		else
		{  
			System.out.println("注册失败，请重新注册");
			request.setAttribute("user2", user2);
			request.getRequestDispatcher("/seller/registerpage.jsp").forward(request, response);
		}
		
	}
	private void editUser(HttpServletRequest request, HttpServletResponse response, Userservice userservice) 
			throws ServletException, IOException {
		
		String userNo=request.getParameter("userNo");
		String userName=request.getParameter("userName");
		String userPsw=request.getParameter("userPsw");
		String adderss=request.getParameter("adderss");
		String sex=request.getParameter("sex");
		String userSign=request.getParameter("userSign");
		UserInfo user1=new UserInfo(userNo,userName,userPsw,adderss,sex,userSign);
		boolean b=userservice.editUser(user1);
		
		if(b)
		{   
             System.out.println("成功");
             UserInfo a=userservice.getById(userNo);
             request.setAttribute("userinfo",a);
            /* PrintWriter pw=response.getWriter();
             pw.write("<script language='javascript'>alert('修改成功')</script>");*/
             
			request.getRequestDispatcher("/personal/Grxx.jsp").forward(request, response);
			
		}
		else {
			System.out.println("提交失败，请重新填写");
			request.setAttribute("userinfo",user1);
			request.getRequestDispatcher("/personal/Grxx.jsp").forward(request, response);
			
		}
		
		
	}

		
	}

	
	
