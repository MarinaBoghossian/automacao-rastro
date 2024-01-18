package Logic.Impressões;

import Logic.LoginLogic;
import Pages.Impressões.ImpressaoRecodePage;
import Pages.Impressões.ScanPrintPage;
import Utils.Utils;

public class ImpressaoRecodeLogic {

    LoginLogic loginLogic = new LoginLogic();
    Utils utils = new Utils();
    MenuImpressoesLogic menuImpressoesLogic = new MenuImpressoesLogic();
    ImpressaoRecodePage impressaoRecodePage = new ImpressaoRecodePage();


    public void acessoAoRastro() throws InterruptedException {
        loginLogic.acessoAoRastro();


    }

    public void menuImpressoes() throws InterruptedException {
        menuImpressoesLogic.impressoes();
    }

    public  void subMenuRecode()throws InterruptedException {
        utils.clicar(impressaoRecodePage.getSubMenuRecode());
        utils.pausa(1000);
    }

    public void subMenuImpressaoRecode()throws InterruptedException {
        utils.clicar(impressaoRecodePage.getSubmenuImpressaoRecode());
        utils.pausa(1000);

    }

    public void NovaImpressaoRecode()throws InterruptedException {
        utils.clicar(impressaoRecodePage.getCampoSelecioneEtiqueta());
        //o nome da etiqueta deve ser preenchido na ScanPrintPage linha 11
        utils.clicar(impressaoRecodePage.getNomeEtiqueta());
        utils.pausa(1000);
        utils.clicar(impressaoRecodePage.getCampoSelecioneImpressora());
        //o nome da impressora deve ser preenchido na ScanPrintPage linha 13
        utils.clicar(impressaoRecodePage.getNomeImpressora());
        utils.pausa(1000);
        utils.preencher(impressaoRecodePage.getCampoQuantidade(), "10");
        utils.clicar(impressaoRecodePage.getBtnImprimir());
    }

    public void validacaoImpressaoRecode(){
        utils.validarTexto(impressaoRecodePage.getValidarImpressaoRecode(), "A etiqueta foi impressa com sucesso.");
    }


}
