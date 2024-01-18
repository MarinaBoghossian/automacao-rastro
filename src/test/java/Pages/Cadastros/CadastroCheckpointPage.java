package Pages.Cadastros;

import org.openqa.selenium.By;

public class CadastroCheckpointPage {

    private By subMenuCheckpoints = By.xpath("//span[text()='Checkpoints']");
    private By btnNovoCheckpoint = By.id("button-new");
    private By campoNomeCheckpoint = By.id("txt-name");
    private By campoEscolhaLeitor =  By.xpath("//span[text()='Escolha um Leitor*']");
    private By selectNomeLeitor = By.xpath("//span[text()='LEITOR 7']");
    private By campoDuracaoCheckpoint = By.id("duration");
    private By campoIntegracao = By.xpath("//*[@id=\"pr_id_9_label\"]");
    private By selectIntegracao = By.xpath("//div[text()=' Entrada ']");
    private By campoEvento = By.xpath("/html/body/app-root/app-main/div/div[2]/app-checkpoint-list/p-dialog[3]/div/div/div[2]/form/div/div/div/div[3]/div/span/p-dropdown/div/div[2]");
    private By selectEvento = By.xpath("//div[text()='CHECKOUT']");
    private By btnSalvarChekpoint = By.id("button-save");
    private By validarNovoCheckpoint = By.xpath("//p[text()='O checkpoint foi cadastro com sucesso!']");

    public By getSubMenuCheckpoints() {
        return subMenuCheckpoints;
    }

    public By getBtnNovoCheckpoint() {
        return btnNovoCheckpoint;
    }

    public By getCampoNomeCheckpoint() {
        return campoNomeCheckpoint;
    }

    public By getCampoEscolhaLeitor() {
        return campoEscolhaLeitor;
    }

    public By getSelectNomeLeitor() {
        return selectNomeLeitor;
    }

    public By getCampoDuracaoCheckpoint() {
        return campoDuracaoCheckpoint;
    }

    public By getCampoIntegracao() {
        return campoIntegracao;
    }

    public By getSelectIntegracao() {
        return selectIntegracao;
    }

    public By getCampoEvento() {
        return campoEvento;
    }

    public By getSelectEvento() {
        return selectEvento;
    }

    public By getBtnSalvarChekpoint() {
        return btnSalvarChekpoint;
    }

    public By getValidarNovoCheckpoint() {
        return validarNovoCheckpoint;
    }
}
