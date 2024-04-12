package Pages;

import org.openqa.selenium.By;

public class LoginPage {

	//Original
	//private By btnAbrirConta = By.cssSelector("body > div.viewport-primary > nav.nav-desktop > div.right > div.nav-item.nav-item-nova-conta > a");
	//private By btnAbrirContaParaVoce = By.id("bt1");
	//private By campoNome = By.id("nome");
	//private By campoTelefone = By.id("telefone");
	//private By campoEmail = By.id("email");
	//private By campoCpf = By.id("cpf");
	//private By btnQueroSerCliente = By.id("btnEnviar");
	//private By textoFaltaPouco = By.xpath("//*[@id=\"pu-modalSucesso\"]/div/div[1]/p/span[1]");
	//public By getBtnAbrirConta() {return btnAbrirConta;}
	//public By getBtnAbrirContaParaVoce() {return btnAbrirContaParaVoce;}
	//public By getCampoNome() {return campoNome;	}
	//public By getCampoTelefone() {return campoTelefone;}
	//	public By getCampoEmail() {	return campoEmail;}
	//	public By getCampoCpf() {return campoCpf;	}
	//public By getBtnQueroSerCliente() {return btnQueroSerCliente;	}
	//public By getTextoFaltaPouco() {return textoFaltaPouco;	}





	//Rastro
	private By campoUsuario = By.id("username");
	private By campoSenha = By.id("password");

	private By btnEntrar = By.id("login-button");



	private By btnEscolhaUmSite = By.xpath("//span[text()='Escolha um site']");

	private By btnSite = By.xpath("");
	private By btnTenant = By.xpath("");
	private By btnEscolhaUmaTenant = By.xpath("//span[text()='Escolha uma tenant']");

	private By btnEntrarSite = By.xpath("//span[text()='Entrar']");

	private By txtDashboard = By.xpath("//span[text()='Dashboard']");
	private By btnEsqueciSenha = By.xpath("//span[text()='Esqueceu sua senha? Clique aqui.']");
	private By campoEmailRecSenha = By.id("txt-name");
	private By btnEnviarEmailRecSenha = By.xpath("//span[text()='Enviar']");
	private By confirmacaoRecSenha = By.xpath("//p[text()='Um email foi enviado para a recuperação da senha.']");
	private By alertaCredenciaisInvalidas = By.xpath("//p[text()='Usuário e/ou senha inválidos. Verifique os dados inseridos.']");
	private By campoEmailRecuperar = By.xpath("//input[@formcontrolname='email']");
	private By campoSenhaRecuperar = By.xpath("//input[@formcontrolname='password']");
	private By campoConfirmarSenhaRecuperar = By.xpath("//input[@formcontrolname='confirmPassword']");
	private By btnSalvar = By.xpath("//span[text()='Salvar']");
	private By validacaoPaginaRecSenha = By.xpath("//span[text()='Recuperação de Senha']");
	private By validarTelaLogin = By.id("login-container");

	public By getValidarTelaLogin() {
		return validarTelaLogin;
	}

	public By getCampoUsuario() {	return campoUsuario;	}

public By getCampoSenha() {
	return campoSenha;
}

public By getBtnEntrar() {
	return btnEntrar;
}


public By getBtnEscolhaUmSite() {
	return btnEscolhaUmSite;
}

public By getBtnSite(String nomeSite) {
	return btnSite = By.xpath("//span[text()='" + nomeSite + "']");
}
public By getBtnTenant(String nomeTenant) {
		return btnSite = By.xpath("//span[text()='" + nomeTenant + "']");
	}

public By getBtnEntrarSite() {
	return btnEntrarSite;
}

public By getTxtDashboard() {
		return txtDashboard;
	}


	public By getBtnEsqueciSenha() {
		return btnEsqueciSenha;
	}

	public By getCampoEmailRecSenha() {
		return campoEmailRecSenha;
	}

	public By getBtnEnviarEmailRecSenha() {
		return btnEnviarEmailRecSenha;
	}

	public By getConfirmacaoRecSenha() {
		return confirmacaoRecSenha;
	}

	public By getAlertaCredenciaisInvalidas() {
		return alertaCredenciaisInvalidas;
	}

	public By getCampoEmailRecuperar() {
		return campoEmailRecuperar;
	}

	public By getCampoSenhaRecuperar() {
		return campoSenhaRecuperar;
	}

	public By getCampoConfirmarSenhaRecuperar() {
		return campoConfirmarSenhaRecuperar;
	}

	public By getBtnSalvar() {
		return btnSalvar;
	}

	public By getValidacaoPaginaRecSenha() {
		return validacaoPaginaRecSenha;
	}

	public By getBtnEscolhaUmaTenant() {
		return btnEscolhaUmaTenant;
	}
}
	
	

	

