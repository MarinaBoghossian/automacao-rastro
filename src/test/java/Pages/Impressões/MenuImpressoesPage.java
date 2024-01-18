package Pages.Impressões;

import org.openqa.selenium.By;

public class MenuImpressoesPage {

    private By menuImpressoes = By.xpath("//span[text()='Impressões']");

    public By getMenuImpressoes() {
        return menuImpressoes;
    }
}
