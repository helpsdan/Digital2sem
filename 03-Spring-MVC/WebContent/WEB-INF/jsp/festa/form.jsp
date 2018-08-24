<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<tags:template titulo="Cadastro de Festa">
	<h1>Cadastro de Festa</h1>
	
	<c:if test="${not empty msg }">
		<div class="alert alert-success">
			${msg }
		</div>
	</c:if>
	
	<form action="cadastrar" method="post">
		<div class="form-group">
			<label for="id-qtd">Quantidade de Pessoas</label>
			<input type="text" name="quantidade" class="form-control" id="id-qtd">
		</div>
		<div class="form-group">
			<label for="id-end">Endereço</label>
			<input type="text" name="endereco" class="form-control" id="id-end">
		</div>
		<div class="form-group">
			<input type="checkbox" name="lembrancinha" id="id-lem">
			<label for="id-lem">Lembrancinha</label>
		</div>
		<div class="form-group">
			<label for="id-car">Cardápio</label>
			<textarea rows="5" cols="50" class="form-control" 
				name="cardapio" id="id-car"></textarea>
		</div>
		<input type="submit" value="Cadastrar" class="btn btn-primary">
	</form>
</tags:template>