# Avaliação 02 - Projeto Intermediário

## Metodologia

A avaliação `N2` consiste no design e codificação de um projeto web service contendo processamento de requisições de um cliente HTTP. O projeto deve ser desenvolvido de forma individual.

## Objetivos

* Avaliar a capacidade de desenvolvimento de um projeto completo;
* Desenvolver a capacidade de autonomia através da construção de um projeto com tema aberto ou semi-aberto;
* Oferecer uma auto-avaliação individual prática para o estudante;

## Requisitos Obrigatórios:

* Deve ser um projeto de web service que recebe e responde requisições HTTP no formato JSON;
* Deve ser executado, por padrão, na porta `8080`;
* Deve conter pelo menos um `controller` e um `service` no código-fonte;
* Deve conter uma rota `GET` para consultas (apenas leitura) e uma rota `POST` que recebe dados pelo corpo da mensagem;
* Deve utilizar dados externos (API ou Arquivos) que serão processados pelo serviço para a geração das respostas HTTP;
* Todas as rotas devem realizar algum tipo de tratamento nos dados recebidos do cliente e do serviço externo;
* Devem possuir um `Dockerfile` e um `docker-compose.yml` que permita a execução do projeto em um container Docker autosuficiente.
* O corpo das mensagens HTTP deve manipular o formato JSON;
* O `README.md` deve conter instruções claras para a execução do projeto, além da **descrição das rotas e exemplos** de requisições e respostas;
* Deverá conter ainda uma denominada: `/sobre`, que deverá responder com conteúdo **EXATAMENTE** no seguinte formato:

````json
"estudante": "seu nome",
"projeto": "nome do projeto"
````

### Sugestões de Temas

* Serviço de localização: (consulta distâncias, converte coordenadas...)
* Missões para um jogo MMORPG: (consulta quests, recebe dicas...)
* Marketplace (consulta aplicativos, avalia, pesquisa itens...)
* Placar de jogos (consulta jogos em andamento, marca jogos favoritos)
* Quiz (pesquisa perguntas, responde perguntas e recebe respostas...)
* Enquetes (cria enquetes, compartilha links, vota em enquetes...)
* Encurtador de Links (cria links compartilháveis, retorna endereço real...)
* Chat (consulta histórico do chat, envia mensagens...)
* Serviço de meteorologia (converte previsão do tempo para mensagens...)

## Critérios de Avaliação

* **Funcionalidade**: o projeto serve seu propósito? Todas as rotas são bem definidas e implementadas corretamente?
* **Integração**: o projeto está integrado a uma API de terceiros, sendo capaz de reconhecer exceções (quando a API não estiver disponível).
* **Organização**: o projeto está bem organizado e contém um arquivo `README.md` explicando seu funcionamento? O código está bem organizado?
* **Criatividade e Inovação**: o projeto demonstra iniciativa e originalidade na sua implementação?

## Nota Final

O projeto final sera avaliado com a nota de `0,0` a `10,0`, de acordo com os critérios anteriores. Todos os critérios possuem o mesmo peso.

## Entrega

O estudante deverá realizar a postagem do endereço online de um repositório git até a data informada pelo professor em sala de aula. O repositório deve ser estar acessível ao professor.

A entrega é individual.

Todas as modificações no projeto deverão ser realizadas até as datas abaixo:

| Turma 01 (2ª feira) | Turma 02 (3ª feira) | Turma 03 (4ª feira)| Turma 04 (5ª feira) |
| :---: | :---: | :---: | :---: |
| 30/09 | 01/10| 02/10 | 03/10 |

## Considerações Finais

* O projeto deve ser feito individualmente por cada estudante
* Projetos fora dos critérios relacionados pelo professor em sala de aula serão **descontados** automaticamente, incluindo:
  * Projetos postados fora do prazo;
  * Projetos sem relação com o enunciado da atividade;
  * Projetos que não podem ser executados corretamente;
* A **cópia comprovada** do projeto resulta no desconto automático na nota final do estudante, o que inclui:
  * Projetos copiados de outros projetos;
  * Projetos não realizados pelo estudante;
  * Projetos com código fonte gerado por inteligência artificial.
