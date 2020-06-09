<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista tickets</title>
</head>
<body>
	<form action="lista">
		<input style="border-radius: 6px" type="text" name="cedula"
			placeholder="cedula" id="buscar"> <input
			style="border-radius: 6px" type="text" name="placa"
			placeholder="placa" id="buscar"> <input
			style="border-radius: 6px" type="submit" value="Buscar">

	</form>
	
	<c:set var="clientes" value="${requestScope['clientes']}" />
	<c:choose>
	<c:when test="${clientes==null}">
	<p>Ingrese los datos a buscar </p>

	</c:when>

	<c:otherwise>
		<table>
			<thead>
				<tr>
				
					<th>Nombre Cliente</th>
					<th>Placa</th>
					<th>Marca</th>
					<th>Modelo</th>
					<th>Fecha y hora de ingreso</th>
					<th>Fecha y hora de salida</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<c:forEach var="vehiculo" items="${clientes.vehiculos}">
						<th>${vehiculo.cliente.nombre}</th>
						<th>${vehiculo.placa}</th>
						<th>${vehiculo.marca}</th>
						<th>${vehiculo.modelo}</th>
						<th>${vehiculo.ticket.fcehaIngreso} ${vehiculo.ticket.horaEntrada}</th>
						<th>${vehiculo.ticket.fcehaSalida} ${vehiculo.ticket.horaSalida}</th>
					</c:forEach>
				</tr>
			</tbody>

		</table>
	</c:otherwise>
	     </c:choose>


</body>
</html>