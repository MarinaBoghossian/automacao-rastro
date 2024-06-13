package Logic.Cadastros;

import Pages.Cadastros.CadastroSLAPage;
import Utils.Utils;
import Utils.Data;



public class CadastroSLALogic {
    CadastroSLAPage cadastroSLAPage = new CadastroSLAPage();
    Utils utils = new Utils();
    Data data = new Data();
    MenuCadastrosLogic menuCadastrosLogic = new MenuCadastrosLogic();

    public void menuCadastros()throws InterruptedException {
        menuCadastrosLogic.cadastros();
    }

    public void subMenuSLA()throws InterruptedException{
        utils.pausa(1000);
        utils.clicar(cadastroSLAPage.getSubMenuSLA());
    }
    
    public void novoSLA(){
        utils.clicar(cadastroSLAPage.getBtnNovoSLA());
        utils.clicar(cadastroSLAPage.getCampoTipo());
        utils.clicar(cadastroSLAPage.getSelectTipo("PADRÃO"));
        utils.clicar(cadastroSLAPage.getCampoDiasAntecedecia());
        utils.clicar(cadastroSLAPage.getSelectDiasAntecedencia("Menor que"));
        utils.preencher(cadastroSLAPage.getCampoDias(), "30");
        utils.preencher(cadastroSLAPage.getCampoSLA(), "5");
        utils.clicar(cadastroSLAPage.getBtnSalvar());
    }

}
