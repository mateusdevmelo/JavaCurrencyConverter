# Conversor de Moedas

Este é um projeto Java que consome uma API de câmbio monetário para converter valores de diferentes moedas para o Real Brasileiro (BRL). O projeto utiliza a API ExchangeRate-API e inclui uma interface de linha de comando para escolher a moeda de origem e o valor a ser convertido.

## Funcionalidades

- Converte valores de EUR, USD, JPY, GBP e CHF para BRL.
- Formata o resultado com duas casas decimais.
- Interface de linha de comando para selecionar a moeda de origem e o valor a ser convertido.

## Pré-requisitos

- JDK 17
- Maven
- Conexão com a Internet para acessar a API de câmbio

## Dependências

O projeto utiliza a biblioteca Gson para manipulação de JSON. A dependência está definida no `pom.xml`.

```xml
<dependencies>
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.8.6</version>
    </dependency>
</dependencies>

# Estrutura do Projeto
O projeto está organizado nas seguintes classes:

APIClient: Responsável por fazer a requisição à API de câmbio e retornar os dados em formato JSON.
CurrencyConverter: Contém a lógica de conversão de moedas e formatação dos resultados.
Main: Classe principal que contém a interface de linha de comando para o usuário.
Como Executar
Usando uma IDE (IntelliJ IDEA)
Importe o Projeto Maven:

Abra sua IDE.
Importe o projeto existente a partir do diretório onde o pom.xml está localizado.
Construa o Projeto:

A IDE deve baixar automaticamente as dependências do Maven e construir o projeto.
Execute a Classe Principal:

Em IntelliJ IDEA: Clique com o botão direito na classe Main e selecione Run 'Main.main()'.
Usando a Linha de Comando
Navegue até o Diretório do Projeto:

cd /caminho/para/seu/projeto
Compile o Projeto:

mvn clean install
Execute o Projeto:

mvn exec:java -Dexec.mainClass="org.example.Main"
Certifique-se de substituir org.example.Main pelo caminho completo do pacote da sua classe Main.

## Exemplo de Uso
Inicie o Programa:

Enter the amount to convert:
Digite o Valor a Ser Convertido:

Escolha a Moeda de Origem:

Choose the target currency to convert to BRL:
1. EUR
2. USD
3. JPY
4. GBP
5. CHF

Veja o Resultado:

EUR to BRL: 620.50
API Utilizada
Este projeto utiliza a ExchangeRate-API para obter as taxas de câmbio atualizadas. Você pode obter sua própria chave de API criando uma conta no site da API.

Licença
Este projeto está licenciado sob a Licença MIT. Veja o arquivo LICENSE para mais detalhes.

Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request.
