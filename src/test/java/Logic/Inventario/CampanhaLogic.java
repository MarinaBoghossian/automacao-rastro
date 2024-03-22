package Logic.Inventario;

import Pages.Inventario.CampanhaPage;
import Utils.Utils;
import Utils.Data;

public class CampanhaLogic {
    Utils utils = new Utils();
    Data data = new Data();
    CampanhaPage campanhaPage = new CampanhaPage();

    public void menuInventario() throws InterruptedException {
        utils.clicar(campanhaPage.getSubMenuInventario());
        utils.pausa(1000);

    }
    public void subMeuCampanha(){
        utils.clicar(campanhaPage.getSubMenuCampanha());
    }

    public void novaCampanhaInventario(){
        utils.clicar(campanhaPage.getBtnNovaCampanha());
        utils.preencher(campanhaPage.getCampoNomeCampanha(), data.nomeCampanha());
        utils.clicar(campanhaPage.getBtnSalvar());

    }
    public void validarCadastroCampanha() throws InterruptedException {
        utils.pausa(1500);
        utils.validarTexto(campanhaPage.getValidacaoCriarCampanha(), "Essa campanha foi cadastrada com sucesso!");
    }

    public void deletarCampanha() throws InterruptedException {
        utils.pausa(1500);
        utils.clicar(campanhaPage.getBtnDeletarCampanha(data.nomeCampanha()));
        utils.validarTexto(campanhaPage.getConfirmarExclusaoCampanha(), "Você tem certeza que deseja excluir?");
        utils.clicar(campanhaPage.getBtnSim());
        utils.validarTexto(campanhaPage.getValidacaoExcluirCampanha(), "A campanha foi excluída com sucesso!");
        utils.clicar(campanhaPage.getBtnOK());
    }
    public void validacaoDeletarCampanha() throws InterruptedException {
        utils.pausa(1500);

        utils.validarTexto(campanhaPage.getValidacaoExcluirCampanha(), "A campanha foi excluída com sucesso!");
        utils.clicar(campanhaPage.getBtnOK());
    }

    public void acessarCampanhaExistente() throws InterruptedException {
        utils.pausa(1500);
        utils.clicar(campanhaPage.getBtnDetalheCampanha(data.nomeCampanha()));
    }

    public void novaContagem() throws InterruptedException {
        utils.pausa(1500);
        utils.clicar(campanhaPage.getBtnNovaContagem());
        utils.pausa(1000);
        utils.clicar(campanhaPage.getSelecaoCheckpoint(data.nomeCheckpoint()));
        utils.clicar(campanhaPage.getBtnIniciarCheckpoint());
        utils.clicar(campanhaPage.getBtnConcluirCheckpoint());
    }
}
