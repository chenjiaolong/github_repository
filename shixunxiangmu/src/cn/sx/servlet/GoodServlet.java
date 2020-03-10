package cn.sx.servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import org.apache.jasper.tagplugins.jstl.core.Out;

import cn.sx.entity.Buy;
import cn.sx.entity.Good;
import cn.sx.entity.User;
import cn.sx.entity.UserInfo;
import cn.sx.service.*;
import cn.sx.service.impl.*;
/**
 * Servlet implementation class GoodServlet
 */
@WebServlet("/GoodServlet")
public class GoodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GoodServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		GoodService gService=new GoodServiceImpl();
		String action = request.getParameter("action");
		System.out.println(action);
		switch(action) {
		
		case "q2":
			oldGood(request,response,gService);				
			break;
		case "q3":
			heartGood(request,response,gService);
			break;
		case "todelete":
			todelete(request,response,gService);break;
		case "select":	
			select(request,response,gService);break;
		case "showbuyinfo":
			showbuyinfo(request,response,gService);break;
		case "seller":
			sellerinfo(request,response,gService);break;
		
			default:
			break;
		}
	}
	private void toseller(HttpServletRequest request, HttpServletResponse response, GoodService gService)
			throws ServletException, IOException {
		System.out.println("haha ");
		String goodNo=request.getParameter("goodNo");
		String userNo=(String)request.getSession().getAttribute("userNo");
		System.out.println(goodNo);
		
		System.out.println(userNo);
		Good good=gService.getById(goodNo);
		System.out.println(goodNo);
		request.setAttribute("sell", good);
		request.getRequestDispatcher("/goods/editseller.jsp").forward(request, response);
	}
	private void sellerinfo(HttpServletRequest request, HttpServletResponse response, GoodService gService)
			throws ServletException, IOException {
		
	  String userNo=(String)request.getSession().getAttribute("userNo");////卖的信息
	  List<Good> goods = gService.getAll1(userNo);
       /* request.getSession().setAttribute("sell", goods);*/
		// 
	   request.setAttribute("sellerpublic", goods);
		
		request.getRequestDispatcher("/personal/sellerinfo.jsp").forward(request, response);
		
		
	}
	private void select(HttpServletRequest request, HttpServletResponse response, GoodService gService)
			throws ServletException, IOException {
		
	}
	
	private void showbuyinfo(HttpServletRequest request, HttpServletResponse response, GoodService gService)
			throws ServletException, IOException {       //展示买的信息
		String userNo=(String)request.getSession().getAttribute("userNo");
		
		List<Buy> buys = gService.getAll(userNo);
		
		request.setAttribute("buys",buys);// 瀛樺偍鍒拌姹傚璞�
		// 杞彂鍒伴〉闈�
		request.getRequestDispatcher("/personal/showbuyinfo.jsp").forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		GoodService gService=new GoodServiceImpl();
		String action = request.getParameter("action");
		System.out.println(action);
		switch(action) {
		case "search":
			SearchGood(request, response, gService);
			break;
		case "build":
			buildgood(request,response,gService);
			break;
		case "show":
			show(request,response,gService);
			break;
		case "editseller":
			editseller(request,response,gService);
			break;
		case "toseller":
			toseller(request,response,gService);break;
			default:
				break;
		}
		
	}
	private void editseller(HttpServletRequest request, HttpServletResponse response, GoodService gService)//展示出发布信息
			throws ServletException, IOException {
		String goodNo=request.getParameter("goodNo");
		String userNo=(String)request.getSession().getAttribute("userNo");
		Good good=gService.getById(goodNo);
		
		int b=gService.editseller(good,userNo);
		
		if(b==1)
		{
             System.out.println("成功");
            
			request.getRequestDispatcher("/personal/Personalpage.jsp").forward(request, response);
			
		}
		else {
			System.out.println("提交失败，请重新填写");
			request.setAttribute("sellerpublic",good);
			request.getRequestDispatcher("/good/editseller.jsp").forward(request, response);
			
		}
		
	}
	private void show(HttpServletRequest request, HttpServletResponse response, GoodService gService)//展示出发布信息
			throws ServletException, IOException {
		String userNo=request.getParameter("userNo");
		String goodName=request.getParameter("goodName");
		
		String goodNo=request.getParameter("goodNo");
		String goodPrice=request.getParameter("goodPrice");
		String tel=request.getParameter("tel");
		
		Buy buy=new Buy(userNo,tel,goodNo,goodName,goodPrice);
		int b=gService.addbuyinfo(buy,goodNo);
		if(b==1)
		{
			System.out.println("添加购买信息成功");
			request.getRequestDispatcher("/goods/homepage.jsp").forward(request, response);
		}
		else {
			System.out.println("添加购买信息失败");
			request.setAttribute("buy",buy);
			request.getRequestDispatcher("/goods/showgoods.jsp").forward(request, response);
		}
		
		
	}
	private void buildgood(HttpServletRequest request, HttpServletResponse response, GoodService gService)
			throws ServletException, IOException {
		String userNo=request.getParameter("userNo");
		String goodNo=request.getParameter("goodNo");
		String goodName=request.getParameter("goodName");
		String tel=request.getParameter("tel");
	
		String goodPrice=request.getParameter("goodPrice");
		String goodDes=request.getParameter("goodDes");
		String goodSort=request.getParameter("goodSort");
		String eoy=request.getParameter("eoy");
		
		/*String eoy1=request.getParameter("eoy1");
		if(eoy==null)
			{ 
			eoy=eoy1;}
			
		else
			{
			eoy=eoy;
			}*/
		Good good1=new Good(goodName,tel,goodPrice,eoy,goodDes,goodSort,goodNo);
		
		int b=gService.addGood(good1,userNo);
		
		if(b==1)
		{
			System.out.println("添加售卖信息成功");
			/*request.getSession().setAttribute("sellerinfo", good1);*/
			request.getSession().setAttribute("goodNo",goodNo);
			request.getRequestDispatcher("/goods/homepage.jsp").forward(request, response);
		}
		else {
			System.out.println("添加售卖信息失败");
			request.setAttribute("good1", good1);
			request.getRequestDispatcher("/selling/seller.jsp").forward(request, response);
		}
		
	}
	
	private void SearchGood(HttpServletRequest request, HttpServletResponse response, GoodService gService)
			throws ServletException, IOException {
		String sort=request.getParameter("Sort");
		List<Good> goods=gService.select(sort);
		request.setAttribute("goods", goods);
		request.getRequestDispatcher("/goods/showgoods.jsp").forward(request, response);
	}

	private void oldGood(HttpServletRequest request, HttpServletResponse response, GoodService gService)
			throws ServletException, IOException {
		List<Good> goods=gService.old();
		
		request.setAttribute("goods", goods);	
		request.getRequestDispatcher("/goods/showgoods.jsp").forward(request, response);

	}
	private void heartGood(HttpServletRequest request, HttpServletResponse response, GoodService gService)
			throws ServletException, IOException {
		List<Good> goods=gService.heart();
		request.setAttribute("goods", goods);
		request.getRequestDispatcher("/goods/showgoods.jsp").forward(request, response);
		
	}
	private void todelete(HttpServletRequest request, HttpServletResponse response, GoodService gService)
			throws ServletException, IOException {
		String goodNo=request.getParameter("goodNo");
		Good good=gService.getById(goodNo);
		request.getSession().setAttribute("buygood", good);
		request.getRequestDispatcher("/personal/buyinfo.jsp").forward(request, response);
		/*int a=gService.delete(good);
		System.out.println(a);*/
		
	}

	

}
