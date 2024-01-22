package Pages.Checkpoint;

import org.openqa.selenium.By;

public class RealizarCheckpointPage {

    private By subMenuRealizarCheckpoint = By.xpath("//span[text()='Realizar Checkpoint']");
    private By btnSelecionarCheckpoint = By.xpath("");
    private By btnIniciarCheckpoint = By.xpath("//span[text()='Iniciar']");
    private By btnPararCheckpoint = By.xpath("//span[text()='Parar']");
    private By btnLimparCheckpoint = By.xpath("//span[text()='Limpar']");
    private By btnConcluirCheckpoint = By.xpath("//span[text()='Concluir']");
    private By validarNegativoLeitor = By.xpath("//p[text()='O agente de leitura não foi encontrado! Verifique se ele foi instalado e/ou está executando.']");

    public By getDynamicElement(String nomeCheckpoint) {
        return btnSelecionarCheckpoint = By.xpath("//div[text()='" + nomeCheckpoint + "']");}

    public By getSubMenuRealizarCheckpoint() {
        return subMenuRealizarCheckpoint;
    }

    public By getBtnSelecionarCheckpoint() {
        return btnSelecionarCheckpoint;
    }

    public By getBtnIniciarCheckpoint() {
        return btnIniciarCheckpoint;
    }

    public By getBtnPararCheckpoint() {
        return btnPararCheckpoint;
    }

    public By getBtnLimparCheckpoint() {
        return btnLimparCheckpoint;
    }

    public By getBtnConcluirCheckpoint() {
        return btnConcluirCheckpoint;
    }

    public By getValidarNegativoLeitor() {
        return validarNegativoLeitor;
    }
}
