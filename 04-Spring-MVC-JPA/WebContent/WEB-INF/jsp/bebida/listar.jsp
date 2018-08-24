<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<tags:template titulo="Cadastro de Bebida">
	<h1>Lista de Bebida</h1>
	<table class="table">
		<tr>
			<th>Código</th>
			<th>Nome</th>
			<th>Data de Validade</th>
			<th>Alcoólico</th>
			<th>Título</th>
		</tr>
		<c:forEach var="bebida" items="${bebidas }">
		<tr>
			<td>${bebida.codigo }</th>
			<td>${bebida.nome }</th>
			<td>
				<fmt:formatDate value="${bebida.validade.time }" pattern="dd/MM/yyyy"/></th>
			<c:choose>
				<c:when test="${bebida.alcoolico }">
					<td>Alcoólico</th>
				</c:when>
				<c:otherwise>
					<td>Sem Álcool</th>
				</c:otherwise>
			</c:choose>
					<td>
			<a href="<c:url value="/bebida/editar/${bebida.codigo }"/>">Editar</a>
					</td>
		</tr>
		</c:forEach>

	</table>
</tags:template>