package Steps.Impressoes;

import Logic.Impressões.JobsImpressaoLogic;
import Utils.Utils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JobsImpressaoStep {
    JobsImpressaoLogic jobsImpressaoLogic = new JobsImpressaoLogic();
    Utils utils = new Utils();

    @When("selecionar impressoes e a aba Jobs de Impressão")
    public void selecionar_impressoes_e_a_aba_jobs_de_impressão() throws InterruptedException {
        jobsImpressaoLogic.menuImpressoes();
        utils.pausa(1000);
        jobsImpressaoLogic.subMenuJobsImpressao();

    }
    @When("consultar os detalhes do job requerido e fazer o download")
    public void consultar_os_detalhes_do_job_requerido_e_fazer_o_download() throws InterruptedException {
        jobsImpressaoLogic.consultarJobImpressao();
        utils.pausa(1000);
        jobsImpressaoLogic.detalhesJob();
        utils.pausa(1000);
        jobsImpressaoLogic.downloadJob();

    }
    @Then("o documento do job será baixado")
    public void o_documento_do_job_será_baixado() throws InterruptedException {
        utils.pausa(5000);
        jobsImpressaoLogic.validarDownload();

    }


}
