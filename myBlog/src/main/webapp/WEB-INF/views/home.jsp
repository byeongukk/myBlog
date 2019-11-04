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
				<h3>방문해주셔서 감사합니다</h3>
				<p>오늘 <b><c:out value="${ totalCount }"/></b>번째 방문자입니다</p>
				<p>TODAY : <c:out value="${ totalCount }"/> </p>
				<p>TOTAL : <c:out value="${ todayCount }"/></p>
			</div>
		</div>
	</div>
	<hr>
	<!-- Footer -->
	<jsp:include page="common/footer.jsp"/>

</body>

</html>
