<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Sede : ${sede.nome} </title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="main.css">
    <script src="main.js"></script>
</head>
<body>
   <li>Nome: ${sede.nome}</li>
   <li>UnidadeFedativa: ${sede.estado}</li>
   <li>Cidade: ${sede.cidade}</li>
   <li>Bairro: ${sede.bairro}</li>
   <li>Telefone: ${sede.telefone}</li>
   <li>Email: ${sede.email}</li>
   <input type="button" onclick="location.href='index.html'" value="Ver Sedes"/><br>
   

   <h1>Membros:</h1>
   <ol>
       <c:forEach var="membro" items="${membros}">
           <li value="${membro.id}"><a href="verMembro.html?idMembro=${membro.id}&idSede=${sede.id}">${membro.nome}</a> - <a href="deletarMembro.html?idMembro=${membro.id}&idSede=${sede.id}">Deletar</a> - <a href="editarMembro.html?idMembro=${membro.id}&idSede=${sede.id}">Editar</a></li>   
       </c:forEach>
   </ol>
   <input type="button" onclick="location.href='novoMembro.html?idSede=${sede.id}'" value="Add Membros"/> 

<br>
--------------------------------------------------------------------------------------------------

   <h1>Tarefas:</h1>
   <ol>
       <c:forEach var="tarefa" items="${tarefas}">
           <li value="${tarefa.id}"><a href="verTarefa.html?idTarefa=${tarefa.id}&idSede=${sede.id}">${tarefa.titulo}</a> - <a href="deletarTarefa.html?idTarefa=${tarefa.id}&idSede=${sede.id}">Deletar</a> - <a href="editarTarefa.html?idTarefa=${tarefa.id}&idSede=${sede.id}">Editar</a></li>   
       </c:forEach>
   </ol>
   <input type="button" onclick="location.href='novaTarefa.html?idSede=${sede.id}'" value="Add Tarefas"/> 
  
<br>   
--------------------------------------------------------------------------------------------------

   <h1>Soma das Categorias</h1>
   <h3>Assistencial:</h3>
   <li>${somaAS}h</li>
   <h3>Jurídica:</h3>
   <li>${somaJU}h</li>
   <h3>financeira:</h3>
   <li>${somaFI}h</li>
   <h3>executiva:</h3>
   <li>${somaEX}h</li>



</body>
</html>