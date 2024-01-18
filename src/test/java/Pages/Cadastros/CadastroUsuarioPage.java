package Pages.Cadastros;

import org.openqa.selenium.By;

public class CadastroUsuarioPage {

    private By subMenuUsuario = By.xpath("//span[text()='Usuários']");
    private By btnNovoUsuario = By.id("button-new");
    private By campoNome = By.id("txt-name");
    private By campoUsuario = By.id("txt-username");
    private By campoEmail = By.id("txt-email");
    private By campoSenha = By.id("txt-password");
    private By campoConfirmarSenha = By.id("txt-password-confirm");
    private By btnUsuarioAdministrador =  By.xpath("//p-inputswitch[@id='chk-is-admin']/..//span");
    private By btnUsuarioMatriz = By.xpath("//p-inputswitch[@id='chk-is-matrix']/..//span");
    private By btnSalvarUsuario = By.id("button-save");
    private By validarCadatsroUsuario = By.xpath("//p[text()='O usuário foi cadastrado com sucesso!']");

    public By getSubMenuUsuario() {
        return subMenuUsuario;
    }

    public By getBtnNovoUsuario() {
        return btnNovoUsuario;
    }

    public By getCampoNome() {
        return campoNome;
    }

    public By getCampoUsuario() {
        return campoUsuario;
    }

    public By getCampoEmail() {
        return campoEmail;
    }

    public By getCampoSenha() {
        return campoSenha;
    }

    public By getCampoConfirmarSenha() {
        return campoConfirmarSenha;
    }

    public By getBtnUsuarioAdministrador() {
        return btnUsuarioAdministrador;
    }

    public By getBtnUsuarioMatriz() {
        return btnUsuarioMatriz;
    }

    public By getBtnSalvarUsuario() {
        return btnSalvarUsuario;
    }

    public By getValidarCadatsroUsuario() {
        return validarCadatsroUsuario;
    }
}
