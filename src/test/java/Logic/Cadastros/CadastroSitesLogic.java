package Logic.Cadastros;

import Logic.LoginLogic;
import Pages.Cadastros.MenuCadastroPage;
import Pages.Cadastros.CadastroProdutosPage;
import Pages.Cadastros.CadastroSitesPage;
import Pages.LoginPage;
import Utils.Utils;
import org.openqa.selenium.WebDriver;

public class CadastroSitesLogic {



    Utils utils = new Utils();
    LoginPage loginPage = new LoginPage();
    CadastroProdutosPage cadastroProdutosPage = new CadastroProdutosPage();
    MenuCadastroPage menuCadastroPage = new MenuCadastroPage();
    LoginLogic loginLogic = new LoginLogic();
    MenuCadastrosLogic menuCadastrosLogic = new MenuCadastrosLogic();
    CadastroSitesPage cadastroSitesPage = new CadastroSitesPage();


    public void acessoAoRastro() throws InterruptedException {
        loginLogic.acessoAoRastro("marina@teste1.com", "102030");


    }

    public void menuCadastros()throws InterruptedException{
        menuCadastrosLogic.cadastros();

    }

    public void subMenuSites() throws InterruptedException {
        WebDriver driver;
        utils.pausa(2000);
        utils.clicar(cadastroSitesPage.getSubMenuSites());


    }

    public void cadastrarNovoSite() throws InterruptedException {
        WebDriver driver;
        utils.pausa(2000);
        utils.clicar(cadastroSitesPage.getBtnNovoSite());
        utils.pausa(2000);
        utils.preencher(cadastroSitesPage.getCampoNomeSite(), "TESTE 3");
        utils.preencher(cadastroSitesPage.getCampoCNPJ(), "78946325986542");
        utils.clicar(cadastroSitesPage.getBtnSalvarSite());

    }


    public void validarCadastrSite() throws InterruptedException {
        WebDriver driver;
        utils.pausa(2000);
        utils.validarTexto(cadastroSitesPage.getTxtCadastroSite(), "O site foi cadastrado com sucesso!");
        utils.fecharNavegador();


    }

}
