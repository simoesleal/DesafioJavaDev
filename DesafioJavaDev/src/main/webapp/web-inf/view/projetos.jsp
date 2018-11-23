<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="academy.learnprogramming.util.Mappings" %>
<html>
<head>
	<title>Meus Projetos</title>
</head>
<body>
	<div align="center">
	<c:url var="addUrl" value="${Mappings.ADD_PROJETO}"/>
	<a href="${addUrl}">Novo Projeto</a>
	
		<table border="1" cellpadding="5">
			<caption><h2>Meus Projetos</h2></caption>			
			<tr>
				<th>Cod</th>
				<th>Nome</th>
				<th>Inicio</th>
				<th>Previsão</th>
				<th>Fim</th>
				<th>Desc</th>
				<th>Status</th>
				<th>Orçamento</th>
				<th>Risco</th>
			</tr>
			
			
			<c:forEach var="item" items="${ProjetoDAO.getData}">
			
				<c:url var="editeUrl" value="${Mappings.ADD_PROJETO}">
					<c:param name="id" value="${item.id}" />
				</c:url>								
				<c:url var="deleteUrl" value="${Mappings.DELETE_ITEM}">
					<c:param name="id" value="${item.id}" />
				</c:url>
				<tr>
					<td><c:out value="${item.Cod}"/></td>
					<td><c:out value="${item.Nome}"/></td>
					<td><c:out value="${item.Inicio}"/></td>
					<td><c:out value="${item.Previsão}"/></td>
					<td><c:out value="${item.Fim}"/></td>
					<td><c:out value="${item.Desc}"/></td>
					<td><c:out value="${item.Status}"/></td>
					<td><c:out value="${item.Orçamento}"/></td>
					<td><c:out value="${item.Risco}"/></td>
					<td><a href="${editeUrl}">Edit</a></td>				
					<td><a href="${deleteUrl}">Delete</a></td>
				</tr>
			
			</c:forEach>	
		</table>
	</div>	
</body>
</html>