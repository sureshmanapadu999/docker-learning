<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body bgcolor="lightblue">
	<center>
		<h1>Services available</h1>
		<hr>
		<table cellspacing="2" cellpadding="2">
			<tr>
				<th>Service Number</th>
				<th>Service name</th>
				<th>start station</th>
				<th>endstation</th>
				<th>departure time</th>
				<th>service type</th>
			</tr>
			<c:forEach items="${requestScope.serviceDetails}" var="service">
				<tr>
					<td>${service.srvnum}</td>
					<td>${service.srvcname}</td>
					<td>${service.startstation}</td>
					<td>${service.endstation}</td>
					<td>${service.deptime}</td>
					<td>${service.stype}</td>
				</tr>
			</c:forEach>
		</table>
	</center>
</body>
</html>
