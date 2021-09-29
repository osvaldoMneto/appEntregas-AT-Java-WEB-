<%@page import="br.edu.Infnet.appspeedmais.model.domain.Bike"%>
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

		<form action="/bike" method="get">
			<button type="submit" class="btn btn-link">Incluir</button>
		</form>
		
		<hr>
		
		<c:if test="${not empty bikes}">
			<c:if test="${not empty msg}">
				<div class="alert alert-success">
				  <strong>Sucesso!</strong> ${msg}
				</div>
			</c:if>
	
			<h4>Quantidade de bikes existentes: ${bikes.size()}!!!</h4>
			
			<hr>
	
			<table class="table table-striped">
		    <thead>
		      <tr>
		      	<th>Id</th>
		      	<td>Marca</td>
		      	<td>Condutor</td>
		        <th>Descrição</th>
		        <th></th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>		    
		    	<c:forEach var="b" items="${bikes}">
			      <tr>
			        <td>${b.id}</td>
			        <td>${b.marca}</td>
			        <td>${b.condutor}</td>
			        <td>${b.descricao}</td>
			        <td>${b.cor }</td>
			        <td><a href="/bike/${b.id}/excluir">Excluir</a></td>
			      </tr>
		    	</c:forEach>
		    </tbody>
		  	</table>
	  	</c:if>
	  	
	  	<c:if test="${empty bikes}">
			<h4>Não existem bikes cadastradas!!!</h4>	  	
	  	</c:if>
	</div>
</body>
</html>