<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<tags:template titulo="Cadastro de Bebida">
	
	<h1>Cadastro de Orçamento</h1>
	
	<c:if test="${not empty msg }">
		<div class="alert alert-success">
			${msg}
		</div>
	</c:if>
	
	<form action="cadastrar" method="post">
		<div class="form-group">
			<label for="id-valor">Valor</label>
			<input type="text" name="valor" class="form-control" id="id-valor">
		</div>
		<div class="form-group">
			<label for="id-data">Data</label>
			<input type="text" name="data" class="form-control" id="id-data">
		</div>
		<div class="form-group">
			<label for="id-desc">Descricao</label>
			<input type="text" name="descricao" class="form-control" id="id-desc">
		</div>
		<input type="submit" value="Cadastrar" class="btn btn-primary">
	</form>
	
</tags:template>