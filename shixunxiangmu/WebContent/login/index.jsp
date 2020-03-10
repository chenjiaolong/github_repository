<%-- <%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%
    String path=request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>index.jsp</title>
<base href="<%=basePath%>">

<title>欢迎进入一米网！</title>

<style type="text/css">
div{
width: 300px;
height: 150px;
}
.img{float:left;}
.center-in-center{
            position: absolute;
            top: 30%;
            left: 40%;
}
</style>
</head>
<body>
<a href="<%=request.getContextPath()%>/Userservlet">注册</a>
 <a href="<%=request.getContextPath()%>/Userservlet?action=addUser">注册</a> 
<img style='z-index:10000' src='<%=request.getContextPath()%>/login/华师7.jpg'>
<!-- 添加一张能够浮动的背景图片-->

<div class="center-in-center">
<table>
    <form action="<%=request.getContextPath()%>/user?action=login" method="post">
        <tr><td>账    号：</td><td><input name="userNo" type="tel"></td></tr>
    	<tr><td>密    码:</td><td><input name="userPsw" type="password"></td></tr>
        <tr><td><input type="submit" value="登录"> </td> 
    </form>
    <form action="<%=request.getContextPath()%>/seller/registerpage.jsp" method="post">
    <td><input type="submit" value="注册"></td></tr>
    </form>
</table>
</div>

</body>
</html> --%>





<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%
    String path=request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>index.jsp</title>
<base href="<%=basePath%>">

<title>欢迎进入一米网！</title>

<style type="text/css">
body{
           <!--background-image:url('el/登录.png')-->; //背景颜色 可换成图片-->
           font-weight: 400;
           font-family:"Microsoft YaHei";
 }
#button{  
        width: 220px;  
        padding:8px; /*按钮的胖瘦*/ 
        background-color: #87CEFA;    
        -moz-border-radius: 10px;  
        -webkit-border-radius: 10px;  
        border-radius: 10px; /* future proofing */  
        -khtml-border-radius: 10px; /* for old Konqueror browsers */
        text-align: center;  
        vertical-align: middle;  
        border: 1px solid transparent;  
        font-weight: 900;  
        font-size:125%  
      }   
#button2 {
      position:absolute;
         top:166px;
         left:186px;
        width: 420px;
        height: 470px;  
        padding:8px;  
        background-color:white;    
        -moz-border-radius: 25px;  
        -webkit-border-radius: 25px;  
        border-radius: 10px; /* future proofing */  
        -khtml-border-radius: 10px; /* for old Konqueror browsers */  
        text-align: center;  
        vertical-align: middle;  
        border: 1px solid transparent;  
        font-weight: 900;  
        font-size:125%;
                
                -webkit-box-shadow: inset 0 1px 1px rgba(0,0,0,.075);
                box-shadow: inset 0 1px 1px rgba(0,0,0,.075);
                -webkit-transition: border-color ease-in-out .15s,-webkit-box-shadow ease-in-out .15s;
                -o-transition: border-color ease-in-out .15s,box-shadow ease-in-out .15s;
                transition: border-color ease-in-out .15s,box-shadow ease-in-out .15s;  
      }   
input{
                border: 1px solid #ccc;
                padding: 7px 0px;
                border-radius: 3px;
                padding-left:5px;
                -webkit-box-shadow: inset 0 1px 1px rgba(0,0,0,.075);
                box-shadow: inset 0 1px 1px rgba(0,0,0,.075);
                -webkit-transition: border-color ease-in-out .15s,-webkit-box-shadow ease-in-out .15s;
                -o-transition: border-color ease-in-out .15s,box-shadow ease-in-out .15s;
                transition: border-color ease-in-out .15s,box-shadow ease-in-out .15s;
            }
.img{float:left;}
</style>
</head>
<body style="background-image:url('../login/登录6.png')"; >
<%-- <a href="<%=request.getContextPath()%>/Userservlet">注册</a> --%>
<%--  <a href="<%=request.getContextPath()%>/Userservlet?action=addUser">注册</a>  --%>
<img style='z-index:10000' src='<%=request.getContextPath()%>/login/登录6.png'>
<!-- 添加一张能够浮动的背景图片-->

<div id="button2"  style="color:black">
    <div style="font-size:50px">登录</div><br>
    <form action="<%=request.getContextPath()%>/user?action=login" method="post">
        <tr><td>账    号：</td><td><input name="userNo" type="tel"></td></tr>
    	<br><br><tr><td>密    码：</td><td><input name="userPsw" type="password"></td></tr>
        <br><br><td><input id="button" type="submit" value="登录"> </td> 
    </form><br>
    <form action="<%=request.getContextPath()%>/seller/registerpage.jsp" method="post">
    <td><input id="button" type="submit" value="注册"></td>
    </form>

</div>
</body>
</html>

