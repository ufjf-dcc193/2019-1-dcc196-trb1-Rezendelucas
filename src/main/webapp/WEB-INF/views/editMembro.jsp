<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Atualizar Membro</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="main.css">
    <script src="main.js"></script>
</head>
<body>
    <h1>Formulario: Editar Membro</h1>
    <form action="membroEditado.html?idMembro=${membro.id}&idSede=${sede.id}" method="POST"> 
        <label>Nome: <input type="text" value="${membro.nome}"name="nome"/></label><br>
        <label>Funcao: <input type="text" value="${membro.funcao}" name="funcao"/></label><br>
        <label>Email: <input type="text" value="${membro.email}" name="email"/></label><br>
        <label>Entrada: <input type="text" value="${membro.entrada}" name="entrada"/></label><br>
        <label>Saida: <input type="text" value="${membro.saida}" name="saida"/></label><br>
        <input type="submit">
        <input type="reset" >
        <input type="button" onclick="location.href='verSede.html?idSede=${sede.id}'" value="Voltar"/> 
   
    </form>
</body>
</html>