<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<tags:template titulo="Edição de Orçamento">
	
	<h1>Editar Orçamento</h1>
	
	<c:url value="/orcamento/editar" var="orc"/>
	<form:form action="${orc }" method="post" commandName="orcamento">
		<div class="form-group">
			<form:label path="valor">Valor</form:label>
			<form:input path="valor" cssClass="form-control"/>
		</div>
		<div class="form-group">
			<form:label path="data">Data</form:label>
			<form:input path="data" cssClass="form-control"/>
		</div>
		<div class="form-group">
			<form:checkbox path="aprovado"/>
			<form:label path="aprovado">Aprovado</form:label>
		</div>
		<form:hidden path="codigo"/>
		<input type="submit" value="Atualizar" class="btn btn-primary">
	</form:form>
	
</tags:template>