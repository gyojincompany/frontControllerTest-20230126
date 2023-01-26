<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 정보 확인</title>
</head>
<body>
	입력하신 아이디는 <%= request.getParameter("id") %> 입니다.<br>
	입력하신 비밀번호는 <%= request.getParameter("pw") %> 입니다.
</body>
</html>