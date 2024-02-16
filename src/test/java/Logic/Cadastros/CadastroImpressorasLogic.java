package Logic.Cadastros;

import Logic.LoginLogic;
import Pages.Cadastros.CadastroImpressorasPage;
import Utils.Utils;
import org.openqa.selenium.chrome.ChromeDriver;

public class CadastroImpressorasLogic {

    Utils utils = new Utils();
    LoginLogic loginLogic = new LoginLogic();
    MenuCadastrosLogic menuCadastrosLogic = new MenuCadastrosLogic();
    CadastroImpressorasPage cadastroImpressorasPage = new CadastroImpressorasPage();

    public void acessoAoRastro() throws InterruptedException {
        loginLogic.acessoAoRastro("marina@teste1.com", "102030");


    }

    public void menuCadastros()throws InterruptedException{
        menuCadastrosLogic.cadastros();

    }

    public void subMenuImpressoras()throws InterruptedException{
        utils.abrirNovaGuia("https://rastroapp-homol.rastreabilidadebrasil.com.br/#/printers-list");
    }

    public void cadastrarNovaImpressora() throws InterruptedException {
        utils.clicar(cadastroImpressorasPage.getBtnNovaImpressora());
        utils.pausa(1000);
        utils.preencher(cadastroImpressorasPage.getCampoNomeImpressora(), "Impressora Teste 1");
        utils.preencher(cadastroImpressorasPage.getCampoEnderecoIP(), "123.123.123");
        utils.preencher(cadastroImpressorasPage.getCampoPorta(), "10");
        utils.preencher(cadastroImpressorasPage.getCampoTempoSpooler(), "5");
        utils.clicar(cadastroImpressorasPage.getCampoModeloImpressora());
        utils.pausa(500);
        utils.clicar(cadastroImpressorasPage.getModeloSATOCL4NX());
        utils.pausa(500);
        utils.preencher(cadastroImpressorasPage.getCampoDescricao(), "descrição teste");
        utils.clicar(cadastroImpressorasPage.getBtnSalvarImpressora());
    }

    public void validarCadastroImpressora() throws InterruptedException {
        utils.pausa(1000);
        utils.validarTexto(cadastroImpressorasPage.getValidarCadastroImpressora(), "A impressora foi cadastrada com sucesso!");
        utils.fecharNavegador();
    }
}
