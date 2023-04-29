package steps;

import cucumber.api.java.pt.Dado;
import pages.LoginPage;
import runner.RunCucumberTest;
import support.Utils;

public class LoginSteps  extends RunCucumberTest {
    LoginPage loginPage = new LoginPage();

    @Dado("^que estou na tela de login$")
    public void queEstouNaTelaDeLogin() {loginPage.acessarTelaLogin();
    }

    @Dado("^acesso o cadastro de usuário$")
    public void acesso_o_cadastro_de_usuário(){
    loginPage.preencherCampoEmail(Utils.getRandomEmail());
    loginPage.botaoCriarConta();
    }
}
