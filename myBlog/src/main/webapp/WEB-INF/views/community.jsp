<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>community</title>
<jsp:include page="link.jsp"/>
<style>
	.community-list{
		margin-bottom: 2em;
		box-shadow: 0 2px 4px rgba(0,0,0,.2), 0 2px 4px rgba(0,0,0,.2);
	}
	.comment{
		margin-bottom: 5em;
	}
	.pagination-container{
		align-items: center;
	}
	.asd{
		border-bottom: 2px #2b8ff3;
	}
</style>


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
				<div class="community-list">
					<table class="table table-bordered">
						<tbody>
							<tr style="border-bottom: 1px solid #2b8ff3">
								<th width="3%">No</th>
								<th width="65%">Comment</th>
								<th width="12%">name</th>
								<th width="10%">date</th>
							</tr>
							<c:forEach var="board" items="${ list }">
								<tr>
									<td style="font-size: 11px"><c:out value="${ board.bNo}"/></td>
									<td style="font-size: 17px">
										<c:choose>
											<c:when test="${ fn:length(board.bContent) gt 40}">
												<c:out value="${ fn:substring(board.bContent, 0, 40) }"/>...
											</c:when>
											<c:otherwise>
												<c:out value="${ board.bContent }"></c:out>
											</c:otherwise>
										</c:choose>
									</td>
									<td style="font-size: 15px"><c:out value="${ board.bWriter }"/></td>
									<td style="font-size: 10px"><c:out value="${ board.writenDate }"/></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				
				<div class="pagination-container">
					<ul class="pagination">
						<li class="page-item"><a class="page-link" href="#">Previous</a></li>
						<li class="page-item"><a class="page-link" href="#">1</a></li>
						<li class="page-item"><a class="page-link" href="#">2</a></li>
						<li class="page-item"><a class="page-link" href="#">3</a></li>
						<li class="page-item"><a class="page-link" href="#">Next</a></li>
					</ul>
				</div>
				
				
				<div class="comment">
					<form action="insertBoard.bo" class="form-signin">
						<div class="input-group mb-3">
						  <input type="text" name="bContent" class="form-control" placeholder="Comment">
						  <input type="hidden" name="bCode" value="100">
						  <div class="input-group-append">
						    <button class="btn btn-success" type="submit" style="padding: 6px 12px 6px 12px">submit</button>
						  </div>
						</div>
					</form>
				</div>
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