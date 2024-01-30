package Pages.Conferencia;

import org.openqa.selenium.By;

public class MenuConferenciaPage {
    private By menuConferencia = By.xpath("//span[text()='Conferência']");

    public By getMenuConferencia() {
        return menuConferencia;
    }
}
