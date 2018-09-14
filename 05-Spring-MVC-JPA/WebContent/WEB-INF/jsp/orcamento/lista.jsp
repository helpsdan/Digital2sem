<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<tags:template titulo="Lista de Or�amentos">

	<h1>Lista de Or�amentos!</h1>

	<c:if test="${not empty msg }">
		<div class="alert alert-success">
			${msg }
		</div>
	</c:if>
	
	<table class="table">
		<tr>
			<th>C�digo</th>
			<th>Valor</th>
			<th>Data</th>
			<th>Aprovado</th>
			<th></th>
		</tr>
		<c:forEach var="orcamento" items="${orcamento }">
			<tr>
				<td>${orcamento.codigo }</td>
				<td>R$${orcamento.valor}</td>
				<td>
					<fmt:formatDate value="${orcamento.data.time }"
						pattern="dd/MM/yyyy"/>
				</td>
				<c:choose>
				<c:when test="${orcamento.aprovado }">
					<td>Aprovado</td>
				</c:when>
				<c:otherwise>
					<td>Negado</td>
				</c:otherwise>
			</c:choose>
				<td>
					<a class="btn btn-outline-primary btn-sm" href="<c:url value="/orcamento/editar/${orcamento.codigo }"/>">Editar</a>
					<!-- Button trigger modal -->
					<button onclick="codigoOrcamento.value = ${orcamento.codigo}" type="button" class="btn btn-outline-danger btn-sm" data-toggle="modal" data-target="#exampleModal">
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
        <h5 class="modal-title" id="exampleModalLabel">Confirma��o</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        Tem certeza do que est� fazendo?
      </div>
      <div class="modal-footer">
      	<c:url value="/orcamento/remover" var="a"/>
      	<form action="${a }" method="post">
      		<input type="hidden" name="codigo" id="codigoOrcamento" >
	        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
	        <button type="submit" class="btn btn-primary">Excluir</button>
        </form>
      </div>
    </div>
  </div>
</div>

</tags:template>