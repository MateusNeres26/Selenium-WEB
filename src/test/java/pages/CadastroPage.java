package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import runner.RunCucumberTest;
import support.Utils;

public class CadastroPage extends RunCucumberTest {


    private By titleM = By.id("id_gender1");
    private By titleF = By.id("id_gender2");
    private By first_name_field = By.id("customer_firstname");
    private By last_name_field = By.id("customer_lastname");
    private By password_field = By.id("passwd");
    private By dia = By.id("days");
    private By mes = By.id("months");
    private By ano = By.id("years");
    private By registrar = By.id("submitAccount");
    private By cadastroEfetuado = By.cssSelector("#center_column > p.alert.alert-success");

    public void selectTitle(Integer type){
        Utils.waitElementBePresent(titleM, 20);
        if(type == 1){
            getDriver().findElement(titleM).click();
        }else if(type == 2){
            getDriver().findElement(titleF).click();
        }
    }

    public void preencheNome(String nome){
        getDriver().findElement(first_name_field).sendKeys(nome);
    }
    public void preencheSobrenome(String sobrenome){
        getDriver().findElement(last_name_field).sendKeys(sobrenome);
    }
    public void preencheSenha(String senha){
        getDriver().findElement(password_field).sendKeys(senha);
    }

    public void dataAniversario(Integer dia, Integer mes, String ano){
        Select  select_dia = new Select(getDriver().findElement(this.dia));
        select_dia.selectByIndex(dia);

        Select  select_mes = new Select(getDriver().findElement(this.mes));
        select_mes.selectByIndex(mes);

        Select  select_ano = new Select(getDriver().findElement(this.ano));
        select_ano.selectByValue(ano);
    }
    public void botaoRegistrar(){
        getDriver().findElement(registrar).click();
    }

    public void validaCadastro(){
        Utils.waitElementBePresent(cadastroEfetuado, 20);
        String message = getDriver().findElement(cadastroEfetuado).getText();
        Assert.assertEquals("Your account has been created.", message);

    }


}
