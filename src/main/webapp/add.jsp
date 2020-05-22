<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
<h1>晾被</h1>
<form action="add" method="post">
宿舍号:<input type="text" name="iname"><br>
教师:<select name="tid" id="t1">
<option value="">请选择</option>
</select><br>
<input type="submit" value="提交">
</form>
<script type="text/javascript">
	$(function(){
		$.post("selectTeacher",function(date){
			for(var x in date){
				//追加
				$("#t1").append("<option value='"+date[x].tid+"'>"+date[x].tname+"</option>");
			}
		},"json");
	});
</script>
</body>
</html>