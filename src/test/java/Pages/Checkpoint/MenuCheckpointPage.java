package Pages.Checkpoint;

import org.openqa.selenium.By;

public class MenuCheckpointPage {
    private By menuCheckpoint = By.xpath("//span[text()='Checkpoint']");

    public By getMenuCheckpoint() {
        return menuCheckpoint;
    }
}
