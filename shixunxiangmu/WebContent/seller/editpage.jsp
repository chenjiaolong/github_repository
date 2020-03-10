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
<title>editpage.jsp</title>
</head>
<body>
<h1>修改学生信息</h1>

  <form action="<%=request.getContextPath()%>/user?action=edit" method="post">
  <table>
  <tr>
  <td>用户名</td><td><input type="text" name="userNo" value="${user.userNo}" ></td>
  </tr>
   <tr>
  <td>用户姓名</td><td><input type="text" value="${user.userName}"  name="userName" ></td>
  </tr>
   <tr>
  <td>密码</td><td><input type="password" value="${user.userPsw}" name="userPsw"></td>
  </tr>
 
   <tr>
  <td colspan="2"><input type="submit" value="提交"></td>
  </tr>
  </table>
  </form>

</body>
</html>