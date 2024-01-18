package Pages.Cadastros;

import org.openqa.selenium.By;

public class CadastroSitesPage {
    private By subMenuSites = By.xpath("//span[text()='Sites']");
    private By sair = By.id("MENU.LOGOUT");

    private By btnNovoSite = By.id("button-new");
    private By campoNomeSite = By.id("txt-name");
    private By campoCNPJ = By.xpath("//*[@id='txt-cnpj']/input");
    private By btnSalvarSite = By.id("button-save");
    private By txtCadastroSite = By.xpath("//p[text()='O site foi cadastrado com sucesso!']");

    public By getSubMenuSites() {
        return subMenuSites;
    }

    public By getBtnNovoSite() {
        return btnNovoSite;
    }

    public By getCampoNomeSite() {
        return campoNomeSite;
    }

    public By getCampoCNPJ() {
        return campoCNPJ;
    }

    public By getBtnSalvarSite() {
        return btnSalvarSite;
    }

    public By getTxtCadastroSite() {
        return txtCadastroSite;
    }

    public By getSair() {
        return sair;
    }
}


