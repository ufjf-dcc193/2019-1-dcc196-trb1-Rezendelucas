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

    <ol>
        <c:forEach var="sede" items="${sedes}">
            <li value="${sede.id}">${sede.nome}</li>   
        </c:forEach>
    </ol>

    <h1>Menu Inicial</h1>
    <a href="novaTarefa.html">novaTarefa</a><br>
    <a href="novoMembro.html">novoMembro</a><br>
    <a href="novaSede.html">novaSede</a><br>
</body>
</html>