-- criação de bancos de dados()
create database  teste

--abrindo um banco de dados
use teste

--criando uma tabela 
CREATE TABLE CLIENTE (
COD_CLI INT PRIMARY KEY NOT NULL,
NOME VARCHAR (50),
SOBRENOME VARCHAR (50),
)

--adicionando um novo campo
alter table CLIENTE add telefone VARCHAR(20)


--excluindo uma tabela 
drop table CLIENTE

--apagando o banco de dados
use master
drop database teste
