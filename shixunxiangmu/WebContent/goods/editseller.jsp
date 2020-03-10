<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!--jstl核心标签  --> 
    
<!DOCTYPE html>
<html>
<head>
 
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="0009.css">
	<title>界面</title>
	<style type="text/css">
	
/* Border styles */
   #table-1 th {
      vertical-align:baseline;
      padding:5px 15px 5px 6px;
      background-color:#428bca
;
      border:1px solid #3F3F3F;
      text-align:left;
      color:#fff;
    }
#table-1 thead, #table-1 tr {
border-top-width: 1px;
border-top-style: solid;
border-top-color: rgb(230, 189, 189);
}
#table-1 {
border-bottom-width: 1px;
border-bottom-style: solid;
border-bottom-color: rgb(230, 189, 189);
}

/* Padding and font style */
#table-1 td {
padding: 5px 10px;
font-size: 15px;
font-family: Verdana;
color: rgb(177, 106, 104);
}
#table-1 th {
padding: 5px 10px;
font-size: 21px;
font-family: Verdana;
color: #fff;
}

/* Alternating background colors */
table.dataintable tr:nth-child(even) {
background: #dd15;
}
table.dataintable tr:nth-child(odd) {
background: #FFF
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
                size: 100px;
            }
            input:focus{
                    border-color: #66afe9;
                    outline: 0;
                    -webkit-box-shadow: inset 0 1px 1px rgba(0,0,0,.075),0 0 8px rgba(102,175,233,.6);
                    box-shadow: inset 0 1px 1px rgba(0,0,0,.075),0 0 8px rgba(102,175,233,.6)
            }
.button {  
		margin-left:5%;
        float:left;
        width: 12%;  
        padding:8px;  
        background-color: #428bca;  
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
        font-size:125% ; }

</style>
</head>
<body>
<div class="button" ><a  style=" text-decoration:none;color:#fff " href="<%=request.getContextPath()%>/goods/homepage.jsp">首页</a></div>
<div class="button"><a  style=" text-decoration:none;color:#fff " href="<%=request.getContextPath()%>/personal/Personalpage.jsp">个人信息</a></div>
<div class="button"><a  style=" text-decoration:none;color:#fff " href="<%=request.getContextPath()%>/personal/showbuyinfo.jsp">购物记录</a></div>
<div class="button"><a  style=" text-decoration:none;color:#fff " href="<%=request.getContextPath()%>/personal/Gouwuche.jsp">购物车</a></div>
<div class="button"><a  style=" text-decoration:none;color:#fff " href="<%=request.getContextPath()%>/personal/Personalpage.jsp">返回</a></div>
    <br><br><br><br><br>
			<table align="center" style="width:600px;font-size: 30px;" id="table-1"  rules=rows   cellspacing=0  >
			    <tr>
      <th colspan="7" style="text-align: center" style="text-align: center;">售卖记录</th>
      
    </tr>

<tr>

<form action="<%=request.getContextPath()%>/GoodServlet?action=editseller" method="post">

<tr><td style="width:100;text-align: center"> 商品号:</td><td><input style="width:200px;" type="text" name="goodNo" value="${sell.goodNo}" readonly="readonly"></td></tr>
<tr></tr>
<tr><td style="width:100;text-align: center"> 商 品 名称:</td><td><input style="width:200px;" type="text" name="goodName" value="${sell.goodName}" ></td></tr>
<tr></tr>
<tr><td style="width:100;text-align: center"> 联系电话:</td><td><input style="width:200px;" type="text" name="tel" value="${sell.tel}" ></td></tr>
<tr></tr>
<tr><td style="width:100;text-align: center"> 价      格:</td><td><input style="width:200px;" type="text" name="goodPrice" value="${sell.goodPrice}" ></td></tr>
<tr></tr>
<tr><td style="width:100;text-align: center"> 发布类型:</td><td><input style="width:200px;" type="text" name="eoy" value="${sell.eoy}" ></td></tr>
<tr></tr><tr></tr>
<tr><td style="width:100;text-align: center"> 描述:</td><td><input style="width:200px;" type="text" name="goodDes" value="${sell.goodDes}" ></td></tr>
<tr></tr><tr></tr>
<tr><td style="width:100;text-align: center"> 分类:</td><td><input style="width:200px;" type="text" name="goodSort" value="${sell.goodSort}" ></td></tr>
<tr></tr><tr></tr>


<tr><center><td style="width:100;text-align: center"> </td><td><input style="width:200px; background-color:#357ebd； "  type="submit" value="确 定"></center></td>
</tr>
</form>

   </tr>
</table>
</body>
</html>