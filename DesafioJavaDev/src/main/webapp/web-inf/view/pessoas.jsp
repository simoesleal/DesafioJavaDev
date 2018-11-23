<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="academy.learnprogramming.util.Mappings" %>
<html>
<head>
	<title>Meus Projetos</title>
</head>
<body>
	<div align="center">
	<c:url var="addUrl" value="${Mappings.ADD_PESSOA}"/>
	<a href="${addUrl}">Nova Pessoa</a>
	
		<table border="1" cellpadding="5">
			<caption><h2>Meus Projetos</h2></caption>			
			<tr>
				<th>Cod</th>
				<th>Nome</th>
				<th>Data Nascimento</th>
				<th>CPF</th>
				<th>Cargo</th>
			</tr>
			
			
			<c:forEach var="item" items="${PessoaDAO.getData}">
			
				<c:url var="editeUrl" value="${Mappings.ADD_PESSOA}">
					<c:param name="id" value="${item.id}" />
				</c:url>								
				<c:url var="deleteUrl" value="${Mappings.DELETE_PESSOA}">
					<c:param name="id" value="${item.id}" />
				</c:url>
				<tr>
					<td><c:out value="${item.id}"/></td>
					<td><c:out value="${item.nome}"/></td>
					<td><c:out value="${item.dataNascimento}"/></td>
					<td><c:out value="${item.cpf}"/></td>
					<td><c:out value="${item.tipoFuncionario}"/></td>
					<td><a href="${editeUrl}">Edit</a></td>				
					<td><a href="${deleteUrl}">Delete</a></td>
				</tr>
			
			</c:forEach>	
		</table>
	</div>	
</body>
</html>