package Pages.Impressões;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class JobsImpressaoPage {

    private By submenuJobsImpressao = By.xpath("//span[text()='Jobs de Impressão']");
    private By btnDownloadJob = By.xpath("//span[text()='Download Job']");
    private By detalhesJob = By.xpath("/html/body/app-root/app-main/div/div[2]/app-print-jobs/p-dialog[2]/div/div/div[2]");
    private By tituloJobImpressao = By.xpath("//div[text()='Jobs de Impressão']");
    private By tituloDetalhesJob = By.id("pr_id_6-label");

    private By nomeArquivo = By.xpath("//span[text()='job.txt']");

    public By getDynamicElement(String dataHoraJob) {
        return tituloJobImpressao = By.xpath("//td[text()='" + dataHoraJob + "']//following::span[1]");}


    public By getSubmenuJobsImpressao() {
        return submenuJobsImpressao;
    }

    public By getBtnDownloadJob() {
        return btnDownloadJob;
    }

    public By getDetalhesJob() {
        return detalhesJob;
    }

    public By getTituloJobImpressao() {
        return tituloJobImpressao;
    }

    public By getTituloDetalhesJob() {
        return tituloDetalhesJob;
    }

    public By getNomeArquivo() {
        return nomeArquivo;
    }
}
