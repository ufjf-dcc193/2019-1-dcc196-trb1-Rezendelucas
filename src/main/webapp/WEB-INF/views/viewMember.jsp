<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>/membro: ${membro.nome}</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="main.css">
    <script src="main.js"></script>
</head>
<body>
        <li>id: ${membro.id}</li>
        <li>Nome: ${membro.nome}</li>
        <li>Função: ${membro.funcao}</li>
        <li>E-mail: ${membro.email}</li>
        <li>Entrada: ${membro.entrada}</li>
        <li>Saida: ${membro.saida}</li>
        <input type="button" onclick="location.href='verSede.html?idSede=${idSede}'" value="Voltar para Sede"/><br>
</body>
</html>