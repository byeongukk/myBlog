<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<style>
	.login-info{
		border: none;
	}
	.login-info-container{
		
		margin: 0px;
		display: flex;
	}
</style>

<c:set var="conextPath" value="${ pageContext.servletContext.contextPath }" scope="application"/>

<nav class="navbar navbar-expand-lg navbar-light fixed-top" id="mainNav">
	<div class="container">
		<button class="navbar-toggler navbar-toggler-right" type="button"
			data-toggle="collapse" data-target="#navbarResponsive"
			aria-controls="navbarResponsive" aria-expanded="false"
			aria-label="Toggle navigation">
			Menu <i class="fas fa-bars"></i>
		</button>
		<c:if test="${ empty sessionScope.loginMember }">
			<button class="navbar-toggler" type="button" onclick="location.href='showLoginForm.me'"
				data-toggle="collapse"
				aria-controls="navbarResponsive" aria-expanded="false"
				aria-label="Toggle navigation">
			Login
			</button>
		</c:if>
		<c:if test="${! empty sessionScope.loginMember }">
			<div class="login-info-container">
				<div class="navbar-toggler login-info" style="padding: 0px;">
					<c:out value="${ loginMember.mId }"/>님 환영합니다.
				</div>
				<div class="navbar-toggler login-info" style="padding: 0px 0px 0px 5px;">
					<a class="nav-link" style="padding: 0px;" href="logout.me">
						<i class="fas fa-sign-out-alt"></i>
					</a>
				</div>
			</div>
		</c:if>		
		<div class="collapse navbar-collapse" id="navbarResponsive">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item">
					<a class="nav-link" onclick="location.href='index.jsp'">Home</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="showAbout.do">About</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="showSkill.do">Skill</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="showProject.do">Project</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="selectCommunityList.bo">Community</a>
				</li>
				<c:if test="${ sessionScope.loginMember.mId eq 'admin' }">
					<li class="nav-item">
						<a class="nav-link" href="showAdminMain.ad">admin</a>
					</li>
				</c:if>
				<c:if test="${ empty sessionScope.loginMember }">
					<li class="nav-item">
						<a class="nav-link" href="showLoginForm.me">
							<i class="fas fa-sign-in-alt"></i>
							login
						</a>
					</li>
				</c:if>
				<c:if test="${! empty sessionScope.loginMember }">
					<li class="nav-item">
						<a class="nav-link" href="logout.me">
							<i class="fas fa-sign-out-alt"></i>
							logout
						</a>
					</li>
				</c:if>
			</ul>
		</div>
	</div>
</nav>
