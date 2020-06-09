<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro de Tickets</title>
  <link rel="stylesheet" href="jsp/css/estilos.css">
</head>
<body>
	<form action="agregar-ticket" method="POST">
		<label>Cedula de Cliente: </label> 
		<input type="text"
			placeholder="Cedula del propietario" name="cedula"><br>
			
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
			placeholder="Numero de Ticket" name="numero"><br>
			
			<label>Fecha de entrada: </label> 
		<input type="date"
			name="fechaEntrada" placeholder="fecha de Entrada"><br>
			
			<label>Hora de entrada: </label> 
		<input type="time"
			name="horaEntrda" placeholder="hora de Entrada"><br>
			
			<label>Fecha de salida: </label> 
		<input type="date"
			name="fechaSalida" placeholder="fecha de Salida"><br>
			
			<label>Hora de salida: </label> 
		<input type="time"
			name="horaSalida" placeholder="hora de Salida"><br>
			
			<input id="registrar" type="submit" value="Registrar">
			
	</form>

</body>
</html>