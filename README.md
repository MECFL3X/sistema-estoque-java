# Sistema de Estoque em Java

Meu primeiro projeto publicado no GitHub, desenvolvido durante meus estudos de Java e Programação Orientada a Objetos (POO).

O objetivo é praticar a criação de classes, manipulação de objetos e o desenvolvimento de funcionalidades básicas de um sistema de estoque.

## Funcionalidades

- Cadastro de produtos de informática.
- Seleção de categorias.
- Geração automática de códigos para os produtos.
- Numeração sequencial por categoria.
- Armazenamento dos produtos em uma lista (`ArrayList`).
- Listagem dos produtos cadastrados no console.
- Métodos para adicionar e remover quantidades do estoque (ainda não integrados ao menu).

## Conceitos utilizados

- Java
- Programação Orientada a Objetos (POO)
- Classes, objetos e construtores
- Encapsulamento
- Métodos e atributos
- Estruturas condicionais e de repetição
- `ArrayList` e `for-each`
- Entrada de dados com `Scanner`

## Estrutura do projeto

```text
src/
├── application/
│   └── SistemaEstoque.java
├── model/
│   └── ProdutoInformatica.java
└── util/
    └── GeradorCodigo.java
```

## Como executar

1. Baixe ou clone este repositório.
2. Abra o projeto em uma IDE Java, como o Eclipse.
3. Execute a classe `SistemaEstoque.java`, localizada no pacote `application`.
4. Siga as instruções exibidas no console.

## Sobre o projeto

Este projeto faz parte do meu aprendizado em desenvolvimento Java e ainda está em construção.

Pretendo adicionar novas funcionalidades conforme avanço nos estudos, como busca de produtos, edição de informações e um menu interativo.

Atualmente, os dados ficam armazenados apenas durante a execução do programa, sem utilização de banco de dados.
