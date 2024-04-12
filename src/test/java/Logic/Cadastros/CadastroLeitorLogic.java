package Logic.Cadastros;

import Logic.LoginLogic;

import Pages.Cadastros.CadastroLeitoresPage;
import Utils.Data;
import Utils.Utils;
import org.openqa.selenium.WebDriver;

public class CadastroLeitorLogic {

    Utils utils = new Utils();
    Data data = new Data();

    LoginLogic loginLogic = new LoginLogic();
    MenuCadastrosLogic menuCadastrosLogic = new MenuCadastrosLogic();
    CadastroLeitoresPage cadastroLeitoresPage = new CadastroLeitoresPage();

    public void acessoRastro() throws InterruptedException {
        loginLogic.acessoAoRastro();
    }

    public void menuCadastros()throws InterruptedException{
        menuCadastrosLogic.cadastros();

    }

    public void subMenuLeitores() throws InterruptedException {
        WebDriver driver;
        utils.pausa(2000);
        utils.clicar(cadastroLeitoresPage.getSubMenuLeitores());
    }

    public void cadastroNovoLeitor() throws InterruptedException {
        WebDriver driver;
        utils.pausa(2000);
        utils.clicar(cadastroLeitoresPage.getBtnNovoLeitor());
        utils.preencher(cadastroLeitoresPage.getCampoNomeLeitor(), data.nomeLeitor());
        utils.preencher(cadastroLeitoresPage.getCampoEnderecoIPLeitor(), data.IPLeitor());
        utils.preencher(cadastroLeitoresPage.getCampoPortaLeitor(), data.portaLeitor());
        utils.clicar(cadastroLeitoresPage.getCampoMododaLista());
        utils.clicar(cadastroLeitoresPage.getModoDaLista(data.nomeModoLista())) ;
        utils.clicar(cadastroLeitoresPage.getCampoLimitacaodaLista());
        utils.clicar(cadastroLeitoresPage.getNomeLimitacaoLista(data.limitacaoDaLista()));
        utils.clicar(cadastroLeitoresPage.getCampoModoLeitor());
        utils.scroll();
        utils.clicar(cadastroLeitoresPage.getNomeModoLeitor(data.modoLeitor()));
        utils.clicar(cadastroLeitoresPage.getCampoModoPesquisa());
        utils.clicar(cadastroLeitoresPage.getNomeModoPesquisa(data.modoPesquisa()));
        utils.clicar(cadastroLeitoresPage.getCampoSessaoLeitor());
        utils.clicar(cadastroLeitoresPage.getNomeSessaoLeitor(data.sessaoLeitor()));
        utils.apagar(cadastroLeitoresPage.getCampoEstimativaTag());
        utils.preencher(cadastroLeitoresPage.getCampoEstimativaTag(), "32");
        utils.preencher(cadastroLeitoresPage.getCampoIDServidor(), "123656");
        utils.preencher(cadastroLeitoresPage.getCampoIPServidor(), "10.255.28.95");
        utils.preencher(cadastroLeitoresPage.getCampoIdentificacaoServidor(), "TROUS");
        utils.clicar(cadastroLeitoresPage.getBtnSalvarLeitor());


    }
    public void validarNovoLeitor() throws InterruptedException {
        utils.pausa(2000);
        utils.validarTexto(cadastroLeitoresPage.getValidarCadastroLeitor(), "O leitor foi cadastrado com sucesso!");
        utils.fecharNavegador();
    }
}
