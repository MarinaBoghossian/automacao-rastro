package Logic.Cadastros;

import Pages.Cadastros.MenuCadastroPage;
import Utils.Utils;
import org.openqa.selenium.WebDriver;


public class MenuCadastrosLogic {

private WebDriver driver = null;
private final Utils utils;
private final MenuCadastroPage menuCadastroPage;




    public MenuCadastrosLogic() {
        this.driver = driver;
        this.utils = new Utils();
        this.menuCadastroPage = new MenuCadastroPage();
    }


    public void cadastros() throws InterruptedException {




        utils.pausa(2000);
        utils.clicar(menuCadastroPage.getMenuCadastros());


    }


}