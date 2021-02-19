<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<ul class="nav justify-content-center">
	<li class="nav-item"><a class="nav-link"
		href="${pageContext.request.contextPath}">Home</a></li>

	<sec:authorize access="isAuthenticated()">
		<li class="nav-item"><a class="nav-link"
			href="${pageContext.request.contextPath}/diefthintes/add">Add
				Principal</a></li>
		<li class="nav-item"><a class="nav-link" name="logout-nav"
			href="">Logout</a></li>
	</sec:authorize>
	<sec:authorize access="isAnonymous()">
		<!-- if user is not authenticated-->
		<li class="nav-item"><a class="nav-link"
			href="${pageContext.request.contextPath}/login">Login</a></li>
	</sec:authorize>
</ul>
<table>
	<tr>
		<th>username</th>
		<th>first name</th>
		<th>last name</th>
		<th>email</th>
		<th>stathmos id</th>
		<th>password</th>
	</tr>
	<!-- loop over and print our customers -->
	<c:forEach var="tempEkpaideftikos" items="${ekpaideftikoi}">

		<tr>
			<td>${tempEkpaideftikos.username}</td>
			<td>${tempEkpaideftikos.first_name}</td>
			<td>${tempEkpaideftikos.last_name}</td>
			<td>${tempEkpaideftikos.email}</td>
			<td>${tempEkpaideftikos.stathmos_id}</td>
			<td>${tempEkpaideftikos.password}</td>
		</tr>
	</c:forEach>
</table>


<a href="<c:url value="/logout" />">Logout</a>
