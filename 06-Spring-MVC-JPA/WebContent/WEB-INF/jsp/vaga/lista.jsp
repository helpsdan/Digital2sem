<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<tags:template titulo="Lista de Vagas">

	<h1>Lista de Vagas!</h1>

	<c:if test="${not empty msg }">
		<div class="alert alert-success">
			${msg }
		</div>
	</c:if>
		
	<table class="table">
		<tr>
			<th>Código</th>
			<th>Data Limite</th>
			<th>Título</th>
			<th>Nível</th>
			<th>Salário</th>
			<th>Requisitos</th>
			<th>Empresa</th>
			<th></th>
			<th></th>
		</tr>
		<c:forEach var="vaga" items="${vaga }">
			<tr>
				<td>${vaga.codigo }</td>
				<td>
					<fmt:formatDate value="${vaga.data.time }"
						pattern="dd/MM/yyyy"/>
				</td>
				<td>${vaga.titulo }</td>
				<td>${vaga.modelo.label }</td>
				<td>R$${vaga.salario }</td>
				<td>${vaga.requisitos }</td>
				<td>${vaga.empresa.nome }</td>
				<td>
					<a class="btn btn-outline-primary btn-sm" href="<c:url value="/vaga/editar/${vaga.codigo }"/>">Editar</a>
					<!-- Button trigger modal -->
					<button onclick="codigoVaga.value = ${vaga.codigo}" type="button" class="btn btn-outline-danger btn-sm" data-toggle="modal" data-target="#exampleModal">
					  Excluir
					</button>
				</td>
			</tr>
		</c:forEach>
	</table>



<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Confirmação</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        Tem certeza do que está fazendo?
      </div>
      <div class="modal-footer">
      	<c:url value="/vaga/remover" var="a"/>
      	<form action="${a }" method="post">
      		<input type="hidden" name="codigo" id="codigoVaga" >
	        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
	        <button type="submit" class="btn btn-primary">Excluir</button>
        </form>
      </div>
    </div>
  </div>
</div>

</tags:template>