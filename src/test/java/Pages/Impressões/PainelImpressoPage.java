package Pages.Impressões;

import org.openqa.selenium.By;

public class PainelImpressoPage {
    private By subMenuPainelImpressao = By.xpath("//span[text()='Painel de Impressão']");
    private By comboSelecionarLeitor = By.xpath("//span[text()='Selecione o Leitor*']");
    private By btnIniciar = By.xpath("//span[text()='Iniciar']");
    private By btnParar = By.xpath("//span[text()='Parar']");
    private By validarLeitura = By.xpath("//p[text()=' Total de SKUs: ']");
    private By selecionarNomeLeitor = By.xpath("");
    public By getSelecionarLeitor(String nomeLeitor) {
        return selecionarNomeLeitor = By.xpath("//span[text()='" + nomeLeitor + "']");}

    public By getSubMenuPainelImpressao() {
        return subMenuPainelImpressao;
    }

    public By getComboSelecionarLeitor() {
        return comboSelecionarLeitor;
    }

    public By getBtnIniciar() {
        return btnIniciar;
    }

    public By getBtnParar() {
        return btnParar;
    }

    public By getValidarLeitura() {
        return validarLeitura;
    }
}
