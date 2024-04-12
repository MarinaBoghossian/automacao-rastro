import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.openqa.selenium.logging.LogType.BROWSER;
import static org.openqa.selenium.remote.BrowserType.*;

public class Properties {
    public static WebDriver driver;

    public static TipoExecucao TIPO_EXECUCAO = TipoExecucao.GRID;

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
    public enum Browsers{
        CHROME,
        FIREFOX
    }
    public enum TipoExecucao{
        LOCAL,
        GRID,
        NUVEM
    }


    //	private static WebDriver driver;
    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<WebDriver>(){
        @Override
        protected synchronized WebDriver initialValue(){
            return initDriver();
        }
    };

    private Properties() {}

    public static WebDriver getDriver(){
        return threadDriver.get();
    }

    public static WebDriver initDriver(){
        WebDriver driver = null;
        if(TIPO_EXECUCAO == TipoExecucao.LOCAL) {
            switch (BROWSER) {
                case FIREFOX: driver = new FirefoxDriver(); break;
                case CHROME: driver = new ChromeDriver(); break;
            }
        }
        if(TIPO_EXECUCAO == TipoExecucao.GRID) {
            DesiredCapabilities cap = null;
            switch (BROWSER) {
                case FIREFOX: cap = DesiredCapabilities.firefox(); break;
                case CHROME: cap = DesiredCapabilities.chrome(); break;
            }
            try {
                driver = new RemoteWebDriver(new URL("http://192.168.0.184:4444/wd/hub"), cap);
            } catch (MalformedURLException e) {
                System.err.println("Falha na conexão com o GRID");
                e.printStackTrace();
            }
        }
        if(TIPO_EXECUCAO == TipoExecucao.NUVEM) {
            DesiredCapabilities cap = null;
            switch (BROWSER) {
                case FIREFOX: cap = DesiredCapabilities.firefox(); break;
                case CHROME: cap = DesiredCapabilities.chrome(); break;
                case IE: cap = DesiredCapabilities.internetExplorer();
                    cap.setCapability("platform", "Windows 7");
                    cap.setCapability("version", "11.0");
                    break;
            }
            try {
                driver = new RemoteWebDriver(new URL("http://wcaquino5:172fcd87-6b7d-4c8d-8693-e20c903affa4@ondemand.saucelabs.com:80/wd/hub"), cap);
            } catch (MalformedURLException e) {
                System.err.println("Falha na conexão com a Saucelabs");
                e.printStackTrace();
            }
        }
        driver.manage().window().setSize(new Dimension(1200, 765));
        return driver;
    }

    public static void killDriver(){
        WebDriver driver = getDriver();
        if(driver != null) {
            driver.quit();
            driver = null;
        }
        if(threadDriver != null) {
            threadDriver.remove();
        }
    }


/*

    ChromeOptions browserOptions = new ChromeOptions();
browserOptions.setPlatformName("Windows 11");
browserOptions.setBrowserVersion("latest");
    Map<String, Object> sauceOptions = new HashMap<>();
sauceOptions.put("username", "oauth-marina.cboghossian-f644c");
sauceOptions.put("accessKey", "c9ac99e0-af46-4a7b-8a45-d24bfc94cc12");
sauceOptions.put("build", "selenium-build-C8FJJ");
sauceOptions.put("name", "<your test name>");
browserOptions.setCapability("sauce:options", sauceOptions);

*/

}



