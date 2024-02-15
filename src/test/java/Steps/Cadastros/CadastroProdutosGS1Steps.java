package Steps.Cadastros;

import Logic.Cadastros.CadastroProdutosLogic;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CadastroProdutosGS1Steps {

    CadastroProdutosLogic cadastroProdutosLogic = new CadastroProdutosLogic();


    @Given("que o usuário faça o login no Rastro e esteja no dashboard")
    public void que_o_usuário_faça_o_login_no_rastro_e_esteja_no_dashboard() throws InterruptedException {
       cadastroProdutosLogic.acessoAoRastro();
    }



    @When("ir em cadastro e selecionar a aba produtos")
    public void ir_em_cadastro_e_selecionar_a_aba_produtos()throws InterruptedException {

       cadastroProdutosLogic.menuCadastros();
        cadastroProdutosLogic.subMenuProdutos();


    }
    @When("ele ira selecionar novo e preencher os campos obrigatorios")
    public void ele_ira_selecionar_novo_e_preencher_os_campos_obrigatorios()throws InterruptedException  {
       cadastroProdutosLogic.cadastrarNovoProduto();


    }
    @Then("sera exibida a mensagem O produto foi cadastrado com sucesso")
    public void sera_exibida_a_mensagem_O_produto_foi_cadastrado_com_sucesso() throws InterruptedException {
        cadastroProdutosLogic.validarCadastroProduto();
    }
}
