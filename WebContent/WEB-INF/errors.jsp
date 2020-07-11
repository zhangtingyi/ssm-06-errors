<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>测试errors标签</h3>
<form:form modelAttribute="user" method="post" action="errors">
	<table>
		<tr>
			<td>用户名：</td>
			<td><form:input path="username"/></td>
			<td><font color="red"><form:errors path="username"/></font></td>
		</tr>
		<tr>
			<td>密码</td>
			<td><form:password path="password"/></td>
			<td><font color="red"><form:errors path="password"/></font></td>
		</tr>

		<tr>
			<td>用户的IP</td>
			<form:hidden path="hide"></form:hidden>
		</tr>

		<tr>
			<td><input type="submit" value="登录"/></td>
		</tr>
	</table>
</form:form>



</body>
</html>