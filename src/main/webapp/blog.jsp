<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>blog.jsp</title>
</head>
<body>
	저는 blog.jsp 입니다. BlogHome.naver 명령으로 실행되었습니다.<br>
	<%= request.getAttribute("id") %>님 안녕하세요.
</body>
</html>