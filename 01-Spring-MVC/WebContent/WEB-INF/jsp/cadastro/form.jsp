<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Veículo</title>
</head>
<body>
	<h1>Cadastro de Veículo</h1>
	<form action="enviar" method="post">
		<div>
			<label for="idPlaca">Placa</label> <input type="text" id="idPlaca"
				placeholder="placa" name="placa">
		</div>
		<div>
			<label for="idPreco">Preço</label> <input type="text" id="idPreco"
				placeholder="preco" name="preco">
		</div>
		<div>
			<input type="checkbox" name="automatico" id="idAutomatico"> 
			<label for="idAutomatico">Automático</label>
		</div>
		<div>
			<select name="marca">
				<option value="ford" selected>Ford</option>
				<option value="fiat">Fiat</option>
				<option value="tesla">Tesla</option>
			</select>
		</div>
		<div>
			<input type="submit" value="Ok">
		</div>

	</form>
</body>
</html>