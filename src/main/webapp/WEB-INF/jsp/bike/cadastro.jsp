<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>APP2021 - Cadastra!!!</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container">
	  <h2>Cadastro de Bike</h2>
	  <form action="/bike/incluir" method="post">

	    <div class="form-group">
	      <label>Marca::</label>
	      <input type="text" class="form-control" placeholder="Entre com a descrição" name="marca">
	    </div>

	    <div class="form-group">
	      <label>Condutor:</label>
	      <input type="text" class="form-control" placeholder="Entre com o condutor da bike" name="condutor">
	    </div>
		
		<div class="form-group">
	      <label>Descricao:</label>
	      <input type="text" class="form-control" placeholder="Entre coma descricao da bike" name="descricao">
	    </div>
		
		<div class="form-group">
	      <label>Cor:</label>
	      <input type="text" class="form-control" placeholder="Entre coma descricao da bike" name="cor">
	    </div>
		
		
	    <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>
	</div>

</body>
</html>