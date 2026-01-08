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

select * from praticante;

create database aula;
use aula;
create table pessoa(
ID		INTEGER,
NOME	VARCHAR (50),
CPF		VARCHAR (15),
IDADE	INTEGER
);

INSERT INTO praticante (cpf, nome, email, idade, plano) VALUES ('12312', '12312', '13213', '23', '12321');

SELECT ID, NOME FROM praticante
WHERE NOME LIKE '12312';
