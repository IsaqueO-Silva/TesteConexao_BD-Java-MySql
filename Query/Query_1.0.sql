create database db_teste;

create table tb_teste
(
    id int primary key auto_increment,
    nome varchar(80) not null,
    fone varchar(50),
    email varchar(50) unique,
    idade int not null
    
);

