package Steps.Inventario;

import Logic.Inventario.CampanhaLogic;
import Utils.Utils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CampanhaSteps {
    CampanhaLogic campanhaLogic = new CampanhaLogic();
    Utils u = new Utils();

    @When("ir em inventario e selecionar o submenu campanha")
    public void ir_em_inventario_e_selecionar_o_submenu_campanha() throws InterruptedException {
        u.pausa(2000);
        campanhaLogic.menuInventario();
        campanhaLogic.subMeuCampanha();


    }

    @When("criar uma nova campanha")
    public void criar_uma_nova_campanha() {
       campanhaLogic.novaCampanhaInventario();
    }

    @Then("a campanha sera cadastrada com sucesso")
    public void a_campanha_sera_cadastrada_com_sucesso() throws InterruptedException {
        campanhaLogic.validarCadastroCampanha();

    }
    @When("clicar em editar e alterar os dados desejados")
    public void clicar_em_editar_e_alterar_os_dados_desejados() {


    }
    @Then("a campanha será editada e deverá constar na listagem com o novo nome")
    public void a_campanha_será_editada_e_deverá_constar_na_listagem_com_o_novo_nome() {

    }
    @When("clicar em deletar")
    public void clicar_em_deletar() throws InterruptedException {
        campanhaLogic.deletarCampanha();
    }
    @Then("a campanha sera deletada com sucesso")
    public void a_campanha_sera_deletada_com_sucesso() throws InterruptedException {
       campanhaLogic.validacaoDeletarCampanha();
    }

    @When("selecionar a campanha desejada")
    public void selecionar_a_campanha_desejada() throws InterruptedException {
        campanhaLogic.acessarCampanhaExistente();

    }
    @Then("iniciar uma nova contagem")
    public void iniciar_uma_nova_contagem() throws InterruptedException {
        campanhaLogic.novaContagem();

    }


}
