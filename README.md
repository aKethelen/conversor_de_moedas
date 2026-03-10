<h1 align="center">
  Conversor de Moedas - Challenge Java ONE
</h1>

<div align="center">

![Java](https://img.shields.io/badge/Java-17-orange)
![GSON](https://img.shields.io/badge/GSON-2.11.0-blue)
![API](https://img.shields.io/badge/ExchangeRate--API-Success-green)

<img src="./badge-main-one.png" height="200" alt="Badge ONE">
<img src="./Badge-Conversor.png" height="200" alt="Badge Conversor">

</div>

## Sobre o Projeto
Esta aplicação foi desenvolvida como o desafio final do módulo de Java no programa **Oracle Next Education (ONE)** em parceria com a **Alura**. O sistema consiste em uma ferramenta de linha de comando que realiza a conversão de valores entre diferentes moedas em tempo real, utilizando integração com a API externa **ExchangeRate-API**.



## Desenvolvedora
Kethelen de Azevedo Fernandes

Estudante de Ciência da Computação

Oracle Next Education (ONE) - Alura

## Licença
Este projeto está sob a Licença MIT.


## Funcionalidades
O software disponibiliza um menu interativo para as seguintes operações de câmbio:
1. **Dólar (USD) para Peso Argentino (ARS)**
2. **Peso Argentino (ARS) para Dólar (USD)**
3. **Dólar (USD) para Real Brasileiro (BRL)**
4. **Real Brasileiro (BRL) para Dólar (USD)**
5. **Dólar (USD) para Peso Boliviano (BOB)**
6. **Peso Boliviano (BOB) para Dólar (USD)**

## Tecnologias e Ferramentas
- **Linguagem**: Java (JDK 17 ou superior).
- **Biblioteca**: Google GSON (versão 2.11.0) para desserialização de dados JSON.
- **API**: ExchangeRate-API.
- **IDE**: Visual Studio Code.

## Estrutura do Projeto
A arquitetura do sistema foi dividida para garantir a separação de responsabilidades:
- **Main.java**: Ponto de entrada da aplicação, responsável pelo fluxo de controle e interface com o usuário.
- **ConsultaMoeda.java**: Responsável por gerenciar a comunicação HTTP e tratar a resposta JSON da API.
- **Conversor.java**: Contém a lógica de negócio e os cálculos matemáticos de conversão.

## Instruções de Execução

### 1. Pré-requisitos
- Java JDK 17+ instalado.
- Biblioteca `gson-2.11.0.jar` presente no diretório `lib`.

### 2. Compilação e Execução
No terminal, utilize os comandos abaixo para preparar e rodar o projeto:

```bash
# Compilar o projeto
javac -cp ".;lib/gson-2.11.0.jar" src/*.java -d bin

# Executar a aplicação
java -cp "bin;lib/gson-2.11.0.jar" Main

