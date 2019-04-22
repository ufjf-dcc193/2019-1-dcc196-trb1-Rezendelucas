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
    <h1>Formulario: Nova Sede</h1>
    <form action="verSede.html" method="POST">
        <label>Id: <input type="number" name="id"/></label><br>
        <label>Nome: <input type="text" name="nome"/></label><br>
        <label>Estado Ferativo: <input type="text" name="estado"/></label><br>
        <label>Cidade: <input type="text" name="cidade"/></label><br>
        <label>Bairro: <input type="text" name="bairro"/></label><br>
        <label>Telefone: <input type="text" name="telefone"/></label><br>
        <label>Email: <input type="text" name="email"/></label><br>
        <input type="submit">
        <input type="reset" >
        <input type="button" onclick="location.href='index.html'" value="Voltar"/> 
    </form>
</body>
</html>