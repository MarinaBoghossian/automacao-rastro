package Pages.Impressões;

import org.openqa.selenium.By;

public class ScanPrintPage {

    private By subMenuScanPrint = By.xpath("//span[text()='Scan Print']");
    private By campoSelecioneEtiqueta =  By.xpath("//span[text()='Selecione uma Etiqueta']");
    private By campoSelecioneImpressora =  By.xpath("//span[text()='Selecione uma Impressora']");
    //inserir o nome da Etiqueta que deseja selecionar após o span text
    private By nomeEtiqueta =  By.xpath("//span[text()='Teste Etiqueta 1']");
    //inserir o nome da Impressora que deseja selecionar após o span text
    private By nomeImpressora = By.xpath("//span[text()='tetsss11']");
    private By campoGTINSKU = By.id("txt-sku");
    private By btnImprimir = By.id("button");
    private By validarProdutoIncorreto = By.xpath("//p[text()='O produto não foi encontrado!']");
    private By validarScanPrint = By.xpath("//p[text()='A etiqueta foi impressa com sucesso.']");

    public By getSubMenuScanPrint() {
        return subMenuScanPrint;
    }

    public By getCampoSelecioneEtiqueta() {
        return campoSelecioneEtiqueta;
    }

    public By getCampoSelecioneImpressora() {
        return campoSelecioneImpressora;
    }

    public By getNomeEtiqueta() {
        return nomeEtiqueta;
    }

    public By getNomeImpressora() {
        return nomeImpressora;
    }

    public By getCampoGTINSKU() {
        return campoGTINSKU;
    }

    public By getBtnImprimir() {
        return btnImprimir;
    }

    public By getValidarProdutoIncorreto() {
        return validarProdutoIncorreto;
    }

    public By getValidarScanPrint() {
        return validarScanPrint;
    }
}
