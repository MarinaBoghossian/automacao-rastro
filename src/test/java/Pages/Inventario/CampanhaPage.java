package Pages.Inventario;

import org.openqa.selenium.By;

public class CampanhaPage {

    private By subMenuInventario = By.xpath("//span[text()='Inventário']");
    private By subMenuCampanha = By.xpath("//span[text()='Campanha']");
    private By btnNovaCampanha = By.xpath("//span[text()='Novo']");
    private By campoNomeCampanha = By.id("txt-name");
    private By btnSalvar = By.xpath("//span[text()='Salvar']");
    private By validacaoCriarCampanha = By.xpath("//p[text()='Essa campanha foi cadastrada com sucesso!']");
    private By confirmarExclusaoCampanha = By.xpath("//p[text()='Você tem certeza que deseja excluir?']");
    private By validacaoExcluirCampanha = By.xpath("//p[text()='A campanha foi excluída com sucesso!']");
    private By btnOK = By.xpath("//button[@label='OK']");
    private By btnSim = By.xpath("//span[text()='Sim']");
    private By btnDetalheCampanha = By.xpath("");
    private By buscaCampanhaNome = By.xpath("");
    private By btnEditarCampanha = By.xpath("");
    private By btnDeletarCampanha = By.xpath("");
    private By btnNovaContagem = By.xpath("//span[text()='Nova Contagem']");
    private By selecaoCheckpoint= By.xpath("");
    private By btnIniciarCheckpoint = By.xpath("//span[text()='Iniciar']");
    private By btnConcluirCheckpoint = By.xpath("//span[text()='Concluir']");
    public By getBtnDetalheCampanha(String nomeCampanha) {
        return btnDetalheCampanha = By.xpath("//td[text()='" + nomeCampanha + "']//following::p-button[@styleclass='p-button-info']");
    }
    public By getBtnEditarCampanha(String nomeCampanha) {
        return btnEditarCampanha = By.xpath("//td[text()='" + nomeCampanha + "']//following::p-button[@styleclass='p-button-success']");
    }
    public By getBtnDeletarCampanha(String nomeCampanha) {
        return btnDeletarCampanha = By.xpath("//td[text()='" + nomeCampanha + "']//following::p-button[@styleclass='p-button-danger']");}
    public By getSelecaoCheckpoint(String nomeCheckpoint){
        return selecaoCheckpoint = By.xpath("//div[text()=' " + nomeCheckpoint + " ']");
    }

    public By getSubMenuInventario() {
        return subMenuInventario;
    }

    public By getBtnNovaCampanha() {
        return btnNovaCampanha;
    }

    public By getCampoNomeCampanha() {
        return campoNomeCampanha;
    }

    public By getValidacaoCriarCampanha() {
        return validacaoCriarCampanha;
    }

    public By getBtnOK() {
        return btnOK;
    }

      public By getBtnNovaContagem() {
        return btnNovaContagem;
    }

    public By getSelecaoCheckpoint() {
        return selecaoCheckpoint;
    }

    public By getBtnIniciarCheckpoint() {
        return btnIniciarCheckpoint;
    }

    public By getBtnConcluirCheckpoint() {
        return btnConcluirCheckpoint;
    }

    public By getSubMenuCampanha() {
        return subMenuCampanha;
    }

    public By getBtnSalvar() {
        return btnSalvar;
    }

    public By getBtnSim() {
        return btnSim;
    }

    public By getConfirmarExclusaoCampanha() {
        return confirmarExclusaoCampanha;
    }

    public By getValidacaoExcluirCampanha() {
        return validacaoExcluirCampanha;
    }
}
