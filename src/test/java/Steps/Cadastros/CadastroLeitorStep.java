package Steps.Cadastros;

import Logic.Cadastros.CadastroLeitorLogic;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CadastroLeitorStep {
    CadastroLeitorLogic cadastroLeitorLogic = new CadastroLeitorLogic();


    @Given("que o usuário faça login no Rastro e esteja no dashboard")
    public void que_o_usuário_faça_login_no_rastro_e_esteja_no_dashboard() throws InterruptedException {

        cadastroLeitorLogic.acessoRastro();



    }
    @When("ir em cadastro e selecionar a aba leitores")
    public void ir_em_cadastro_e_selecionar_a_aba_leitores() throws InterruptedException {

        cadastroLeitorLogic.menuCadastros();
        cadastroLeitorLogic.subMenuLeitores();
    }
    @When("clicar em novo e inserir os dados do leitor")
    public void clicar_em_novo_e_inserir_os_dados_do_leitor() throws InterruptedException {

        cadastroLeitorLogic.cadastroNovoLeitor();
    }
    @Then("o leitor será cadastrado com sucesso")
    public void o_leitor_será_cadastrado_com_sucesso() throws InterruptedException {

        cadastroLeitorLogic.validarNovoLeitor();


    }


}
