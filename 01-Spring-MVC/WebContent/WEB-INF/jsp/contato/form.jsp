<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulário de Contato</title>
</head>
<body>
	<h1>Formulário de Contato</h1>
	<form action="enviar" method="post">
		<div>
			<label for="idNome">Nome</label>
			<input type="text" id="idNome" placeholder="nome" name="nome">
		</div>
		<div>
			<label for="idEmail">E-mail</label>
			<input type="text" id="idEmail" placeholder="e-mail" name="email">
		</div>
		<div>
			<label for="idTelefone">Telefone</label>
			<input type="text" id="idTelefone" placeholder="telefone" name="telefone">
		</div>
		<div>
			<input type="submit" value="Enviar">
		</div>
		
	</form>
</body>
</html>