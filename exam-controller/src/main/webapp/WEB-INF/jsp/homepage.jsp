<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>主页面</title>
   
	<link rel="stylesheet" type="text/css" href="styles.css">
		<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
		<!--用百度的静态资源库的cdn安装bootstrap环境-->
		<!-- Bootstrap 核心 CSS 文件 -->
		<link href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet">
		<!--font-awesome 核心我CSS 文件-->
		<link href="//cdn.bootcss.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">
		<!-- 在bootstrap.min.js 之前引入 -->
		<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>
		<!-- Bootstrap 核心 JavaScript 文件 -->
		<script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
  		<style type="text/css">
  			#depar_id{
			 	background: url('yourimage') no-repeat;
			    width: 100px;
			    height: 30px;
			    overflow: hidden;
  			}
  		</style>
  </head>
  
  <body>
  	<div style="width: 500px;margin:0px auto;">
	  	<h2 style="text-align:center">用户信息</h2>
		<button class="btn btn-success	" type="button" onclick="window.location.href='add'">增加</button>
    			<table class="table table-bordered" style="text-align:center;font-size:17px">
    				<tr class="success">
    					<td><strong>姓名</strong></td>
    					<td><strong></strong></td>
    				</tr>
    					<c:forEach var="user" items="${list}">
    					<tr class="warning">
    						<td><strong>${user.name}</strong></td>
    						<td><strong>${user.address.address_user}</strong></td>
    						<td>
    							 <button class="btn btn-danger" type="button" onclick="dela(${user.id})">删除</button>
    							 <button class="btn btn-warning" type="button" onclick="window.location.href='modifyuser?id=${user.id}'">修改</button>
							</td>
    					</tr>
    					</c:forEach>
    			</table>
    	</div>
    	<script type="text/javascript" src="static/js/jquery-1.12.4.js"></script>
    	<script type="text/javascript">
    		function dela(id){
    			var $dele = confirm("确定要删除吗?");
	    		if($dele == true){
	    			$.ajax({
	    				"url"		:		"del",	
	    				"type"		:		"post",								
	    				"data"		:		"id="+id,							
	    				"dataType"	:		"text",							
	    				"success"	:		callBack,						
	    				"error"		:		function(){						
	    					alert("删除信息请求失败!");
	    				}
	    			});
	    			function callBack(ruelt){
	    				if(ruelt == "true"){
	    					alert("删除成功!");
	    					window.location.href = "all";
	    				}else{
	    					alert("删除失败!");
	    				}
	    			}
	    		}
	    		}
    	</script>
  </body>
</html>
