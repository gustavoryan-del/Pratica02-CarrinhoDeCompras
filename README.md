# 🛒 Sistema de Faturamento - Carrinho de Compras

> [!NOTE]
> Um sistema simples de gerenciamento de carrinho de compras via terminal (CLI) desenvolvido em Java. Criado com o intuito de praticar conceitos de Programação Orientada a Objetos (POO), como encapsulamento, relacionamentos entre classes e manipulação de listas (`ArrayList`).

---

## 🚧 Status do Projeto

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) ![Status](https://img.shields.io/badge/Status-Concluído-success?style=for-the-badge)

---

## 📚 Índice
- [Sobre o Projeto](#-sobre-o-projeto)
- [Funcionalidades Principais](#-funcionalidades-principais)
- [Tecnologias Utilizadas](#-tecnologias-utilizadas)
- [Instalação e Execução](#-instalação-e-execução)
- [Estrutura do Código](#-estrutura-do-código)
- [Demonstração](#-demonstração)
- [Autores](#-autores)

---

## 📝 Sobre o Projeto
Este projeto simula o fluxo de caixa de uma pequena loja. Ele permite ao usuário interagir com um menu no console para visualizar um catálogo de produtos, adicionar itens a uma fatura (carrinho), gerenciar as quantidades e, por fim, calcular o valor total da compra.

É um excelente exercício prático para fixar conhecimentos de controle de fluxo de menus, laços de repetição, interações com a classe `Scanner` e tratamento de regras de negócio simples em Java.

---

## ✨ Funcionalidades Principais
O sistema apresenta um menu interativo com as seguintes opções:

- 🛒 **Comprar:** Lista o catálogo de produtos e permite ao usuário adicionar um item à fatura informando o código e a quantidade.
- 🧾 **Ver Fatura:** Exibe os itens atualmente no carrinho, suas quantidades e os subtotais gerados.
- 🗑️ **Excluir Item:** Permite remover um produto específico da fatura pelo seu código.
- 🔄 **Alterar Quantidade:** Atualiza o número de unidades de um item que já está na fatura.
- 💰 **Finalizar Compra:** Encerra o fluxo, imprimindo o resumo final e o valor total a ser pago.

---

## 🛠 Tecnologias Utilizadas

* **Linguagem:** Java (JDK 8 ou superior)
* **Ambiente de Execução:** Console / Terminal
* **Paradigma:** Orientação a Objetos

---

## 🔧 Instalação e Execução

### Pré-requisitos
* **Java JDK** instalado e configurado nas variáveis de ambiente do seu sistema.

### Como Executar Localmente

1. Clone o repositório ou baixe os arquivos fonte (`.java`).
2. Abra o terminal e navegue até a pasta onde os arquivos estão localizados.
3. Compile todas as classes Java com o comando:
   ```bash
   javac *.java
   ```
4. Execute a classe principal (que contém o método `main`):
   ```bash
   java Carrinho
   ```

---

## 📂 Estrutura do Código

O projeto está dividido nas seguintes classes para manter a responsabilidade única:

- `Produto.java`: Representa um item da loja, com código, nome, preço e estoque.
- `Item.java`: Representa a relação entre um produto e a quantidade desejada, calculando seu subtotal.
- `Fatura.java`: Gerencia a lista de `Item` (o carrinho), adicionando, removendo e calculando o total global.
- `FluxoMenu.java`: Controla a exibição do menu interativo e a captura das entradas do usuário via teclado.
- `Carrinho.java`: A classe principal que inicializa o estoque e inicia o fluxo do sistema.

---

## 💻 Demonstração

**Exemplo de interação no Terminal:**

```text
Digite 0 para sair
Digite 1 para comprar
Digite 2 para ver a fatura
Digite 3 para excluir um item
Digite 4 para alterar a quantidade de um item
Digite 5 para finalizar a compra
Digite a opção desejada: 
1
Nome: Camiseta Algodão
Quantidade: 20
Código: 101
Preço: 50.0
...
Digite o código do produto desejado: 
101
Digite a quantidade do produto desejado: 
2
Subtotal: 100.0
Compra realizada com sucesso
```

---

## 👥 Autores

| 👤 Nome      | GitHub                                                     |
|--------------|------------------------------------------------------------|
| Gustavo Ryan | [github.com/seugithub](https://github.com/gustavoryan-del) |
