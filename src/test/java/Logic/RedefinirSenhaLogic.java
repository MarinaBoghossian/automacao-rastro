package Logic;

import Pages.Cadastros.MenuCadastroPage;
import Pages.LoginPage;
import Pages.RedefinirSenhaPage;
import Utils.Utils;

public class RedefinirSenhaLogic {
    Utils utils = new Utils();
    RedefinirSenhaPage redefinirSenhaPage = new RedefinirSenhaPage();

    LoginPage loginPage = new LoginPage();

    public void esqueceuSenha(String email) throws InterruptedException {
        //utils.abrirNavegador("https://rastroapp-homol.rastreabilidadebrasil.com.br/#/login");
        utils.clicar(redefinirSenhaPage.getBtnEsqueciSenha());
        utils.preencher(redefinirSenhaPage.getCampoEmailRecSenha(), email);
        utils.clicar(redefinirSenhaPage.getBtnEnviarEmailRecSenha());
        utils.pausa(2000);


    }

    public void confirmacaoEsqueceuSenha() {
        utils.validarTexto(redefinirSenhaPage.getConfirmacaoRecSenha(), "Um email foi enviado para a recuperação da senha.");
    }

    public void linkRedefinicaoSenha(String urlEmailPersonalizado) throws InterruptedException {
        utils.abrirNavegador(urlEmailPersonalizado);
        utils.pausa(2000);




    }

    public void redefinirSenha(String email, String senha, String confirmacaoSenha) throws InterruptedException {
        utils.pausa(2000);
        utils.preencher(redefinirSenhaPage.getCampoEmailRecuperar(), email);
        utils.preencher(redefinirSenhaPage.getCampoSenhaRecuperar(), senha);
        utils.preencher(redefinirSenhaPage.getCampoConfirmarSenhaRecuperar(), confirmacaoSenha);
        utils.clicar(redefinirSenhaPage.getBtnSalvar());
        utils.pausa(3000);
        utils.clicar(redefinirSenhaPage.getBtnOK());
    }

    public void login (String usuario, String senha) throws InterruptedException {
        utils.pausa(2000);
        utils.preencher(loginPage.getCampoUsuario(), usuario);
        utils.preencher(loginPage.getCampoSenha(), senha);
        utils.clicar(loginPage.getBtnEntrar());


        utils.pausa(18000);
        utils.clicar(loginPage.getBtnEscolhaUmSite());
        utils.clicar(loginPage.getBtnSite());
        utils.clicar(loginPage.getBtnEntrarSite());


        utils.pausa(2000);
        utils.validarTexto(loginPage.getTxtDashboard(), "Dashboard");


    }

    public void validacaoEmailSemCadastro() throws InterruptedException {
        utils.pausa(1000);
        utils.validarTexto(redefinirSenhaPage.getValidarEmailSemCadastro(), "O usuário não foi encontrado");
    }
    }




