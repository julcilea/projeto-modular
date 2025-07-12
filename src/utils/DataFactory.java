package utils;

import java.util.UUID;

public class DataFactory {

    public static String gerarNome() {
        return "Usuario_" + UUID.randomUUID().toString().substring(0, 5);
    }

    public static String gerarEmail() {
        return "email_" + UUID.randomUUID().toString().substring(0, 5) + "@teste.com";
    }

    public static String gerarSenha() {
        return "Senha123!";
    }
}