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
    <h1>Formulario: Nova Tarefa</h1>
    <form action="visualizaTarefa.html?idSede=${idSede}" method="POST">
        <label>titulo: <input type="text" name="titulo"/></label><br>
        <label>Descricao: <input type="text" name="descricao"/></label><br>
        <label>Inicio: <input type="text" name="inicio"/></label><br>
        <label>Fim: <input type="text" name="fim"/></label><br>
        <label>Total: <input type="text" name="total"/></label><br>
        <select id="cbCategoria" name="categoria">  
            <option value="">Select...</option>
            <option value="ASSISTENCIAL">ASSISTENCIAL</option>
            <option value="JURIDICO">JURIDICO</option>
            <option value="FINANCEIRA">FINANCEIRA</option>
            <option value="EXECULTIVO">EXECULTIVO</option>
        </select> 
        <br>
        <input type="submit">
        <input type="reset" >
        <input type="button" onclick="location.href='verSede.html?idSede=${idSede}'" value="Voltar"/> 
    
    </form>
</body>
</html>