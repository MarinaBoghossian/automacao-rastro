package Steps.Checkpoint;

import Logic.Checkpoint.RealizarCheckpointLogic;
import Utils.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RealizarCheckpointStep {
    RealizarCheckpointLogic realizarCheckpointLogic = new RealizarCheckpointLogic();
    Utils utils = new Utils();

    @Given("que o usuário faça o login e selecione checkpoint")
    public void que_o_usuário_faça_o_login_e_selecione_checkpoint() throws InterruptedException {
        realizarCheckpointLogic.acessoAoRastro();
        realizarCheckpointLogic.menuCheckpoint();
    }
    @When("estiver no submenu Realizar checkpoint e iniciar um novo chekpoint sem leitor conectado")
    public void estiver_no_submenu_realizar_checkpoint_e_iniciar_um_novo_chekpoint_sem_leitor_conectado() throws InterruptedException {
        realizarCheckpointLogic.subMenuRealizarCheckpoint();
        utils.pausa(2000);
        realizarCheckpointLogic.realizarNovoChekpoint();
    }
    @Then("o checkpoint não será realizado e aparecera a mensagem {string}")
    public void o_checkpoint_não_será_realizado_e_aparecera_a_mensagem(String string) {
        realizarCheckpointLogic.validacaoNegativaCheckpointSemLeitor();
    }

}