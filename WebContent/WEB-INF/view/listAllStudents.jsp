<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table>
	<tr>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Email</th>
	</tr>
	<!-- loop over and print our customers -->
	<c:forEach var="tempStudent" items="${students}">

		<tr>
			<td>${tempStudent.firstName}</td>
			<td>${tempStudent.lastName}</td>
			<td>${tempStudent.email}</td>
		</tr>
	</c:forEach>
</table>