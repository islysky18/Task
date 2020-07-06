<%@page import="in.cdac.Post"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>


<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://localhost/Book?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8"
	user="root" password="Bearishandsome820708" />

<jsp:include page="session-validator.jsp"></jsp:include>

<%
if (session.getAttribute("AUTH") == null) {
	response.sendRedirect("login.jsp");
}
%>

<%
	List<Post> postList = new ArrayList<>();
if (session.getAttribute("POST_LIST") != null) {
	postList = (List<Post>) session.getAttribute("POST_LIST");
}
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
</head>
<style>
body {
	box-sizing: border-box;
}

html, body {
	margin: 0;
	height: 100%;
}

.bg {
	background-image: url("./img/bg.jpeg");
	height: 100%;
	/* Center and scale the image nicely */
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
}

#main-footer {
	text-align: center;
	background: #444;
	color: #fff;
	padding: 20px;
	width: 100%;
	/* position: absolute; */
	bottom: 0
}
</style>
<body class="bg">

	<!-- Navigation -->
	<main>
		<div class="container-fluid" style="height: 100%">
			<div class="row">
				<div class="col-6 bg-dark text-light d-flex align-items-center"
					style="height: 60px">WhatToSay</div>
				<div
					class="col-6 bg-dark text-light d-flex justify-content-end align-items-center"
					style="height: 60px">
					<a class="btn btn-primary" href="logout-servlet" role="button">Log
						out</a>
				</div>
			</div>


			<div class="row">
				<div class="col-3"></div>
				<div class="col-6 bg-secondary d-flex align-items-center"
					style="height: 80px">
					<form class="col-12" action="post-servlet">
						<div class="form-row">
							<div class="col-10">
								<input class="form-control form-control-lg" type="text"
									name="post" placeholder="Post Something Here...">
							</div>
							<div class="col-2 d-flex align-items-center">
								<button type="submit" class="btn btn-dark ml-1">Post</button>
							</div>
						</div>
					</form>

				</div>
			</div>

			<div class="row mt-1">
				<div class="col-3"></div>
				<div class="col-6 ">
					<div class="card">
						<div class="div1" style="overflow: auto;">

							<sql:query dataSource="${db}" var="book">SELECT post from HBM_POST Order by id DESC;</sql:query>
							<table class="table table-striped">
								<thead>
									<tr>
										<th scope="col">New POST</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach var="book" items="${book.rows}">
										<tr>
											<td><c:out value="${book.post}" /></td>

										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>

			</div>

		</div>

	</main>

	<<!-- footer id="main-footer">
		<p>Tobias Wen&copy; 2020, All Rights Reserved</p>
	</footer> -->
</body>
</html>