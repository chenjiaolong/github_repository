<%-- <%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<title>注册</title>
<style type="text/css">
div{
width: 300px;
height: 200px;
}
.center-in-center{
            position: absolute;
            top: 30%;
            left: 40%;
}
</style>
</head>
<body >
    <form action="<%=request.getContextPath()%>/seller/index.jsp" method="post">
    <input type="submit" value="返回">
    </form>
    <img style='z-index:10000' src='<%=request.getContextPath()%>/login/华师7.jpg'>
<center>
<div class="center-in-center">
<form action="<%=request.getContextPath()%>/user?action=addUser" method="post">
<table >
    	<tr><td>账号：</td><td><input name="userNo" type="text"></td></tr>
    	<tr><td> 用户名：</td><td><input name="userName" type="text"></td></tr>
    	<tr><td>设置密码:</td><td><input name="userPsw" type="password"></td></tr>
    	<tr><td>确认密码:</td><td><input name="userPsw1" type="password"></td></tr>
    	<tr><td><input type="submit" value="提交"> </td>
    	<td><input type="reset" value="重置"> </td> </tr>
    	</table>
    	</form>	
</div>
</center>
</body>
</html> --%>




<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<title>注册</title>
<style type="text/css">
body{
           background-image:url('登录6.png');
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
      #button1 {  
        width: 80px;  
        padding:8px;  
        background-color: #87CEFA;  
        border-color: #357ebd;  
        color: #fff;   
        -moz-border-radius: 10px;  
        -webkit-border-radius: 10px;  
        border-radius: 10px; /* future proofing */  
        -khtml-border-radius: 10px; /* for old Konqueror browsers */  
        text-align: center;  
        vertical-align: middle;  
        border: 1px solid transparent;  
        font-weight: 900;  
        font-size:125%;
      }
      #button2 {
      position:absolute;
         top:177px;
         left:189px;
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
<body >

    <form action="<%=request.getContextPath()%>/login/index.jsp" method="post">
    <input id="button1" type="submit" value="返回">
    </form>
<img >
   <br><br>
   <div id="button2" style="color:black">
   <div style="font-size:50px">注册</div>
   <div>
   <form action="<%=request.getContextPath()%>/user?action=addUser" method="post">

    	<tr><td>账&nbsp;&nbsp; &nbsp;号：</td><td><input name="userNo" type="text"></td></tr>
    	<br><br><tr><td> 用户名：</td><td><input name="userName" type="text"></td></tr>
    	<br><br><tr><td>设置密码:</td><td><input name="userPsw" type="password"></td></tr>
    	<br><br><tr><td>确认密码:</td><td><input name="userPsw1" type="password"></td></tr>
    	<br><br><tr><td><input id="button" type="submit" value="提交"> </td>
    	<br><br><td><input id="button" type="reset" value="重置"> </td> </tr>    	
    	</form>	
    	</div>
   </div>

</body>
</html>