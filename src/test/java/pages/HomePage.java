package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class HomePage extends Utils {

    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void acessarAplicação(){
        driver.get("https://www.qazando.com.br/curso.html");
        waitElementBePresent(By.id("btn-ver-cursos"), 10);
        Assert.assertTrue("Não acessou a aplicação", driver.findElement(By.id("btn-ver-cursos")).isDisplayed());
    }

    public void scrollDown() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, 10000)");
        Thread.sleep(2000);
    }
    public void setEmail(){
        driver.findElement(By.id("email")).sendKeys("teste@teste.com");
        driver.findElement(By.id("email")).sendKeys(Keys.TAB);
    }
    public void clickGanharDesconto(){
        driver.findElement(By.id("button")).click();
    }
    public void verificarCupomDesconto(){
        String text = driver.findElement(By.xpath("//span[contains(text(),'QAZANDO15OFF')]")).getText();
        Assert.assertEquals("QAZANDO15OFF", text);
    }
}
