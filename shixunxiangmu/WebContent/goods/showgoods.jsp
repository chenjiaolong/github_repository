<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!--jstl核心标签  --> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>搜索结果</title>
</head>
<body>
<h2>搜索结果</h2>
<table>
<tr><td>商品编号</td><td>商品名称</td><td>联系人电话</td><td>价格</td><td>二手或义卖</td><td>描述</td><td>商品类别</td></tr>
 <c:forEach items="${goods}" var="good">
<tr><td>${good.goodNo}</td><td>${good.goodName}</td><td>${good.tel}</td><td>${good.goodPrice}</td><td>${good.eoy}</td><td>${good.goodDes}</td><td>${good.goodSort}</td>
<td><a href="<%=request.getContextPath()%>/GoodServlet?action=todelete&goodNo=${good.goodNo}">确认购买</a></tr>
</c:forEach>
 
 <tr><td>${sellerinfo.goodNo}</td><td>${sellerinfo.goodName}</td><td>${sellerinfo.userNo}</td><td>${sellerinfo.goodPrice}</td><td>${sellerinfo.eoy}</td><td>${sellerinfo.goodDes}</td><td>${sellerinfo.goodSort}</td>
</table>
</body>
</html> --%>





<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!--jstl核心标签  --> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>搜索结果</title>

<style type="text/css">
 body {
            margin: 0;
            padding: 0;
            background: ; 
            background-image:url(""); /*待定 暂时不填*/
            font-weight: 500;
            font-family: "Microsoft YaHei","宋体","Segoe UI", "Lucida Grande", Helvetica, Arial,sans-serif, FreeSans, Arimo;
            }
            
            #button1 {  
        float:left;
        gargin-rihgt:30px;
        width: 150px;  
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
            
            #div01{
         position:absolute;
         top:5px;
         left:400px;
         
         
         font-size: 45px;
         text-shadow: ; /* 阴影颜色 怎么弄都不好看 */
         color:FF9900;
         border-radius:25px;
         -moz-border-radius:25px;
         line-height:center;
         text-align:center;
         border:2px solid #a1a1a1;
         padding:10px 40px; 
         background:#84c1ff;
         
         }
         

/* Border styles */
#table-1 thead, #table-1 tr {
border-top-width: 1px;
border-top-style: solid;
border-top-color: rgb(230, 189, 189);
}
#table-1 {
border-bottom-width: 1px;
border-bottom-style: solid;
border-bottom-color: #FF9900;
}

/* Padding and font style */
#table-1 td, #table-1 th {
padding: 5px 10px;
font-size: 20px;
font-family: Verdana;
color:black;
}

/* Alternating background colors */
#table-1 tr:nth-child(even) {
background:#9aff02;
}
#table-1 tr:nth-child(odd) {
background: #FFF
}

         
</style>
</head>
<body>
<a class="btn btn-default" href="<%=request.getContextPath() %>/goods/homepage.jsp" role="button" id="button1">返回首页</a>

<div id="div01">
 搜 索 结 果
</div>

<table id="table-1" style="position: absolute;left: 160px; top: 100px;" rules=rows   cellspacing=0    align=right>
<tr><th>商品编号</th><th>商品名称</th><th>联系人电话</th><th>价格</th><th>二手或义卖</th><th>描述</th><th>商品类别</th></tr>
 <c:forEach items="${goods}" var="good">
<tr><td>${good.goodNo}</td><td>${good.goodName}</td><td>${good.tel}</td><td>${good.goodPrice}</td><td>${good.eoy}</td><td>${good.goodDes}</td><td>${good.goodSort}</td>
<td><a href="<%=request.getContextPath()%>/GoodServlet?action=todelete&goodNo=${good.goodNo}">确认购买</a></td>
<td><a href="<%=request.getContextPath()%>/GoodServlet?action=todelete&goodNo=${good.goodNo}">加入购物车</a></td>
</tr>
</c:forEach>

</table>

</body>
</html>