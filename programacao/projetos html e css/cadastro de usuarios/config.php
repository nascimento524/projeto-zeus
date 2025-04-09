<?php

$dbHost = 'localhost';
$dbUsername = 'root';
$dbPassword = '3312';
$dbName = 'formulario_joao';

$conexão = new mysqli($dbHost,$dbUsername,$dbPassword,$dbName);

header("Location: artigo.html#dadosCadastrados");

if ($conexao->connect_errno)
{
    echo "erro";
}
else
{
    echo "conexão feita com sucesso";
}
?>