package Steps.Cadastros;

import Logic.Cadastros.CadastroProdutosLogic;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CadastroProdutosGS1Steps {

    CadastroProdutosLogic cadastroProdutosLogic = new CadastroProdutosLogic();


    @Given("que o usuário faça o login no Rastro e esteja no dashboard")
    public void que_o_usuário_faça_o_login_no_rastro_e_esteja_no_dashboard() throws InterruptedException {
       cadastroProdutosLogic.acessoAoRastro("marina@teste2.com", "102030");
    }



    @When("ir em cadastro e selecionar a aba produtos")
    public void ir_em_cadastro_e_selecionar_a_aba_produtos()throws InterruptedException {

       cadastroProdutosLogic.menuCadastros();
        cadastroProdutosLogic.subMenuProdutos();


    }
    @When("ele ira selecionar novo e preencher os campos obrigatorios")
    public void ele_ira_selecionar_novo_e_preencher_os_campos_obrigatorios()throws InterruptedException  {
       cadastroProdutosLogic.cadastrarNovoProdutoGS1("1324568",  "07908475065933", "produto teste automacao3", "categoria teste automacao3");


    }
    @Then("sera exibida a mensagem O produto foi cadastrado com sucesso")
    public void sera_exibida_a_mensagem_O_produto_foi_cadastrado_com_sucesso() throws InterruptedException {
        cadastroProdutosLogic.validarCadastroProduto();
    }

    @When("selecionar novo e preencher todos os campos obrigatorios exceto SKU")
    public void selecionar_novo_e_preencher_todos_os_campos_obrigatorios_exceto_sku() throws InterruptedException {
        cadastroProdutosLogic.cadastrarNovoProdutoGS1("",  "07908475065933", "produto teste automacao3", "categoria teste automacao3");
    }
    @Then("o botao salvar nao devera ser habilitado sem SKU")
    public void o_botao_salvar_nao_devera_ser_habilitado_sem_SKU() {
        cadastroProdutosLogic.preenchimentosObrigatorios("Não foi possível cadastrar o produto. O preenchimento do SKU é obrigatório");
    }

    @When("selecionar novo e preencher todos os campos obrigatorios exceto GTIN")
    public void selecionar_novo_e_preencher_todos_os_campos_obrigatorios_exceto_GTIN() throws InterruptedException {
        cadastroProdutosLogic.cadastrarNovoProdutoGS1("1324568",  "", "produto teste automacao3", "categoria teste automacao3");
    }
    @Then("o botao salvar nao devera ser habilitado sem GTIN")
    public void o_botao_salvar_nao_devera_ser_habilitado_sem_GTIN() {
        cadastroProdutosLogic.preenchimentosObrigatorios("Não foi possível cadastrar o produto. O preenchimento do GTIN é obrigatório");
    }
    @When("selecionar novo e preencher todos os campos obrigatorios exceto descricao")
    public void selecionar_novo_e_preencher_todos_os_campos_obrigatorios_exceto_descricao() throws InterruptedException {
        cadastroProdutosLogic.cadastrarNovoProdutoGS1("1324568",  "07908475065933", "", "categoria teste automacao3");
    }
    @Then("o botao salvar nao devera ser habilitado sem descricao")
    public void o_botao_salvar_nao_devera_ser_habilitado_sem_descricao() {
        cadastroProdutosLogic.preenchimentosObrigatorios("Não foi possível cadastrar o produto. O preenchimento da descricao é obrigatório");
    }
    @When("selecionar novo e preencher todos os campos obrigatorios exceto categoria")
    public void selecionar_novo_e_preencher_todos_os_campos_obrigatorios_exceto_categoria() throws InterruptedException {
        cadastroProdutosLogic.cadastrarNovoProdutoGS1("1324568",  "07908475065933", "produto teste automacao3", "");
    }
    @Then("o botao salvar nao devera ser habilitado sem categoria")
    public void o_botao_salvar_nao_devera_ser_habilitado_sem_categoria() {
        cadastroProdutosLogic.preenchimentosObrigatorios("Não foi possível cadastrar o produto. O preenchimento da categoria é obrigatório");
    }


    //Steps a baixo somente no caso de TENANT prefixo por SKU
    @When("selecionar novo e preencher todos os campos obrigatorios exceto prefixo")
    public void selecionar_novo_e_preencher_todos_os_campos_obrigatorios_exceto_prefixo() throws InterruptedException {
        cadastroProdutosLogic.cadastrarNovoProdutoPrefixoSKU("1324568", "", "produto teste sem prefixo", "categoria testes sem prefixo");

    }
    @Then("o botao salvar nao devera ser habilitado sem o prefixo")
    public void o_botao_salvar_nao_devera_ser_habilitado_sem_o_prefixo() {
        cadastroProdutosLogic.preenchimentosObrigatorios("Não foi possível cadastrar o produto. O preenchimento do prefixo é obrigatório");
    }



}
