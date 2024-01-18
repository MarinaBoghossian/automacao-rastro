package Logic.Impressões;

import Pages.Cadastros.MenuCadastroPage;
import Pages.Impressões.MenuImpressoesPage;
import Utils.Utils;
import org.openqa.selenium.WebDriver;

public class MenuImpressoesLogic {
    private final MenuImpressoesPage menuImpressoesPage;
    private WebDriver driver = null;
    private Utils utils;




    public MenuImpressoesLogic() {
        this.driver = driver;
        this.utils = new Utils();
        this.menuImpressoesPage = new MenuImpressoesPage();
    }


    public void impressoes() throws InterruptedException {




        utils.pausa(2000);
        utils.clicar(menuImpressoesPage.getMenuImpressoes());


    }
}
