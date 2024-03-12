package Steps.Cadastros;

import Logic.Cadastros.CadastroProdutosLogic;
import Pages.Cadastros.CadastroProdutosPage;
import Utils.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utils.Data;

public class CadastroProdutosStep {

    CadastroProdutosLogic cadastroProdutosLogic = new CadastroProdutosLogic();
    Utils utils = new Utils();
    CadastroProdutosPage cadastroProdutosPage = new CadastroProdutosPage();
    Data data = new Data();



    @Given("que o usuário faça o login no Rastro e esteja no dashboard")
    public void que_o_usuário_faça_o_login_no_rastro_e_esteja_no_dashboard() throws InterruptedException {
       cadastroProdutosLogic.acessoAoRastro();
    }



    @When("ir em cadastro e selecionar a aba produtos")
    public void ir_em_cadastro_e_selecionar_a_aba_produtos()throws InterruptedException {

       cadastroProdutosLogic.menuCadastros();
        cadastroProdutosLogic.subMenuProdutos();


    }
    @When("ele ira selecionar novo e preencher os campos obrigatorios da Tenant por SKU")
    public void ele_ira_selecionar_novo_e_preencher_os_campos_obrigatorios_da_tenant_por_SKU()throws InterruptedException  {
       cadastroProdutosLogic.cadastrarNovoProdutoSKU();}

       @When("ele ira selecionar novo e preencher os campos obrigatorios")
        public void ele_ira_selecionar_novo_e_preencher_os_campos_obrigatorios()throws InterruptedException  {
            cadastroProdutosLogic.cadastrarNovoProdutoGS1();


    }
    @Then("sera exibida a mensagem O produto foi cadastrado com sucesso")
    public void sera_exibida_a_mensagem_O_produto_foi_cadastrado_com_sucesso() throws InterruptedException {
        cadastroProdutosLogic.validarCadastroProduto();

    }

    @When("selecionar novo e preencher todos os campos obrigatorios exceto SKU")
    public void selecionar_novo_e_preencher_todos_os_campos_obrigatorios_exceto_sku() throws InterruptedException {
        cadastroProdutosLogic.cadastrarNovoProdutoGS1();
    }
    @Then("o botao salvar nao devera ser habilitado sem SKU")
    public void o_botao_salvar_nao_devera_ser_habilitado_sem_SKU() {
        cadastroProdutosLogic.preenchimentosObrigatorios("Não foi possível cadastrar o produto. O preenchimento do SKU é obrigatório");
    }

    @When("selecionar novo e preencher todos os campos obrigatorios exceto GTIN")
    public void selecionar_novo_e_preencher_todos_os_campos_obrigatorios_exceto_GTIN() throws InterruptedException {
        cadastroProdutosLogic.cadastrarNovoProdutoGS1();
    }
    @Then("o botao salvar nao devera ser habilitado sem GTIN")
    public void o_botao_salvar_nao_devera_ser_habilitado_sem_GTIN() {
        cadastroProdutosLogic.preenchimentosObrigatorios("Não foi possível cadastrar o produto. O preenchimento do GTIN é obrigatório");
    }
    @When("selecionar novo e preencher todos os campos obrigatorios exceto descricao")
    public void selecionar_novo_e_preencher_todos_os_campos_obrigatorios_exceto_descricao() throws InterruptedException {
        cadastroProdutosLogic.cadastrarNovoProdutoGS1();
    }
    @Then("o botao salvar nao devera ser habilitado sem descricao")
    public void o_botao_salvar_nao_devera_ser_habilitado_sem_descricao() {
        cadastroProdutosLogic.preenchimentosObrigatorios("Não foi possível cadastrar o produto. O preenchimento da descricao é obrigatório");
    }
    @When("selecionar novo e preencher todos os campos obrigatorios exceto categoria")
    public void selecionar_novo_e_preencher_todos_os_campos_obrigatorios_exceto_categoria() throws InterruptedException {
        cadastroProdutosLogic.cadastrarNovoProdutoGS1();
    }
    @Then("o botao salvar nao devera ser habilitado sem categoria")
    public void o_botao_salvar_nao_devera_ser_habilitado_sem_categoria() {
        cadastroProdutosLogic.preenchimentosObrigatorios("Não foi possível cadastrar o produto. O preenchimento da categoria é obrigatório");
    }


    //Steps a baixo somente no caso de TENANT prefixo por SKU
    @When("selecionar novo e preencher todos os campos obrigatorios exceto prefixo")
    public void selecionar_novo_e_preencher_todos_os_campos_obrigatorios_exceto_prefixo() throws InterruptedException {
        cadastroProdutosLogic.cadastrarNovoProdutoPrefixoSKU();

    }
    @Then("o botao salvar nao devera ser habilitado sem o prefixo")
    public void o_botao_salvar_nao_devera_ser_habilitado_sem_o_prefixo() {
        cadastroProdutosLogic.preenchimentosObrigatorios("Não foi possível cadastrar o produto. O preenchimento do prefixo é obrigatório");
    }

    @Given("que o usuário não administrador faça login no rastro e esteja no dashboard")
    public void que_o_usuário_não_administrador_faça_login_no_rastro_e_esteja_no_dashboard() throws InterruptedException {
        cadastroProdutosLogic.acessoAoRastro();
    }
    @Then("nao sera permitido cadastrar o produto")
    public void nao_sera_permitido_cadastrar_o_produto() throws InterruptedException {
        cadastroProdutosLogic.validarCdastroProdutoUsuarioNotAdmin();

    }


    @Given("que o usuario cadastre um produto")
    public void que_o_usuario_cadastre_um_produto() throws InterruptedException {
        cadastroProdutosLogic.acessoAoRastro();
        cadastroProdutosLogic.menuCadastros();
        cadastroProdutosLogic.subMenuProdutos();
        cadastroProdutosLogic.cadastrarNovoProdutoGS1();
        cadastroProdutosLogic.validarCadastroProduto();
    }
    @When("retornar a listagem e buscar o produto pela descricao")
    public void retornar_a_listagem_e_buscar_o_produto_pela_descricao() throws InterruptedException {
        cadastroProdutosLogic.buscaDeProdutoPorDescricao();

    }
    @Then("o produto cadastrado deve constar na listagem de produtos")
    public void o_produto_cadastrado_deve_constar_na_listagem_de_produtos() throws InterruptedException {
        cadastroProdutosLogic.buscaDeProdutoPorDescricao();
        utils.fecharNavegador();

    }
    @When("ele ira selecionar novo e preencher os campos obrigatorios com um SKU ja cadastrado anteriomente")
    public void ele_ira_selecionar_novo_e_preencher_os_campos_obrigatorios_com_um_sku_ja_cadastrado_anteriomente() throws InterruptedException {
        cadastroProdutosLogic.cadastrarNovoProdutoGS1();

    }
    @Then("sera exibida a mensagem que O cadastro do produto ja existe")
    public void sera_exibida_a_mensagem_que_o_cadastro_do_produto_ja_existe() throws InterruptedException {
        utils.pausa(1000);
        cadastroProdutosLogic.validarProdutoJaCadastrado();
        utils.fecharNavegador();


    }

    @When("ele ira selecionar novo e preencher os campos obrigatorios com um GTIN ja cadastrado anteriomente")
    public void ele_ira_selecionar_novo_e_preencher_os_campos_obrigatorios_com_um_gtin_ja_cadastrado_anteriomente() throws InterruptedException {
        cadastroProdutosLogic.cadastrarNovoProdutoGS1();

    }

    @Given("que tenha um produto cadastrado")
    public void que_tenha_um_produto_cadastrado() throws InterruptedException {
        cadastroProdutosLogic.acessoAoRastro();
        cadastroProdutosLogic.menuCadastros();
        cadastroProdutosLogic.subMenuProdutos();



    }
    @When("o usuário excluir o produto")
    public void o_usuário_excluir_o_produto() throws InterruptedException {
        utils.pausa(1000);
        cadastroProdutosLogic.deletarProdutoPorNome();
        cadastroProdutosLogic.confirmacaoExclusao();


    }
    @Then("ele nao devera aparecer mais na lista")
    public void ele_nao_devera_aparecer_mais_na_lista() throws InterruptedException {
        cadastroProdutosLogic.buscaDeProdutoPorDescricao();



    }

    @When("ele incluir novamente o produto com os mesmos dados do anterior")
    public void ele_incluir_novamente_o_produto_com_os_mesmos_dados_do_anterior() throws InterruptedException {
        cadastroProdutosLogic.cadastrarNovoProdutoGS1();
        cadastroProdutosLogic.validarCadastroProduto();

    }
    @Then("o produto devera ser cadastrado com sucesso e ser exibido na lista")
    public void o_produto_devera_ser_cadastrado_com_sucesso_e_ser_exibido_na_lista() throws InterruptedException {
        cadastroProdutosLogic.buscaDeProdutoPorDescricao();


    }

    @Given("que um usuário not-admin faça login acesse um produto cadastrado")
    public void que_um_usuário_not_admin_faça_login_acesse_um_produto_cadastrado() throws InterruptedException {
        cadastroProdutosLogic.acessoAoRastro();
        cadastroProdutosLogic.menuCadastros();
        cadastroProdutosLogic.subMenuProdutos();

    }
    @Then("ele nao devera ter permissao para excluir")
    public void ele_nao_devera_ter_permissao_para_excluir() throws InterruptedException {
        utils.pausa(2000);
        cadastroProdutosLogic.mensagemNaoExclusaoProdutoUsuarioNotAdmin();
        utils.fecharNavegador();


    }

    @When("o usuário tentar excluir o produto")
    public void o_usuário_tentar_excluir_o_produto() throws InterruptedException {
        utils.pausa(1000);
        cadastroProdutosLogic.deletarProdutoPorNome();

        utils.clicar(cadastroProdutosPage.getBtnConfirmarExclusaoProduto());
        utils.pausa(1000);

    }

    @When("o usuário for editar o GTIN do produto")
    public void o_usuário_for_editar_o_gtin_do_produto() throws InterruptedException {
        utils.pausa(1000);
        utils.clicar(cadastroProdutosPage.getBtnEditarProduto(data.nomeProduto()));
        utils.pausa(1000);
        utils.apagar(cadastroProdutosPage.getCampoGTIN());
        utils.preencher(cadastroProdutosPage.getCampoGTIN(), data.GTIN());
        utils.clicar(cadastroProdutosPage.getBtnSalvar());

    }

    @Then("devera aparecer a mensagem {string}")
    public void devera_aparecer_a_mensagem(String string) throws InterruptedException {
        utils.pausa(1000);
        utils.validarTexto(cadastroProdutosPage.getValidarEdicaoProduto(string), string);
        utils.fecharNavegador();

    }

    @When("o usuário for editar o SKU do produto")
    public void o_usuário_for_editar_o_sku_do_produto() throws InterruptedException {
        utils.pausa(1000);
        utils.clicar(cadastroProdutosPage.getBtnEditarProduto(data.nomeProduto()));
        utils.pausa(1000);
        utils.apagar(cadastroProdutosPage.getCampoSKU());
        utils.preencher(cadastroProdutosPage.getCampoSKU(), data.SKU());
        utils.clicar(cadastroProdutosPage.getBtnSalvar());

    }

    @When("o usuário for editar a descricao do produto")
    public void o_usuário_for_editar_a_descricao_do_produto() throws InterruptedException {
        utils.pausa(1000);
        utils.clicar(cadastroProdutosPage.getBtnEditarProduto(data.nomeProduto()));
        utils.pausa(1000);
        utils.apagar(cadastroProdutosPage.getCampoDescricao());
        utils.preencher(cadastroProdutosPage.getCampoDescricao(), data.descricao());
        utils.clicar(cadastroProdutosPage.getBtnSalvar());
    }

    @When("o usuário for editar a categoria do produto")
    public void o_usuário_for_editar_a_categoria_do_produto() throws InterruptedException {
        utils.pausa(1000);
        utils.clicar(cadastroProdutosPage.getBtnEditarProduto(data.nomeProduto()));
        utils.pausa(1000);
        utils.apagar(cadastroProdutosPage.getCampoCategoria());
        utils.preencher(cadastroProdutosPage.getCampoCategoria(), data.categoria());
        utils.clicar(cadastroProdutosPage.getBtnSalvar());
    }

    @When("o usuário for editar o prefixo do produto")
    public void o_usuário_for_editar_o_prefixo_do_produto() throws InterruptedException {
        utils.pausa(1000);
        utils.clicar(cadastroProdutosPage.getBtnEditarProduto(data.nomeProduto()));
        utils.pausa(1000);
        utils.apagar(cadastroProdutosPage.getCampoPrefixo());
        utils.preencher(cadastroProdutosPage.getCampoPrefixo(), data.prefixo());
        utils.clicar(cadastroProdutosPage.getBtnSalvar());
    }

    @When("selecionar +Arquivo e fazer o upload do arquivo")
    public void selecionar_arquivo_e_fazer_o_upload_do_arquivo() throws InterruptedException {
        cadastroProdutosLogic.cadastrarProdutoPorArquivo();

    }
    @Then("sera exibida a mensagem {string}")
    public void sera_exibida_a_mensagem(String string) throws InterruptedException {
        utils.pausa(1000);
        cadastroProdutosLogic.validarUploadArquivo();


    }
    @When("selecionar o botao +Arquivo e fazer o upload do arquivo com as informações do produto que deseja atualizar")
    public void selecionar_o_botao_arquivo_e_fazer_o_upload_do_arquivo_com_as_informações_do_produto_que_deseja_atualizar() throws InterruptedException {
        cadastroProdutosLogic.cadastrarProdutoPorArquivo();

    }
    @Then("as alterações do produto editado deve constar na listagem de produtos")
    public void as_alterações_do_produto_editado_deve_constar_na_listagem_de_produtos() throws InterruptedException {
        cadastroProdutosLogic.buscaDeProdutoPorDescricao();
        utils.fecharNavegador();

    }













}
