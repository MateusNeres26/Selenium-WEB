$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cadastroUsuario.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 4,
  "name": "Cadastro de usuário",
  "description": "",
  "id": "cadastro-de-usuário",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@wip"
    },
    {
      "line": 3,
      "name": "@cadastro"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Registrar um novo usuário com sucesso",
  "description": "",
  "id": "cadastro-de-usuário;registrar-um-novo-usuário-com-sucesso",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 5,
      "name": "@cadastro-sucesso"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "que estou na tela de login",
  "keyword": "Dado "
});
formatter.step({
  "line": 8,
  "name": "acesso o cadastro de usuário",
  "keyword": "E "
});
formatter.step({
  "line": 9,
  "name": "eu preencho o formulário de cadastro",
  "keyword": "Quando "
});
formatter.step({
  "line": 10,
  "name": "vejo a mensagem de cadastro realizado com sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "LoginSteps.queEstouNaTelaDeLogin()"
});
formatter.result({
  "duration": 9025184300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.acesso_o_cadastro_de_usuário()"
});
formatter.result({
  "duration": 112328800,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.euPreenchoOFormularioDeCadastro()"
});
formatter.result({
  "duration": 9011010800,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.vejoAMensagemDeCadastroRealizadoComSucesso()"
});
formatter.result({
  "duration": 51102100,
  "status": "passed"
});
});