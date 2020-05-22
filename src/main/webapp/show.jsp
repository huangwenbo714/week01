<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>


	<h1>详情</h1>
	宿舍号:
	<input type="text" value="${info.iname}" name="iname"
		readonly="readonly">
	<br> 教师:
	<select name="tid" disabled="disabled">
		<option value="">请选择</option>
		<c:forEach items="${tlist}" var="t">
			<option value="${t.tid}"
				<c:if test="${t.tid==info.tid}">selected="selected"</c:if>>${t.tname}</option>
		</c:forEach>
	</select>
	<br> 日期:
	<input type="text" name="uptime" value="${info.uptime}"
		readonly="readonly">
	<br> 状态:
	<select name="status" disabled="disabled">
		<option value="">请选择</option>

		<option value="0"
			<c:if test="${info.status==0}">selected="selected"</c:if>>晾被中</option>
		<option value="1"
			<c:if test="${info.status==1}">selected="selected"</c:if>>已收被</option>
	</select>
	<br>
	<a href="list"><input type="button" value="返回"></a>

</body>
</html>