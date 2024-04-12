package Steps.Impressoes;

import Pages.Impressões.MenuImpressoesPage;
import Pages.Impressões.PainelImpressoPage;
import Utils.Utils;
import Utils.Data;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PainelImpressaoStep {

    Utils utils = new Utils();
    Data data = new Data();
    PainelImpressoPage painelImpressoPage = new PainelImpressoPage();
    MenuImpressoesPage menuImpressoesPage = new MenuImpressoesPage();

    @When("selecionar impressoes e a aba Painel de Impressao")
    public void selecionar_impressoes_e_a_aba_painel_de_impressao() {
        utils.clicar(menuImpressoesPage.getMenuImpressoes());
        utils.clicar(painelImpressoPage.getSubMenuPainelImpressao());



    }

    @When("selecionar o leitor e iniciar o painel")
    public void selecionar_o_leitor_e_iniciar_o_painel() throws InterruptedException {
        utils.clicar(painelImpressoPage.getComboSelecionarLeitor());
        utils.clicar(painelImpressoPage.getSelecionarLeitor(data.nomeLeitor()));
        utils.clicar(painelImpressoPage.getBtnIniciar());
        utils.pausa(10000);
        utils.clicar(painelImpressoPage.getBtnParar());

    }

    @Then("devera ser feita a leitura das impressoes pendentes")
    public void devera_ser_feita_a_leitura_das_impressoes_pendentes() {
        utils.validarTexto(painelImpressoPage.getValidarLeitura(), " Total de SKUs: ");

    }
}
