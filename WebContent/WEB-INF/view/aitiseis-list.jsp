<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Aitiseis Directory</title>
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
		<h1>Aitiseis Directory</h1>
		<hr />

		<p>${NOTIFICATION}</p>

	

		<table class="table table-striped table-bordered" id="datatable">
			<thead>
				<tr class="thead-dark">
					<th>Aitisi</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Eisodima</th>
					<th>Hm. Gen.</th>
					<th>Pateras</th>
					<th>Mhtera</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${aitiseis}" var="aitiseis">
					<tr>
						<td>${aitiseis.aitisi_id}</td>
						<td>${aitiseis.first_name}</td>
						<td>${aitiseis.last_name}</td>
						<td>${aitiseis.etisioIsodima}</td>
						<td>${aitiseis.dateOfBirth}</td>
						<td>${aitiseis.onomaPatera}</td>
						<td>${aitiseis.onomaMiteras}</td>
						<td><a
							href="${pageContext.request.contextPath}/aitiseis/save?id=${aitiseis.id}">Accept</a>
							| <a
							href="${pageContext.request.contextPath}/aitiseis/delete?id=${aitiseis.id}">Decline</a>
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