<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro de Tickets</title>
</head>
<body>
	<form action="agregar-ticket" method="POST">
		<label>Cedula de Cliente: </label> 
		<input type="text"
			placeholder="Cedula" name="cedula"><br>
			
			<label>Placa de vehiculo: </label> 
		<input type="text"
			placeholder="Placa" name="placa"><br>
			
			<label>Marca de vehiculo: </label> 
		<input type="text"
			placeholder="Maraca" name="marca"><br>
			
			<label>Modelo de vehiculo: </label> 
		<input type="text"
			placeholder="Modelo" name="modelo"><br>
			
			<label>Numero de Ticket: </label> 
		<input type="text"
			placeholder="Numero" name="numero"><br>
			
			<label>Fecha de entrada: </label> 
		<input type="date"
			name="fechaEntrada"><br>
			
			<label>Hora de entrada: </label> 
		<input type="time"
			name="horaEntrda"><br>
			
			<label>Fecha de salida: </label> 
		<input type="date"
			name="fechaSalida"><br>
			
			<label>Hora de salida: </label> 
		<input type="time"
			name="horaSalida"><br>
			
			<input type="submit" value="Enviar">
			
	</form>

</body>
</html>