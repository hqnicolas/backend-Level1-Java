# backend-Level1-Java

Neste repositório encontram-se todos os exercícios desenvolvidos durante o semestre na disciplina de back-end. Os exercicios foram propostos com o objetivo de aprender a desenvolver APIs utilizando a arquitetura REST utilizando a linguagem Java e o framework spring Boot.

Disciplina ministrada pelo professor Ramon Venson

"Ramon Venson" <ramon.venson@satc.edu.br>


# [Hello World!](https://github.com/hqnicolas/backend-Level1-Java/tree/main/Hello%20World)
- [exercicio00](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Hello%20World/exercicio00/src/main/java/org/example/Main.java) Hello World!
### [Gerador de Username](https://github.com/hqnicolas/backend-Level1-Java/blob/main/base/avaliacoes/exercicios/exercicio00.md)
- [exercicio01](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Hello%20World/exercicio01/src/main/java/org/example/Main.java) Criar nome de usuário

# [Projeto Intermediário N2](https://github.com/hqnicolas/backend-Level1-Java/tree/main/n2intermediario)
### Gerador de URL's Curtas
- [docker-compose.yml](https://github.com/hqnicolas/backend-Level1-Java/blob/main/n2intermediario/docker-compose.yml) Setup de Port Foward do container
- [Dockerfile](https://github.com/hqnicolas/backend-Level1-Java/blob/main/n2intermediario/Dockerfile) Configura os arquivos dentro do container
- [application.yml](https://github.com/hqnicolas/backend-Level1-Java/blob/main/n2intermediario/application.yml) Setup do Token Api e URL
- [Insomnia.json](https://github.com/hqnicolas/backend-Level1-Java/blob/main/n2intermediario/Insomnia_Shortener_Nicolas.json) Template para usar Insomnia
- [AboutShortener.java](https://github.com/hqnicolas/backend-Level1-Java/blob/main/n2intermediario/src/main/java/com/shortener/api/AboutShortener.java) Sobre o App
- [ApiApplication.java](https://github.com/hqnicolas/backend-Level1-Java/blob/main/n2intermediario/src/main/java/com/shortener/api/ApiApplication.java) Início da aplicação
- [AppConfig.java](https://github.com/hqnicolas/backend-Level1-Java/blob/main/n2intermediario/src/main/java/com/shortener/api/AppConfig.java) Configura um Template REST
- [CheckUrlRequest.java](https://github.com/hqnicolas/backend-Level1-Java/blob/main/n2intermediario/src/main/java/com/shortener/api/CheckUrlRequest.java) Consulta URL's geradas anteriormente
- [RestClient.java](https://github.com/hqnicolas/backend-Level1-Java/blob/main/n2intermediario/src/main/java/com/shortener/api/RestClient.java) Variáveis usadas
- [ShortenerController.java](https://github.com/hqnicolas/backend-Level1-Java/blob/main/n2intermediario/src/main/java/com/shortener/api/ShortenerController.java) Controle de criação de URL curta

# [Introdução ao Java N1](https://github.com/hqnicolas/backend-Level1-Java/tree/main/Intro)
### [Recomendador de Filmes](https://github.com/hqnicolas/backend-Level1-Java/blob/main/base/avaliacoes/exercicios/exercicio01.md)
- [exercicio02](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/exercicio02/src/main/java/org/example/Main.java) recomende uma série, livro ou filme
### [Gerador de Personagem](https://github.com/hqnicolas/backend-Level1-Java/blob/main/base/avaliacoes/exercicios/exercicio02.md)
- [exercicio03.0](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/exercicio03/src/main/java/org/example/Main.java) personagens de jogo usando classes
- [exercicio03.1](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/exercicio03/src/main/java/org/example/Personagem.java) classe chamada `Personagem` que implemente os atributos
### [Barcos e Portos](https://github.com/hqnicolas/backend-Level1-Java/blob/main/base/avaliacoes/exercicios/exercicio03.md)
- [exercicio04.0](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/exercicio04/src/main/java/org/example/Main.java) manipule barcos e portos usando classes
- [exercicio04.1](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/exercicio04/src/main/java/org/example/BasePorto.java) `BasePorto` contendo os `barcosAtracados`
- [exercicio04.2](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/exercicio04/src/main/java/org/example/PortoGrande.java) recebe um objeto `Barco` e `barcosAtracados`
- [exercicio04.3](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/exercicio04/src/main/java/org/example/PortoPequeno.java) recebe um objeto `Barco` e `barcosAtracados`
- [exercicio04.4](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/exercicio04/src/main/java/org/example/Barco.java) `Barco` contendo os atributos `nome` e `tamanho
### [Buscador de Músicas](https://github.com/hqnicolas/backend-Level1-Java/blob/main/base/avaliacoes/exercicios/exercicio04.md)
- [exercicio05.0](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/exercicio05/src/main/java/org/example/Main.java) Classe main do Aplicativo de música
- [exercicio05.1](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/exercicio05/src/main/java/org/example/MusicCloud.java)  `MusicCloud` com os atributos musicasDisponiveis
- [exercicio05.2](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/exercicio05/src/main/java/org/example/Musica.java) `Musica` com os atributos titulo e artista
- [exercicio05.3](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/exercicio05/src/main/java/org/example/Playlist.java) `Playlist` com os atributos nome e musicas
### [Ticket do Cinema](https://github.com/hqnicolas/backend-Level1-Java/blob/main/base/avaliacoes/exercicios/exercicio06.md)
- [exercicio06.0](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/exercicio06/src/main/java/org/example/Cinema.java) `Cinema`, adicione uma lista com ingressosVendidos
- [exercicio06.1](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/exercicio06/src/main/java/org/example/Cliente.java) `cliente`, implemente um POJO contendo os atributos nome e 'idade'.
- [exercicio06.2](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/exercicio06/src/main/java/org/example/Filme.java) `Filme`, adicione os atributos nome, preco, idadeMinima
- [exercicio06.3](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/exercicio06/src/main/java/org/example/Ingresso.java) Ingresso, adicione os atributos cliente, filme e assento
- [exercicio06.4](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/exercicio06/src/main/java/org/example/Main.java) classe chamada `Cliente`, `Cinema`, `Filme` e `Ingresso`
### [Controladores Web](https://github.com/hqnicolas/backend-Level1-Java/blob/main/base/avaliacoes/exercicios/exercicio07.md)
- [exercicio07.0](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/exercicio07/src/main/java/com/example/demo/MyController.java) Spring Boot usando o Spring Initializr
- [exercicio07.1](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/exercicio07/src/main/java/com/example/demo/NicolasApplication.java) entrada por query strings e retorne uma resposta
### [Tabela FIPE](https://github.com/hqnicolas/backend-Level1-Java/blob/main/base/avaliacoes/exercicios/exercicio08.md)
- [exercicio08.0](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/exercicio08/src/main/java/com/shortener/api/ApiApplication.java) Spring Boot usando o Spring Initializr.
- [exercicio08.1](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/exercicio08/src/main/java/com/shortener/api/RestClient.java) RestClient para fazer a requisição à [API da Tabela FIPE](https://deividfortuna.github.io/fipe/) 
- [exercicio08.2](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/exercicio08/src/main/java/com/shortener/api/TabelaFipeController.java) valor de tabela FIPE para esse carro
### [CyberSATC](https://github.com/hqnicolas/backend-Level1-Java/blob/main/base/avaliacoes/exercicios/exercicio09.md)
- [CyberSatc.md](https://github.com/hqnicolas/backend-Level1-Java/tree/main/Intro/exercicio09) Simpósio de Segurança Cybernética CyberSATC 2024

### [Api Rest Crude](https://github.com/hqnicolas/backend-Level1-Java/blob/main/base/avaliacoes/exercicios/exercicio10.md)
- [TrabalhoApiRest.md](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/atividade10/TrabalhoApiRest.md) Acessar e manipular a lista de vazamentos de dados
  
### [Gerador de Jogador Web](https://github.com/hqnicolas/backend-Level1-Java/blob/main/base/avaliacoes/exercicios/exercicio11.md)
- [exercicio11.0](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/atividade11/src/main/java/com/player/webplayer/Controller.java) Controller
- [exercicio11.1](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/atividade11/src/main/java/com/player/webplayer/JogadorRequestDTO.java) Request Template
- [exercicio11.2](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/atividade11/src/main/java/com/player/webplayer/JogadorResponseDTO.java) Response Template
- [exercicio11.3](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/atividade11/src/main/java/com/player/webplayer/Services.java) Service

### [Transações Bancárias](https://github.com/hqnicolas/backend-Level1-Java/blob/main/base/avaliacoes/exercicios/exercicio12.md)
- [exercicio12.0](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/atividade12/src/main/java/com/transactions/banc/BancApplication.java) SpringBootApplication
- [exercicio12.1](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/atividade12/src/main/java/com/transactions/banc/Conta.java) Conta 
- [exercicio12.2](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/atividade12/src/main/java/com/transactions/banc/ContaDTO.java) ContaDTO 
- [exercicio12.3](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/atividade12/src/main/java/com/transactions/banc/ContaMapper.java) ContaMapper 
- [exercicio12.4](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/atividade12/src/main/java/com/transactions/banc/Transacao.java) Transacao 
- [exercicio12.5](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/atividade12/src/main/java/com/transactions/banc/TransacaoController.java) TransacaoController 
- [exercicio12.6](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/atividade12/src/main/java/com/transactions/banc/TransacaoRequestDTO.java) TransacaoRequestDTO 
- [exercicio12.7](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/atividade12/src/main/java/com/transactions/banc/TransacaoResponseDTO.java) TransacaoResponseDTO
- [exercicio12.8](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/atividade12/src/main/java/com/transactions/banc/TransacoesService.java) TransacoesService 

### [Gerador de Jogador Web](https://github.com/hqnicolas/backend-Level1-Java/blob/main/base/avaliacoes/exercicios/exercicio13.md)
- [exercicio13.0](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/atividade13/src/main/java/com/jogador/web/GeradorApplication.java) GeradorApplication
- [exercicio13.1](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/atividade13/src/main/java/com/jogador/web/Jogador.java) Jogador
- [exercicio13.2](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/atividade13/src/main/java/com/jogador/web/JogadorController.java) JogadorController
- [exercicio13.3](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/atividade13/src/main/java/com/jogador/web/JogadorDTO.java) JogadorDTO
- [exercicio13.4](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/atividade13/src/main/java/com/jogador/web/JogadorMapper.java) JogadorMapper
- [exercicio13.5](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/atividade13/src/main/java/com/jogador/web/JogadorRepository.java) JogadorRepository
- [exercicio13.6](https://github.com/hqnicolas/backend-Level1-Java/blob/main/Intro/atividade13/src/main/java/com/jogador/web/JogadorService.java) JogadorService
