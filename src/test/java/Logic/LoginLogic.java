package Logic;

import Pages.Cadastros.MenuCadastroPage;
import Pages.LoginPage;
import Utils.Utils;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogic {

//     O sistema deve permitir:
//     Realizar o login com a nova senha cadastrada
//     Redefinir a senha pelo campo Esqueceu a Senha
//     Realizar o login com usuário e senhas corretos

//     O sistema não deve permitir:
//     Após a redefinição da senha tentar o Login com a senha antiga
//     Tentar acessar o sistema sem escolher um site
//     Tentar o login com a senha diferente do que foi cadastrado
//     Tentar o login com o nome de usuário errado
//     Tentar fazer login com um usuário que foi deletado

//     Após o Login verificar se o Sites exibidos estão corretos com o que esta cadastrado no backoffice

    Utils utils = new Utils();
    LoginPage loginPage = new LoginPage();

    MenuCadastroPage menuCadastroPage = new MenuCadastroPage();

    public void acessoAoRastro(String usuario, String senha) throws InterruptedException {
        String url = "https://rastroapp-homol.rastreabilidadebrasil.com.br/#/login";
        utils.abrirNavegador(url);


        utils.pausa(2000);
        utils.preencher(loginPage.getCampoUsuario(), usuario);
        utils.preencher(loginPage.getCampoSenha(), senha);
        utils.clicar(loginPage.getBtnEntrar());


        utils.pausa(18000);
        utils.clicar(loginPage.getBtnEscolhaUmSite());
        utils.clicar(loginPage.getBtnSite());
        utils.clicar(loginPage.getBtnEntrarSite());


        utils.pausa(2000);
        utils.validarTexto(loginPage.getTxtDashboard(), "Dashboard");


    }

    public void cadastros() throws InterruptedException {

        utils.pausa(2000);
        utils.clicar(menuCadastroPage.getMenuCadastros());


    }

    public void redefinirSenha(String email) throws InterruptedException {

        utils.clicar(loginPage.getBtnEsqueciSenha());
        utils.preencher(loginPage.getCampoEmailRecSenha(), email);
        utils.clicar(loginPage.getBtnEnviarEmailRecSenha());
        utils.pausa(2000);


    }

    public void confirmacaoRedefinirSenha() {
        utils.validarTexto(loginPage.getConfirmacaoRecSenha(), "Um email foi enviado para a recuperação da senha.");
    }
}