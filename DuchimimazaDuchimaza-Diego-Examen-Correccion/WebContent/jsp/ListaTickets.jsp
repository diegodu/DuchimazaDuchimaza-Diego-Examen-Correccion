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
					placeholder="cedula" id="buscar">
					<input style="border-radius: 6px" type="text" name="placa"
					placeholder="placa" id="buscar"> <input
					style="border-radius: 6px" type="submit" value="Buscar">

</form>
<c:set var = "clientes" value = "${requestScope['clientes']}" />
	<table>
		<thead>
			<tr>
				<th>Cedula</th>
				<th>Nombre</th>
				<th>Direccion</th>
				<th>Telefono</th>
				<th>Placa</th>
				<th>Marca</th>
				<th>Modelo</th>
				<th>Numero</th>
				<th>Fecha y hora de ingreso</th>
				<th>Fecha y hora de salida</th>
			</tr>
		</thead>
		<tbody>
			 <tr>
			 <c:forEach var="cliente" items="${clientes}">
		
			 	<th>${cliente.cedula}</th>
			 	<th>${cliente.nombre}</th>
			 	<th>${cliente.direccion}</th>
			 	<th>${cliente.telefono}</th>
			    <c:forEach var="vehiculo" items="${cliente.vehiculos}">
			 	<th>${vehiculo.placa}</th> 	
			 	<th>${vehiculo.marca}</th>
			 	<th>${vehiculo.modelo}</th>	  
			 </c:forEach>
			  
			 </c:forEach>
			  </tr>
		</tbody>
	</table>
</body>
</html>