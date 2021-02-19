<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<div class="float-right">
			<a href="${pageContext.request.contextPath}/logout.jsp">Logout</a>
		</div>
		<h1>Diefthintes Directory</h1>
		<hr />

		<div class="row">
			<div class="col-md-4">
				<form action="updatePrincipal" method="POST">

					<div class="form-group">
						<input type="text" class="form-control" name="username"
							placeholder="Enter Username" value="${diefthintes.username}" />
					</div>

					<div class="form-group">
						<input type="text" class="form-control" name="first_name"
							placeholder="${ediefthintes.getFirst_name() }"
							value="${diefthintes.first_name}" />
					</div>

					<div class="form-group">
						<input type="text" class="form-control" name="last_name"
							placeholder="Enter Last Name" value="${diefthintes.last_name}" />
					</div>

					<div class="form-group">
						<input type="text" class="form-control" name="email"
							placeholder="Enter mail" value="${diefthintes.email}" />
					</div>

					<div class="form-group">
						<input type="text" class="form-control" name="stathmos_id"
							placeholder="Enter stathmos" value="${diefthintes.stathmos_id}" />
					</div>

					<div class="form-group">
						<input type="text" class="form-control" name="password"
							placeholder="Enter Password" value="${diefthintes.password}" />
					</div>


					<button type="submit" class="btn btn-primary">Save</button>
				</form>
			</div>
		</div>
		<a href="${pageContext.request.contextPath}/diefthintes/list">Back
			to List</a>
	</div>


	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>