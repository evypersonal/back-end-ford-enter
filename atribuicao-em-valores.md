## Sinais de atribuição na pesquisa de banco

- valores iguais:
`select * from nomeTabela where valor=3000`

- valores diferentes:
`select * from nomeTabela where valor!=3000`

- valor maior que o número definido:
`select * from nomeTabela where valor>3000`

- valor menor que o número definido:
`select * from nomeTabela where valor<3000`

- valor entre dois números definidos:
`select * from nomeTabela where valor between 3000 and 5000`

select sum(nomeCampoValor) from nomeTabela
select min(nomeCampoValor) from nomeTabela
select max(nomeCampoValor) from nomeTabela
