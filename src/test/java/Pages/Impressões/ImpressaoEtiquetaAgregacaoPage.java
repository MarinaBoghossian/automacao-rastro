package Pages.Impressões;

import org.openqa.selenium.By;

public class ImpressaoEtiquetaAgregacaoPage {
    private By subMenuImpressaoAgregacao = By.xpath("//span[text()='Agregação']");
    private By campoSelecionarEtiqueta = By.xpath("//span[text()='Selecione uma Etiqueta*']");
    private By nomeEtiqueta =  By.xpath("//span[text()='Teste Etiqueta 1']");
    private By campoSelecionarImpressora = By.xpath("//span[text()='Selecione uma Impressora*']");
    private By nomeImpressora = By.xpath("//span[text()='tetsss11']");
    private By campoQuantidade = By.xpath("/html/body/app-root/app-main/div/div[2]/app-aggregation-print/div/div/form/div[2]/div/input");
    private By btnImprimir = By.xpath("//span[text()='Imprimir']");
    private By validarImpressaoEtiquetaAgregacao = By.xpath("//p[text()='A etiqueta selecionada será impressa. Aguarde!']");
    private By validarAlerta1 = By.xpath("//span[text()='ATENÇÃO!']");
    private By validarAlerta2 = By.xpath("//p[text()='Você realmente deseja imprimir a etiqueta de agregação?']");
    private By btnImprimir2 = By.xpath("/html/body/app-root/app-main/div/div[2]/app-aggregation-print/p-dialog[2]/div/div/div[3]/p-footer/p-button/button/span[2]");

    public By getSubMenuImpressaoAgregacao() {
        return subMenuImpressaoAgregacao;
    }

    public By getCampoSelecionarEtiqueta() {
        return campoSelecionarEtiqueta;
    }

    public By getCampoSelecionarImpressora() {
        return campoSelecionarImpressora;
    }

    public By getCampoQuantidade() {
        return campoQuantidade;
    }

    public By getBtnImprimir() {
        return btnImprimir;
    }

    public By getValidarImpressaoEtiquetaAgregacao() {
        return validarImpressaoEtiquetaAgregacao;
    }

    public By getNomeEtiqueta() {
        return nomeEtiqueta;
    }

    public By getNomeImpressora() {
        return nomeImpressora;
    }

    public By getValidarAlerta1() {
        return validarAlerta1;
    }

    public By getValidarAlerta2() {
        return validarAlerta2;
    }

    public By getBtnImprimir2() {
        return btnImprimir2;
    }
}
