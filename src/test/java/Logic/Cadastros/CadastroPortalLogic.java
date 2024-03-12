package Logic.Cadastros;

import Logic.LoginLogic;
import Pages.Cadastros.CadastroPortalPage;
import Utils.Utils;
import Utils.Data;

public class CadastroPortalLogic {
    Utils utils = new Utils();
    LoginLogic loginLogic = new LoginLogic();
    MenuCadastrosLogic menuCadastrosLogic = new MenuCadastrosLogic();
    CadastroPortalPage cadastroPortalPage = new CadastroPortalPage();
    Data data = new Data();

    public void menuCadastros()throws InterruptedException {
        menuCadastrosLogic.cadastros();
    }


    public void subMenuPortal()throws InterruptedException{
        utils.pausa(1000);
        utils.clicar(cadastroPortalPage.getSubMenuPortal());

    }

    public void cadastroNovoPortal()throws InterruptedException{
        utils.pausa(1000);
        utils.clicar(cadastroPortalPage.getBtnNovoPortal());
        utils.preencher(cadastroPortalPage.getCampoNomePortal(), data.nomePortal());
        utils.clicar(cadastroPortalPage.getCampoEvento());
        utils.clicar(cadastroPortalPage.getSelectNomeEvento(data.nomeEvento()));
        utils.pausa(1000);
        utils.clicar(cadastroPortalPage.getCampoImpressora());
        utils.clicar(cadastroPortalPage.getSelectNomeImpressora(data.nomeImpressora()));
        utils.pausa(1000);
        utils.clicar(cadastroPortalPage.getCampoLeitor());
        utils.clicar(cadastroPortalPage.getSelectNomeLeitor(data.nomeLeitor()));
        utils.pausa(1000);
        utils.clicar(cadastroPortalPage.getBtnSalvarNovoPortal());

    }

    public void validarCadastroPortal() throws InterruptedException {
        utils.pausa(2000);
        utils.validarTexto(cadastroPortalPage.getValidarCadastroPortal(), "O portal foi cadastrado com sucesso!");
        utils.fecharNavegador();
    }
}
