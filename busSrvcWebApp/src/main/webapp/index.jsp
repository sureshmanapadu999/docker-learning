<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="styles1.css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js"></script>
</head>
<body>
	<script type="text/javascript">
		function dynaFunction(name) {

			var screen1 = name + ".jsp";
			//alert(screen1);
			// return true or false, depending on whether you want to allow the `href` property to follow through or not

			//document.getElementById("section").innerHTML='<object type="text/html" data="test1.html" ></object>';

			$("#section").load(screen1);
			//alert('satya'); 

		}
	</script>


	<div id="header">
		<h1>Bus Service Application</h1>
	</div>

	<div id="nav">

		<a href="" onclick="dynaFunction('searchSrvc'); return false;">search for a bus service</a><br />
	</div>

	<div id="section">
		<%
			Object obj = request.getAttribute("status");
			if (obj != null) {
				boolean status = (Boolean) request.getAttribute("status");
				if (status == true) {

				} else
					out.write("error Description:" + request.getAttribute("errorDesc"));
			}
		%>
	</div>

	<div id="footer">Copyright @satyanarayana</div>

</body>
</html>
