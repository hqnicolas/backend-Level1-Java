# Avaliação 02 - Projeto Intermediário

## Como Funciona:

Este aplicativo assume que você tem um token de API válido configurado de acordo com este manual.
- Acesse a área de registro de usuário: [tinyurl/register](https://tinyurl.com/app/register)
- Registre seu usuário.
- Verifique seu email para validar seu registro.
- Acesse a página de gerenciamento de API: [tinyurl/api](https://tinyurl.com/app/settings/api)
- Dê um nome para seu Token em "Token name"
- Defina a permissão como "Permission (Select All)".
- Clique em Create Token.
- Copie seu token da página WEB.

Para realizar o uso deste aplicativo, edite o arquivo [application.yml](/application.yml) colocando o Token que você gerou seguindo o manual acima.

## Consultar URL's Geradas:

- Para Consultar todas as URL's encurtadas por este aplicativo:
Faça um POST para: localhost:8080/data

```
{
    "from": "2024-09-09 14:00:00 CDT",
    "to": "2026-10-10 14:00:00 CDT"
}
```
As datas inseridas são usadas na filtragem das URL's geradas no seu token cadastrado onde o valor "from" representa a data inicial e "to" representa a data final do filtro de pesquisa.

## Gerar uma nova URL curta:
- Para criar uma nova URL encurtada á partir do seu Json:
Faça um GET para: localhost:8080/api
```
{
  "url": "https://www1.satc.edu.br",
  "description": "Satc"
}
```
Você deve passar pelo menos os campos url e descrição preenchidos. Onde a url é o caminho longo que deseja encurtar. E description é Uma descrição opcional para a URL curta

## Consultra o criador da aplicação:

Faça um GET para: localhost:8080/sobre

## Atalho para o seu Insomnia:
- Para facilitar o uso, adicione esta coleção ao seu Insomnia [insomnia.json](/Insomnia_Shortener_Nicolas.json) 

##  Clone este repositório:
```
git clone https://gitlab.com/hqnicolas/n2intermediario.git
```
Monte com docker Compose:
```
sudo docker compose build
```
Execute com docker Compose:
```
sudo docker compose up
```