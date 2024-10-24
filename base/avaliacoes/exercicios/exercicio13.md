# Exercício 13: Gerador de Jogador Web

## Objetivo

Crie um aplicativo web Spring Boot que permita a criação, acesso e deleção de jogadores e também salve as informações em um banco de dados.

## Instruções

* Crie duas rotas para inserir e listar jogadores
* Todas as entradas de dados devem ser validadas usando um DTO e o Jakarta Validation
* Todos os jogadores devem ser salvos em um banco de dados
* Deve-se criar um mapper para as conversões de dados


## Entradas (inputs)

````json
// POST /jogadores
{
  "nome": "Ronaldo",
  "apelido": "Fenômeno",
}

// GET /jogadores
- sem corpo -
````

## Saídas (outputs)

````json
// POST /jogadores
{
  "nome": "Ronaldo"
  "apelido": "Fenomeno",
  "habilidade": 100
}

// GET /jogadores
[
  { "nome": "Ronaldo" "apelido": "Fenomeno", "habilidade": 100 }
]
````