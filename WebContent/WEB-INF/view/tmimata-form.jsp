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
		<h1>Tmimata Add Form</h1>
		<hr />

		<div class="row">
			<div class="col-md-4">
				<form action="registerTmimata" method="POST">

					

					<div class="form-group">
						<input type="text" class="form-control" name="tmima_id"
							placeholder="Enter Tmima" value="${tmimata.tmima_id}" />
					</div>

					<div class="form-group">
						<input type="text" class="form-control" name="stathmos_id"
							placeholder="Enter stathmos" value="${tmimata.stathmos_id}" />
					</div>
					
					<div class="form-group">
						<input type="text" class="form-control" name="username"
							placeholder="Enter Username" value="${tmimata.username}" />
					</div>


					<button type="submit" class="btn btn-primary">Save</button>
				</form>
			</div>
		</div>
		<a href="${pageContext.request.contextPath}/diefthintes/tmimatalist">Back
			to List</a>
	</div>


	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>