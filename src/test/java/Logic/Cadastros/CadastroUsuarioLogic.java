package Logic.Cadastros;

import Logic.LoginLogic;
import Pages.Cadastros.CadastroUsuarioPage;
import Utils.Utils;
import Utils.Data;

public class CadastroUsuarioLogic {

    Utils utils = new Utils();
    LoginLogic loginLogic = new LoginLogic();
    MenuCadastrosLogic menuCadastrosLogic = new MenuCadastrosLogic();
    CadastroUsuarioPage cadastroUsuarioPage = new CadastroUsuarioPage();
    Data data = new Data();


    public void acessoAoRastro() throws InterruptedException {
        loginLogic.acessoAoRastro();


    }

    public void menuCadastros()throws InterruptedException{
        menuCadastrosLogic.cadastros();

    }

    public void subMenuUsuario(){
        utils.clicar(cadastroUsuarioPage.getSubMenuUsuario());
    }

    public void cadastrarNovoUsuario() throws InterruptedException {
        utils.clicar(cadastroUsuarioPage.getBtnNovoUsuario());
        utils.preencher(cadastroUsuarioPage.getCampoNome(), data.nomeUsuario());
        utils.preencher(cadastroUsuarioPage.getCampoUsuario(), data.novoUsuario());
        utils.preencher(cadastroUsuarioPage.getCampoEmail(), data.novoUsuario());
        utils.preencher(cadastroUsuarioPage.getCampoSenha(), data.novaSenha());
        utils.preencher(cadastroUsuarioPage.getCampoConfirmarSenha(), data.novaSenha());
        utils.clicar(cadastroUsuarioPage.getBtnUsuarioAdministrador());
        utils.clicar(cadastroUsuarioPage.getBtnUsuarioMatriz());
        utils.clicar(cadastroUsuarioPage.getBtnSalvarUsuario());
        utils.pausa(1000);
    }

    public void validarCadastroUsuario(){
        utils.validarTexto(cadastroUsuarioPage.getValidarCadatsroUsuario(), "O usuário foi cadastrado com sucesso!");
    }
}
