<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="academy.learnprogramming.util.Mappings" %>
<html>
<head>
	<title>Teste Java Application</title>
</head>
<body>
	<div align="center">
		<c:url var="itemLink" value="${Mappings.PROJETOS}"/>
		<h2><a href="${itemLink}">Meus Projetos</a></h2>
	</div>	
	<div align="center">
		<c:url var="itemLinkPessoa" value="${Mappings.PESSOAS}"/>
		<h2><a href="${itemLinkPessoa}">Lista de Pessoas</a></h2>
	</div>		
	<div align="center">
		<c:url var="itemLinkItem" value="${Mappings.ITEMS}"/>
		<h2><a href="${itemLinkItem}">Itens</a></h2>
	</div>		
</body>
</html>