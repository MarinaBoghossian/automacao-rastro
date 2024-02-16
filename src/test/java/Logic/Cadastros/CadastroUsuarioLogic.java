package Logic.Cadastros;

import Logic.LoginLogic;
import Pages.Cadastros.CadastroUsuarioPage;
import Utils.Utils;

public class CadastroUsuarioLogic {

    Utils utils = new Utils();
    LoginLogic loginLogic = new LoginLogic();
    MenuCadastrosLogic menuCadastrosLogic = new MenuCadastrosLogic();
    CadastroUsuarioPage cadastroUsuarioPage = new CadastroUsuarioPage();


    public void acessoAoRastro() throws InterruptedException {
        loginLogic.acessoAoRastro("marina@teste1.com", "102030");


    }

    public void menuCadastros()throws InterruptedException{
        menuCadastrosLogic.cadastros();

    }

    public void subMenuUsuario(){
        utils.clicar(cadastroUsuarioPage.getSubMenuUsuario());
    }

    public void cadastrarNovoUsuario() throws InterruptedException {
        utils.clicar(cadastroUsuarioPage.getBtnNovoUsuario());
        utils.preencher(cadastroUsuarioPage.getCampoNome(), "Teste Automação1");
        utils.preencher(cadastroUsuarioPage.getCampoUsuario(), "teste1@teste.com");
        utils.preencher(cadastroUsuarioPage.getCampoEmail(), "teste1@teste.com");
        utils.preencher(cadastroUsuarioPage.getCampoSenha(), "102030");
        utils.preencher(cadastroUsuarioPage.getCampoConfirmarSenha(), "102030");
        utils.clicar(cadastroUsuarioPage.getBtnUsuarioAdministrador());
        utils.clicar(cadastroUsuarioPage.getBtnUsuarioMatriz());
        utils.clicar(cadastroUsuarioPage.getBtnSalvarUsuario());
        utils.pausa(1000);
    }

    public void validarCadastroUsuario(){
        utils.validarTexto(cadastroUsuarioPage.getValidarCadatsroUsuario(), "O usuário foi cadastrado com sucesso!");
    }
}
