package Logic.Consultas;

import Pages.Checkpoint.MenuCheckpointPage;
import Pages.Consultas.MenuConsultasPage;
import Utils.Utils;
import org.openqa.selenium.WebDriver;

public class MenuConsultasLogic {

    private WebDriver driver = null;
    private Utils utils;
    private MenuConsultasPage menuConsultasPage;




    public MenuConsultasLogic() {
        this.driver = driver;
        this.utils = new Utils();
        this.menuConsultasPage = new MenuConsultasPage();
    }


    public void consultas() throws InterruptedException {




        utils.pausa(2000);
        utils.clicar(menuConsultasPage.getMenuConsultas());


    }
}

