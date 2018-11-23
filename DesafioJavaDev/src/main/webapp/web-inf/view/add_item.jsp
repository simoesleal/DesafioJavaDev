<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="academy.learnprogramming.util.AttributeNames" %>
<html>
<head>
	<title>Add Items</title>
</head>
<body>
	<div align="center">
		<form:form method="POST" modelAttribute="${AttributeNames.ITEM}">
			<table>
				<tr>
					<td><label>ID</label></td>
					<td>
						<form:input path="id" disable="true" />	
					</td>
				</tr>
				<tr>
					<td><label>Title</label></td>
					<td><form:input path="title"/></td>
				</tr>
				<tr>
					<td><label>DeadLine</label></td>
					<td><form:input path="deadLine"/></td>
				</tr>
				<tr>
					<td><label>Details</label></td>
					<td><form:textarea path="details"/></td>
				</tr>
				<tr>
					<td><input type="submit" value="Submite"/></td>
				</tr>
			</table>
		</form:form>		
	</div>	
</body>
</html>