package Steps.Cadastros;

import Logic.Cadastros.CadastroSpoolerLogic;
import Logic.Cadastros.MenuCadastrosLogic;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CadastroSpoolerStep {

    CadastroSpoolerLogic cadastroSpoolerLogic = new CadastroSpoolerLogic();
    MenuCadastrosLogic menuCadastrosLogic = new MenuCadastrosLogic();

    @When("ir em cadastro e selecionar a aba Spoolers de Impressão")
    public void ir_em_cadastro_e_selecionar_a_aba_spoolers_de_impressão() throws InterruptedException {
        cadastroSpoolerLogic.menuCadastros();
        cadastroSpoolerLogic.subMenuSpoolers();

    }
    @When("clicar em novo e inserir as informaçoes do novo Spooler")
    public void clicar_em_novo_e_inserir_as_informaçoes_do_novo_spooler() throws InterruptedException {
        cadastroSpoolerLogic.cadastroNovoLeitor();


    }
    @Then("o Spooler será cadastrado com sucesso")
    public void o_spooler_será_cadastrado_com_sucesso() throws InterruptedException {
        cadastroSpoolerLogic.validarCadastroSpooler();

    }

}
