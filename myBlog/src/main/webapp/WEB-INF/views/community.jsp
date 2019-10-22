<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>community</title>
<jsp:include page="link.jsp"/>

</head>

<body>
	<!-- navigator -->
	<jsp:include page="common/nav.jsp"/>

	<!-- Page Header -->
	<header class="masthead" style="background-image: url('../../../resources/img/community-bg.jpg')">
		<div class="overlay">
		
		</div>
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-md-10 mx-auto">
					<div class="site-heading">
						<h1>Community</h1>
						<span class="subheading"></span>
					</div>
				</div>
			</div>
		</div>
	</header>
	
	
	<!-- Main Content -->
	<div class="container">
		<div class="row">
			<div class="col-lg-12 col-md-12 mx-auto">
				<table class="table table-bordered">
					<tbody style="border: 1px solid black">
						<tr>
							<th width="5%">No</th>
							<th width="65%">Comment</th>
							<th width="10%">name</th>
							<th width="10%">date</th>
						</tr>
						<tr>
							<td>1</td>
							<td></td>
							<td></td>
							<td></td>
						</tr>
					</tbody>
				</table>
				<form action="" class="form-signin">
					<div class="input-group mb-3">
					  <input type="text" class="form-control" placeholder="Comment">
					  <div class="input-group-append">
					    <button class="btn btn-success" type="submit" style="padding: 6px 12px 6px 12px">submit</button>
					  </div>
					</div>
				</form>
			</div>
		</div>
	</div>
		
	<!-- Footer -->
	<jsp:include page="common/footer.jsp"/>

  <!-- Bootstrap core JavaScript -->
  <script src="../../resources/vendor/jquery/jquery.min.js"></script>
  <script src="../../resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Custom scripts for this template -->
  <script src="../../resources/js/clean-blog.min.js"></script>

</body>
</html>