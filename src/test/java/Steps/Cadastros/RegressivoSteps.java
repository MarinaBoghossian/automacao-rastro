package Steps.Cadastros;

import Logic.Cadastros.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegressivoSteps {
    CadastroProdutosLogic cadastroProdutosLogic = new CadastroProdutosLogic();
    CadastroSitesLogic cadastroSitesLogic = new CadastroSitesLogic();
    CadastroUsuarioLogic cadastroUsuarioLogic = new CadastroUsuarioLogic();
    CadastroImpressorasLogic cadastroImpressorasLogic = new CadastroImpressorasLogic();
    CadastroLeitorLogic cadastroLeitorLogic = new CadastroLeitorLogic();
    CadastroSpoolerLogic cadastroSpoolerLogic = new CadastroSpoolerLogic();
    CadastroEtiquetasLogic cadastroEtiquetasLogic = new CadastroEtiquetasLogic();
    CadastroCheckpointLogic cadastroCheckpointLogic = new CadastroCheckpointLogic();
    CadastroSLALogic cadastroSLALogic = new CadastroSLALogic();

    @Given("cadastre um produto")
    public void cadastre_um_produto() throws InterruptedException {
        cadastroProdutosLogic.menuCadastros();
        cadastroProdutosLogic.subMenuProdutos();
        cadastroProdutosLogic.cadastrarNovoProdutoGS1();
        cadastroProdutosLogic.validarCadastroProduto();
    }

    @Given("cadastre um site")
    public void cadastre_um_site() throws InterruptedException {
        cadastroSitesLogic.menuCadastros();
        cadastroSitesLogic.subMenuSites();
        cadastroSitesLogic.cadastrarNovoSite();
        cadastroSitesLogic.validarCadastrSite();

    }

    @Given("cadastre um usuario")
    public void cadastre_um_usuario() throws InterruptedException {
        cadastroUsuarioLogic.menuCadastros();
        cadastroUsuarioLogic.subMenuUsuario();
        cadastroUsuarioLogic.cadastrarNovoUsuario();
       }

    @Given("cadastre uma impressora")
    public void cadastre_uma_impressora() throws InterruptedException {
        cadastroImpressorasLogic.menuCadastros();
        cadastroImpressorasLogic.subMenuImpressoras();
        cadastroImpressorasLogic.cadastrarNovaImpressora();
    }

    @Given("cadastre um leitor")
    public void cadastre_um_leitor() throws InterruptedException {
        cadastroLeitorLogic.menuCadastros();
        cadastroLeitorLogic.subMenuLeitores();
        cadastroLeitorLogic.cadastroNovoLeitor();
    }

    @Given("cadastre um spooler")
    public void cadastre_um_spooler() throws InterruptedException {
        cadastroSpoolerLogic.menuCadastros();
        cadastroSpoolerLogic.subMenuSpoolers();
        cadastroSpoolerLogic.cadastroNovoSpooler();
    }

    @Given("cadastre uma etiqueta item")
    public void cadastre_uma_etiqueta_item() throws InterruptedException {
        cadastroEtiquetasLogic.menuCadastros();
        cadastroEtiquetasLogic.subMenuEtiquetaItem();
        cadastroEtiquetasLogic.cadastrarNovaEtiqueta();
       }

    @Given("cadastre uma etiqueta agregacao")
    public void cadastre_uma_etiqueta_agregacao() throws InterruptedException {
        cadastroEtiquetasLogic.menuCadastros();
        cadastroEtiquetasLogic.subMenuEtiquetaAgregacao();
        cadastroEtiquetasLogic.cadastrarNovaEtiqueta();
        }

    @Given("cadastre um checkpoint")
    public void cadastre_um_checkpoint() throws InterruptedException {
        cadastroCheckpointLogic.menuCadastros();
        cadastroCheckpointLogic.subMenuCheckpoints();
        cadastroCheckpointLogic.cadastrarNovoCheckpoint();
        }
    @Given("cadastre um SLA")
    public void cadastre_um_SLA() throws InterruptedException {
        cadastroSLALogic.menuCadastros();
        cadastroSLALogic.subMenuSLA();
        cadastroSLALogic.novoSLA();
    }
    @When("todos os ites forem cadastrados")
    public void todos_os_ites_forem_cadastrados() {
        }

    @Then("fazer a conferencia se os cadastros estao retornando corretamente em suas respectivas listas")
    public void fazer_a_conferencia_se_os_cadastros_estao_retornando_corretamente_em_suas_respectivas_listas() {
       }

}
