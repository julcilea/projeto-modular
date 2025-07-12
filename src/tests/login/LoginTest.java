package tests.login;

import config.Config;
import driver.DriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LoginTest {
    LoginPage loginPage = new LoginPage();

    @Before
    public void setUp() {
        DriverManager.getDriver().get(Config.BASE_URL + "/login");
    }

    @Test
    public void deveRealizarLoginComSucesso() {
        loginPage.preencherUsuario("usuarioValido");
        loginPage.preencherSenha("senhaValida");
        loginPage.clicarNoBotaoLogin();
    }

    @After
    public void tearDown() {
        DriverManager.quitDriver();
    }
}