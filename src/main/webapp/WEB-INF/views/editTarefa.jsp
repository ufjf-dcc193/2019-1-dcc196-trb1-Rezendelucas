<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Atualizar Atividade</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="main.css">
    <script src="main.js"></script>
</head>
<body>
    <h1>Formulario: Editar Atividade</h1>
    <form action="tarefaEditada.html?idTarefa=${tarefa.id}&idSede=${sede.id}" method="POST">
        <label>titulo: <input type="text" value="${tarefa.titulo}" name="titulo"/></label><br>
        <label>Descricao: <input type="text" value="${tarefa.descricao}" name="descricao"/></label><br>
        <label>Inicio: <input type="text" value="${tarefa.inicio}" name="inicio"/></label><br>
        <label>Fim: <input type="text" value="${tarefa.fim}" name="fim"/></label><br>
        <label>Total: <input type="text" value="${tarefa.total}"  name="total"/></label><br>
        <select id="cbCategoria" name="categoria">  
            <option value="${tarefa.categoria}">${tarefa.categoria}"</option>
            <option value="ASSISTENCIAL">ASSISTENCIAL</option>
            <option value="JURIDICO">JURIDICO</option>
            <option value="FINANCEIRA">FINANCEIRA</option>
            <option value="EXECULTIVO">EXECULTIVO</option>
        </select>
     
        <input type="submit">
        <input type="reset" >
        <input type="button" onclick="location.href='verSede.html?idSede=${sede.id}'" value="Voltar"/> 
    </form>
</body>
</html>