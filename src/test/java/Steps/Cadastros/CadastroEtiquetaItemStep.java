package Steps.Cadastros;

import Logic.Cadastros.CadastroEtiquetasLogic;
import Utils.Utils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CadastroEtiquetaItemStep {
    CadastroEtiquetasLogic cadastroEtiquetasLogic = new CadastroEtiquetasLogic();
    Utils utils = new Utils();
    @When("ir em cadastro, selecionar a aba Etiquetas e selecionar Item")
    public void ir_em_cadastro_selecionar_a_aba_etiquetas_e_selecionar_item() throws InterruptedException {
        cadastroEtiquetasLogic.menuCadastros();
        cadastroEtiquetasLogic.subMenuEtiquetas();
        utils.pausa(1000);
        cadastroEtiquetasLogic.subMenuEtiquetaItem();


    }
    @When("clicar em novo e inserir as informacoes da nova etiqueta")
    public void clicar_em_novo_e_inserir_as_informacoes_da_nova_etiqueta() throws InterruptedException {
        cadastroEtiquetasLogic.cadastrarNovaEtiqueta();

    }
    @Then("a etiqueta por item sera cadastrada com sucesso")
    public void a_etiqueta_por_item_sera_cadastrada_com_sucesso() throws InterruptedException {
        cadastroEtiquetasLogic.validarCadastroEtiqueta();

    }
}
