<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Cadastro Da Empresa</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="main.css">
    <script src="main.js"></script>
</head>
<body>
    <h1>Formulario: Novo Membro</h1>
    <form action="visualizaMembro.html?idSede=${idSede}" method="POST">
        <label>Nome: <input type="text" name="nome"/></label><br>
        <label>Funcao: <input type="text" name="funcao"/></label><br>
        <label>Email: <input type="text" name="email"/></label><br>
        <label>Entrada: <input type="text" name="entrada"/></label><br>
        <label>Saida: <input type="text" name="saida"/></label><br>
        <input type="submit">
        <input type="reset" >
        <input type="button" onclick="location.href='verSede.html?idSede=${idSede}'" value="Voltar"/> 
   
    </form>
</body>
</html>