# language: pt
@wip
  @cadastro
Funcionalidade: Cadastro de usuário
@cadastro-sucesso
  Cenário: Registrar um novo usuário com sucesso
    Dado que estou na tela de login
    Quando eu preencho o formulário de cadastro
    Então vejo a mensagem de cadastro realizado com sucesso

