<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String errorMessage = "";
if (session.getAttribute("ERROR") != null) {
	errorMessage = (String) session.getAttribute("ERROR");
	session.removeAttribute("ERROR");
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div
				class="col-12 bg-dark d-flex text-light justify-content-center align-items-center"
				style="height: 100vh">
				<form action="register-servlet" method="post">
					<div class="form-group">
						<label>User Name</label> <input type="text" name="username"
							class="form-control">
					</div>

					<div class="form-group">
						<label>Password</label> <input type="password" name="password"
							class="form-control">
					</div>

					<div class="form-group">
						<label>Email Address</label> <input type="email" name="email"
							class="form-control">
					</div>

					<div class="form-group">
						<label>Phone Number</label> <input type="text" name="mobile"
							class="form-control">
					</div>

					<button type="submit" class="btn btn-primary">Register</button>
					<a class="btn btn-primary" href="login.jsp" role="button">Login</a>

					<%
						if (errorMessage != "") {
					%>
					<div class="alert alert-danger mt-1" role="alert">
						<%=errorMessage%>
					</div>

					<%
						}
					%>

				</form>

			</div>
		</div>
	</div>
</body>
</html>