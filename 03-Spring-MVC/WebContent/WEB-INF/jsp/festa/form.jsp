<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<tags:template titulo="Cadastro de Festa">
	<jsp:body>
	
		<c:if test="${not empty msg}">
		<div class="alert alert-sucess">
			${msg } 
		</div>
		</c:if>
		<div>
			<form action="cadastrar" method="post">
				<div class="form-group">
					<label for="id-qtd">Quantidade de Pessoas</label>
					<input type="text" name="qtd" id="id-qtd" class="form-control">
				</div>
				<div class="form-group">
					<label for="id-end">Endereço</label>
					<input type="text" name="end" id="id-end" class="form-control">
				</div>
				<div class="form-group">
					<input type="checkbox" name="lemb" id="id-lemb"> <label
							for="id-lemb">Lembrancinha</label>
				</div>
				<div class="form-group">			
					<label for="id-cardapio">Cardápio</label>
					<textarea rows="4" cols="50" class="form-control"></textarea>
				</div>
				<input type="submit" value="Enviar" class="btn btn-primary">
			</form>
		</div>
	</jsp:body>
</tags:template>