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
<section class="form-registro">
	<form class="ui-form" action="agregar-ticket" method="POST">
		
		<input type="text" class="controls"
			placeholder="Cedula del propietario" name="cedula">
		<input type="text" class="controls"
			placeholder="Placa" name="placa"> 
		<input type="text" class="controls"
			placeholder="Maraca" name="marca">
		<input type="text" class="controls"
			placeholder="Modelo" name="modelo">
		<input type="text" class="controls"
			placeholder="Numero de Ticket" name="numero">
		<input type="date" class="controls"
			name="fechaEntrada" placeholder="fecha de Entrada">
		<input type="time" class="controls"
			name="horaEntrda" placeholder="hora de Entrada">
		<input type="date" class="controls"
			name="fechaSalida" placeholder="fecha de Salida">
		<input type="time" class="controls"
			name="horaSalida" placeholder="hora de Salida"><br>
			
			<input class="botones" id="registrar" type="submit" value="Registrar">
			
	</form>
	</section>

</body>
</html>