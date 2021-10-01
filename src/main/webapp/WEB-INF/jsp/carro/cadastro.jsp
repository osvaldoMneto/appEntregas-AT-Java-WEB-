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
	  <h2>Cadastro de Carros</h2>
	  <form action="/carro/incluir" method="post">

	    <div class="form-group">
	      <label>Condutor:</label>
	      <input type="text" value="José" class="form-control" placeholder="Entre com a descrição" name="condutor">
	    </div>
	    
	      <div class="form-group">
	      <label>Descrição:</label>
	      <input type="text" value="Camaro" class="form-control" placeholder="Entre com a descrição" name="descricao">
	    </div>

	    <div class="form-group">
	      <label>Ano:</label>
	      <input type="text" value="2018" class="form-control" placeholder="Entre com o ano do Carro" name="ano">
	    </div>
		
	    <div class="form-group">
	      <label>Marca:</label>
	      <input type="text" value="4" class="form-control" placeholder="Entre com a nota do Serviço" name="marca">
	    </div>

	   
	    <div class="form-group">
	      <label>Características:</label>
			<label class="checkbox-inline"><input type="checkbox" name="airberg">Air Berg</label>
			<label class="checkbox-inline"><input type="checkbox" name="mala">Mala</label>
	    </div>

	    <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>
	</div>

</body>
</html>