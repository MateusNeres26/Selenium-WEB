package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import runner.RunCucumberTest;

public class CadastroSteps extends RunCucumberTest {

    LoginPage loginPage = new LoginPage(driver);

    @Quando("^eu preencho o formulário de cadastro$")
    public void euPreenchoOFormularioDeCadastro() {
    }

    @E("^clico em registrar$")
    public void clicoEmRegistrar() {
    }

    @Então("^vejo a mensagem de cadastro realizado com sucesso$")
    public void vejoAMensagemDeCadastroRealizadoComSucesso() {
    }
}
