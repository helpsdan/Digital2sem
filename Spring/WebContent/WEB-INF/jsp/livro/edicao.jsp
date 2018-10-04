<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<tags:template titulo="Edicao de Bebida">
	<c:if test="${not empty msg}">
		<div class="alert alert-success">
			${msg }
		</div>
	</c:if>
	<c:url value="/livro/editar" var="edt"/>
	<form:form action="${edt }" method="post">
		<div class="form-group">
			<form:label path="titulo">Título</form:label>
			<form:input path="titulo" cssClass="form-control"/>
		</div>
		<div class="form-group">
			<form:label path="numeroPagina">Número de Páginas</form:label>
			<form:input path="numeroPagina" cssClass="form-control"/>
		</div>
		<div class="form-group">
			<form:checkbox path="sumario"/>
			<form:label path="sumario">Sumário</form:label>
		</div>
		<input type="submit" value="Editar" class="btn btn-primary"/>
	</form:form>
</tags:template>