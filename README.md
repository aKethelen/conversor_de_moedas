# Conversor de Moedas - Challenge Java ONE

## Descrição do Projeto
Este projeto foi desenvolvido como parte do desafio final de Java no programa Oracle Next Education (ONE). O objetivo é criar um conversor de moedas interativo via terminal que consome taxas de câmbio em tempo real através de uma API externa.

## Funcionalidades
O sistema oferece um menu interativo com as seguintes conversões:

Dolar (USD) para Peso Argentino (ARS)

Peso Argentino (ARS) para Dolar (USD)

Dolar (USD) para Real Brasileiro (BRL)

Real Brasileiro (BRL) para Dolar (USD)

Dolar (USD) para Peso Boliviano (BOB)

Peso Boliviano (BOB) para Dolar (USD)

## Tecnologias e Ferramentas
Linguagem: Java (JDK 17+)

Biblioteca: Google GSON para manipulação de arquivos JSON.

API: ExchangeRate-API para obtenção de taxas dinâmicas.

IDE: Visual Studio Code.

## Estrutura de Arquivos
O projeto segue uma estrutura organizada para facilitar a manutenção:

src/Main.java: Ponto de entrada que gerencia o menu e a interação com o usuário.

src/ConsultaMoeda.java: Responsável pela requisição HTTP e extração dos dados da API.

src/Conversor.java: Classe utilitária que contém a lógica matemática da conversão.

lib/: Pasta contendo as dependências externas (.jar).

bin/: Pasta para os arquivos compilados (.class).

## Como Executar
Clone este repositório.

Certifique-se de ter o arquivo gson-2.11.0.jar na pasta lib.

Compile o projeto:

Bash
javac -cp ".;lib/gson-2.11.0.jar" src/*.java -d bin
Execute a aplicação:

Bash
java -cp "bin;lib/gson-2.11.0.jar" Main


## Autora

Kethelen de Azevedo Fernandes  
Oracle Next Education (ONE) - Alura

