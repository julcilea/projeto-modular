package tests.login;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver = DriverManager.getDriver();

    By campoUsuario = By.id("usuario");
    By campoSenha = By.id("senha");
    By botaoLogin = By.id("login");

    public void preencherUsuario(String usuario) {
        driver.findElement(campoUsuario).sendKeys(usuario);
    }

    public void preencherSenha(String senha) {
        driver.findElement(campoSenha).sendKeys(senha);
    }

    public void clicarNoBotaoLogin() {
        driver.findElement(botaoLogin).click();
    }
}