<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Page Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="main.css">
    <script src="main.js"></script>
</head>
<body>
        <li>Id: ${tarefa.id}</li>
        <li>Titulo: ${tarefa.titulo}</li>
        <li>Descrição: ${tarefa.descricao}</li>
        <li>Inicio: ${tarefa.inicio}</li>
        <li>Fim: ${tarefa.fim}</li>
        <li>Total: ${tarefa.total}</li>
        <li>Categoria: ${tarefa.categoria}</li>
        <input type="button" onclick="location.href='verSede.html?idSede=${idSede}'" value="Voltar para Sede"/><br>

</body>
</html>