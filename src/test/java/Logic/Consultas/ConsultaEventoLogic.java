package Logic.Consultas;

import Pages.Consultas.ConsultaEventoPage;
import Utils.Utils;

public class ConsultaEventoLogic {
        ConsultaEventoPage consultaEventoPage = new ConsultaEventoPage();
        Utils utils = new Utils();

    public void subMenuEvento(){
        utils.clicar(consultaEventoPage.getSubMenuEventos());

    }

    public void consultarUltimoEvento(){
        utils.clicar(consultaEventoPage.getBtnVerDetalheEvento());
    }

    public void downloadCSV(){
        utils.clicar(consultaEventoPage.getBtnBaixarCSV());
    }
}
