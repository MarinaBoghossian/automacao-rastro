package Steps.Impressoes;

import Logic.Impressões.ScanPrintLogic;
import Utils.Utils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScanPrintStep {
    ScanPrintLogic scanPrintLogic = new ScanPrintLogic();
    Utils utils = new Utils();

    @When("ir em impressoes e selecionar a aba Scan Print")
    public void ir_em_impressoes_e_selecionar_a_aba_scan_print() throws InterruptedException {
        scanPrintLogic.menuImpressoes();
        utils.pausa(1000);
        scanPrintLogic.subMenuScanPrint();


    }
    @When("preencher as informacoes da Scan Print")
    public void preencher_as_informacoes_da_scan_print() throws InterruptedException {
        utils.pausa(500);
        scanPrintLogic.NovaScanPrint();
        utils.pausa(500);

    }
    @Then("a Scan Print sera enviada com sucesso")
    public void a_scan_print_sera_enviada_com_sucesso() {
        scanPrintLogic.validacaoScanPrintPositivo();
        utils.fecharNavegador();


    }

}
