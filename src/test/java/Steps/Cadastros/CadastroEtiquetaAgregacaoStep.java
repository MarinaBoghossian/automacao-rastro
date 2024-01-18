package Steps.Cadastros;

import Logic.Cadastros.CadastroEtiquetasLogic;
import Utils.Utils;
import io.cucumber.java.en.When;

public class CadastroEtiquetaAgregacaoStep {
    CadastroEtiquetasLogic cadastroEtiquetasLogic = new CadastroEtiquetasLogic();
    Utils utils = new Utils();
    @When("ir em cadastro, selecionar a aba Etiquetas e selecionar agregacao")
    public void ir_em_cadastro_selecionar_a_aba_etiquetas_e_selecionar_agregacao() throws InterruptedException {
        cadastroEtiquetasLogic.menuCadastros();
        cadastroEtiquetasLogic.subMenuEtiquetas();
        utils.pausa(1000);
        cadastroEtiquetasLogic.subMenuEtiquetaAgregacao();
    }
}
