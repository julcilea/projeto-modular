package tests.cadastro;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CadastroPage {
    WebDriver driver = DriverManager.getDriver();

    By campoNome = By.id("nome");
    By campoEmail = By.id("email");
    By campoSenha = By.id("senha");
    By botaoCadastrar = By.id("cadastrar");

    public void preencherNome(String nome) {
        driver.findElement(campoNome).sendKeys(nome);
    }

    public void preencherEmail(String email) {
        driver.findElement(campoEmail).sendKeys(email);
    }

    public void preencherSenha(String senha) {
        driver.findElement(campoSenha).sendKeys(senha);
    }

    public void clicarNoBotaoCadastrar() {
        driver.findElement(botaoCadastrar).click();
    }
}
