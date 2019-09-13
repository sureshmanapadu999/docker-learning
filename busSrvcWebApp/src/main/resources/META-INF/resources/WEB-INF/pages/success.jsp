<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body bgcolor="lightblue">
	<center>
		<h1>Services available</h1>
		<hr>
		<c:forEach items="${requestScope.serviceDetails}" var="service">
			<br>${service}
		</c:forEach>
	</center>
</body>
</html>
