<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="academy.learnprogramming.util.AttributeNames" %>
<html>
<head>
	<title>Add Pessoas</title>
</head>
<body>
	<div align="center">
		<form:form method="POST" modelAttribute="${AttributeNames.PESSOA}">
			<table>
				<tr>
					<td><label>ID</label></td>
					<td>
						<form:input path="id" disable="true" />	
					</td>
				</tr>
				<tr>
					<td><label>Nome </label></td>
					<td><form:input path="nome"/></td>
				</tr>
				<tr>
					<td><label>Data Nascimento</label></td>
					<td><form:input path="dataNascimento"/></td>
				</tr>
				<tr>
					<td><label>CPF</label></td>
					<td><form:textarea path="cpf"/></td>
				</tr>
				<tr>
					<td><label>Funcionario</label></td>
					<td><form:textarea path="tipoFuncionario"/></td>
				</tr>
				<tr>
					<td><input type="submit" value="Submite"/></td>
				</tr>
			</table>
		</form:form>		
	</div>	
</body>
</html>