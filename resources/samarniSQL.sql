create database PI2_OTICA ;
use PI2_OTICA ;
create user OTICA@localhost identified by '1234' ;
grant all privileges on PI2_OTICA.* to 'OTICA'@'localhost' ;

CREATE TABLE if not exists CLIENTE ( 
 cod_cli smallint auto_increment PRIMARY KEY,
 cpf_cli varchar(11),
 nome_cli varchar(30) NOT NULL ,
 endereco_cli varchar(50),
 cidade_cli varchar(30),
 uf_cli varchar(2),
 fone_cli varchar(15),
 observacao_cli varchar(60) 
);

CREATE TABLE if not exists FORNECEDOR ( 
 cod_for smallint auto_increment PRIMARY KEY,
 cnpj_for varchar(14),
 nome_for varchar(30) NOT NULL ,
 endereco_for varchar(50),
 cidade_for varchar(30),
 uf_for varchar(2),
 fone_for varchar(15),
 observacao_for varchar(60) 
);

CREATE TABLE if not exists TIPO_COLABORADOR ( 
 tipo_colab varchar(3) NOT NULL PRIMARY KEY,
 nome_tipocolab varchar(30) NOT NULL,
 observacao_tipocolab varchar(60) 
 );