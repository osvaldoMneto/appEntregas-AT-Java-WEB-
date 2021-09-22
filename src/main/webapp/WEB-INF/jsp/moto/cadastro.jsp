<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SpeedMais - Cadastra!!!</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container">
	  <h2>Cadastro de Motos</h2>
	  <form action="/motos/incluir" method="post">

	    <div class="form-group">
	      <label>Nom do Condutor:</label>
	      <input value="Elberth Moraes" type="text" class="form-control" placeholder="Entre com o nome do condutor" name="condutor">
	    </div>

	    <div class="form-group">
	      <label>Placa:</label>
	      <input value="xml1010" type="text" class="form-control" placeholder="Entre com a sua placa" name="placa">
	    </div>

	    <div class="form-group">
	      <label>Marca:</label>
	      <input value="Honda" type="number" class="form-control" placeholder="Entre com a maca" name="marca">
	    </div>

	    
		<div class="form-group">
		  <label>Cilidradas:</label>
		  <select class="form-control" name="cilidradas">
			<option>50</option>
			<option>100</option>
			<option selected="selected" >150</option>
			<option>200</option>
			<option>250</option>
		  </select>
		</div>		
		
	    <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>
	</div>

</body>
</html>