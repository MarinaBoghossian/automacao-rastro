package Pages.Conferencia;

import org.openqa.selenium.By;

public class GestaoConferenciaPage {

    private By subMenuGestaoCoferencia = By.xpath("//span[text()='Gestão de Conferência']");
    private By btnSubirArquivo = By.xpath("//span[text()='Arquivo']");
    private By btnVerDetalhesConferencia = By.id("olho");
    private By btnExcluirOrdemConferencia = By.id("excluir-conferencia");
    private By validarGTINconferencia = By.xpath("");

    public By getDynamicvalidarGTINconferencia(String numeroGTIN)
    {return validarGTINconferencia = By.xpath("//td[text()=" + numeroGTIN +"]");}


}
