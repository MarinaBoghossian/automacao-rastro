package Logic.Cadastros;

import Logic.LoginLogic;
import Pages.Cadastros.CadastroEtiquetasPage;
import Utils.Utils;

public class CadastroEtiquetasLogic {

    Utils utils = new Utils();
    LoginLogic loginLogic = new LoginLogic();
    MenuCadastrosLogic menuCadastrosLogic = new MenuCadastrosLogic();
    CadastroEtiquetasPage cadastroEtiquetasPage = new CadastroEtiquetasPage();

    public void menuCadastros()throws InterruptedException {
        menuCadastrosLogic.cadastros();
    }


    public void subMenuEtiquetas()throws InterruptedException{
        utils.pausa(1000);
        utils.clicar(cadastroEtiquetasPage.getSubMenuEtiquetas());


    }

    public void subMenuEtiquetaItem()throws InterruptedException {
        utils.clicar(cadastroEtiquetasPage.getSubMenuEtiquetaItem());

    }

    public void subMenuEtiquetaAgregacao()throws InterruptedException{
        utils.clicar(cadastroEtiquetasPage.getSubMenuEtiquetaAgregacao());

    }

    public void cadastrarNovaEtiqueta()throws InterruptedException{
        utils.pausa(1000);
        utils.clicar(cadastroEtiquetasPage.getBtnNovaEtiqueta());
        utils.preencher(cadastroEtiquetasPage.getCampoNomeEtiqueta(), "Teste Etiqueta 2");
        utils.preencher(cadastroEtiquetasPage.getCampoLargura(), "100");
        utils.preencher(cadastroEtiquetasPage.getCampoAltura(), "100");
        utils.preencher(cadastroEtiquetasPage.getCampoResolucao(), "3");
        utils.clicar(cadastroEtiquetasPage.getCampoSelecionarImpressora());
        utils.preencher(cadastroEtiquetasPage.getCampoNomeImpressora(), "tetsss11");
        utils.clicar(cadastroEtiquetasPage.getSelectImpressora());
        utils.preencher(cadastroEtiquetasPage.getCampoZPLLayout(), "teste 123456");
        utils.preencher(cadastroEtiquetasPage.getCampoZPLUnitario(), "teste369851");
        utils.clicar(cadastroEtiquetasPage.getBtnSalvarEtiqueta());
    }

    public void validarCadastroEtiqueta() throws InterruptedException {
        utils.pausa(2000);
        utils.validarTexto(cadastroEtiquetasPage.getValidarCadastroEtiqueta(),"A etiqueta foi cadastrada com sucesso!");
        utils.fecharNavegador();
    }
}

