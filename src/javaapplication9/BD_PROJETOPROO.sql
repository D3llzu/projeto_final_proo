create database projetoproo;
use projetoproo;

create table funcionario(
id		INTEGER NOT NULL PRIMARY KEY auto_increment,
CPF		VARCHAR (14),
NOME	VARCHAR (60),
EMAIL	VARCHAR (40),
IDADE	INTEGER,
CARGO	varchaR (50),
SALARIO	DOUBLE (10,2)
);
create table praticante(
id		INTEGER NOT NULL PRIMARY KEY auto_increment,
CPF		VARCHAR (14),
NOME	VARCHAR (60),
EMAIL	VARCHAR (40),
IDADE	INTEGER,
PLANO	VARCHAR (50)
);