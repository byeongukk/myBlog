<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<link href="https://fonts.googleapis.com/css?family=Noto+Serif+KR&display=swap" rel="stylesheet">
</head>
<body>
	<!-- navigator -->
	<jsp:include page="common/nav.jsp"/>

	<!-- Page Header -->
	<header class="masthead" style="background-image: url('${ conextPath }/resources/img/about-bg.jpg')">
		<div class="overlay">
		
		</div>
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-md-10 mx-auto">
					<div class="site-heading">
						<h1>About Me</h1>
						<span class="subheading"></span>
					</div>
				</div>
			</div>
		</div>
	</header>
	
	<!-- Main Content -->
	<div class="container">
		<div class="row">
			<div class="col-lg-8 col-md-10 mx-auto">
				<h3 style="font-family: 'Noto Serif KR', serif;">발전하는 개발자</h3>
				<h5 style="font-family: 'Noto Serif KR', serif;">저는 잘하는 개발자를 지향하고있습니다.</h5>
				<p style="font-family: 'Noto Serif KR', serif;">
				개발자의 역량은 다양한 경험과 끊임없는 자기계발에서 나온다고 생각합니다. 
				다양한 시도로 경험을 쌓으며,새로운 기술등 변화를 두려워하지 않고 즐기며 노력하는 개발자로
				잘하는 개발자가 되고싶습니다.	
				</p>
			</div>
		</div>
	</div>
	<hr>

	<!-- Footer -->
	<jsp:include page="common/footer.jsp"/>

</body>

</html>
