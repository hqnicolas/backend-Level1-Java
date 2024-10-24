---
marp: true
theme: venson
author: Ramon Venson
title: Extra 07 - Naming Conventions
footer: Disciplina de Backend - Professor Ramon Venson - SATC 2024
header: Extra 07 - Naming Conventions
---

<!-- 
_class: lead
-->

# Extra 07 - Naming Conventions

---

## O que são Naming Conventions?

* Naming conventions são padrões que definem como os nomes de variáveis, funções, classes e outros elementos de código devem ser escritos;
* Elas facilitam a leitura e a manutenção do código, promovendo consistência;
* Diferentes convenções são usadas em diferentes contextos, linguagens de programação e sistemas operacionais.

---

### Principais tipos de Naming Conventions

![bg right 120%](https://images.ctfassets.net/jicu8fwm4fvs/6t7sQCGGSXHSpdrIqlS6hY/744d6c0e3da61c6cb9be46528d7838c2/blog-hero-naming-conventions-_thumbnail-1200x675.png)

1. **PascalCase**  
2. **camelCase**  
3. **snake_case**  
4. **kebab-case**  
5. **SCREAMING_SNAKE_CASE**  
6. **Hungarian Notation**  
7. **Train-Case**  
8. **Flatcase**

---

## PascalCase

* Cada palavra começa com letra maiúscula, sem separadores.
* **Exemplo**: `MyClass`, `UserController`
* **Uso comum**: Nomeação de classes e tipos em linguagens como C#, Java e TypeScript.

---

## camelCase

* A primeira palavra é em minúscula, e as subsequentes começam com maiúscula.
* **Exemplo**: `myVariableName`, `getUserData`
* **Uso comum**: Nomeação de variáveis e funções em linguagens como JavaScript, Java, e Swift.

---

## snake_case

* As palavras são todas em minúsculas e separadas por underscores (`_`).
* **Exemplo**: `my_variable_name`, `get_user_data`
* **Uso comum**: Utilizado em Python para funções e variáveis, e em nomes de arquivos.

---

## kebab-case

* As palavras são em minúsculas e separadas por hifens (`-`).
* **Exemplo**: `my-variable-name`, `get-user-data`
* **Uso comum**: Muito utilizado em nomes de classes CSS e URLs.

---

## SCREAMING_SNAKE_CASE

* Igual ao `snake_case`, mas todas as letras são maiúsculas.
* **Exemplo**: `MY_CONSTANT_NAME`, `API_KEY`
* **Uso comum**: Usado para constantes em linguagens como C, C++ e Python.

---

## Hungarian Notation

* Usa prefixos para indicar o tipo ou propósito da variável.
* **Exemplo**: `strName` (string), `intAge` (inteiro)
* **Uso comum**: Bastante utilizado em linguagens mais antigas, como Visual Basic e C.

---

## Train-Case

* As palavras são separadas por hifens, mas com cada palavra começando em maiúscula.
* **Exemplo**: `My-Variable-Name`
* **Uso comum**: Menos comum, pode aparecer em alguns casos específicos.

---

## Flatcase

* Todas as letras são minúsculas, sem espaços ou separadores.
* **Exemplo**: `myvariablename`
* **Uso comum**: Geralmente usado em sistemas compactos ou em nomes de arquivos.

---

## Onde as Naming Conventions são usadas?

| Convenção | Linguagens/Sistemas | Contexto de Uso |
|---|---|---|
| **PascalCase** | C#, Java, TypeScript | Classes, Tipos, e métodos em frameworks e APIs  |
| **camelCase**  | JavaScript, Swift, Java  | Variáveis e funções |
| **snake_case** | Python, C, Ruby | Funções, variáveis, nomes de arquivos |

---

| Convenção | Linguagens/Sistemas | Contexto de Uso |
|---|---|---|
| **kebab-case** | CSS, HTML, URLs | Classes CSS, Nomes de arquivos web |
| **SCREAMING_SNAKE_CASE** | C, Python, Ruby  | Constantes |
| **Hungarian Notation** | C, Visual Basic  | Indicação de tipos em variáveis |
| **Flatcase** | Arquivos compactados | Nomes de arquivos e URLs curtos |

---

## Outras convenções importantes

1. **Namespaces**: Estrutura hierárquica usada em linguagens como C# para organizar classes e métodos em módulos.
   
2. **Nome de Arquivos e Pastas**: Sistemas operacionais têm suas próprias regras, como o uso de *underscores* ao invés de espaço para compatibilidade com Unix/Linux.

3. **Web Naming Conventions**: URLs usam kebab-case por questões de legibilidade e SEO.

---

## O que aprendemos hoje

* Diferentes tipos de naming conventions e exemplos;
* Onde e quando cada convenção é utilizada;
* A importância de seguir padrões para consistência e manutenção.