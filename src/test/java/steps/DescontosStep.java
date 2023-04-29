package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.HomePage;
import runner.RunCucumberTest;

public class DescontosStep extends RunCucumberTest {

    HomePage homePage = new HomePage();
    @Dado("^que estou no site da qazando$")
    public void queEstouNoSiteDaQazando() {
        homePage.acessarAplicação();
    }
    @Quando("^eu preencho meu e-mail$")
    public void euPreenchoMeuEMail() throws InterruptedException {
    homePage.scrollDown();
    homePage.setEmail();
    }
    @E("^clico em ganhar cupom$")
    public void clicoEmGanharCupom() {
    homePage.clickGanharDesconto();
    }
    @Então("^eu vejo o código de desconto$")
    public void euVejoOCodigoDeDesconto() {
    homePage.verificarCupomDesconto();
    }
}
