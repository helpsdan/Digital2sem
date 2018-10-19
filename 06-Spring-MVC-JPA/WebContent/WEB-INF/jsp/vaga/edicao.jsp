<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<tags:template titulo="Edição de Vaga">

	<h1>Editar Vaga</h1>
	<c:url value="/vaga/editar" var="vaga" />
	<form:form action="${vaga }" method="post" commandName="vaga">
		<div class="form-group">
			<form:label path="data">Data</form:label>
			<form:input path="data" cssClass="form-control" />
		</div>
		<div class="form-group">
			<form:label path="titulo">Título</form:label>
			<form:input path="titulo" cssClass="form-control" />
		</div>
		<div class="form-group">
			<form:label path="modelo">Nível</form:label>
			<form:select path="modelo" cssClass="form-control">
				<form:options items="${modelos }" itemLabel="label" />
			</form:select>
		</div>
		<div class="form-group">
			<form:label path="salario">Salário</form:label>
			<form:input path="salario" cssClass="form-control" />
		</div>
		<div class="form-group">
			<form:label path="requisitos">Requisitos</form:label>
			<form:input path="requisitos" cssClass="form-control" />
		</div>
		<div class="form-group">
			<form:label path="empresa">Empresa</form:label>
			<form:select path="empresa.codigo" cssClass="form-control">
				<form:option value="0">Selecione</form:option>
				<form:options items="${empresas }" itemLabel="nome"
					itemValue="codigo" />
			</form:select>
			<form:errors path="empresa" />
		</div>
		<form:hidden path="codigo" />
		<input type="submit" value="Atualizar" class="btn btn-primary">
	</form:form>

</tags:template>