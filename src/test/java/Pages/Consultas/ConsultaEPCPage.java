package Pages.Consultas;

import org.openqa.selenium.By;

public class ConsultaEPCPage {

    private By subMenuEPC = By.xpath("//span[text()='EPC']");
    private By campoInserirEPC = By.xpath("//div[@id='container']//input");
    private By btnBuscarEPC = By.xpath("//div[@id='container']//button");
    private By validarBuscarEPCTag = By.id("p-panel-10_header");
    private By validarBuscarEPCProduto = By.id("p-panel-11_header");
    private By validarBuscarEPCLinhaTempo = By.id("p-panel-12_header");
    private By btnBaixarPDF = By.xpath("//span[text()='PDF']");

    public By getSubMenuEPC() {
        return subMenuEPC;
    }

    public By getCampoInserirEPC() {
        return campoInserirEPC;
    }

    public By getBtnBuscarEPC() {
        return btnBuscarEPC;
    }

    public By getValidarBuscarEPCTag() {
        return validarBuscarEPCTag;
    }

    public By getValidarBuscarEPCProduto() {
        return validarBuscarEPCProduto;
    }

    public By getValidarBuscarEPCLinhaTempo() {
        return validarBuscarEPCLinhaTempo;
    }

    public By getBtnBaixarPDF() {
        return btnBaixarPDF;
    }
}
