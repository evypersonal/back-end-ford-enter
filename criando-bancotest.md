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

- É possivel visualizar o que foi inserido:
`SELECT * FROM bancotest.fornecedores;`
