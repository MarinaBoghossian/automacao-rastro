package Steps.Cadastros;

import Logic.Cadastros.CadastroImpressorasLogic;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CadastroImpressorasSteps {
    CadastroImpressorasLogic cadastroImpressorasLogic = new CadastroImpressorasLogic();

    @When("ir em cadastro e selecionar a aba Impressoras")
    public void ir_em_cadastro_e_selecionar_a_aba_impressoras() throws InterruptedException {

        cadastroImpressorasLogic.subMenuImpressoras();

    }

    @When("clicar em novo e inserir as informacoes da nova impressora")
    public void clicar_em_novo_e_inserir_as_informacoes_da_nova_impressora() throws InterruptedException {
        cadastroImpressorasLogic.cadastrarNovaImpressora();

    }

    @Then("a impressora será cadastrada com sucesso")
    public void a_impressora_será_cadastrada_com_sucesso() throws InterruptedException {
        cadastroImpressorasLogic.validarCadastroImpressora();

    }
}
