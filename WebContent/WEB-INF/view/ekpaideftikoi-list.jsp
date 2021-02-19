<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ekpaideftikoi Directory</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/v/bs4/dt-1.10.20/datatables.min.css" />
</head>
<body>
	<%--
        String email=(String)session.getAttribute("email");
        
        //redirect user to login page if not logged in
        if(email==null){
        	response.sendRedirect("hello.jsp");
        }
    --%>
	<div class="container">
		<div class="float-right">
			<a href="${pageContext.request.contextPath}/logout.jsp">Logout</a>
		</div>
		<h1>Ekpaideftikoi Directory</h1>
		<hr />

		<p>${NOTIFICATION}</p>

		<p>
			<a href = "${pageContext.request.contextPath}/ekpaideftikoi/add">Add Ekpaideftikoi</a>
			<%-- <button class = "btn btn-primary" onclick="javascript:document.forms[0].action = 'ekpaideftikoi-form.jsp'; document.forms[0].submit();">Add Ekpaideftikoi</button>--%>
		</p>

		<table class="table table-striped table-bordered" id="datatable">
			<thead>
				<tr class="thead-dark">
					<th>Username</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Stathmos</th>
					<th>Password</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${ekpaideftikoi}" var="ekpaideftikoi">
					<tr>
						<td>${ekpaideftikoi.username}</td>
						<td>${ekpaideftikoi.first_name}</td>
						<td>${ekpaideftikoi.last_name}</td>
						<td>${ekpaideftikoi.email}</td>
						<td>${ekpaideftikoi.stathmos_id}</td>
						<td>${ekpaideftikoi.password}</td>
						<td><a
							href="${pageContext.request.contextPath}/ekpaideftikoi/update?username=${ekpaideftikoi.username}">Edit</a>
							| <a
							href="${pageContext.request.contextPath}/ekpaideftikoi/delete?username=${ekpaideftikoi.username}">Delete</a>
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