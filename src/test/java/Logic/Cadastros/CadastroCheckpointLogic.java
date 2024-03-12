package Logic.Cadastros;

import Logic.LoginLogic;
import Pages.Cadastros.CadastroCheckpointPage;
import Utils.Utils;
import Utils.Data;

public class CadastroCheckpointLogic {


    Utils utils = new Utils();
    LoginLogic loginLogic = new LoginLogic();
    MenuCadastrosLogic menuCadastrosLogic = new MenuCadastrosLogic();
    CadastroCheckpointPage cadastroCheckpointPage = new CadastroCheckpointPage();
    Data data = new Data();

    public void menuCadastros()throws InterruptedException {
        menuCadastrosLogic.cadastros();
    }


    public void subMenuCheckpoints()throws InterruptedException{
        utils.pausa(1000);
        utils.clicar(cadastroCheckpointPage.getSubMenuCheckpoints());

    }

    public void cadastrarNovoCheckpoint()throws InterruptedException{
        utils.pausa(1000);
        utils.clicar(cadastroCheckpointPage.getBtnNovoCheckpoint());
        utils.preencher(cadastroCheckpointPage.getCampoNomeCheckpoint(), data.nomeCheckpoint());
        utils.pausa(500);
        utils.clicar(cadastroCheckpointPage.getCampoEscolhaLeitor());
        utils.clicar(cadastroCheckpointPage.getSelectNomeLeitor(data.nomeLeitor()));
        utils.pausa(500);
        utils.preencher(cadastroCheckpointPage.getCampoDuracaoCheckpoint(), data.duracaoCheckpoint());
        utils.pausa(500);
        utils.clicar(cadastroCheckpointPage.getCampoIntegracao());
        utils.clicar(cadastroCheckpointPage.getSelectIntegracao(data.nomeIntegracao()));
        utils.pausa(500);
        utils.clicar(cadastroCheckpointPage.getCampoEvento());
        utils.clicar(cadastroCheckpointPage.getSelectEvento(data.nomeEvento()));
        utils.clicar(cadastroCheckpointPage.getBtnSalvarChekpoint());
    }

    public void validarCadatsroCheckpoint() throws InterruptedException {
        utils.pausa(2000);
        utils.validarTexto(cadastroCheckpointPage.getValidarNovoCheckpoint(), "O checkpoint foi cadastro com sucesso!");
        utils.fecharNavegador();
    }
}
