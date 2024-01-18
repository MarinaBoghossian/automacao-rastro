package Steps.Impressoes;

import Logic.Impressões.ImpressaoAvulsaLogic;
import Utils.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ImpressaoAvulsaStep {
    ImpressaoAvulsaLogic impressaoAvulsaLogic = new ImpressaoAvulsaLogic();
    Utils utils = new Utils();

    @Given("que o usuário faça login no Rastro")
    public void que_o_usuário_faça_login_no_rastro() throws InterruptedException {
        impressaoAvulsaLogic.acessoAoRastro();}


    @When("ir em impressoes e selecionar a aba Impressao Avulsa")
    public void ir_em_impressoes_e_selecionar_a_aba_impressao_avulsa() throws InterruptedException {
        impressaoAvulsaLogic.menuImpressoes();
        utils.pausa(1000);
        impressaoAvulsaLogic.subMenuImpressaoAvulsa();


    }
    @When("preencher as informacoes da impressao Avulsa")
    public void preencher_as_informacoes_da_impressao_avulsa() throws InterruptedException {
        impressaoAvulsaLogic.novaImpressaoAvulsa();

    }
    @Then("a impressao avulsa sera enviada com sucesso")
    public void a_impressao_avulsa_sera_enviada_com_sucesso() throws InterruptedException {
        impressaoAvulsaLogic.validarImpressao();

    }

}
