package Steps;

import Logic.LoginLogic;
import Pages.LoginPage;
import Utils.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

	Utils utils = new Utils();
	LoginPage loginPage = new LoginPage();
	LoginLogic loginLogic = new LoginLogic();


	@Given("que o usuario acesse a url")
	public void que_o_usuario_acesse_a_url() {
		String url = "https://rastroapp-homol.rastreabilidadebrasil.com.br/#/login";
		utils.abrirNavegador(url);

	}

	@Given("fazer o login com dados validos")
	public void fazer_o_login_com_dados_validos() throws InterruptedException {
		utils.pausa(2000);
		utils.preencher(loginPage.getCampoUsuario(), "marina.lessa@rastreabilidadebrasil.com.br");
		utils.preencher(loginPage.getCampoSenha(), "102030");
		utils.clicar(loginPage.getBtnEntrar());
	}


	@When("escolher o site")
	public void escolher_o_site() throws InterruptedException {
		utils.pausa(2000);
		utils.clicar(loginPage.getBtnEscolhaUmSite());
		utils.clicar(loginPage.getBtnSite());
		utils.clicar(loginPage.getBtnEntrarSite());

	}


	@Then("sera exibido o Dashboard")
	public void sera_exibido_o_Dashboard() throws InterruptedException {
		utils.pausa(2000);
		utils.validarTexto(loginPage.getTxtDashboard(), "Dashboard");

	}

	@Then("fechar navegador")
	public void fechar_navegador() {
		utils.fecharNavegador();

	}

	@When("clicar no botao Esqueceu a senha e inserir o email para recuperacao de senha")
	public void clicar_no_botao_esqueceu_a_senha_e_inserir_o_email_para_recuperacao_de_senha() throws InterruptedException {
		loginLogic.redefinirSenha("marina.lessa@rastreabilidadebrasil.com.br");

	}

	@Then("sera exibido o a mensagem e o email de recuparecao sera enviado para o endereco informado")
	public void sera_exibido_o_a_mensagem_e_o_email_de_recuparecao_sera_enviado_para_o_endereco_informado() {
		loginLogic.confirmacaoRedefinirSenha();
		utils.fecharNavegador();
	}

	@Given("fazer o login com email correto e senha incorreta")
	public void fazer_o_login_com_email_correto_e_senha_incorreta() throws InterruptedException {
		utils.pausa(2000);
		utils.preencher(loginPage.getCampoUsuario(), "marina.lessa@rastreabilidadebrasil.com.br");
		utils.preencher(loginPage.getCampoSenha(), "102035");
		utils.clicar(loginPage.getBtnEntrar());
	}

	@When("clicar no botao entrar")
	public void clicar_no_botao_entrar() throws InterruptedException {
		utils.clicar(loginPage.getBtnEntrar());
		utils.pausa(1000);
	}

	@Then("sera exibido o alerta de credenciais invalidas")
	public void sera_exibido_o_alerta_de_credenciais_invalidas() {
		utils.validarTexto(loginPage.getAlertaCredenciaisInvalidas(), "Usuário e/ou senha inválidos. Verifique os dados inseridos.");
		utils.fecharNavegador();
	}


	@Given("fazer o login com email nao cadastrado e senha")
	public void fazer_o_login_com_email_nao_cadastrado_e_senha() throws InterruptedException {
		utils.pausa(2000);
		utils.preencher(loginPage.getCampoUsuario(), "marina.lessa123@rastreabilidadebrasil.com.br");
		utils.preencher(loginPage.getCampoSenha(), "102030");
		utils.clicar(loginPage.getBtnEntrar());
	}

	@When("não selecionar um site")
	public void não_selecionar_um_site() throws InterruptedException {
		utils.pausa(2000);
		utils.clicar(loginPage.getBtnEscolhaUmSite());
		utils.clicar(loginPage.getBtnEntrarSite());

	}

	@Then("não deverá ser permitido seguir para o dashboard")
	public void não_deverá_ser_permitido_seguir_para_o_dashboard() {
		if (utils.clicar(loginPage.getBtnEntrarSite())) ;
		else {
			System.out.println("Botão não habilitado. Não é possível seguir sem selecionar ");


		}
	}
}