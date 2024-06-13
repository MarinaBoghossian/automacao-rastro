package Logic.Cadastros;

import Logic.LoginLogic;
import Pages.Cadastros.CadastroSpoolerPage;
import Utils.Utils;
import org.openqa.selenium.WebDriver;

public class CadastroSpoolerLogic {
    Utils utils = new Utils();
    LoginLogic loginLogic = new LoginLogic();
    MenuCadastrosLogic menuCadastrosLogic = new MenuCadastrosLogic();
    CadastroSpoolerPage cadastroSpoolerPage = new CadastroSpoolerPage();

    public void acessoRastro() throws InterruptedException {
        loginLogic.acessoAoRastro();
    }

    public void menuCadastros()throws InterruptedException{
        menuCadastrosLogic.cadastros();

    }

    public void subMenuSpoolers() throws InterruptedException {
        WebDriver driver;
        utils.pausa(2000);
        utils.clicar(cadastroSpoolerPage.getSubMenuSpooler());
    }

    public void cadastroNovoSpooler() throws InterruptedException {
        WebDriver driver;
        utils.pausa(2000);
        utils.clicar(cadastroSpoolerPage.getBtnNovoSpooler());
        utils.preencher(cadastroSpoolerPage.getCampoNomeSpooler(), "Teste 1");
        utils.preencher(cadastroSpoolerPage.getCampoDescricaoSpooler(), "Spooler de impressão 1");
        utils.clicar(cadastroSpoolerPage.getBtnSalvarSpooler());}

    public void validarCadastroSpooler()throws InterruptedException {
        WebDriver driver;
        utils.pausa(2000);
        utils.validarTexto(cadastroSpoolerPage.getValidarCadastroSpooler(), "O spooler foi cadastrado com sucesso!");
        utils.fecharNavegador();
    }
    }



