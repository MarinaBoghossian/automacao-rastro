package Steps.Cadastros;

import Logic.Cadastros.CadastroProdutosGS1Logic;
import Logic.Cadastros.MenuCadastrosLogic;
import Steps.LoginStep;
import Utils.Utils;
import Pages.Cadastros.CadastroProdutosGS1Page;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Logic.LoginLogic;

public class CadastroProdutosGS1Steps {

    CadastroProdutosGS1Logic cadastroProdutosGS1Logic = new CadastroProdutosGS1Logic();


    @Given("que o usuário faça o login no Rastro e esteja no dashboard")
    public void que_o_usuário_faça_o_login_no_rastro_e_esteja_no_dashboard() throws InterruptedException {
       cadastroProdutosGS1Logic.acessoAoRastro();
    }



    @When("ir em cadastro e selecionar a aba produtos")
    public void ir_em_cadastro_e_selecionar_a_aba_produtos()throws InterruptedException {

       cadastroProdutosGS1Logic.menuCadastros();
        cadastroProdutosGS1Logic.subMenuProdutos();


    }
    @When("ele ira selecionar novo e preencher os campos obrigatorios")
    public void ele_ira_selecionar_novo_e_preencher_os_campos_obrigatorios()throws InterruptedException  {
       cadastroProdutosGS1Logic.cadastrarNovoProduto();


    }
    @Then("sera exibida a mensagem O produto foi cadastrado com sucesso")
    public void sera_exibida_a_mensagem_O_produto_foi_cadastrado_com_sucesso() throws InterruptedException {
        cadastroProdutosGS1Logic.validarCadastroProduto();
    }
}
