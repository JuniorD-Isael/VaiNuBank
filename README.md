# VainuBank

VainuBank é um sistema bancário simples implementado em Java. O sistema permite a criação, edição, exclusão e busca de contas bancárias, além de visualizar todas as contas existentes.

## Funcionalidades

### Criar conta

A criação de contas é feita através do método `criarConta` na classe `ContaController`. Este método coleta informações do usuário, como nome do titular, CPF e saldo inicial, e cria uma nova conta com essas informações.

### Editar conta

A edição de contas é feita através do método `editarConta` na classe `ContaController`. Este método permite ao usuário editar o nome do titular e a agência da conta.

### Excluir conta

A exclusão de contas é feita através do método `excluirConta` na classe `ContaController`. Este método exclui uma conta com base no número da conta fornecido pelo usuário.

### Buscar uma conta pelo número

A busca de contas é feita através do método `buscarContaPeloNumero` na classe `ContaController`. Este método retorna uma conta com base no número da conta fornecido pelo usuário.

### Visualizar todas as contas

A visualização de todas as contas é feita através do método `visualizarTodasAsContas` na classe `ContaController`. Este método imprime os detalhes de todas as contas existentes.


![Diagrama de Classes](https://www.mermaidchart.com/raw/1a1edb7b-f16f-46b2-acf0-b6e28d578707?theme=dark&version=v0.1&format=svg)

## Como executar

Para executar o VainuBank, você precisa ter o Java instalado em seu sistema. Depois de instalado, você pode compilar e executar o projeto usando o seguinte comando no terminal:


```bash
javac Application.java
java Application
