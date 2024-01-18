package Steps.Cadastros;

import Logic.Cadastros.CadastroUsuarioLogic;
import Utils.Utils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CadastroUsuarioStep {
    CadastroUsuarioLogic cadastroUsuarioLogic = new CadastroUsuarioLogic();
    Utils utils = new Utils();
    @When("ir em cadastro e selecionar a aba Usuarios")
    public void ir_em_cadastro_e_selecionar_a_aba_usuarios() throws InterruptedException {
        cadastroUsuarioLogic.menuCadastros();
        utils.pausa(1000);
        cadastroUsuarioLogic.subMenuUsuario();
        utils.pausa(1000);

    }

    @When("clicar em novo e inserir as informacoes do novo usuario")
    public void clicar_em_novo_e_inserir_as_informacoes_do_novo_usuario() throws InterruptedException {
        cadastroUsuarioLogic.cadastrarNovoUsuario();

    }

    @Then("o usuario será cadastrado com sucesso")
    public void o_usuario_será_cadastrado_com_sucesso() throws InterruptedException {
        utils.pausa(1000);
        cadastroUsuarioLogic.validarCadastroUsuario();
        utils.fecharNavegador();

    }
}
