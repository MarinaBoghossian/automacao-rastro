package Logic.Impressões;

import Logic.LoginLogic;
import Pages.Impressões.AssociacaoRecodePage;
import Pages.Impressões.ImpressaoRecodePage;
import Utils.Utils;

public class AssociacaoRecodeLogic {

    LoginLogic loginLogic = new LoginLogic();
    MenuImpressoesLogic menuImpressoesLogic = new MenuImpressoesLogic();
    Utils utils = new Utils();
    ImpressaoRecodePage impressaoRecodePage = new ImpressaoRecodePage();
    AssociacaoRecodePage associacaoRecodePage = new AssociacaoRecodePage();

    public void acessoAoRastro() throws InterruptedException {
        loginLogic.acessoAoRastro();



    }

    public void menuImpressoes() throws InterruptedException {
        menuImpressoesLogic.impressoes();
    }

    public  void subMenuRecode()throws InterruptedException {
        utils.clicar(impressaoRecodePage.getSubMenuRecode());
        utils.pausa(1000);
    }

    public void subMenuAssociacaoRecode()throws InterruptedException{
        utils.clicar(associacaoRecodePage.getSubMenuAssociacaoRecode());
        utils.pausa(1000);

    }

    public void novaAssociacaoRecode()throws InterruptedException{
        utils.preencher(associacaoRecodePage.getCampoSKU(), "1324567");
        utils.preencher(associacaoRecodePage.getCampoEPC(), "30366259ffd08fc000000005");
        utils.preencher(associacaoRecodePage.getCampoDetalhes(), "teste");
        utils.clicar(associacaoRecodePage.getBtnAssociar());
    }

    public void validarAssociacao()throws InterruptedException{
        utils.pausa(1000);
        utils.validarTexto(associacaoRecodePage.getValidacaoAssociacaoRecode(), "A etiqueta foi associada com sucesso!");
        utils.fecharNavegador();
    }












}

