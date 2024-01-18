package Steps.Cadastros;

import Logic.Cadastros.CadastroProdutosGS1Logic;
import Logic.Cadastros.CadastroSitesLogic;
import Logic.Cadastros.MenuCadastrosLogic;
import Logic.LoginLogic;
import Pages.Cadastros.CadastroProdutosGS1Page;
import Pages.LoginPage;
import Steps.LoginStep;
import Utils.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CadastroSitesStep {
    Utils utils = new Utils();
    CadastroProdutosGS1Page cadastroProdutosGS1Page = new CadastroProdutosGS1Page();
    LoginPage loginPage = new LoginPage();
    LoginStep loginStep = new LoginStep();
    LoginLogic loginLogic = new LoginLogic();
    MenuCadastrosLogic menuCadastrosLogic = new MenuCadastrosLogic();
    CadastroProdutosGS1Logic cadastroProdutosGS1Logic = new CadastroProdutosGS1Logic();
    CadastroSitesLogic cadastroSitesLogic = new CadastroSitesLogic();

    @Given("que o usuário faça o login e esteja no dashboard")
    public void que_o_usuário_faça_o_login_e_esteja_no_dashboard()throws InterruptedException {
        String url = "https://rastroapp-homol.rastreabilidadebrasil.com.br/#/login";
        cadastroSitesLogic.acessoAoRastro();


    }

    @When("ir em cadastro e selecionar a aba sites")
    public void ir_em_cadastro_e_selecionar_a_aba_sites()throws InterruptedException {
        cadastroSitesLogic.menuCadastros();
        cadastroSitesLogic.subMenuSites();


    }

    @When("clilcar em novo e inserir os dados solicitados")
    public void clilcar_em_novo_e_inserir_os_dados_solicitados()throws InterruptedException {
        cadastroSitesLogic.cadastrarNovoSite();

    }

    @Then("aparecera a mensagem {string}")
    public void aparecera_a_mensagem(String string) throws InterruptedException{
        cadastroSitesLogic.validarCadastrSite();
    }
}
