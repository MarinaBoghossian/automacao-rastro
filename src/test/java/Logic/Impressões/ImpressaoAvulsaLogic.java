package Logic.Impressões;

import Logic.LoginLogic;
import Pages.Impressões.ImpressaoAvulsaPage;
import Utils.Utils;

public class ImpressaoAvulsaLogic {
    LoginLogic loginLogic = new LoginLogic();
    Utils utils = new Utils();
    MenuImpressoesLogic menuImpressoesLogic = new MenuImpressoesLogic();
    ImpressaoAvulsaPage impressaoAvulsaPage = new ImpressaoAvulsaPage();


    public void acessoAoRastro() throws InterruptedException {
        loginLogic.acessoAoRastro();


    }

    public void menuImpressoes() throws InterruptedException {
        menuImpressoesLogic.impressoes();
    }
    public  void subMenuImpressaoAvulsa()throws InterruptedException {
        utils.clicar(impressaoAvulsaPage.getSubMenuImpressaoAvulsa());
        utils.pausa(1000);
    }

    public void novaImpressaoAvulsa()throws InterruptedException {

        utils.preencher(impressaoAvulsaPage.getCampoSKU(), "05602185700017");

        utils.pausa(1000);
        utils.clicar(impressaoAvulsaPage.getBtnBuscarSKU());
        //a confirmação da descrição deve ser preenchida na ImpressaoAvulsaPage linha 14
        utils.pausa(1000);
        utils.clicar(impressaoAvulsaPage.getConfirmarDadoDoProduto("05602185700017"));
        utils.clicar(impressaoAvulsaPage.getBtnOK());
        utils.pausa(1000);
        utils.clicar(impressaoAvulsaPage.getBtnProximo());
        utils.pausa(1000);
        utils.clicar(impressaoAvulsaPage.getBtnProximo());
        utils.pausa(1000);
        utils.preencher(impressaoAvulsaPage.getCampoLote(), "teste");
        utils.preencher(impressaoAvulsaPage.getCampoDataProd(), "10/02/2023");
        utils.preencher(impressaoAvulsaPage.getCampoDataExpiracao(), "10/02/2024");
        utils.clicar(impressaoAvulsaPage.getClicarFora());
        utils.preencher(impressaoAvulsaPage.getCampoDocFiscal(), "teste");
        utils.preencher(impressaoAvulsaPage.getCampoObservacoes(), "observação teste");

        utils.pausa(1000);
        utils.clicar(impressaoAvulsaPage.getBtnProximo());
        utils.clicar(impressaoAvulsaPage.getCampoSelecionarEtiqueta());
        utils.clicar(impressaoAvulsaPage.getCampoNomeEtiqueta("SEM LOGO / SEM TAG"));
        utils.pausa(1000);
        utils.clicar(impressaoAvulsaPage.getCampoSelecionarImpressora());
        utils.clicar(impressaoAvulsaPage.getCampoNomeImpressora("Trousseau TESTE"));
        utils.pausa(1000);
        utils.preencher(impressaoAvulsaPage.getCampoQuantidadeImpressao(), "50");
        utils.clicar(impressaoAvulsaPage.getBtnProximo());
        utils.pausa(1000);
        utils.scroll();
        utils.clicar(impressaoAvulsaPage.getBtnImprimir());
        utils.pausa(2000);
    }

        public void validarImpressao() throws InterruptedException {
            utils.pausa(4000);
        utils.validarTexto(impressaoAvulsaPage.getValidarImpressao(), "A etiqueta selecionada será impressa. Aguarde!");

        utils.fecharNavegador();






    }

}
