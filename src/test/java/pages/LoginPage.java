package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class LoginPage extends Utils {

    WebDriver driver;
    private By create_email_field = By.id("user");
    private By create_email_button = By.id("createAccount");

    public LoginPage(WebDriver driver){
        this.driver = driver;

    }
    public void acessarTelaLogin(){
        driver.get("http://automationpratice.com.br/");
    }

    public void preencherCampoEmail(){
        driver.findElement(By.id("email")).sendKeys(getRandomEmail());
    }
    public void btnClicarCriarConta(){
        driver.findElement(By.xpath("//body/div[@id='root']/section[@id='top_header']/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")).click();
    }

}
