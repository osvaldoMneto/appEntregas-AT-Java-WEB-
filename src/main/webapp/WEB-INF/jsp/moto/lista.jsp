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

		<form action="/moto" method="get">
			<button type="submit" class="btn btn-link">Incluir</button>
		</form>
		
		<hr>
		
		<c:if test="${not empty msg}">
				<div class="alert alert-success">
				  <strong>Sucesso!</strong> ${msg}
				</div>
			</c:if>
			
			<c:if test="${not empty motos}">
			
			<h4>Quantidade de motos existentes: ${motos.size()}!!!</h4>
			
			<hr>
	
			<table class="table table-striped">
		    <thead>
		      <tr>
		      	<th>Id</th>
		        <th>Condutor</th>
		        <th>descricao</th>
		        <th>Ano</th>
		        <th>cilindradas</th>
		        <th></th>
		        <th></th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>		    
		    	<c:forEach var="m" items="${motos}">
			      <tr>
			        <td>${m.id}</td>
			        <td>${m.condutor}</td>
			        <td>${m.descricao}</td>
			        <td>${m.ano}</td>
			        <td>${m.cilindradas}</td>
			        <td></td>
			     
			        <td><a href="/moto/${m.id}/excluir">Excluir</a></td>
			      </tr>
		    	</c:forEach>
		    </tbody>
		  	</table>
	  	</c:if>
	  	
	  	<c:if test="${empty motos}">
			<h4>Não existem Motos cadastradas!!!</h4>	  	
	  	</c:if>
	</div>
</body>
</html>