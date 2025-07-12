package tests.cadastro;

import config.Config;
import driver.DriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import utils.DataFactory;

public class CadastroTest {
    CadastroPage cadastroPage = new CadastroPage();

    @Before
    public void setUp() {
        DriverManager.getDriver().get(Config.BASE_URL + "/cadastro");
    }

    @Test
    public void deveRealizarCadastroComSucesso() {
        cadastroPage.preencherNome(DataFactory.gerarNome());
        cadastroPage.preencherEmail(DataFactory.gerarEmail());
        cadastroPage.preencherSenha(DataFactory.gerarSenha());
        cadastroPage.clicarNoBotaoCadastrar();
    }

    @After
    public void tearDown() {
        DriverManager.quitDriver();
    }
}