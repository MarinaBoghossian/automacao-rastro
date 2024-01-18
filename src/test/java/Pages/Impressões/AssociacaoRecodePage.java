package Pages.Impressões;

import org.openqa.selenium.By;

public class AssociacaoRecodePage {

    private By subMenuAssociacaoRecode = By.xpath("//span[text()='Associação de Recode']");
    private By campoSKU = By.xpath("/html/body/app-root/app-main/div/div[2]/app-association-recode/div/div/div[2]/form/div/div[1]/div[1]/span/input");
    private By campoEPC = By.xpath("/html/body/app-root/app-main/div/div[2]/app-association-recode/div/div/div[2]/form/div/div[1]/div[2]/span/input");
    private By campoDetalhes = By.xpath("/html/body/app-root/app-main/div/div[2]/app-association-recode/div/div/div[2]/form/div/div[2]/div/span/input");
    private By btnAssociar = By.id("button");
    //precisa verificar o xpath do item abaixo
    private By validacaoAssociacaoRecode = By.xpath("//p[text()='A etiqueta foi associada com sucesso!']");

    public By getSubMenuAssociacaoRecode() {
        return subMenuAssociacaoRecode;
    }

    public By getCampoSKU() {
        return campoSKU;
    }

    public By getCampoEPC() {
        return campoEPC;
    }

    public By getCampoDetalhes() {
        return campoDetalhes;
    }

    public By getBtnAssociar() {
        return btnAssociar;
    }

    public By getValidacaoAssociacaoRecode() {
        return validacaoAssociacaoRecode;
    }
}
