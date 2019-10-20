<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
<link href="../../resources/css/loginForm.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</head>


<body onload="fn_alertMsg( '${ msg }')" cellpadding="0" cellspacing="0" marginleft="0" margintop="0" width="100%" height="100%" align="center">

	<div class="card align-middle" style="width: 20rem; border-radius: 20px;">
		<div class="card-title" style="margin-top: 30px;">
			<h2 class="card-title text-center" style="color: #113366;">로그인 폼</h2>
		</div>
		<div class="card-body">
			<form class="form-signin" method="POST" action="login.me">
				<h5 class="form-signin-heading">로그인 정보를 입력하세요</h5>
				<label for="inputEmail" class="sr-only">ID</label> 
				<input type="text" id="mId" name="mId" class="form-control" placeholder="Your ID"
					   required autofocus><BR> 
				<label for="inputPassword" class="sr-only">Password</label> 
				<input type="password" id="mPwd" name="mPwd" class="form-control" placeholder="Password" required>
				<div align="right">
					<a href="#">ID/PW 찾기</a>
				</div>
				<br>
				<button id="btn-Yes" class="btn btn-primary btn-block" type="submit">로그인</button>
				<br>
				<div align="center">
					<a href="showJoinForm.me">회원가입</a><br>
				</div>
			</form>

		</div>
	</div>

	<div class="modal">
	</div>
	
	<script>
		function fn_alertMsg(msg){
			if(!msg == ""){
				alert(msg);
			}
		}
	</script>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
 
  </body>
</html>