# Exercício 11: Gerador de Jogador Web

## Objetivo

Crie um aplicativo web Spring Boot que permita a criação e acesso de jogadores, utilizando DTOs e Java Records.

## Instruções

* Crie um novo projeto Spring Boot com dependência Web.
* Defina uma classe Record `JogadorRequestDTO` que representa os dados enviados na solicitação HTTP (`nome`, `apelido`).
* Defina outra classe Record `JogadorResponseDTO` que será enviada de volta na resposta HTTP (`nome`, `apelido`, `habilidade`, statusMessage).
* Implemente uma classe Controller que aceita um DTO `JogadorRequestDTO` via POST e retorna um `JogadorResponseDTO`.
* Implemente uma classe Service que recebe um `JogadorRequestDTO` e retorna um `JogadorResponseDTO`.
  * A habilidade do jogador deve ser um número aleatório entre 0 e 100 gerado por um método no service.
  * O jogador gerado deve ser armazenado em uma collection (ArrayList, por exemplo) no service;
  * O controller não deve manipular ou receber o modelo `Jogador`;
* Implemente um método no controller e no service que retorne todos os jogadores cadastrados;


## Entradas (inputs)

````json
{
  "nome": "Ronaldo",
  "apelido": "Fenômeno",
}
````

## Saídas (outputs)

````json
{
  "nome": "Ronaldo"
  "apelido": "Fenomeno",
  "habilidade": 100
}
````