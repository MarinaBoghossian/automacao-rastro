package Steps.Cadastros;

import Logic.Cadastros.CadastroCheckpointLogic;
import Logic.Cadastros.CadastroProdutosLogic;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CadastroCheckpointStep {

    CadastroCheckpointLogic cadastroCheckpointLogic = new CadastroCheckpointLogic();
    CadastroProdutosLogic cadastroProdutosLogic = new CadastroProdutosLogic();

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
    @Given("que um usuário not-admin faça login no Rastro")
    public void que_um_usuário_not_admin_faça_login_no_rastro() throws InterruptedException {
        cadastroProdutosLogic.acessoAoRastro("usernotadm@teste.com", "102030");
        cadastroProdutosLogic.menuCadastros(); cadastroProdutosLogic.acessoAoRastro("usernotadm@teste.com", "102030");

    }


}
