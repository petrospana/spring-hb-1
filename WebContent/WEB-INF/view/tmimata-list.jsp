<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Tmimata Directory</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/v/bs4/dt-1.10.20/datatables.min.css" />
</head>
<body>
	
	<div class="container">
		<div class="float-right">
			<a href="${pageContext.request.contextPath}/logout.jsp">Logout</a>
		</div>
		<h1>Tmimata Directory</h1>
		<hr />

		<p>${NOTIFICATION}</p>

		<p>
			<a href = "${pageContext.request.contextPath}/diefthintes/tmimataAdd">Add Tmimata</a>

		</p>

		<table class="table table-striped table-bordered" id="datatable">
			<thead>
				<tr class="thead-dark">
					<th>Id</th>
					<th>Stathmos</th>
					<th>Ekpaideftikos</th>
					
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${tmimata}" var="tmimata">
					<tr>
						<td>${tmimata.username}</td>
						<td>${tmimata.first_name}</td>
						<td>${tmimata.last_name}</td>
						<td>${tmimata.email}</td>
						<td>${tmimata.stathmos_id}</td>
						<td>${tmimata.password}</td>
						<td><a
							href="${pageContext.request.contextPath}/diefthintes/tmimataUpdate?id=${tmimata.id}">Edit</a>
							| <a
							href="${pageContext.request.contextPath}/diefthintes/tmimataDelete?id=${tmimata.id}">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
	<script type="text/javascript"
		src="https://cdn.datatables.net/v/bs4/dt-1.10.20/datatables.min.js"></script>
	<script>
		$(document).ready(function() {
			$("#datatable").DataTable();
		})
	</script>
</body>
</html>