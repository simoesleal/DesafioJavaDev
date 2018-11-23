<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="academy.learnprogramming.util.AttributeNames" %>
<html>
<head>
	<title>Add Items</title>
</head>
<body>
	<div align="center">
		<form:form method="POST" modelAttribute="${AttributeNames.PROJETO}">
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
					<td><label>Inicio</label></td>
					<td><form:input path="data_inicio"/></td>
				</tr>
				<tr>
					<td><label>Previsao</label></td>
					<td><form:input path="data_previsao"/></td>
				</tr>
				<tr>
					<td><label>Fim</label></td>
					<td><form:input path="data_fim"/></td>
				</tr>
				<tr>
					<td><label>Descricao</label></td>
					<td><form:textarea path="descricao"/></td>
				</tr>
				<tr>
					<td><label>Orcamento</label></td>
					<td><form:textarea path="orcamento"/></td>
				</tr>
				<tr>
					<td><label>Status</label></td>
						<td>
							<select>
								  <option value="Analise">Em Analise</option>
								  <option value="ARealizada">Analise Realizada</option>
								  <option value="Iniciado">Inicido</option>
								  <option value="Planejado">Planejado</option>
								  <option value="Andamento">Em andamento</option>
								  <option value="Encerrado">Encerrado</option>
								  <option value="Cancelado">Cancelado</option>
							</select>
						</td>				
				</tr>
				<tr>
					<td><label>Risco</label></td>
						<td>
							<select>
								  <option value="Alto">Alto</option>
								  <option value="Médio">Medio</option>
								  <option value="Baixo">Baixo</option>
							</select>
						</td>
				</tr>
				<tr>
					<td><input type="submit" value="Submite"/></td>
				</tr>
			</table>
		</form:form>		
	</div>	
</body>
</html>