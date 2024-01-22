package Logic;

import Pages.Cadastros.MenuCadastroPage;
import Pages.LoginPage;
import Utils.Utils;

public class LoginLogic {

    Utils utils = new Utils();
    LoginPage loginPage = new LoginPage();

    MenuCadastroPage menuCadastroPage = new MenuCadastroPage();

    public void acessoAoRastro() throws InterruptedException {
        String url = "https://rastroapp-homol.rastreabilidadebrasil.com.br/#/login";
        utils.abrirNavegador(url);


        utils.pausa(2000);
        utils.preencher(loginPage.getCampoUsuario(), "marina@teste1.com");
        utils.preencher(loginPage.getCampoSenha(), "102030");
        utils.clicar(loginPage.getBtnEntrar());


        utils.pausa(18000);
        utils.clicar(loginPage.getBtnEscolhaUmSite());
        utils.clicar(loginPage.getBtnSite());
        utils.clicar(loginPage.getBtnEntrarSite());


        utils.pausa(2000);
        utils.validarTexto(loginPage.getTxtDashboard(), "Dashboard");


    }
    public void cadastros() throws InterruptedException {

        utils.pausa(2000);
        utils.clicar(menuCadastroPage.getMenuCadastros());


    }


}
