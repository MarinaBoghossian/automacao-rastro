package Pages;

import org.openqa.selenium.By;

public class RedefinirSenhaPage {
    private By btnEsqueciSenha = By.xpath("//span[text()='Esqueceu sua senha? Clique aqui.']");
    private By campoEmailRecSenha = By.id("txt-name");
    private By btnEnviarEmailRecSenha = By.xpath("//span[text()='Enviar']");
    private By confirmacaoRecSenha = By.xpath("//p[text()='Um email foi enviado para a recuperação da senha.']");
    private By alertaCredenciaisInvalidas = By.xpath("//p[text()='Usuário e/ou senha inválidos. Verifique os dados inseridos.']");
    private By campoEmailRecuperar = By.xpath("//input[@formcontrolname='email']");
    private By campoSenhaRecuperar = By.xpath("//input[@formcontrolname='password']");
    private By campoConfirmarSenhaRecuperar = By.xpath("//input[@formcontrolname='confirmPassword']");
    private By btnSalvar = By.xpath("//span[text()='Salvar']");
    private By validacaoPaginaRecSenha = By.xpath("//span[text()='Recuperação de Senha']");
    private By validarTelaLogin = By.id("login-container");
    private By linkRedefinirSenha = By.id("UniqueMessageBody");
    private By campoPesquisaEmail = By.id("searchBoxColumnContainerId");
    private By resultadoPesquisa = By.id("searchSuggestion-0");
    private By btnOK = By.xpath("//p[text()='OK']");
    private By validarEmailSemCadastro = By.xpath("//p[text()='O usuário não foi encontrado']");


    public By getBtnEsqueciSenha() {
        return btnEsqueciSenha;
    }

    public By getCampoEmailRecSenha() {
        return campoEmailRecSenha;
    }

    public By getBtnEnviarEmailRecSenha() {
        return btnEnviarEmailRecSenha;
    }

    public By getConfirmacaoRecSenha() {
        return confirmacaoRecSenha;
    }

    public By getAlertaCredenciaisInvalidas() {
        return alertaCredenciaisInvalidas;
    }

    public By getCampoEmailRecuperar() {
        return campoEmailRecuperar;
    }

    public By getCampoSenhaRecuperar() {
        return campoSenhaRecuperar;
    }

    public By getCampoConfirmarSenhaRecuperar() {
        return campoConfirmarSenhaRecuperar;
    }

    public By getBtnSalvar() {
        return btnSalvar;
    }

    public By getValidacaoPaginaRecSenha() {
        return validacaoPaginaRecSenha;
    }

    public By getValidarTelaLogin() {
        return validarTelaLogin;
    }

    public By getLinkRedefinirSenha() {
        return linkRedefinirSenha;
    }

    public By getCampoPesquisaEmail() {
        return campoPesquisaEmail;
    }

    public By getResultadoPesquisa() {
        return resultadoPesquisa;
    }

    public By getBtnOK() {
        return btnOK;
    }

    public By getValidarEmailSemCadastro() {
        return validarEmailSemCadastro;
    }
}
