package Pages.Impressões;

import org.openqa.selenium.By;

public class ImpressaoRecodePage {

    private By subMenuRecode = By.xpath("//span[text()='Recode']");
    private By submenuImpressaoRecode = By.xpath("//span[text()='Impressão de Recode']");
    private By campoSelecioneEtiqueta =  By.xpath("//span[text()='Selecione uma Etiqueta']");
    private By campoSelecioneImpressora =  By.xpath("//span[text()='Selecione uma Impressora']");
    //inserir o nome da Etiqueta que deseja selecionar após o span text
    private By nomeEtiqueta =  By.xpath("//span[text()='teste recode']");
    //inserir o nome da Impressora que deseja selecionar após o span text
    private By nomeImpressora = By.xpath("//span[text()='tetsss11']");
    private By campoQuantidade = By.id("txt-qtd");
    private By btnImprimir = By.id("button");
    private By validarImpressaoRecode = By.xpath("//p[text()='A etiqueta foi impressa com sucesso.']");

    public By getSubMenuRecode() {
        return subMenuRecode;
    }

    public By getSubmenuImpressaoRecode() {
        return submenuImpressaoRecode;
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

    public By getCampoQuantidade() {
        return campoQuantidade;
    }

    public By getBtnImprimir() {
        return btnImprimir;
    }

    public By getValidarImpressaoRecode() {
        return validarImpressaoRecode;
    }
}
