package Pages.Consultas;

import org.openqa.selenium.By;

public class MenuConsultasPage {

    private By menuConsultas = By.xpath("//span[text()='Consultas']");

    public By getMenuConsultas() {
        return menuConsultas;
    }
}
