package Logic.Impressões;

import Logic.LoginLogic;
import Pages.Impressões.ScanPrintPage;
import Utils.Utils;

public class ScanPrintLogic {

    LoginLogic loginLogic = new LoginLogic();
    Utils utils = new Utils();
    MenuImpressoesLogic menuImpressoesLogic = new MenuImpressoesLogic();
    ScanPrintPage scanPrintPage = new ScanPrintPage();


    public void acessoAoRastro() throws InterruptedException {
        loginLogic.acessoAoRastro();


    }

    public void menuImpressoes() throws InterruptedException {
        menuImpressoesLogic.impressoes();
    }

    public  void subMenuScanPrint()throws InterruptedException {
        utils.clicar(scanPrintPage.getSubMenuScanPrint());
        utils.pausa(1000);
    }

    public void NovaScanPrint()throws InterruptedException {
        utils.clicar(scanPrintPage.getCampoSelecioneEtiqueta());
        //o nome da etiqueta deve ser preenchido na ScanPrintPage linha 11
        utils.clicar(scanPrintPage.getNomeEtiqueta());
        utils.pausa(1000);
        utils.clicar(scanPrintPage.getCampoSelecioneImpressora());
        //o nome da impressora deve ser preenchido na ScanPrintPage linha 13
        utils.clicar(scanPrintPage.getNomeImpressora());
        utils.pausa(1000);
        //preencher apenas com um GTIN ou SKU que está cadastrado para essa Tenant
        utils.preencher(scanPrintPage.getCampoGTINSKU(), "05602185700017");
        utils.clicar(scanPrintPage.getBtnImprimir());
    }

    public void validacaoScanPrintPositivo(){
        utils.validarTexto(scanPrintPage.getValidarScanPrint(), "A etiqueta foi impressa com sucesso.");
    }

    public void validarScanPrintNegativo(){
        utils.validarTexto(scanPrintPage.getValidarProdutoIncorreto(), "O produto não foi encontrado!");

    }





}
