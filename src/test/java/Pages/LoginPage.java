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

	private By btnEsqueciASenha = By.xpath("//span[text()='Esqueceu sua senha? Clique aqui.']");


	private By campoEmailRecSenha = By.id("txt-name");

	private By btnEnviarRecSenha = By.xpath("//span[text()='Enviar']");

	private By btnEscolhaUmSite = By.xpath("//span[text()='Escolha um site']");

	private By btnSite = By.xpath("//*[@id='pr_id_3_list']/p-dropdownitem/li");

	private By btnEntrarSite = By.xpath("//span[text()='Entrar']");

	private By txtDashboard = By.xpath("//span[text()='Dashboard']");



	public By getCampoUsuario() {	return campoUsuario;	}

public By getCampoSenha() {
	return campoSenha;
}

public By getBtnEntrar() {
	return btnEntrar;
}

public By getBtnEsqueciASenha() {
	return btnEsqueciASenha;
}

public By getCampoEmailRecSenha() {
	return campoEmailRecSenha;
}

public By getBtnEnviarRecSenha() {
	return btnEnviarRecSenha;
}

public By getBtnEscolhaUmSite() {
	return btnEscolhaUmSite;
}

public By getBtnSite() {
	return btnSite;
}

public By getBtnEntrarSite() {
	return btnEntrarSite;
}

	public By getTxtDashboard() {
		return txtDashboard;
	}
}
	
	

	

