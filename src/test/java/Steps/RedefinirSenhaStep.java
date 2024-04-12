package Steps;

import Logic.LoginLogic;
import Logic.RedefinirSenhaLogic;
import Pages.LoginPage;
import Pages.RedefinirSenhaPage;
import Utils.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utils.Data;


public class RedefinirSenhaStep {

    RedefinirSenhaLogic redefinirSenhaLogic = new RedefinirSenhaLogic();
    LoginLogic loginLogic = new LoginLogic();
    LoginPage loginPage = new LoginPage();
    Utils utils = new Utils();
    Data data = new Data();
    RedefinirSenhaPage redefinirSenhaPage = new RedefinirSenhaPage();
    @Given("que o usuário resete sua senha")
    public void que_o_usuário_resete_sua_senha() throws InterruptedException {

        redefinirSenhaLogic.linkRedefinicaoSenha("https://bra01.safelinks.protection.outlook.com/?url=https%3A%2F%2Frastroapp-homol.rastreabilidadebrasil.com.br%2F%23%2Fchange-password%3Fguid%3Dedd9bdd6-2318-4b0a-bc5d-35f4b3c24ad9&data=05%7C02%7Cmarina.lessa%40rastreabilidadebrasil.com.br%7C54adf2f98e6e4d315abd08dc3219ec35%7C78c92e46f9ad4071a0be6d848dc38163%7C0%7C0%7C638440334142571230%7CUnknown%7CTWFpbGZsb3d8eyJWIjoiMC4wLjAwMDAiLCJQIjoiV2luMzIiLCJBTiI6Ik1haWwiLCJXVCI6Mn0%3D%7C0%7C%7C%7C&sdata=YeRkZbxuUP1M2XVV5oVKbX5uQm71eTxsjZqDHkADGBc%3D&reserved=0");
        //link inserido acima não possui validade porém é criptografado de acordo com cada email, ou seja, não consigo utilizar o link acima para outro email diferente de marina.lessa@rastreabilildadebrasil.com.br". O LINK NÃO EXPIRA

        redefinirSenhaLogic.redefinirSenha("marina.lessa@rastreabilidadebrasil.com.br", "102040", "102040");


    }
    @When("fizer o login novamente utilizando a senha antiga")
    public void fizer_o_login_novamente_utilizando_a_senha_antiga() throws InterruptedException {
        redefinirSenhaLogic.login("marina.lessa@rastreabilidadebrasil.com.br", "102030");


    }

    @When("clicar no botao Esqueceu a senha e inserir um email não cadstrao para recuperacao de senha")
    public void clicar_no_botao_esqueceu_a_senha_e_inserir_um_email_não_cadstrao_para_recuperacao_de_senha() throws InterruptedException {
        redefinirSenhaLogic.esqueceuSenha("a@a.com");
        //inserir um e-mail não cadastrado na String acima

    }
    @Then("sera exibido o alerta de que o usuario nao foi encontrado")
    public void sera_exibido_o_alerta_de_que_o_usuario_nao_foi_encontrado() throws InterruptedException {
       redefinirSenhaLogic.validacaoEmailSemCadastro();
    }

    @When("fizer o login com a nova senha e escolher o site")
    public void fizer_o_login_com_a_nova_senha_e_escolher_o_site() throws InterruptedException {
        utils.pausa(2000);
        utils.preencher(loginPage.getCampoUsuario(), "marina.lessa@rastreabilidadebrasil.com.br");
        utils.preencher(loginPage.getCampoSenha(), "102030");
        utils.clicar(loginPage.getBtnEntrar());
        utils.pausa(2000);
        utils.clicar(loginPage.getBtnEscolhaUmSite());
        utils.clicar(loginPage.getBtnSite(data.site()));
        utils.clicar(loginPage.getBtnEntrarSite());utils.pausa(2000);
        utils.clicar(loginPage.getBtnEscolhaUmSite());
        utils.clicar(loginPage.getBtnSite(data.site()));
        utils.clicar(loginPage.getBtnEntrarSite());
    }
    @Given("que o usuario esteja na redefinicao de senha")
    public void que_o_usuario_esteja_na_redefinicao_de_senha() {
        utils.abrirNavegador("https://rastroapp-homol.rastreabilidadebrasil.com.br/#/change-password?guid=18d4a496-9c36-4a44-9288-076053f8f24b");

    }
    @When("preencher os dados e NAO preencher a confirmacao de senha")
    public void preencher_os_dados_e_nao_preencher_a_confirmacao_de_senha() throws InterruptedException {
        utils.pausa(2000);
        utils.preencher(redefinirSenhaPage.getCampoEmailRecuperar(), "marina.lessa@rastreabilidadebrasil.com.br");
        utils.preencher(redefinirSenhaPage.getCampoSenhaRecuperar(), "102030");
        utils.preencher(redefinirSenhaPage.getCampoConfirmarSenhaRecuperar(), "");


    }
    @Then("o botao salvar nao sera habilitado e a senha nao sera redefinida")
    public void o_botao_salvar_nao_sera_habilitado_e_a_senha_nao_sera_redefinida() {
        if (utils.clicar(redefinirSenhaPage.getBtnSalvar())) ;
        else {
            System.out.println("Botão não habilitado. Não é possível seguir sem a confirmação da senha ");


        }
    }


}
