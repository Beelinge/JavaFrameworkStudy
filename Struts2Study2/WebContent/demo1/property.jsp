<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>数据的封装方式一：提供set方法的方式</h1>
	<form action="${pageContext.request.contextPath}/StrutsAction4.action" method="post">
		姓名：<input type="text" name="name"/><br/>
		年龄：<input type="text" name="age"><br/>
		<input type="submit" value="提交">
	</form>
	
	<h1>数据的封装方式二：页面提供表达式的方式</h1>
	<form action="${pageContext.request.contextPath}/StrutsAction5.action" method="post">
		姓名：<input type="text" name="user.name"/><br/>
		年龄：<input type="text" name="user.age"><br/>
		<input type="submit" value="提交">
	</form>
	
	<h1>数据的封装方式三：使用模型驱动的方式</h1>
	<form action="${pageContext.request.contextPath}/StrutsAction6.action" method="post">
		姓名：<input type="text" name="name"/><br/>
		年龄：<input type="text" name="age"><br/>
		<input type="submit" value="提交">
	</form>
</body>
</html>