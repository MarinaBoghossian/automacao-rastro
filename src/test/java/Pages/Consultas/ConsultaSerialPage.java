package Pages.Consultas;

import org.openqa.selenium.By;

public class ConsultaSerialPage {

    private By subMenuSerial = By.xpath("//span[text()='Serial']");
    private By campoDigitarSerial = By.xpath("//div[@id='container']//input");
    private By btnBuscarSerial = By.xpath("//div[@id='container']//button");
    private By validacaoSerialIncorreto = By.xpath("//p[text()='A etiqueta não foi encontrada.']");

    public By getSubMenuSerial() {
        return subMenuSerial;
    }

    public By getCampoDigitarSerial() {
        return campoDigitarSerial;
    }

    public By getBtnBuscarSerial() {
        return btnBuscarSerial;
    }

    public By getValidacaoSerialIncorreto() {
        return validacaoSerialIncorreto;
    }
}
