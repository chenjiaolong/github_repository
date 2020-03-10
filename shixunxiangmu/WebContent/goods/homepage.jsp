<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 
String path=request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="<%=basePath%>">
<title>Insert title here</title>
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>

<link href="http://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" href="style.css">

<style type="text/css">
* {
            box-sizing: border-box;
        }

        body {
            margin: 0;
            padding: 0;
            background: white; //背景颜色 可换成图片
            font-weight: 500;
            font-family: "Microsoft YaHei","宋体","Segoe UI", "Lucida Grande", Helvetica, Arial,sans-serif, FreeSans, Arimo;
        }

        #container {
            width: 500px;
            height: 820px;
            margin: 0 auto;
        }
        div.search {padding: 20px 0;}

        form {
            position: relative;
            width: 600px;
            margin: 0 auto;
        }

        input, button {
            border: none;
            outline: none;
        }

        input {
            width: 100%;
            height: 42px;
            padding-left: 13px;
        }

        button {
            height: 42px;
            width: 42px;
            cursor: pointer;
            position: absolute;
        }

        
        .bar7 {background: #7BA7AB;}
        .bar7 form {
            height: 22px;
        }
        .bar7 input {
            width: 500px;
            border-radius: 42px;
            border: 2px solid #324B4E;
            background: #F9F0DA;
            transition: .3s linear;
            margin-right: 20px
        }
        .bar7 input:focus {
            width: 560px;
        }
        .bar7 button {
            background: none;
            top: 13px;
            right: 10px;
        }
        .bar7 button:before{
          content: "\f002";
          font-family: FontAwesome;
          color: #324b4e;
        }                            //搜索框的css设计
        
        
        
      



#main {
	height: 200px;
	width: 100%;
}
#left {
	float: left;
	height: 400px;
	width: 33%;
	border: medium solid #000000;
}
#right {
	float: left;
	height: 400px;
	width: 33%;
	border: medium solid #000000;
}
#center {
	float: left;
	height: 400px;
	width: 34%;
	border: medium solid #000000;
}


#shoumai {
	float: left;
	height: 100px;
	width: 33%;
	border: medium solid #000000;
	line-height: 100px;
	font-family: "Microsoft YaHei";
	font-size: 30px;
}
#ershou {
	float: left;
	height: 100px;
	width: 33%;
	border: medium solid #000000;
	line-height: 100px;
	font-family: "Microsoft YaHei";
	font-size: 30px;
}
#aixin {
	float: left;
	height: 100px;
	width: 34%;
	border: medium solid #000000;
	line-height: 100px;
	font-family: "Microsoft YaHei";
	font-size: 30px;
}
        

#button {  
        float:right;
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
        font-size:125%  
      }  
      #button1 {  
        float:left;
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
        font-size:125%  
      } 

</style>

</style>
</head>
<body>
<center><h2>Welcome to yimi</h2></center>
<div>
<a class="btn btn-default" href="https://www.duba.com/?f=edge" role="button" id="button1">购物车</a>
     <input type="button" id="button"  value="个人信息"
     onclick="javascrtpt:window.location.href='<%=request.getContextPath()%>/personal/Personalpage.jsp'">
     
<div>

     
<form  method="post" action="<%=request.getContextPath()%>/GoodServlet?action=search" >

     <div class="search bar7">
        <form>
            <input type="text" class="form-control" id="input" name="Sort"  placeholder="Click on the search">
            <button type="submit" id="b1"></button>
        </form>
           
      </div>
    </form> 
    
 <div id="main">
  <div id="left" style="background-image: url('shoumai.PNG');"></div>
  <div id="right" style="background-image: url('ershou.PNG')"></div>
  <div id="center"style="background-image: url('aixin.PNG')"></div>

</div>
<div id="shoumai">
<center><a href="<%=request.getContextPath()%>/selling/seller.jsp">售卖商品</a></center>
</div>

<div id="ershou"><center><a href="<%=request.getContextPath()%>/GoodServlet?action=q2">二手商品</a></center></div>


<div id="aixin"><center><a href="<%=request.getContextPath()%>/GoodServlet?action=q3">爱心义卖</a></center></div>
</body>
</html>
  --%>
  
  
  
  
  
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
<link rel="stylesheet" href="http://hovertree.com/texiao/css3/39/themes/csslider.default.css" />
<base href="<%=basePath%>">
<title>Insert title here</title>
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>

<link href="http://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" href="style.css">
    
    
   <style type="text/css">
   #hewenqislider {
        margin: 20px;
        font-family: 'Lato';
    }/*左边的按钮*/


         #div03{}  
            
    .csslider>ul{width:900px;
                 text-align: center;
                 
                                                 /*在这里改变宽度 何问起修改的是整个的大小*/}
* {
            box-sizing: border-box;
        }

        body {
            text-align:center;
            margin: 0 auto;
            padding: 0;
            background: white; //背景颜色 可换成图片
            font-weight: 500;
            font-family: "Microsoft YaHei","宋体","Segoe UI", "Lucida Grande", Helvetica, Arial,sans-serif, FreeSans, Arimo;
        }

        #container {
            width: 500px;
            height: 820px;
            margin: 0 auto;
        }
        div.search {padding: 20px 0;}

        form {
            position: relative;
            width: 600px;
            margin: 0 auto;
        }

        input, button {
            border: none;
            outline: none;
        }

        input {
            width: 100%;
            height: 42px;
            padding-left: 13px;
        }

        button {
            height: 42px;
            width: 42px;
            cursor: pointer;
            position: absolute;
        }

        
        .bar7 {background: #7BA7AB;}
        .bar7 form {
            height: 22px;
        }
        .bar7 input {
            width: 540px;
            border-radius: 42px;
            border: 2px solid #324B4E;
            background: #F9F0DA;
            transition: .3s linear;
            margin-right: 20px
        }
        .bar7 input:focus {
            width: 560px;
        }
        .bar7 button {
            background: none;
            top: 13px;
            right: 10px;
        }
        .bar7 button:before{
          content: "\f002";
          font-family: FontAwesome;
          color: #324b4e;
        }                            /*搜索框的设计*/   
        
 .center-in-center{
            position: absolute;
            top: 40%;
            left: 13%;
}       

#shoumai {
	float: left;
	height: 85px;
	width: 33%;
	border: medium solid #000000;
	line-height: 90px;
	font-family: "Microsoft YaHei";
	font-size: 30px;
}
#ershou {
	float: left;
	height: 85px;
	width: 33%;
	border: medium solid #000000;
	line-height: 90px;
	font-family: "Microsoft YaHei";
	font-size: 30px;
}
#aixin {
	float: left;
	height: 85px;
	width: 34%;
	border: medium solid #000000;
	line-height: 90px;
	font-family: "Microsoft YaHei";
	font-size: 30px;
}
        

#button {  
        float:right;
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
        font-size:125%  
      }  
      #button1 {  
        float:left;
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
        font-size:125%  
      } 

</style>


</head>
<body>
<center><h2>Welcome to yimi</h2></center>
<div>
<a class="btn btn-default" href="https://www.duba.com/?f=edge" role="button" id="button1">购物车</a>
     <input type="button" id="button"  value="个人信息"
     onclick="javascrtpt:window.location.href='<%=request.getContextPath()%>/personal/Personalpage.jsp'">
     
<div>

     
<form  method="post" action="<%=request.getContextPath()%>/GoodServlet?action=search" >

     <div class="search bar7">
        <form>
            <input type="text" class="form-control" id="input" name="Sort"  placeholder="Click on the search">
            <button type="submit" id="b1"></button>
        </form>
           
      </div>     
    </form> 
 
<div id="shoumai">
<center><a href="<%=request.getContextPath()%>/selling/seller.jsp">售卖商品</a></center>
</div>

<div id="ershou"><center><a href="<%=request.getContextPath()%>/GoodServlet?action=q2">二手商品</a></center></div>


<div id="aixin"><center><a href="<%=request.getContextPath()%>/GoodServlet?action=q3">爱心义卖</a></center></div>
   <div class="center-in-center">
  <div id="hewenqislider" class="csslider">
        <input type="radio" name="slides" id="slides_1"  />
        <input type="radio" name="slides" id="slides_2"  />
        <input type="radio" name="slides" id="slides_3" checked />
        
        <ul>
            <li style="list-style-type: none;">
          
                <a href="<%=request.getContextPath()%>/selling/seller.jsp">
             
               <img src="售卖.jpg"  style=" width:100%; height:100%;"></a> 
            </li>
            <li style="list-style-type: none;">
            <a href="<%=request.getContextPath()%>/GoodServlet?action=q2">
                <img src="二手.jpg" style=" width:100%; height:100%;"></a>
            </li>
            <li style="list-style-type: none;">
            <a href="<%=request.getContextPath()%>/GoodServlet?action=q3">
               <img src="爱心义卖.jpg" style=" width:100%; height:100%;"></a>
            </li>
            
        </ul>      
        <div class="arrows">
            <label for="slides_1"></label>
            <label for="slides_2"></label>
            <label for="slides_3"></label>
          
        </div>
        <div class="navigation">
            <div>
                <label for="slides_1"></label>
                <label for="slides_2"></label>
                <label for="slides_3"></label>
               
            </div>      
        </div>
    </div>

</div>
</body>
</html>