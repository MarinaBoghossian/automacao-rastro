package Pages.Cadastros;

import org.openqa.selenium.By;

public class CadastroSpoolerPage {

    public By subMenuSpooler = By.xpath("//span[text()='Spoolers de Impressão']");
    public By btnNovoSpooler = By.id("button-new");
    public By campoNomeSpooler = By.id("txt-name");
    public By campoDescricaoSpooler = By.id("txt-description");
    public By btnSalvarSpooler = By.id("button-save");
    public By validarCadastroSpooler = By.xpath("//p[text()='O spooler foi cadastrado com sucesso!']");

    public By getSubMenuSpooler() {
        return subMenuSpooler;
    }

    public By getBtnNovoSpooler() {
        return btnNovoSpooler;
    }

    public By getCampoNomeSpooler() {
        return campoNomeSpooler;
    }

    public By getCampoDescricaoSpooler() {
        return campoDescricaoSpooler;
    }

    public By getBtnSalvarSpooler() {
        return btnSalvarSpooler;
    }

    public By getValidarCadastroSpooler() {
        return validarCadastroSpooler;
    }
}
