package Pages.Consultas;

import org.openqa.selenium.By;

public class ConsultaEventoPage {

    private By subMenuEventos = By.xpath("//span[text()='Evento']");
    private By tipoEvento = By.xpath("/html/body/app-root/app-main/div/div[2]/app-event-query/div/p-table/div/div[1]/div[1]/div[2]/form/div/div[2]/p-dropdown/div/div[2]");
    private By nomeEvento =  By.xpath("");

    public By getDynamicElementNomeEvento(String nomeDoEvento)
    {return nomeEvento = By.xpath("//div[text()='" + nomeDoEvento + "']");}

    private By btnVerDetalheEvento = By.xpath("/html/body/app-root/app-main/div/div[2]/app-event-query/div/p-table/div/div[2]/table/tbody/tr[1]/td[8]/div/div/button");
    private By btnBaixarCSV = By.xpath("//span[text()='CSV']");
    private By mensagemDownload = By.xpath("//p[text()='O download foi iniciado.']");


    public By getSubMenuEventos() {
        return subMenuEventos;
    }

    public By getTipoEvento() {
        return tipoEvento;
    }

    public By getNomeEvento() {
        return nomeEvento;
    }

    public By getBtnVerDetalheEvento() {
        return btnVerDetalheEvento;
    }

    public By getBtnBaixarCSV() {
        return btnBaixarCSV;
    }

    public By getMensagemDownload() {
        return mensagemDownload;
    }
}
