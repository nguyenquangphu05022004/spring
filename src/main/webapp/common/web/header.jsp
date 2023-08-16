<%@page import="com.laptrinhjavaweb.util.SecurityUtils"%>
<%@page import="com.laptrinhjavaweb.dto.MyUser"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
	<div class="container">
		<a class="navbar-brand" href="#">Start Bootstrap</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarResponsive" aria-controls="navbarResponsive"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarResponsive">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item active"><a class="nav-link" href="<c:url value = "/trang-chu"/>">Home
						<span class="sr-only">(current)</span>
				</a></li>

				<sec:authorize access = "isAnonymous()">
				<li class="nav-item"><a class="nav-link" href="<c:url value = "/dang-nhap"/>">Đăng nhập</a></li>
				<li class="nav-item"><a class="nav-link" href="<c:url value = "/dang-ky"/>">Đăng ký</a>
				</sec:authorize>

				<sec:authorize access = "isAuthenticated()">
				<li class="nav-item"><a class="nav-link" href="<c:url value = "/thoi-khoa-bieu"/>">Đăng ký môn học</a></li>
				<li class="nav-item"><a class="nav-link" href="<c:url value = "/thoi-khoa-bieu"/>">Thời khóa biểu</a></li>
				<li class="nav-item"><a class="nav-link" href="">Welcome <%= SecurityUtils.getPrincipal().getFullName() %></a></li>
				<li class="nav-item"><a class="nav-link" href="<c:url value = "/thoat"/>">Thoát</a></li>
				</sec:authorize>
			</ul>
		</div>
	</div>
</nav>