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

		<c:if test="${not empty veiculos}"/>
		<c:if test="${not empty msg }">
			<div class="alert alert-success">
			  <strong>Sucesso!</strong> ${msg}
			</div>
		</c:if>

		<c:if test="${not empty veiculos}">
			<h4>Quantidade de veiculos existentes: ${veiculos.size()}!!!</h4>
			
			<hr>
	
			<table class="table table-striped">
		    <thead>
		      <tr>
		      	<th>Id</th>
		        <th>Descricao</th>
		        <th>Condutor</th>
		        <th>Ano</th>
		         <th>Marca</th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>		    
		    	<c:forEach var="v" items="${veiculos}">
			      <tr>
			        <td>${v.id}</td>
			        <td>${v.descricao}</td>
			        <td>${v.condutor}</td>
			        <td>${v.ano}</td>
			        <td>${v.marca}</td>
			        <td>${v.usuario.nome}</td>
			        <td><a href="/veiculo/${v.id}/excluir">Excluir</a></td>
			      </tr>
		    	</c:forEach>
		    </tbody>
		  	</table>
	  	</c:if>
	  	
	  	<c:if test="${empty veiculos}">
			<h4>Não existem veiculos cadastradas!!!</h4>	  	
	  	</c:if>
	</div>
</body>
</html>