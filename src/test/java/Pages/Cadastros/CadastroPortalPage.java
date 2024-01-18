package Pages.Cadastros;

import org.openqa.selenium.By;

public class CadastroPortalPage {

    private By subMenuPortal = By.xpath("//span[text()='Portal']");
    private By btnNovoPortal = By.id("button-new");
    private By campoNomePortal = By.id("txt-name");
    private By campoEvento = By.xpath("//*[@id='event-list']/div/div[2]");
    private By selectNomeEvento = By.xpath("//div[text()=' CHECKIN ']");
    private By campoImpressora = By.xpath("//*[@id='printer-list']/div");
    private By selectNomeImpressora = By.xpath("//span[text()='tetsss11']");
    private By campoLeitor = By.xpath("//*[@id='reader-list']/div");
    private By selectNomeLeitor = By.xpath("//span[text()='LEITOR 7']");
    private By btnSalvarNovoPortal = By.id("button-save");
    private By validarCadastroPortal = By.xpath("//p[text()='O portal foi cadastrado com sucesso!']");

    public By getSubMenuPortal() {
        return subMenuPortal;
    }

    public By getBtnNovoPortal() {
        return btnNovoPortal;
    }

    public By getCampoNomePortal() {
        return campoNomePortal;
    }

    public By getCampoEvento() {
        return campoEvento;
    }

    public By getCampoImpressora() {
        return campoImpressora;
    }

    public By getSelectNomeImpressora() {
        return selectNomeImpressora;
    }

    public By getCampoLeitor() {
        return campoLeitor;
    }

    public By getSelectNomeLeitor() {
        return selectNomeLeitor;
    }

    public By getBtnSalvarNovoPortal() {
        return btnSalvarNovoPortal;
    }

    public By getValidarCadastroPortal() {
        return validarCadastroPortal;
    }

    public By getSelectNomeEvento() {
        return selectNomeEvento;
    }
}
