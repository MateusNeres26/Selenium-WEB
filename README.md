# Projeto para automatização WEB

<p>Projeto criado para automação de testes web</p>

## Ferramentas utilizadas

- Java
- Junit
- Cucumber
- Maven
- Cluecumber Report

## Execução
Para executar passamos alguns argumentos para os testes:

`-Dtest=`: Esse argumento deve receber o nome da suite que fica localizado dentro do pacote runner.

Para limpar relatórios: `mvn clean`

Para executar no terminal: `mvn test -Dtest=**/*RunCucumberTest cluecumber-report:reporting -Dcucumber.options="--tags @wip"`  

