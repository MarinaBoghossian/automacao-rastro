package Logic.Impressões;

import Logic.LoginLogic;
import Pages.Impressões.ImpressaoEtiquetaAgregacaoPage;
import Pages.Impressões.ImpressaoRecodePage;
import Utils.Utils;

public class ImpressaoEtiquetaAgregacaoLogic {
    LoginLogic loginLogic = new LoginLogic();
    Utils utils = new Utils();
    MenuImpressoesLogic menuImpressoesLogic = new MenuImpressoesLogic();
    ImpressaoEtiquetaAgregacaoPage impressaoEtiquetaAgregacaoPage = new ImpressaoEtiquetaAgregacaoPage();

    public void acessoAoRastro() throws InterruptedException {
        loginLogic.acessoAoRastro("marina@teste1.com", "102030");
    }

    public void menuImpressoes() throws InterruptedException {
        menuImpressoesLogic.impressoes();
    }

    public void subMenuImpressaoEtiquetaAgregacao() throws InterruptedException {
        utils.clicar(impressaoEtiquetaAgregacaoPage.getSubMenuImpressaoAgregacao());
        utils.pausa(1000);

    }

    public void novaImpressaoAgregaçao() throws InterruptedException {
        utils.clicar(impressaoEtiquetaAgregacaoPage.getCampoSelecionarEtiqueta());
        utils.clicar(impressaoEtiquetaAgregacaoPage.getNomeEtiqueta());
        utils.pausa(1000);
        utils.clicar(impressaoEtiquetaAgregacaoPage.getCampoSelecionarImpressora());
        utils.clicar(impressaoEtiquetaAgregacaoPage.getNomeImpressora());
        utils.pausa(1000);
        utils.preencher(impressaoEtiquetaAgregacaoPage.getCampoQuantidade(), "40");
        utils.pausa(1000);
        utils.clicar(impressaoEtiquetaAgregacaoPage.getBtnImprimir());
        utils.pausa(1000);
    }

    public void alertaImpressaoAgrecaçao(){
       // utils.confirmarAlerta("ATENÇÃO!", "Você realmente deseja imprimir a etiqueta de agregação?");

        utils.validarTexto(impressaoEtiquetaAgregacaoPage.getValidarAlerta1(), "ATENÇÃO!");
        utils.validarTexto(impressaoEtiquetaAgregacaoPage.getValidarAlerta2(), "Você realmente deseja imprimir a etiqueta de agregação?");
        utils.clicar(impressaoEtiquetaAgregacaoPage.getBtnImprimir2());

    }

    public void validarImpressaoAgrecaçao() throws InterruptedException {
        utils.pausa(2000);
       utils.validarTexto(impressaoEtiquetaAgregacaoPage.getValidarImpressaoEtiquetaAgregacao(), "A etiqueta selecionada será impressa. Aguarde!");
       utils.fecharNavegador();
    }


}
