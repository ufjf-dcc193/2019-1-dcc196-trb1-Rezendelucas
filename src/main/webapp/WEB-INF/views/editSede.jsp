<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Atualizar Sede</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="main.css">
    <script src="main.js"></script>
</head>
<body>
    <h1>Formulario: Editar Sede</h1>
    <form action="sedeEditada.html?idSede=${sede.id}" method="POST">
        <label>Nome: <input type="text" value="${sede.nome}" name="nome"/></label><br>
        <label>Estado Ferativo: <input type="text" value="${sede.estado}" name="estado"/></label><br>
        <label>Cidade: <input type="text" value="${sede.cidade}" name="cidade"/></label><br>
        <label>Bairro: <input type="text" value="${sede.bairro}" name="bairro"/></label><br>
        <label>Telefone: <input type="text" value="${sede.telefone}" name="telefone"/></label><br>
        <label>Email: <input type="text" value="${sede.email}" name="email"/></label><br>
        <input type="submit">
        <input type="reset" >
        <input type="button" onclick="location.href='index.html'" value="Voltar"/> 
    </form>
</body>
</html>