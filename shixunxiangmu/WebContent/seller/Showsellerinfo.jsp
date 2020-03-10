<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!--jstl核心标签  -->
 <%
    String path=request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>  用户信息 <br>
    <table>
    <tr><td>UserNo</td><td>UserName</td><td>UserPsw</td></tr>
    <c:forEach items="${users}" var="user"><!-- for(Student stu : stus) -->
     <tr><td>${user.userNo}</td><td>${user.userName}</td><td>${user.userPsw}</td>
     <td><a href="<%=request.getContextPath()%>/user?action=toedit&userNo=${user.userNo}">修改</a></td></tr>
     <!-- 修改提交的路径 依然是studnet的servlet  但是需要通过一个参数来区分动作  action -->
    </c:forEach>
    </table>

</body>
</html>