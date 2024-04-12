package Logic.Checkpoint;

import Logic.LoginLogic;
import Pages.Checkpoint.RealizarCheckpointPage;
import Pages.LoginPage;
import Utils.Utils;
import Utils.Data;

public class RealizarCheckpointLogic {
    LoginLogic loginLogic = new LoginLogic();
    Utils utils = new Utils();
    MenuCheckpointLogic menuCheckpointLogic = new MenuCheckpointLogic();
    RealizarCheckpointPage realizarCheckpointPage = new RealizarCheckpointPage();
    LoginPage loginPage = new LoginPage();
    Data data = new Data();



    public void acessoAoRastro() throws InterruptedException {
        String url = "https://rastroapp-homol.rastreabilidadebrasil.com.br/#/login";
        utils.abrirNavegador(url);


        utils.pausa(2000);
        utils.preencher(loginPage.getCampoUsuario(), data.usuario());
        utils.preencher(loginPage.getCampoSenha(), data.senha());
        utils.clicar(loginPage.getBtnEntrar());


        utils.pausa(9000);
        utils.clicar(loginPage.getBtnEscolhaUmSite());
        utils.clicar(loginPage.getBtnSite("Automatizados"));
        utils.clicar(loginPage.getBtnEntrarSite());


        utils.pausa(2000);
        utils.validarTexto(loginPage.getTxtDashboard(), "Dashboard");
        utils.pausa(1000);


    }
    public void menuCheckpoint() throws InterruptedException {
        menuCheckpointLogic.checkpoint();
        utils.pausa(1000);

    }

    public void subMenuRealizarCheckpoint(){
        utils.clicar(realizarCheckpointPage.getSubMenuRealizarCheckpoint());
    }

    public void realizarNovoChekpoint() throws InterruptedException {
        utils.clicar(realizarCheckpointPage.getDynamicElement(" Teste Checkpoint 1 "));
        utils.pausa(2000);
        utils.clicar(realizarCheckpointPage.getBtnIniciarCheckpoint());
        utils.pausa(2000);
    }

    public void validacaoNegativaCheckpointSemLeitor(){
        utils.validarTexto(realizarCheckpointPage.getValidarNegativoLeitor(), "O agente de leitura não foi encontrado! Verifique se ele foi instalado e/ou está executando.");
        utils.fecharNavegador();
    }

}
