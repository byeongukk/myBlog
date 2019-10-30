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
<!-- CSS 파일 -->
<link href="../../resources/css/community.css" rel="stylesheet">
<!-- paging -->
<script src="../../resources/js/paging.js"></script>
<style>
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
				<div id="list-area">
					<table class="table">
						<tbody>
							<tr style="border-bottom: 1px solid #2b8ff3">
								<th width="3%" >No</th>
								<th width="70%">Comment</th>
								<th width="15%">name</th>
								<th width="15%">date</th>
							</tr>
							<c:forEach var="board" items="${ list }">
								<tr>
									<td style="font-size: 11px"><c:out value="${ board.bNo}"/></td>
									<td style="font-size: 17px; display: block;" class="comment" title="${ board.bContent }">
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
				<!-- 페이징 -->
				<div class="paging-wrap">
	       			<ul class="pagination justify-content-center">
			            <!--맨 첫페이지 이동 -->
        		        <li class="page-item"><a class="page-link" onclick='pagePre(${pi.pageCnt+1},${pi.pageCnt});'>«</a></li>
                		<!--이전 페이지 이동 -->
                		<li class="page-item"><a class="page-link" onclick='pagePre(${pi.pageStartNum},${pi.pageCnt});'>‹</a></li>
			            <!--페이지번호 -->
	    		        <c:forEach var='i' begin="${pi.pageStartNum}" end="${pi.pageLastNum}" step="1">
    		      			
    		      			<c:choose>
    		      				<c:when test="${ i == pi.index+1 }">
		    		    	  		<li><a class="page-link"><b>${i}</b></a></li>
		    		      		</c:when>
    		      				<c:when test="${ i != pi.index+1 }">
    		      					<li class='pageIndex${i} page-item'><a class="page-link" onclick='pageIndex(${i});'>${i}</a></li>
    		      				</c:when>
    		      			</c:choose>
	            			<br>
	            		</c:forEach>
	            
		                <!--다음 페이지 이동 -->
		                <li class="page-item"><a class="page-link" onclick='pageNext(${pi.pageStartNum},${pi.total},${pi.listCnt},${pi.pageCnt});'>›</a></li>
		                <!--마지막 페이지 이동 -->
		                <li class="page-item"><a class="page-link" onclick='pageLast(${pi.pageStartNum},${pi.total},${pi.listCnt},${pi.pageCnt});'>»</a></li>
                			
        			</ul>		
				</div>
				<!-- 선택된 값들을 보낼 form영역 -->
		        <form onSubmit="selectCommunityList.bo" method="get" id='frmPaging'>
		            <!--출력할 페이지번호, 출력할 페이지 시작 번호, 출력할 리스트 갯수 -->
		            <input type='hidden' name='index' id='index' value='${pi.index}'>
		            <input type='hidden' name='pageStartNum' id='pageStartNum' value='${pi.pageStartNum}'>
		            <input type='hidden' name='listCnt' id='selected' value='${pi.listCnt}'>
		        </form>
				
				
				<div class="comment-insert">
					<form action="insertBoard.bo" class="form-signin">
						<div class="input-group mb-3">
							
							<c:if test="${! empty sessionScope.loginMember }">
								<input type="text" name="bContent" class="form-control" placeholder="Comment">
								<input type="hidden" name="bCode" value="100">
								<div class="input-group-append">
									<button class="btn btn-success" type="submit" style="padding: 6px 12px 6px 12px">submit</button>
								</div>
							</c:if>
							<c:if test="${empty sessionScope.loginMember }">
								<input type="text" name="bContent" class="form-control" placeholder="로그인을 하시면 Comment를 남길 수 있습니다." disabled="disabled">
								<div class="input-group-append">
									<button class="btn btn-success" type="submit" style="padding: 6px 12px 6px 12px" disabled="disabled">submit</button>
								</div>
							</c:if>
						
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	
	<hr>
	<!-- Footer -->
	<jsp:include page="common/footer.jsp"/>
	
	<script>
		$(function(){
			$("#list-area td").mouseenter(function(){
				$(this).parent().css({"background":"#dcedff","cursor":"pointer"});
			}).mouseout(function(){
				$(this).parent().css({"background":"white"})
			})
		});
	</script>

</body>
</html>