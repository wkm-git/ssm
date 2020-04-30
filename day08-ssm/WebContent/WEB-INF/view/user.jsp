<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1px">
		<tr>
			<th>id</th>
			<th>姓名</th>
			<th>密码</th>
			<th>年龄</th>
			<th>操作</th>
		</tr>

		<c:forEach var="user" items="${list}">
			<tr>
				<th>${user.id}</th>
				<th>${user.name}</th>
				<th>${user.password}</th>
				<th>${user.age}</th>
				<th><a onclick="deleteUser(${user.id});" href="javascript.void(0);">删除</a> 
				&nbsp;&nbsp;&nbsp;&nbsp;
				 <a href="#">修改</a>
				</th>
			</tr>
		</c:forEach>
	</table>
	
	<script type="text/javascript">
		function deleteUser(userId){
			if(confirm("确定要删除吗?")){
				location.href="${pageContext.request.contextPath}/user/delete.do?userId="+userId;
			}
		}
	
	</script>

</body>
</html>