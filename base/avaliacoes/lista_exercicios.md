---
marp: true
theme: venson
author: Ramon Venson
title: Exercícios da Disciplina
footer: Disciplina de Backend - Professor Ramon Venson - SATC 2024
header: Exercícios da Disciplina
---

<!-- 
_class: lead
-->

# Exercícios da Disciplina

---

<!--
paginate: true 
class: normal
-->

## Lista de Exercícios

* [Exercício 00](#exercício-00): Gerador de username
* [Exercício 01](#exercício-01): Recomendador de Filmes

---

## Exercício 00 <a id="exercicio00"></a>

### Objetivo

Criar um programa que gere nomes de usuário (usernames) baseados em dois nomes fornecidos pelo usuário e um número aleatório.

### Instruções

Desenvolva o programa em Java. Certifique-se de que o código está bem estruturado e que as instruções para o usuário estão claras. A entrada e saída de dados devem ser feitas exclusivamente via console.

---

### Especificações

#### Entradas (inputs)
O usuário fornecerá um nome e um sobrenome pelo console. Ex.: (`Ronaldo` e `Fenomeno`)

#### Saídas (outputs)
O programa exibirá um nome de usuário gerado automaticamente, combinando o nome fornecido com um número aleatório. Ex.: (`RonaldoFenomeno98`)

---

## Exercício 01 <a id="exercicio01"></a>

### Objetivo

Criar um programa que interaja com o usuário, faça duas perguntas, e recomende uma série, livro ou filme com base nas respostas fornecidas. O programa deverá fornecer pelo menos quatro recomendações diferentes.

### Instruções

Desenvolva o programa em Java. Certifique-se de que o código está bem estruturado e que as instruções para o usuário estão claras. A entrada e saída de dados devem ser feitas exclusivamente via console.

---

### Conjunto de dados (dataset) [opcional]
````
Homens de Preto, Arrival, Shrek, Gladiador
````

````
Pergunta 1: Que ambientação você prefere?
  1. Sci-fi
  2. Medieval

Pergunta 2: Que gênero você prefere?
  1. Comédia
  2. Drama
````

---

### Entradas (inputs)
O usuário responderá a cada pergunta digitando os números 1 ou 2 pelo console. Caso o número não esteja entre 1 e 2, o programa deve ser encerrado sem erros. Ex.: (`1` e `1`)

### Saídas (outputs)
O programa exibirá o nome de uma série, livro ou filme recomendado com base nas respostas. Ex.: (`Homens de Preto`)