# Sistemas que gerenciam bancos de dados
Relacionais ou não relacionais

## Não relacional
- Tabelas que não possuem relação com outras tabelas
- São individualizadas
- São mais rápidas
- Falta de confiabilidade (consistencia nos dados)

## Relacional
- Consistente
- Mais lento por fazer a pesquisa em todas as tabelas relacionadas

# Estrutura de um Banco de Dados
Base de dados < Tabela < Registro < Coluna (datatype)
Banco de dados < Tabela < Linha < Campo

### Tabelas
- Em um banco de dados pode possuir 1 ou mais tabelas
- Utilizada para manter a organização dos dados
- Formada por registros (linhas)
- Formada por campos (Colunas)

### Registros
- Formada por linhas
- Cada linha é um registro de dado

### Campos
- São as colunas
- Define os tipos de informações que está sendo armazenado

## Estrutura dos tipos de dados
| DADO | TIPO|
|------|-----|
|Texto | VARCHAR(n)|
|Caractere| CHAR (n)|
|Data|DATE|
|Data e Hora|DATETIME|
|Inteiro|INT|
|Decimal|DECIMAL|
|Ponto flutuante|FLOAT|
|Ponto flutuanre de mais casas|DOUBLE|
|Booleano|BOOLEAN|

## MER - Modelo Entidade Relacional
- Quais são as tabelas ?
- Com quem elas se relacionam?

## DER - Diagrama Entidade Relacional
- Campos e tipos de cada tabela

## Tipos de relacionamentos
- 1,1
- 1,n
- n,n

### Exercicio
- Fazer um MER para um hortifrute
* Tabelas *
- produto
- funcionário
- cliente



