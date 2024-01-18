package Steps;

import Pages.LoginPage;
import Utils.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	
	Utils l = new Utils();
	LoginPage lp = new LoginPage();

	@Given("que o usuario acesse a url")
	public void que_o_usuario_acesse_a_url() {
		String url = "https://rastroapp-homol.rastreabilidadebrasil.com.br/#/login";
		l.abrirNavegador(url);
	
	}

	@Given("fazer o login")
	public void fazer_o_login() throws InterruptedException {
		l.pausa(2000);
		l.preencher(lp.getCampoUsuario(), "marina.lessa@rastreabilidadebrasil.com.br");
		l.preencher(lp.getCampoSenha(), "102030");
		l.clicar(lp.getBtnEntrar());

	}



	@When("escolher o site")
	public void escolher_o_site() throws InterruptedException {
		l.pausa(2000);
		l.clicar(lp.getBtnEscolhaUmSite());
		l.clicar(lp.getBtnSite());
		l.clicar(lp.getBtnEntrarSite());

	}
	


	@Then("sera exibido o Dashboard")
	public void sera_exibido_o_Dashboard() throws InterruptedException {
		l.pausa(2000);
		l.validarTexto(lp.getTxtDashboard(), "Dashboard");

	}

	@Then("fechar navegador")
	public void fechar_navegador(){
		l.fecharNavegador();

	}


	
}
