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
<style>

	.skill_imgBox {
	    text-align: center;
	    display: inline-block;
	    width: 114px;
	    height: 116px;
	    border-radius: 30px 30px;
	    background-size: cover;
	    background-repeat: no-repeat;
	    margin-right: 2rem;
	    margin-left: 2rem;
	    margin-bottom: 2rem;
	    box-shadow: 0 3px 6px rgba(0,0,0,.2), 0 3px 6px rgba(0,0,0,.2);
	}

</style>

<body>
	<!-- navigator -->
	<jsp:include page="common/nav.jsp"/>

	<!-- Page Header -->
	<header class="masthead" style="background-image: url('../../../resources/img/skill-bg.jpg')">
		<div class="overlay">
		
		</div>
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-md-10 mx-auto">
					<div class="site-heading">
						<h1>Skills</h1>
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
				<span class="skill_imgBox" style="background-image: url('../../resources/img/skill/java.png')">				
				</span>
				<span class="skill_imgBox" style="background-image: url('../../resources/img/skill/html5.png">
				</span>
				<span class="skill_imgBox" style="background-image: url('../../resources/img/skill/css-3.png"> 
				</span>
				<span class="skill_imgBox" style="background-image: url('../../resources/img/skill/js.png">
				</span>
				<span class="skill_imgBox" style="background-image: url('../../resources/img/skill/jquery.png">
				</span>
				<span class="skill_imgBox" style="background-image: url('../../resources/img/skill/mybatis.png">
				</span>
				<span class="skill_imgBox" style="background-image: url('../../resources/img/skill/spring.png">
				</span>
				<span class="skill_imgBox" style="background-image: url('../../resources/img/skill/oracle.jpg">
				</span>
				<span class="skill_imgBox" style="background-image: url('../../resources/img/skill/react.png">
				</span>
				<span class="skill_imgBox" style="background-image: url('../../resources/img/skill/git.png">
				</span>
				<span class="skill_imgBox" style="background-image: url('../../resources/img/skill/aws.png">
				</span>
			</div>
		</div>
	</div>
	<hr>
	<!-- Footer -->
	<jsp:include page="common/footer.jsp"/>
</body>

</html>
