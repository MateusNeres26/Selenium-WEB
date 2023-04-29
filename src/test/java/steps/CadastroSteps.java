package steps;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.CadastroPage;
import runner.RunCucumberTest;

public class CadastroSteps extends RunCucumberTest {
    CadastroPage cadastroPage = new CadastroPage();

    @Quando("^eu preencho o formulário de cadastro$")
    public void euPreenchoOFormularioDeCadastro() {
        cadastroPage.selectTitle(1);
        cadastroPage.preencheNome("Mateusss");
        cadastroPage.preencheSobrenome("Neresss");
        cadastroPage.preencheSenha("1234567");
        cadastroPage.dataAniversario(23, 2, "2000");
        cadastroPage.botaoRegistrar();

    }


    @Então("^vejo a mensagem de cadastro realizado com sucesso$")
    public void vejoAMensagemDeCadastroRealizadoComSucesso() {
        cadastroPage.validaCadastro();
    }
}
