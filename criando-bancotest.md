# Criando um banco de dados no MySQL

Query - é uma lista de operações

- Criar o banco na conexão

`create database nomedobanco` 

(O ⚡ executa as instruções da query.)

- Selecionar o banco após a criação

`use nomedobanco`

- Após selecionar o banco, criaremos a tabela, seus campos (colunas) e sua chave primaria:

`create table nomedatabela(
  codigo int(4) auto_increment,
  nome varchar(30) not null,
  email varchar(50) not null,
  primary key(codigo)
  );`

- Após criação da tabela e dos campos, podemos alimentar os campos:

`insert into nomedatabela(
  nome,
  email
) values (
  "fiat",
  "fiat@fiat.com"
);`


## Comando SELECT
- É possivel visualizar o que foi inserido:
`SELECT * FROM bancotest.fornecedores;`

- Podemos selecionar os campos também para visualização
`SELECT nome FROM bancotest.fornecedores`

- Podemos selecionar mais de um campo:
`select modelo, ano from bancotest.carros`

- Podemos visualizar a tabela organizada de forma crescente
`select * from bancotest.carros order by modelo asc`

- Podemos visualizar a tabela organizada de forma decrescente
`select * from bancotest.carros order by modelo desc`

## Chave estrangeira
- para a adição da chave estrageira é necessário criar uma nova tabela, criar um campo no qual será inserido a relação, e por fim definir esse campo como FOREIGN KEY referenciando a outra tabela, no qual a PRIMARY KEY será a relação.

`CREATE TABLE books (
  id INT (4) AUTO_INCREMENT PRIMARY KEY,
  titulo VARCHAR(50),
  ano INT(4),
  idAuthor INT(4),
  FOREIGN KEY (idAuthor) REFERENCES author(id)
);`
