<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello!</h1>

	<ul class="nav justify-content-center">
		<li class="nav-item"><a class="nav-link"
			href="${pageContext.request.contextPath}">Home</a></li>

		<!--<sec:authorize access="isAuthenticated()">-->
			<li class="nav-item"><a class="nav-link"
				href="${pageContext.request.contextPath}/students/add">Add
					Student</a></li>
			<li class="nav-item"><a class="nav-link"
				href="${pageContext.request.contextPath}/ekpaideftikoi/add">Add
					Teacher</a></li>
			<li class="nav-item"><a class="nav-link"
				href="${pageContext.request.contextPath}/diefthintes/add">Add
					Principal</a></li>
			<li class="nav-item"><a class="nav-link" name="logout-nav"
				href="">Logout</a></li>
		<!--</sec:authorize>-->
		<!--<sec:authorize access="isAnonymous()">-->
			<!-- if user is not authenticated-->
			<li class="nav-item"><a class="nav-link"
				href="${pageContext.request.contextPath}/login">Login</a></li>
		<!--</sec:authorize>-->
	</ul>

</body>
</html>