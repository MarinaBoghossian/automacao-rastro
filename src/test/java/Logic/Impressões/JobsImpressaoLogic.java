package Logic.Impressões;

import Logic.LoginLogic;
import Pages.Impressões.JobsImpressaoPage;
import Pages.Impressões.ScanPrintPage;
import Utils.Utils;

public class JobsImpressaoLogic {

    LoginLogic loginLogic = new LoginLogic();
    Utils utils = new Utils();
    MenuImpressoesLogic menuImpressoesLogic = new MenuImpressoesLogic();
    JobsImpressaoPage jobsImpressaoPage = new JobsImpressaoPage();

    public void acessoAoRastro() throws InterruptedException {
        loginLogic.acessoAoRastro("marina@teste1.com", "102030");


    }

    public void menuImpressoes() throws InterruptedException {
        menuImpressoesLogic.impressoes();
    }

    public void subMenuJobsImpressao() throws InterruptedException {
        utils.clicar(jobsImpressaoPage.getSubmenuJobsImpressao());
        utils.pausa(1000);
    }

    public void consultarJobImpressao(){
        //dataHoraJob precisa seguir exatamente esse formato " 18/01/2024 09:07:16 "
        utils.clicar(jobsImpressaoPage.getDynamicElement(" 18/01/2024 09:07:16 "));
    }

    public void detalhesJob(){
        utils.obterTexto(jobsImpressaoPage.getDetalhesJob());
    }

    public void downloadJob(){
        utils.clicar(jobsImpressaoPage.getBtnDownloadJob());
    }

    public void validarDownload() throws InterruptedException {
        utils.pausa(1000);
        utils.historico();
        utils.pausa(1000);
        utils.validarTexto(jobsImpressaoPage.getNomeArquivo(), "job.txt");

    }
}
