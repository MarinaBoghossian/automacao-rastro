package Steps.Cadastros;

import Logic.Cadastros.CadastroProdutosLogic;
import Logic.Cadastros.CadastroSitesLogic;
import Logic.Cadastros.MenuCadastrosLogic;
import Logic.LoginLogic;
import Pages.Cadastros.CadastroProdutosPage;
import Pages.LoginPage;
import Steps.LoginStep;
import Utils.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CadastroSitesStep {

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
