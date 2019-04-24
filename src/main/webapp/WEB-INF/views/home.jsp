<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Home</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="main.css">
    <script src="main.js"></script>
</head>
<body>
    <h1>Menu Inicial: Lista de Sedes da Companhias</h1>
    <ol>
        <c:forEach var="sede" items="${sedes}">
            <li value="${sede.id}"><a href="verSede.html?idSede=${sede.id}">${sede.nome}</a> - <a href="deletarSede.html?idSede=${sede.id}">Deletar</a> - <a href="editarSede.html?idSede=${sede.id}">Editar</a></li>   
        </c:forEach>
    </ol>
    <input type="button" onclick="location.href='novaSede.html'" value="Nova Sede"/><br> 
    

    
</body>
</html>