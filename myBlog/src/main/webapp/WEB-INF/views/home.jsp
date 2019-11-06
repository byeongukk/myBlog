<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>MyBlog</title>
	<!-- import link -->	
	<jsp:include page="link.jsp"/>
<link href="https://fonts.googleapis.com/css?family=Bree+Serif|Noto+Serif+KR|Sunflower:300&display=swap" rel="stylesheet">
<style>
	.visit-content {
		font-family: 'Noto Serif KR', serif;
	}
	.login-info{
	 	font-family: 'Bree Serif', serif; 
	 	margin-bottom: 5em;
	}
</style>
</head>

<body>
	<!-- navigator -->
	<jsp:include page="common/nav.jsp"/>

	<!-- Page Header -->
	<header class="masthead" style="background-image: url('${ conextPath }/resources/img/home-bg.jpg')">
		<div class="overlay">
		
		</div>
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-md-10 mx-auto">
					<div class="site-heading">
						<h1>Developer <br> uk's BLOG</h1>
						<span class="subheading"></span>
					</div>
				</div>
			</div>
		</div>
	</header>
	<div class="container">
		<div class="row">
			<div class="col-lg-8 col-md-10 mx-auto" align="center">
				
				<h3 class="visit-content">방문해주셔서 감사합니다</h3>
				<p class="visit-content">오늘 <b><c:out value="${ totalCount }"/></b>번째 방문자입니다</p>
				<p style="font-family: 'Sunflower', sans-serif;">TODAY : <c:out value="${ totalCount }"/> / TOTAL : <c:out value="${ todayCount }"/> </p>
				<hr>
				<div class="login-info">
					<p><b>Admin</b></p>
					<p>ID : admin</p>
					<p>pwd : admin123123</p>
					
					<p><b>guest</b></p>
					<p>ID : guest</p>
					<p>pwd : guest123123</p>
				</div>
						
			</div>
		</div>
	</div>
	<hr>
	<!-- Footer -->
	<jsp:include page="common/footer.jsp"/>

</body>

</html>
