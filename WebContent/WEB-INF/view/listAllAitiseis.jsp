<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table>
	<tr>
		<th>aitisi id</th>
		<th>first name</th>
		<th>last name</th>
		<th>etisio Isodima</th>
		<th>date of birth</th>
		<th>Onoma Patera</th>
		<th>Onoma Miteras</th>
	</tr>
	<!-- loop over and print our customers -->
	<c:forEach var="tempAitisi" items="${aitiseis}">

		<tr>
			<td>${tempAitisi.aitisi_id}</td>
			<td>${tempAitisi.first_name}</td>
			<td>${tempAitisi.last_name}</td>
			<td>${tempAitisi.etisioIsodima}</td>
			<td>${tempAitisi.dateOfBirth}</td>
			<td>${tempAitisi.onomaPatera}</td>
			<td>${tempAitisi.onomaMiteras}</td>
		</tr>
	</c:forEach>
</table>