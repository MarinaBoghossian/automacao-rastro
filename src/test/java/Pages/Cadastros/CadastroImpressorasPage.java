package Pages.Cadastros;

import org.openqa.selenium.By;

public class CadastroImpressorasPage {

    private By subMenuImpressoras = By.xpath("//*[@id='MENU.PRINTERS']");
    private By menuCadastros = By.xpath("//span[text()='Cadastros']");
    private By btnNovaImpressora = By.id("button-new");
    private By campoNomeImpressora = By.id("txt-name");
    private By campoEnderecoIP = By.id("txt-ipAddress");
    private By campoPorta = By.id("txt-portNumber");
    private By campoTempoSpooler = By.id("time-spooler");
    private By campoModeloImpressora = By.xpath("/html/body/app-root/app-main/div/div[2]/app-printers-list/p-dialog[3]/div/div/div[2]/form/div/div/div[3]/div[2]/span/p-dropdown/div/div[2]");
    private By modeloZebraZT410 = By.xpath("//span[text()='Zebra ZT410']");
    private By modeloZebraZM400 = By.xpath("//span[text()='Zebra ZM400']");
    private By modeloSATOCL4NX = By.xpath("//span[text()='SATO CL4NX']");
    private By campoDescricao = By.id("txt-descriptionName");
    private By btnSalvarImpressora = By.id("button-save");
    private By validarCadastroImpressora = By.xpath("//p[text()='A impressora foi cadastrada com sucesso!']");

    public By getSubMenuImpressoras() {
        return subMenuImpressoras;
    }

    public By getBtnNovaImpressora() {
        return btnNovaImpressora;
    }

    public By getCampoNomeImpressora() {
        return campoNomeImpressora;
    }

    public By getCampoEnderecoIP() {
        return campoEnderecoIP;
    }

    public By getCampoPorta() {
        return campoPorta;
    }

    public By getCampoTempoSpooler() {
        return campoTempoSpooler;
    }

    public By getCampoModeloImpressora() {
        return campoModeloImpressora;
    }

    public By getModeloZebraZT410() {
        return modeloZebraZT410;
    }

    public By getModeloZebraZM400() {
        return modeloZebraZM400;
    }

    public By getModeloSATOCL4NX() {
        return modeloSATOCL4NX;
    }

    public By getCampoDescricao() {
        return campoDescricao;
    }

    public By getBtnSalvarImpressora() {
        return btnSalvarImpressora;
    }

    public By getValidarCadastroImpressora() {
        return validarCadastroImpressora;
    }

    public By getMenuCadastros() {
        return menuCadastros;
    }
}
