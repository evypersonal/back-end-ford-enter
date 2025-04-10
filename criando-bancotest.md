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

## Filtros na tabela
### filtrar uma quantidade especifica de resultado

`SELECT * FROM bancoteste.carros limit 2, 5`
* nesse caso ele pegará os indices após o id '2', e trazer os '5' após

### fazer um filtro através da primeira letra após selecionar o campo

`SELECT * FROM bancoteste.carros where placa like 'fi%'`
* nesse caso ele trará os resultados que começam com as iniciais 'fi', no campo 'placa'

### fazer um filtro através da última letra após selecionar o campo

`SELECT * FROM bancoteste.carros where placa like '%fi'`
* nesse caso ele trará os resultados que começam com os finais 'fi', no campo 'placa'

### fazer um filtro através de uma posição do caracter

`SELECT * FROM bancoteste.carros where placa like '______9%'`
* nesse caso ele irá ignorar a quantidade de 'undeline' nesse caso são 6, e na 7º posição ele trará com final '9'.

### fazer filtro na penúltima letra

`SELECT * FROM bancoteste.carros where placa like '%8_'`
* nesse caso ele irá filtrar quais dados possuem o '8' como penúltimo caracter

### apresentarna tabela apenas a quantidade de caracter que desejar

`SELECT left(carroceria, 3) from bancoteste.carros`
* nesse caso ele trará as 3 primeiras caracteres da esquerda para direita no campo 'carroceria'


