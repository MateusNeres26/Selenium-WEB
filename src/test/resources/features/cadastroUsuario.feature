# language: pt

Funcionalidade: Cadastro de usuário
@wip
  Cenário: Registrar um novo usuário com sucesso
    Dado que estou na tela de login
    E acesso o cadastro de usuário
    Quando eu preencho o formulário de cadastro
    E clico em registrar
    Então vejo a mensagem de cadastro realizado com sucesso
