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
	<table>
	<a href="add.jsp"><input type="button" value="添加"></a>
	<tr>
		<td colspan="10">
			<form action="list" method="post">
			宿舍号:<input type="text" name="iname" value="${iname}">
			状态:<select name="status">
				<option value="">请选择</option>
				<option value="0">晾被中</option>
				<option value="1">已收被</option>
			</select>
			教师:<select name="tid">
				<option value="">请选择</option>
				<c:forEach items="${tlist}" var="t">
				<option value="${t.tid}">${t.tname}</option>
				</c:forEach>
			</select>
			<input type="submit" value="搜索">
			</form>
		</td>
	</tr>
  <tr>
    <th>编号</th>
    <th>宿舍号</th>
    <th>负责老师</th>
    <th>晾被时间</th>
    <th>状态</th>
    <th>操作</th>
  </tr>
  <c:forEach items="${page.list}" var="p">
  <tr>
    <td>${p.inid}</td>
    <td>${p.iname}</td>
    <td>${p.tname}</td>
    <td>${p.uptime}</td>
    <td>${p.status==1?"已收被":"晾被中"}</td>
    <td>
    <c:choose>
    	<c:when test="${p.status==1}">
    	<a href="show?inid=${p.inid}"><input type="button" value="查看"></a>
    	</c:when>
    	<c:otherwise>
    	<a href="update?inid=${p.inid}"><input type="button" value="收被"></a>
    	</c:otherwise>
    </c:choose>
    
    </td>
  </tr>
  </c:forEach>
  <tr>
  	<td colspan="10">
  		<a href="list?pageNum=${page.firstPage}">首页</a>
  		<a href="list?pageNum=${page.prePage}">上一页</a>
  		<a href="list?pageNum=${page.nextPage}">下一页</a>
  		<a href="list?pageNum=${page.lastPage}">尾页</a>
  	</td>
  </tr>
</table>

</body>
</html>