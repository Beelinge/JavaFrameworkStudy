<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>访问Servlet的API方式一</h1>
	<form action="${pageContext.request.contextPath}/StrutsAction.action" method="post">
		姓名：<input type="text" name="name"/><br/>
		年龄：<input type="text" name="age"><br/>
		<input type="submit" value="提交">
	</form>
</body>
</html>