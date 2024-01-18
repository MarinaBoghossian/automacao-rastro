package Steps.Impressoes;

import Logic.Impressões.AssociacaoRecodeLogic;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AssociacaoRecodeStep {

    AssociacaoRecodeLogic associacaoRecodeLogic = new AssociacaoRecodeLogic();

    @When("selecionar o submenu Associacao de Recode")
    public void selecionar_o_submenu_associacao_de_recode() throws InterruptedException {
        associacaoRecodeLogic.subMenuAssociacaoRecode();

    }
    @When("preencher as informacoes da Associacao de Recode")
    public void preencher_as_informacoes_da_associacao_de_recode() throws InterruptedException {
        associacaoRecodeLogic.novaAssociacaoRecode();

    }
    @Then("a associacao do recode sera enviada com sucesso")
    public void a_associacao_do_recode_sera_enviada_com_sucesso() throws InterruptedException {
        associacaoRecodeLogic.validarAssociacao();

    }
}
