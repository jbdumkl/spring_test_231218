<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원 가입</h2>
	<hr>
	<form action="joinOk2" method="post">
		아이디 : <input type="text" name="joinId"><br><br>
		비밀번호 : <input type="password" name="joinPw"><br><br>
		이름 : <input type="text" name="joinName"><br><br>
		이메일 : <input type="text" name="joinEmail"><br><br>
		<input type="submit" value="회원가입">	
	</form>
</body>
</html>