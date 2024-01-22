package Logic.Checkpoint;

import Pages.Checkpoint.MenuCheckpointPage;
import Pages.Impressões.MenuImpressoesPage;
import Utils.Utils;
import org.openqa.selenium.WebDriver;

public class MenuCheckpointLogic {

    private  MenuCheckpointPage menuCheckpointPage;
    private WebDriver driver = null;
    private Utils utils;




    public MenuCheckpointLogic() {
        this.driver = driver;
        this.utils = new Utils();
        this.menuCheckpointPage = new MenuCheckpointPage();
    }


    public void checkpoint() throws InterruptedException {




        utils.pausa(2000);
        utils.clicar(menuCheckpointPage.getMenuCheckpoint());


    }
}


