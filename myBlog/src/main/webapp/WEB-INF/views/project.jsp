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
<link href="https://fonts.googleapis.com/css?family=Jua&display=swap" rel="stylesheet">
<!-- CSS 파일 -->
<link href="${ conextPath }/resources/css/project.css" rel="stylesheet">


</head>

<body>
	<!-- navigator -->
	<jsp:include page="common/nav.jsp"/>

	<!-- Page Header -->
	<header class="masthead" style="background-image: url('${ conextPath }/resources/img/project-bg.jpg')">
		<div class="overlay">
		
		</div>
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-md-10 mx-auto">
					<div class="site-heading">
						<h1>Project</h1>
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
				<div class="project-container">
					<div class="project-wrap">
						<!-- 프로젝트 썸네일 -->
						<a href="https://github.com/sinsoyeon/nullLive" target="_blank">
							<div class="project-thumbnail">
								<img class="thumbnail" alt="github로 이동" src="${ conextPath }/resources/img/project/nullLive_logo.PNG">
							</div>
	
						</a>
						<!-- 간략한 프로젝트 소개 -->
						<a href="https://github.com/sinsoyeon/nullLive" target="_blank"> 
							<span class="fa-stack project-git"> 
								<i class="fas fa-circle fa-stack-2x"></i>
								<i class="fab fa-github fa-stack-1x fa-inverse"></i>
							</span>
						</a>
						<div class="project-brief">
							<h2>NullLive</h2>
							<hr>
							<div class="project-sub">
								<p>개요 : 누구나 쉽게 방송할 수 있는 플랫폼 구축</p>
								<p>개발 기간 : 2019년 06월 20일 ~ 2019년 07월 17일 </p>
							</div>
							<div>
								<p class="project-sub"> 전체 구현 기능 </p>
								<span class="project-fn">로그인</span>
								<span class="project-fn">회원가입</span>
								<span class="project-fn">아이디 비밀번호 찾기</span>
								<span class="project-fn">실시간 방송</span>
								<span class="project-fn">방송 시청</span>
								<span class="project-fn">실시간 채팅</span>
								<span class="project-fn">구인구직 게시판</span>
								<span class="project-fn">후원하기 / 결제</span>
								<span class="project-fn">스트리머 관리</span>
								<span class="project-fn">회원 관리</span>
								<span class="project-fn">정산 및 환불</span>
								<span class="project-fn">통계</span>
								<span class="project-fn">게시판 관리</span>
							</div>
							<div>
								<p class="project-sub">담당 구현 기능</p>
								<span class="project-fn">구인구직 게시판</span>
							</div>
							<div class="dev-enm">
								<p class="project-sub">개발 환경</p>
								<table class="table table-bordered">
									<tbody>
										<tr>
											<td>OS</td>
											<td>Windows 10</td>
										</tr>
										<tr>
											<td>Tools</td>
											<td>STS / sqlDeveloper</td>
										</tr>
										<tr>
											<td>DBMS</td>
											<td>Oracle(11g XE)</td>
										</tr>
										<tr>
											<td>WAS</td>
											<td>Apache Tomcat 8.5</td>
										</tr>
										<tr>
											<td>Language</td>
											<td>Java(jdk 1.8) / HTML5 / CSS3 / JavaScript</td>
										</tr>
										<tr>
											<td>Framework</td>
											<td>Spring / Mybatis / Bootstrap</td>
										</tr>
										<tr>
											<td>Library</td>
											<td>jQuery / socket.io / Gmail / Lombok</td>
										</tr>
										<tr>
											<td>SCM</td>
											<td>github</td>
										</tr>
										<tr>
											<td>APIs</td>
											<td>webRTC / I'mport / CoolSMS / CKEditor / Google(chart, TTS)</td>
										</tr>
										<tr>
											<td>skills</td>
											<td>Servlet 3.1 / JSP 2.5 / Ajax</td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
					</div>
					<hr>
					<div class="project-wrap">
						<!-- 프로젝트 썸네일 -->
						<a href="https://github.com/byeongukk/shareThings" target="_blank">
							<div class="project-thumbnail">
								<img class="thumbnail" alt="github로 이동" src="${ conextPath }/resources/img/project/shareThing_logo.PNG">
							</div>
						</a>
						<!-- 간략한 프로젝트 소개 -->
						<a href="https://github.com/byeongukk/shareThings" target="_blank"> 
							<span class="fa-stack project-git"> 
								<i class="fas fa-circle fa-stack-2x"></i>
								<i class="fab fa-github fa-stack-1x fa-inverse"></i>
							</span>
						</a>
						<div class="project-brief">
							<h2 class="project-title">shareThings</h2>
							<hr>
							<div class="project-sub">
								<p>개요 : 이용자간의 안전하게 물건을 빌리고 빌려주기위한 사이트 구축</p>
								<p>개발 기간 : 2019년 05월 10일 ~ 2019년 05월 27일 </p>
							</div>
							<div>
								<p class="project-sub">전체 구현 기능</p>
								<span class="project-fn">로그인</span>
								<span class="project-fn">회원가입</span>
								<span class="project-fn">아이디 비밀번호 찾기</span>
								<span class="project-fn">물품 등록</span>
								<span class="project-fn">물품 대여 후기</span>
								<span class="project-fn">QnA</span>
								<span class="project-fn">회원 조회</span>
								<span class="project-fn">회원 관리</span>
								<span class="project-fn">등록 관리</span>
								<span class="project-fn">등록 물품 관리</span>
								<span class="project-fn">대여 조회</span>
								<span class="project-fn">대여 관리</span>
								<span class="project-fn">물품 발송 관리</span>
								<span class="project-fn">배송 조회</span>
								<span class="project-fn">게시글 관리</span>
								<span class="project-fn">정산 및 환불</span>
								<span class="project-fn">통계</span>
							</div>
							<div>
								<p class="project-sub">담당 역할</p>
								<span class="project-fn">대여관리</span>
								<span class="project-fn">물품 발송 관리</span>
								<span class="project-fn">배송 조회</span>
								<span class="project-fn">게시글 관리</span>
							</div>
							<div class="dev-enm">
								<p class="project-sub">개발 환경</p>
								<table class="table table-bordered">
									<tbody>
										<tr>
											<td>OS</td>
											<td>Windows 10</td>
										</tr>
										<tr>
											<td>Tools</td>
											<td>Eclipse / sqlDeveloper</td>
										</tr>
										<tr>
											<td>DBMS</td>
											<td>Oracle(11g XE)</td>
										</tr>
										<tr>
											<td>WAS</td>
											<td>Apache Tomcat 8.5</td>
										</tr>
										<tr>
											<td>Language</td>
											<td>Java(jdk 1.8) / HTML5 / CSS3 / JavaScript</td>
										</tr>
										<tr>
											<td>Framework</td>
											<td>Bootstrap</td>
										</tr>
										<tr>
											<td>Library</td>
											<td>jQuery / poi</td>
										</tr>
										<tr>
											<td>SCM</td>
											<td>github</td>
										</tr>
										<tr>
											<td>APIs</td>
											<td>I'mport / sweetTracker / CoolSMS / GoogleCharts</td>
										</tr>
										<tr>
											<td>skills</td>
											<td>Servlet 3.1 / JSP 2.5 / Ajax</td>
										</tr>
									</tbody>
								</table>
							</div><!-- dev-evm -->
						</div><!-- project-brief -->
					</div> <!-- project-wrap -->
				</div><!-- project-container -->
			</div>
		</div>
	</div>
	<hr>
	<!-- Footer -->
	<jsp:include page="common/footer.jsp"/>

</body>

</html>
