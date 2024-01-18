package Steps.Cadastros;

import Logic.Cadastros.CadastroCheckpointLogic;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CadastroCheckpointStep {

    CadastroCheckpointLogic cadastroCheckpointLogic = new CadastroCheckpointLogic();

    @When("ir em cadastro e selecionar a aba Checkpoints")
    public void ir_em_cadastro_e_selecionar_a_aba_checkpoints() throws InterruptedException {
        cadastroCheckpointLogic.menuCadastros();
        cadastroCheckpointLogic.subMenuCheckpoints();

    }
    @When("clicar em novo e inserir as informacoes do novo checkpoint")
    public void clicar_em_novo_e_inserir_as_informacoes_do_novo_checkpoint() throws InterruptedException {
        cadastroCheckpointLogic.cadastrarNovoCheckpoint();

    }
    @Then("o checkpoint será cadastrado com sucesso")
    public void o_checkpoint_será_cadastrado_com_sucesso() throws InterruptedException {
        cadastroCheckpointLogic.validarCadatsroCheckpoint();

    }
}
