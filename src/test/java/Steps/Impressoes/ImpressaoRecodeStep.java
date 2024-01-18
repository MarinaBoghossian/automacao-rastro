package Steps.Impressoes;

import Logic.Impressões.ImpressaoRecodeLogic;
import Utils.Utils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ImpressaoRecodeStep {
    ImpressaoRecodeLogic impressaoRecodeLogic = new ImpressaoRecodeLogic();
    Utils utils = new Utils();

    @When("ir em impressoes e selecionar a aba Recode")
    public void ir_em_impressoes_e_selecionar_a_aba_recode() throws InterruptedException {
        impressaoRecodeLogic.menuImpressoes();
        utils.pausa(1000);
        impressaoRecodeLogic.subMenuRecode();
        utils.pausa(500);

    }
    @When("selecionar o submenu Impressao de Recode")
    public void selecionar_o_submenu_impressao_de_recode() throws InterruptedException {
        impressaoRecodeLogic.subMenuImpressaoRecode();
        utils.pausa(1000);


    }
    @When("preencher as informacoes da Etiqueta de Recode")
    public void preencher_as_informacoes_da_etiqueta_de_recode() throws InterruptedException {
        impressaoRecodeLogic.NovaImpressaoRecode();
        utils.pausa(1000);
    }
    @Then("a impressao do recode sera enviada com sucesso")
    public void a_impressao_do_recode_sera_enviada_com_sucesso() {
        impressaoRecodeLogic.validacaoImpressaoRecode();
        utils.fecharNavegador();

    }
}
