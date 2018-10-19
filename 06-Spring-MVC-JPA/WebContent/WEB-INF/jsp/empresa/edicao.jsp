<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<tags:template titulo="Edição de Empresa">
	
	<h1>Editar Empresa</h1>
	
	<c:url value="/empresa/editar" var="emp"/>
	<form:form action="${emp }" method="post" commandName="empresa">
		<div class="form-group">
			<form:label path="nome">Nome</form:label>
			<form:input path="nome" cssClass="form-control"/>
		</div>
		<input type="submit" value="Atualizar" class="btn btn-primary">
	</form:form>
	
</tags:template>