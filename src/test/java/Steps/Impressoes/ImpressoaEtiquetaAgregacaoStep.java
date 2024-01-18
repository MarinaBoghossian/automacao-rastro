package Steps.Impressoes;

import Logic.Impressões.ImpressaoEtiquetaAgregacaoLogic;
import Utils.Utils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ImpressoaEtiquetaAgregacaoStep {
    ImpressaoEtiquetaAgregacaoLogic impressaoEtiquetaAgregacaoLogic = new ImpressaoEtiquetaAgregacaoLogic();
    Utils utils = new Utils();


    @When("selecionar impressoes e a aba Agregcao")
    public void selecionar_impressoes_e_a_aba_agregcao() throws InterruptedException {
        impressaoEtiquetaAgregacaoLogic.menuImpressoes();
        utils.pausa(500);
        impressaoEtiquetaAgregacaoLogic.subMenuImpressaoEtiquetaAgregacao();

    }

    @When("preencher as informacoes de impressao da Etiqueta de Agregacao")
    public void preencher_as_informacoes_de_impressao_da_etiqueta_de_agregacao() throws InterruptedException {
        utils.pausa(1000);
        impressaoEtiquetaAgregacaoLogic.novaImpressaoAgregaçao();

    }

    @Then("sera exibido o alerta de impressao e a impressao sera enviada com sucesso")
    public void sera_exibido_o_alerta_de_impressao_e_a_impressao_sera_enviada_com_sucesso() throws InterruptedException {
        utils.pausa(1000);
        impressaoEtiquetaAgregacaoLogic.alertaImpressaoAgrecaçao();
        impressaoEtiquetaAgregacaoLogic.validarImpressaoAgrecaçao();

    }

}
