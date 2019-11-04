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
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
					Saepe nostrum ullam eveniet pariatur voluptates odit, fuga atque ea
					nobis sit soluta odio, adipisci quas excepturi maxime quae totam
					ducimus consectetur?
				</p>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
					Eius praesentium recusandae illo eaque architecto error,
					repellendus iusto reprehenderit, doloribus, minus sunt. Numquam at
					quae voluptatum in officia voluptas voluptatibus, minus!
				</p>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aut
					consequuntur magnam, excepturi aliquid ex itaque esse est vero
					natus quae optio aperiam soluta voluptatibus corporis atque iste
					neque sit tempora!
				</p>
			</div>
		</div>
	</div>
	<hr>
	<!-- Footer -->
	<jsp:include page="common/footer.jsp"/>

</body>

</html>
