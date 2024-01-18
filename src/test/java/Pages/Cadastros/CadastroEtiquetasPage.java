package Pages.Cadastros;

import org.openqa.selenium.By;

public class CadastroEtiquetasPage {

    public By subMenuEtiquetas = By.xpath("//span[text()='Etiquetas']");
    private By subMenuEtiquetaItem = By.xpath("//span[text()='Item']");
    private By subMenuEtiquetaAgregacao = By.xpath("//span[text()='Agregação']");
    private By btnNovaEtiqueta = By.id("button-new");
    private By campoNomeEtiqueta = By.id("txt-name");
    private By campoLargura = By.id("txt-width");
    private By campoAltura = By.id("txt-height");
    private By campoResolucao = By.id("txt-resolution");
    private By campoSelecionarImpressora = By.xpath("//*[@id='printer-select']/div/div[3]");
    private By campoNomeImpressora = By.xpath("/html/body/div/div[1]/div[2]/input");
    private By selectImpressora = By.xpath("/html/body/div/div[1]/div[2]");
    private By campoZPLLayout = By.id("txt-zpl-layout");
    private By campoZPLUnitario = By.id("txt-zpl-unit");
    private By btnSalvarEtiqueta = By.id("button-save");
    private By validarCadastroEtiqueta = By.xpath("//p[text()='A etiqueta foi cadastrada com sucesso!']");

    public By getSubMenuEtiquetas() {
        return subMenuEtiquetas;
    }

    public By getSubMenuEtiquetaItem() {
        return subMenuEtiquetaItem;
    }

    public By getSubMenuEtiquetaAgregacao() {
        return subMenuEtiquetaAgregacao;
    }

    public By getBtnNovaEtiqueta() {
        return btnNovaEtiqueta;
    }

    public By getCampoNomeEtiqueta() {
        return campoNomeEtiqueta;
    }

    public By getCampoLargura() {
        return campoLargura;
    }

    public By getCampoAltura() {
        return campoAltura;
    }

    public By getCampoResolucao() {
        return campoResolucao;
    }

    public By getCampoSelecionarImpressora() {
        return campoSelecionarImpressora;
    }

    public By getCampoNomeImpressora() {
        return campoNomeImpressora;
    }

    public By getSelectImpressora() {
        return selectImpressora;
    }

    public By getCampoZPLLayout() {
        return campoZPLLayout;
    }

    public By getCampoZPLUnitario() {
        return campoZPLUnitario;
    }

    public By getBtnSalvarEtiqueta() {
        return btnSalvarEtiqueta;
    }

    public By getValidarCadastroEtiqueta() {
        return validarCadastroEtiqueta;
    }
}
