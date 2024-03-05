package Logic.Cadastros;

import Logic.LoginLogic;
import Pages.Cadastros.MenuCadastroPage;
import Pages.Cadastros.CadastroProdutosPage;
import Pages.LoginPage;
import Utils.Utils;
import org.openqa.selenium.WebDriver;

public class CadastroProdutosLogic {

//     O sistema deve permitir:
//     Cadastrar um SKU com 1 digito numérico
//     Cadastrar um SKU com 50 dígitos alfanuméricos
//     Cadastrar um SKU com 50 dígitos alfanuméricos e pontos
//     Cadastrar um produto com 1 caracteres no campo Descrição
//     Cadastrar um produto com 50 caracteres no campo Descrição
//     Cadastrar um produto com 1 caracteres no campo Categoria
//     Cadastrar um produto com 30 caracteres no campo Categoria incluindo letras, números e simbolos
//     Validar se Download do item está disponível após cadastrado
//     Cadastrar novo produto com itens de todos os tipos de extensões disponíveís, e validar mensagem de sucesso "Produto Cadastrado"
//     Validar se Produto está sendo listado após cadastro e retornado por busca no filtro
//     Cadastrar produto, e validar mensagem de sucesso "Produto Cadastrado"
//     Validar se Botão "Novo" retorna modal "Novo Produto"

    //     O sistema não deve permitir:
//     Cadastrar um novo produto sem preencher o campo SKU
//     Cadastrar um novo produto sem preencher o campo Descrição
//     Cadastrar um novo produto sem preencher o campo Categoria
//     Cadastrar um produto com o mesmo SKU utilizado no cadastro do primeiro produto
//     Cadastrar um produto com 100 caracteres no campo Descrição
//     Cadastrar um produto com 100 caracteres no campo SKU
//     Cadastrar um produto com 100 caracteres no campo Categoria
//     Cadastrar novo produto sem preencher SKU, GTIN, Descrição ou Categoria, e validar visibilidade do erro "Campo Inválido"
//     Cadastrar mais de um item do tipo TEXTO com Referência de Etiqueta iguais, no mesmo produto, e validar visibilidade do erro "Palavra-chave já existente!"
//     Cadastrar um arquivo com extensão diferente do especificado no campo "TIPO"
//     Cadastrar novo produto com SKU ou GTIN já existente, e validar erro "Produto já cadastrado"
//     Cadastrar um produto com um usuário NOT-ADMIN
//
    Utils utils = new Utils();
    LoginPage loginPage = new LoginPage();
    CadastroProdutosPage cadastroProdutosPage = new CadastroProdutosPage();
    MenuCadastroPage menuCadastroPage = new MenuCadastroPage();
    LoginLogic loginLogic = new LoginLogic();
    MenuCadastrosLogic menuCadastrosLogic = new MenuCadastrosLogic();


    public void acessoAoRastro(String usuario, String senha) throws InterruptedException {
        String url = "https://rastroapp-homol.rastreabilidadebrasil.com.br/#/login";
        utils.abrirNavegador(url);


        utils.pausa(2000);
        utils.preencher(loginPage.getCampoUsuario(), usuario);
        utils.preencher(loginPage.getCampoSenha(), senha);
        utils.clicar(loginPage.getBtnEntrar());


        utils.pausa(2000);
        utils.clicar(loginPage.getBtnEscolhaUmSite());
        utils.clicar(loginPage.getBtnSite());
        utils.clicar(loginPage.getBtnEntrarSite());


        utils.pausa(2000);
        utils.validarTexto(loginPage.getTxtDashboard(), "Dashboard");
        utils.pausa(1000);


    }

    public void menuCadastros() throws InterruptedException {
        menuCadastrosLogic.cadastros();

    }

    public void subMenuProdutos() throws InterruptedException {
        WebDriver driver;
        utils.pausa(2000);
        utils.clicar(cadastroProdutosPage.getSubMenuProduto());


    }

    public void cadastrarNovoProdutoGS1(String SKU, String GTIN, String descricao, String categoria) throws InterruptedException {
        WebDriver driver;
        utils.pausa(2000);
        utils.clicar(cadastroProdutosPage.getBtnNovoProduto());
        utils.pausa(2000);
        utils.preencher(cadastroProdutosPage.getCampoSKU(), SKU);
        utils.preencher(cadastroProdutosPage.getCampoGTIN(), GTIN);
        utils.preencher(cadastroProdutosPage.getCampoDescricao(), descricao);
        utils.preencher(cadastroProdutosPage.getCampoCategoria(), categoria);
        utils.clicar(cadastroProdutosPage.getBtnSalvar());
    }


    public void validarCadastroProduto() throws InterruptedException {
        WebDriver driver;
        utils.pausa(2000);
        utils.validarTexto(cadastroProdutosPage.getTxtCadastroProduto(), "O produto foi cadastrado com sucesso!");
        utils.clicar(cadastroProdutosPage.getBtnOK());
    }

    public void preenchimentosObrigatorios(String mensagem) {
        if (utils.clicar(cadastroProdutosPage.getBtnSalvar())) ;
        else {
            System.out.println(mensagem);
        }
    }

    public void cadastrarNovoProdutoPrefixoSKU(String SKU, String prefixo, String descricao, String categoria) throws InterruptedException {
        WebDriver driver;
        utils.pausa(2000);
        utils.clicar(cadastroProdutosPage.getBtnNovoProduto());
        utils.pausa(2000);
        utils.preencher(cadastroProdutosPage.getCampoSKU(), SKU);
        utils.preencher(cadastroProdutosPage.getCampoDescricao(), descricao);
        utils.preencher(cadastroProdutosPage.getCampoCategoria(), categoria);
        utils.preencher(cadastroProdutosPage.getCampoPrefixo(), prefixo);
        utils.clicar(cadastroProdutosPage.getBtnSalvar());
    }

    public void validarCdastroProdutoUsuarioNotAdmin() throws InterruptedException {
        utils.pausa(2000);
        utils.validarTexto(cadastroProdutosPage.getValidacaoUserNotAdmin(), "Esse perfil não tem permissão para realizar esta operação!");
        utils.fecharNavegador();
    }

    public void buscaDeProdutoPorDescricao(String filtro, String nomeProduto) throws InterruptedException {
        utils.pausa(1000);
        utils.preencher(cadastroProdutosPage.getCampoFiltrar(), filtro);
        if (utils.validarTexto(cadastroProdutosPage.getValidarColunaDescricao(nomeProduto), nomeProduto)) ;
        else {
            System.out.println("Produto não encontrado");

        }
    }



    public void validarProdutoJaCadastrado(){
        utils.validarTexto(cadastroProdutosPage.getValidacaoProdutoJaExistente(), "O produto cadastrado já existe! Por favor, verifique os dados inseridos!");
    }

    public void deletarProdutoPorNome(String nomeProduto){
        utils.clicar(cadastroProdutosPage.getBtnDeletarProduto(nomeProduto));
    }

    public void confirmacaoExclusao() throws InterruptedException {
        utils.clicar(cadastroProdutosPage.getBtnConfirmarExclusaoProduto());
        utils.pausa(1000);
        utils.clicar(cadastroProdutosPage.getBtnOK());
    }

    public void mensagemNaoExclusaoProdutoUsuarioNotAdmin(){
        utils.validarTexto(cadastroProdutosPage.getAlertaProdutoNaoExcluidoUserNotAdmin(), "Esse perfil não tem permissão para realizar esta operação!");
    }
}
