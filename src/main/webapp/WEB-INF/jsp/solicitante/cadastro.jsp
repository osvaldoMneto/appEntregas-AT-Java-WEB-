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
	  <h2>Cadastro de Solicitantes</h2>
	  <form action="/solicitante/incluir" method="post">

	    <div class="form-group">
	      <label>Nome:</label>
	      <input value="Osvaldo Carvalho" type="text" class="form-control" placeholder="Entre com o seu nome" name="nome">
	    </div>

	    <div class="form-group">
	      <label>Idade:</label>
	      <input value="20" type="text" class="form-control" placeholder="Entre com a sua idade" name="idade">
	    </div>

	    <div class="form-group">
	      <label>E-mail:</label>
	      <input value="osvaldocarvalhont@gmail.com" type="email" class="form-control" placeholder="Entre com o seu e-mail" name="email">
	    </div>

	    <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>
	</div>

</body>
</html>