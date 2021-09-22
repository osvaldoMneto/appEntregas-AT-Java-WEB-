<%@page import="br.edu.Infnet.appspeedmais.model.domain.Carro"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>APP2021 - Confirma!!!</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container">

		<form action="/carro" method="get">
			<button type="submit" class="btn btn-link">Incluir</button>
		</form>
		
		<hr>
		
		<c:if test="${not empty lista}">
			<c:if test="${not empty msg}">
				<div class="alert alert-success">
				  <strong>Sucesso!</strong> ${msg}
				</div>
			</c:if>
	
			<h4>Quantidade de carros existentes: ${lista.size()}!!!</h4>
			
			<hr>
	
			<table class="table table-striped">
		    <thead>
		      <tr>
		      	<th>Id</th>
		        <th>Condutor</th>
		        <th>descricao</th>
		        <th>Ano</th>
		        <th>Marca</th>
		        <th>Lugares</th>
		        <th>Mala</th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>		    
		    	<c:forEach var="c" items="${lista}">
			      <tr>
			        <td>${c.id}</td>
			        <td>${c.nome}</td>
			        <td>${c.email}</td>
			        <td>${c.idade}</td>
			        <td>${c.curso}</td>
			        <td>${c.regiao}</td>
			        <td>${c.usuario.nome}</td>
			        <td><a href="/carro/${c.id}/excluir">Excluir</a></td>
			      </tr>
		    	</c:forEach>
		    </tbody>
		  	</table>
	  	</c:if>
	  	
	  	<c:if test="${empty lista}">
			<h4>Não existem carros cadastrados!!!</h4>	  	
	  	</c:if>
	</div>
</body>
</html>