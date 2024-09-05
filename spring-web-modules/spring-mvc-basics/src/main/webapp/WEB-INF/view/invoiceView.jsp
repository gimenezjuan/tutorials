<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resumen de la Factura</title>
</head>
<body>
	<h3>Resumen de la Factura</h3>
	<p><strong>Concepto:</strong> ${concept}</p>
	<p><strong>Cantidad:</strong> ${amount}</p>
	<p><strong>Porcentaje de Retención:</strong> ${percentage}</p>

	<%
		double netAmount = (Double.parseDouble(request.getAttribute("amount").toString())) * (1 - Double.parseDouble(request.getAttribute("percentage").toString()));
	%>

	<p><strong>Cantidad después de Retención:</strong> <%= netAmount %></p>

</body>
</html>