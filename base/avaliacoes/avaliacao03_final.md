# Avaliação 03 - Projeto Final

> Atenção! Este documento é uma versão preliminar e está sujeito a alterações.

## Resumo

A avaliação `N3` consiste no design e implementação de uma API RESTful para processamento de requisições de um cliente HTTP.

A aplicação deverá processar operações de leitura, criação, atualização e exclusão de dados para pelo menos três recursos diferentes, persistindo os dados em uma base de dados.

O projeto deverá ser desenvolvido em grupo de até 3 pessoas e compartilhado em um repositório público no GitHub ou Gitlab. A apresentação do projeto será realizada em sala de aula.

## Objetivos

* Avaliar a capacidade de desenvolvimento e implantação de uma aplicação de backend;
* Desenvolver a capacidade de autonomia através da construção de um projeto com diferentes etapas do processo de desenvolvimento de software;
* Oferecer uma auto-avaliação individual prática para o estudante;
* Avaliar a capacidade de trabalho em grupo e comunicação;

## Temas

Cada grupo escolhe e desenvolve um projeto dentro do escopo do tema escolhido, que é obrigatório. Os exemplos de aplicações são apenas ilustrativos.

* `Mudanças Climáticas`: aplicações para visualização de dados ambientais, calculadora de emissões de carbono, monitoramento com sensores;
* `Saúde e Bem-estar`: Gerenciamento de medicamentos, mapeamento de atendimentos médicos, recomendações médicas;
* `Acesso à Educação`: *Math-system* para tutoria, repositórios educacionais, compartilhamento de dados públicos;
* `Agricultura e Segurança Alimentar`: Marktplace para agricultura familiar, monitoramento de plantações, mapeamento de desperdício alimentar;
* `Engajamento Comunitário`: *Match-system* para voluntários, gerenciamento de donativos, mapeamento de abrigos;

## Requisitos Obrigatórios

Os requisitos obrigatórios são aqueles que devem ser implementados para que a avaliação seja considerada para avaliação:

* A aplicação implementa um serviço para processamento de requisições de um cliente HTTP;
* O projeto foi apresentado por todos os integrantes do grupo em sala de aula;
* O código-fonte do projeto está disponível em um repositório público no GitHub ou Gitlab
* O projeto foi desenvolvido inteiramente pelos integrantes do grupo;

## Requisitos Incrementais

Os requisitos incrementais são aqueles que devem ser implementados integralmente para que a nota máxima seja atribuída:

* A aplicação implementa rotas para pelo menos três recursos distintos e relacionados entre si, cada um contendo operações de leitura, escrita, atualização e exclusão;
* A arquitetura da aplicação é baseada em camadas, possuindo clara distinção e preservando as responsabilidades entre *controllers*, *services*, *repositories* e *models*;
* A aplicação sincroniza as operações efetuadas em um banco de dados persistente usando o padrão *Repository*;
* Todos os dados enviados no corpo de requisições são validados e tratados de acordo com as regras de negócio em um DTO (Data Transfer Object) isolado do modelo de domínio;
* Todas as respostas possuem um código de status HTTP apropriado e um corpo de resposta formatado em JSON;
* Todas as rotas da aplicação retornam erros de maneira clara e amigável, com o código de status HTTP apropriado e um objeto de erro formatado em JSON;
* O projeto pode ser executado de maneira simples usando o comando `docker compose up --build`, incluindo todos os demais serviços necessários para a execução do projeto;
* O projeto possui um arquivo `README.md` com instruções claras para a execução do projeto, incluindo exemplos de requisições e respostas para todas as rotas da aplicação (pode ser automatizado com o [Swagger](https://swagger.io/));
* Todas as variáveis necessárias para a execução do projeto podem ser configuradas através de variáveis de ambiente;
* O projeto propõe uma solução viável para o tema proposto e apresenta regras de negócio para além da implementação de um CRUD (*Create, Read, Update, Delete*);

## Requisitos Opcionais

Os requisitos opcionais são aqueles que podem ser implementados para melhorar a qualidade do projeto e a nota da avaliação, mas não são obrigatórios para a aprovação.

* A maioria das rotas da aplicação é protegida por um mecanismo de autenticação, exigindo um token de acesso válido;
* A aplicação foi implantada em um servidor de produção e está disponível em um servidor de público na Internet;
* Os métodos implementados na camada de serviço possuem cobertura de pelo menos 80% em testes unitários;
* A aplicação está integrado a uma API de terceiros, sendo capaz de reconhecer exceções (quando a API não estiver disponível);
* O projeto possui CICD configurado para a execução de testes, compilação e geração da imagem Docker;

## Organização do Repositório

O código fonte do projeto deve estar organizado da seguinte forma:

* `src`: pasta com o código-fonte da aplicação;
* `Dockerfile`: arquivo de configuração da imagem Docker;
* `docker-compose.yml`: arquivo de configuração do Docker Compose;
* `README.md`: arquivo de instruções de execução do projeto;
* `AUTHORS.md`: arquivo com os nomes completos dos autores do projeto, um por linha;

## Nota Final

O projeto final sera avaliado com a nota de `0,0` a `10,0`, de acordo com os critérios anteriores. Todos os critérios possuem o mesmo peso.

## Apresentação

O projeto deverá ser apresentado por **todos os componentes do grupo**, que deverão demonstrar o funcionamento da aplicação e conhecimento da implementação. A apresentação deverá ter até **20 minutos** e deverá levar em consideração as três etapas:

* `Apresentação do Domínio`: apresentação das entidades e dos casos de uso utilizados no projeto. Deve-se deixar claro em quais casos o projeto será útil;

* `Funcionamento da Aplicação`: demonstração do projeto em funcionamento, desde a execução. Deve-se realizar pelo menos uma requisição de cada verbo do CRUD;

* `Arquitetura`: Deverá ser demonstrado a arquitetura da aplicação, compreendendo o código e a persistência de dados.

## Entrega

Um dos integrantes da equipe deverá realizar a postagem do endereço online do repositório git até a data informada pelo professor em sala de aula. O repositório deve ser estar acessível ao professor.

Todas as modificações no projeto deverão ser realizadas até as datas abaixo:

| Turma 01 (2ª feira) | Turma 02 (3ª feira) | Turma 03 (4ª feira)| Turma 04 (5ª feira) |
| :---: | :---: | :---: | :---: |
| 25/11 | 26/11 | 27/11 | 28/11 |

## Considerações Finais

* Projetos que não atendam aos requisitos obrigatórios não serão avaliados.
* Projetos fora dos critérios relacionados pelo professor em sala de aula serão **descontados** ou **invalidados** automaticamente, incluindo:
  * Projetos postados fora do prazo;
  * Projetos sem relação com o enunciado da atividade;
  * Projetos que não podem ser executados pela falta de dependências e/ou configuração;
* A **cópia comprovada** do projeto resulta no desconto automático na nota final do estudante, o que inclui:
  * Projetos copiados de outros projetos (online ou de colegas);
  * Projetos não realizados pelos integrantes do grupo;
  * Projetos com código fonte gerado completamente por inteligência artificial.
