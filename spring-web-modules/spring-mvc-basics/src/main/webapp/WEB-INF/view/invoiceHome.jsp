<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulario de Factura</title>
</head>
<body>
	<h3>Bienvenido, Introduzca los detalles de la Factura</h3>

	<form:form method="POST" action="/invoice/addInvoice" modelAttribute="invoice">
		<table>
			<tr>
				<td><form:label path="concept">Concepto</form:label></td>
				<td><form:input path="concept" /></td>
			</tr>
			<tr>
				<td><form:label path="amount">Cantidad</form:label></td>
				<td><form:input path="amount" /></td>
			</tr>
			<tr>
				<td><form:label path="percentage">Porcentaje de Retención</form:label></td>
				<td><form:input path="percentage" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Enviar Factura" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>