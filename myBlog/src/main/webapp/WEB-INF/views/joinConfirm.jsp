<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> ${ msg }</h1>
	<script>
		alert('회원가입이 완료 되었습니다. 이메일 인증 후 로그인 하실 수 있습니다.');
		location.href="index.jsp";
	</script>
</body>
</html>