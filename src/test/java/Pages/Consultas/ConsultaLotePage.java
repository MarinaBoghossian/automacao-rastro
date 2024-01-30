package Pages.Consultas;

import org.openqa.selenium.By;

public class ConsultaLotePage {

    private By subMenuConsultaLote = By.xpath("//span[text()='Lote']");
    private By campoLote = By.id("txt-data");
    private By campoDataProducao = By.xpath("//input[@placeholder='Data de Produção']");
    private By campoDataExpiracao = By.xpath("//input[@placeholder='Data de Expiração']");
    private By btnBuscar = By.xpath("//span[text()='Buscar']");
    private By validacaoLoteNaoEncontrado = By.xpath("//p[text()='O lote não foi encontrado.']");

    public By getSubMenuConsultaLote() {
        return subMenuConsultaLote;
    }

    public By getCampoLote() {
        return campoLote;
    }

    public By getCampoDataProducao() {
        return campoDataProducao;
    }

    public By getCampoDataExpiracao() {
        return campoDataExpiracao;
    }

    public By getBtnBuscar() {
        return btnBuscar;
    }

    public By getValidacaoLoteNaoEncontrado() {
        return validacaoLoteNaoEncontrado;
    }
}
