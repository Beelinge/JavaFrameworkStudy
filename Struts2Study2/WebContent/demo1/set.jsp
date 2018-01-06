<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>封装到List集合中</h1>
	<form action="${pageContext.request.contextPath}/StrutsAction7.action" method="post">
		姓名：<input type="text" name="list[0].name"/><br/>
		年龄：<input type="text" name="list[0].age"><br/>
		
		姓名：<input type="text" name="list[1].name"/><br/>
		年龄：<input type="text" name="list[1].age"><br/>
		<input type="submit" value="提交">
	</form>
	
	<h1>封装到Map集合中</h1>
	<form action="${pageContext.request.contextPath}/StrutsAction8.action" method="post">
		姓名：<input type="text" name="map['one'].name"/><br/>
		年龄：<input type="text" name="map['one'].age"><br/>
		
		姓名：<input type="text" name="map['two'].name"/><br/>
		年龄：<input type="text" name="map['two'].age"><br/>
		<input type="submit" value="提交">
	</form>
</body>
</html>