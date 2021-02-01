<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table>
	<tr>
		<th>Tmima_id</th>
		<th>Stathmos_id</th>
		<th>Mathitis_id</th>
	</tr>
	<!-- loop over and print our customers -->
	<c:forEach var="tempMathitis" items="${mathites}">

		<tr>
			<td>${tempMathitis.tmima_id}</td>
			<td>${tempMathitis.stathmos_id}</td>
			<td>${tempMathitis.mathitis_id}</td>
		</tr>
	</c:forEach>
</table>