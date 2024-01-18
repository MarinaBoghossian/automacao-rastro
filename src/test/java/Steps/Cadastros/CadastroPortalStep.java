package Steps.Cadastros;

import Logic.Cadastros.CadastroPortalLogic;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CadastroPortalStep {
    CadastroPortalLogic cadastroPortalLogic = new CadastroPortalLogic();

    @When("ir em cadastro e selecionar a aba Portal")
    public void ir_em_cadastro_e_selecionar_a_aba_portal() throws InterruptedException {
        cadastroPortalLogic.menuCadastros();
        cadastroPortalLogic.subMenuPortal();


    }
    @When("clicar em novo e inserir as informacoes do novo portal")
    public void clicar_em_novo_e_inserir_as_informacoes_do_novo_portal() throws InterruptedException {
        cadastroPortalLogic.cadastroNovoPortal();

    }
    @Then("o portal será cadastrado com sucesso")
    public void o_portal_será_cadastrado_com_sucesso() throws InterruptedException {
        cadastroPortalLogic.validarCadastroPortal();

    }

}
