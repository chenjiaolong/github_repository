<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%
    String path=request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎进入一米</title>
</head>
<body>
<%-- <form action="<%=request.getContextPath()%>/user?action=addUser" method="post">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;帐号<input type="tel" value="手机号" name="userNo">
<br>
&nbsp;&nbsp;&nbsp;&nbsp;用户名<input type="text" value="用户名" name="userName">
<br> 
用户密码<input type="text" value="密码" name="userPsw">

<br>
<input type="submit" value="提交">

</form>
 --%>
 <%request.getRequestDispatcher("/login/zhuce.jsp").forward(request, response); %>
</body>
</html>