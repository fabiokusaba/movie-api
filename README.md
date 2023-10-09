# Aplicação CRUD de Filmes com Spring Boot e Kotlin

Visão Geral

Esta é uma aplicação simples de CRUD (Criar, Ler, Atualizar, Deletar) para gerenciar filmes. A aplicação é construída usando o framework Spring Boot com Kotlin como linguagem de programação.

Funcionalidades
* Listar Filmes: Visualize uma lista de todos os filmes no banco de dados.

* Ver Detalhes do Filme: Clique em um filme para ver seus detalhes, incluindo ID, nome, descrição e classificação.

* Adicionar Novo Filme: Crie um novo filme fornecendo um nome, descrição e classificação.

* Atualizar Filme: Edite os detalhes de um filme existente, incluindo nome, descrição e classificação.

* Deletar Filme: Remova um filme do banco de dados.

Tecnologias
* Spring Web
* Spring Data JPA
* H2 Database
* Kotlin

Instalação
* Clone o repositório
* Abra na sua IDE de preferência
* Execute o arquivo
* Porta padrão: 8080

Pontos de Acesso da API
* GET "/": Recupere uma lista de todos os filmes.
* GET "/{id}": Recupere detalhes de um filme específico.
* POST "/": Crie um novo filme.
* PUT "/{id}": Atualize detalhes de um filme existente.
* DELETE "/{id}": Delete um filme.

Corpo da Requisição:

```json

{
    "name": "Nome do Filme",
    "description": "Descrição do Filme",
    "rating": 4.5
}
```