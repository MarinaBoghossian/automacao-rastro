package Steps.Inventario;

import Pages.Inventario.CampanhaPage;
import Pages.LoginPage;
import Utils.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utils.Data;

public class CampanhaTesteTrousseauStep {
    Utils utils = new Utils();
    Data data = new Data();
    LoginPage loginPage = new LoginPage();
    CampanhaPage campanhaPage = new CampanhaPage();

    @Given("que o usuário faça o login no Rastro  com o usuario {string} e esteja no dashboard")
    public void que_o_usuário_faça_o_login_no_rastro_com_o_usuario_e_esteja_no_dashboard(String usuario) throws InterruptedException {


        utils.abrirNavegador("https://rastroapp.rastreabilidadebrasil.com.br/");


        utils.pausa(2000);
        utils.preencher(loginPage.getCampoUsuario(), usuario);
        utils.preencher(loginPage.getCampoSenha(), "102030");
        utils.clicar(loginPage.getBtnEntrar());


        utils.pausa(2000);
        utils.clicar(loginPage.getBtnEscolhaUmSite());
        utils.clicar(loginPage.getBtnSite(data.site()));
        utils.clicar(loginPage.getBtnEntrarSite());


        utils.pausa(2000);
        utils.validarTexto(loginPage.getTxtDashboard(), "Dashboard");
        utils.pausa(1000);


    }

    @When("criar uma nova campanha e realizar a leitura dos itens")
    public void criar_uma_nova_campanha_e_realizar_a_leitura_dos_itens() {


    }


    @When("voltar aos portais, escolher um novo portal e realizar a leitura na mesma campanha por {int} vezes")
    public void voltar_aos_portais_escolher_um_novo_portal_e_realizar_a_leitura_na_mesma_campanha_por_vezes(Integer int1) {

    }

    @Then("cada leitura devera ser finalizada com no maximo {int} itens e no total devera ter por volta de {int} itens")
    public void cada_leitura_devera_ser_finalizada_com_no_maximo_itens_e_no_total_devera_ter_por_volta_de_itens(Integer int1, Integer int2) {

    }

    @When("consolidar os itens lidos sem nenhum erro")
    public void consolidar_os_itens_lidos_sem_nenhum_erro() {

    }

    @Then("a campanha devera ser finalizada com sucesso")
    public void a_campanha_devera_ser_finalizada_com_sucesso() {

    }

    @When("clicar em novo e inserir o nome da campanha")
    public void clicar_em_novo_e_inserir_o_nome_da_campanha() {
        utils.clicar(campanhaPage.getBtnNovaCampanha());
        utils.preencher(campanhaPage.getCampoNomeCampanha(), "Campanha Teste Automação");
    }

    @Then("clicar em salvar e a nova campanha será criada")
    public void clicar_em_salvar_e_a_nova_campanha_será_criada() {


        utils.clicar(campanhaPage.getBtnSalvar());
        utils.validarTexto(campanhaPage.getValidacaoCriarCampanha(), "Essa campanha foi cadastrada com sucesso!");

    }

    @When("acessar uma campanha existente {string} e realizar a leitura {string} {string} dos itens")
    public void acessar_uma_campanha_existente_e_realizar_a_leitura_dos_itens(String nomeCampanha, String nomeCheckpoint1, String nomeLeitura1) throws InterruptedException {
        utils.pausa(1000);
        utils.clicar(campanhaPage.getBtnDetalheCampanha(nomeCampanha));
        utils.pausa(1000);
        utils.clicar(campanhaPage.getBtnNovaContagem());
        utils.pausa(1000);
        utils.clicar(campanhaPage.getSelecaoCheckpoint(nomeCheckpoint1));
        utils.pausa(1000);
        utils.clicar(campanhaPage.getBtnIniciarCheckpoint());
        utils.pausa(3000);
        utils.clicar(campanhaPage.getBtnConcluirCheckpoint());
        utils.pausa(2000);
        utils.preencher(campanhaPage.getCampoNomeInventario(), nomeLeitura1);
        utils.clicar(campanhaPage.getBtnSalvar());
        utils.pausa(1000);
        utils.preencher(campanhaPage.getCampoObservacoes(), "tteste");
        utils.clicar(campanhaPage.getBtnSalvar());
        utils.pausa(10000);
        utils.validarTexto(campanhaPage.getValidacaoLeitura(), "Sucesso");

    }

    @When("voltar aos portais, escolher um novo portal {string} e realizar leituras {string} na mesma campanha por 5vezes em portais diferentes {string} {string} {string} {string} {string} {string}")
    public void voltar_aos_portais_escolher_um_novo_portal_e_realizar_leituras_na_mesma_campanha_por_5vezes_em_portais_diferentes(String nomeportal2, String nomeleitura2, String nomeportal3, String nomeportal4, String nomeportal5, String nomeleitura3, String nomeleitura4, String nomeleitura5) throws InterruptedException {
        utils.clicar(campanhaPage.getBtnVoltar());
        utils.pausa(1000);
        utils.clicar(campanhaPage.getSelecaoCheckpoint(nomeportal2));
        utils.pausa(1000);
        utils.clicar(campanhaPage.getBtnIniciarCheckpoint());
        utils.pausa(3000);
        utils.clicar(campanhaPage.getBtnConcluirCheckpoint());
        utils.pausa(2000);
        utils.preencher(campanhaPage.getCampoNomeInventario(), nomeleitura2);
        utils.clicar(campanhaPage.getBtnSalvar());
        utils.pausa(1000);
        utils.preencher(campanhaPage.getCampoObservacoes(), "tteste");
        utils.clicar(campanhaPage.getBtnSalvar());
        utils.pausa(10000);
        utils.validarTexto(campanhaPage.getValidacaoLeitura(), "Sucesso");

        utils.clicar(campanhaPage.getBtnVoltar());
        utils.pausa(1000);
        utils.clicar(campanhaPage.getSelecaoCheckpoint(nomeportal3));
        utils.pausa(1000);
        utils.clicar(campanhaPage.getBtnIniciarCheckpoint());
        utils.pausa(3000);
        utils.clicar(campanhaPage.getBtnConcluirCheckpoint());
        utils.pausa(2000);
        utils.preencher(campanhaPage.getCampoNomeInventario(), nomeleitura3);
        utils.clicar(campanhaPage.getBtnSalvar());
        utils.pausa(1000);
        utils.preencher(campanhaPage.getCampoObservacoes(), "tteste");
        utils.clicar(campanhaPage.getBtnSalvar());
        utils.pausa(10000);
        utils.validarTexto(campanhaPage.getValidacaoLeitura(), "Sucesso");

        utils.clicar(campanhaPage.getBtnVoltar());
        utils.pausa(1000);
        utils.clicar(campanhaPage.getSelecaoCheckpoint(nomeportal4));
        utils.pausa(1000);
        utils.clicar(campanhaPage.getBtnIniciarCheckpoint());
        utils.pausa(3000);
        utils.clicar(campanhaPage.getBtnConcluirCheckpoint());
        utils.pausa(2000);
        utils.preencher(campanhaPage.getCampoNomeInventario(), nomeleitura4);
        utils.clicar(campanhaPage.getBtnSalvar());
        utils.pausa(1000);
        utils.preencher(campanhaPage.getCampoObservacoes(), "tteste");
        utils.clicar(campanhaPage.getBtnSalvar());
        utils.pausa(10000);
        utils.validarTexto(campanhaPage.getValidacaoLeitura(), "Sucesso");

        utils.clicar(campanhaPage.getBtnVoltar());
        utils.pausa(1000);
        utils.clicar(campanhaPage.getSelecaoCheckpoint(nomeportal5));
        utils.pausa(1000);
        utils.clicar(campanhaPage.getBtnIniciarCheckpoint());
        utils.pausa(3000);
        utils.clicar(campanhaPage.getBtnConcluirCheckpoint());
        utils.pausa(2000);
        utils.preencher(campanhaPage.getCampoNomeInventario(), nomeleitura5);
        utils.clicar(campanhaPage.getBtnSalvar());
        utils.pausa(1000);
        utils.preencher(campanhaPage.getCampoObservacoes(), "tteste");
        utils.clicar(campanhaPage.getBtnSalvar());
        utils.pausa(10000);
        utils.validarTexto(campanhaPage.getValidacaoLeitura(), "Sucesso");

    }

    @Then("cada leitura devera ser finalizada com no maximo 1500itens e no total devera ter por volta de 5000itens")
    public void cada_leitura_devera_ser_finalizada_com_no_maximo_1500itens_e_no_total_devera_ter_por_volta_de_5000itens() {

    }

}
