package Pages.Cadastros;
import org.openqa.selenium.By;
public class MenuCadastroPage {
    private By menuCadastros = By.xpath("//span[text()='Cadastros']");
    public By getMenuCadastros() {
        return menuCadastros;
    }

}
