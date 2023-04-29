package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import runner.RunCucumberTest;
import support.Utils;

public class HomePage extends RunCucumberTest {


    public void acessarAplicação(){
        getDriver().get("https://www.qazando.com.br/curso.html");
        Utils.waitElementBePresent(By.id("btn-ver-cursos"), 10);
        Assert.assertTrue("Não acessou a aplicação", getDriver().findElement(By.id("btn-ver-cursos")).isDisplayed());
    }

    public void scrollDown() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollTo(0, 10000)");
        Thread.sleep(2000);
    }
    public void setEmail(){
        getDriver().findElement(By.id("email")).sendKeys("teste@teste.com");
        getDriver().findElement(By.id("email")).sendKeys(Keys.TAB);
    }
    public void clickGanharDesconto(){
        getDriver().findElement(By.id("button")).click();
    }
    public void verificarCupomDesconto(){
        String text = getDriver().findElement(By.xpath("//span[contains(text(),'QAZANDO15OFF')]")).getText();
        Assert.assertEquals("QAZANDO15OFF", text);
    }
}
