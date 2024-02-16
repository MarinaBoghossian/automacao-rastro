package Utils;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utils {

	public static WebDriver driver;


	public boolean clicar (By elemento) {

	
	driver.findElement(elemento).click();

        return false;
    }
	
	public void preencher (By elemento, String texto) {
	
		driver.findElement(elemento).sendKeys(texto);
		
	}
	
	public void pausa (int tempo)  throws InterruptedException{
		
		Thread.sleep(tempo);
	
	}
	
	
public void fecharNavegador ()  {
		
		driver.quit();
	
	}
	
public void abrirNavegador (String url)  {
	System.setProperty("webdriver.chrome.driver", "./Drive/chromedriver.exe");
driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();

	//comando para posicionar a tela (caso estiver trabalhando em duas telas e quiser que o codigo rode na outra tela.
	//OBS: substituir o .maximize pelo código abaixo, os dois juntos não irá funcionar
	// driver.manage().window().setPosition(newPoint(x,y)
	//no x, y colocar a posição da tela desejada. Ex: 100,100

	//comando para definir o tamanho da tela
	// driver.manage().window().setSize(newDimension(x,y)

	//driver.close()  - fechar apenas uma aba do browser

}

	public void abrirNovaGuia (String url)  {

		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		driver.get(url);
		}

public boolean validarTexto(By elemento, String texto) {
	
	
String TextoTela = driver.findElement(elemento).getText();

  assertEquals(texto, TextoTela);


    return false;
}
public void obterTexto(By elemento) {


		 driver.findElement(elemento).getText();

	}
	public void apagar(By elemento) {

		driver.findElement(elemento).clear();


	}

	public void MouseHover(By elemento) {

		WebElement iframe = driver.findElement(elemento);
		new Actions(driver)
				.moveToElement(iframe)
				.click()
				.build()
				.perform();
	}

	public void scroll(){
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300)");
	}

	public void selecionarCombo(By elemento, String valor){
		//método para selecionar informações quando há um combobox com várias opções
		WebElement element = driver.findElement(elemento);
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);

		//posso utilizar também a seleção por Index que é pela ordem da listagem de opções do combobox ou pelo value do inspecionar
		//combo.selectByIndex(valor);
		//combo.selectByValue(valor);

	}


// atalhos adicionais
	// pular linha usar comando '/n'

	public void confirmarAlerta(String mensagemAlerta, String mensagemAlerta2){

		Alert alerta = driver.switchTo().alert();
		Assert.assertEquals(mensagemAlerta, alerta.getText());
		Assert.assertEquals(mensagemAlerta2, alerta.getText());
		alerta.accept();

	}

	public void cancelarAlerta (String mensagemAlerta, String mensagemAlerta2){
		Alert alerta = driver.switchTo().alert();
		Assert.assertEquals(mensagemAlerta, alerta.getText());
		Assert.assertEquals(mensagemAlerta2, alerta.getText());
		alerta.dismiss();
	}


	public void historico ()  {

		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"J");
		driver.navigate().to("chrome://downloads/");

	}



}
