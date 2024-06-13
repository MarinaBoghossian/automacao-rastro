package Logic.Cadastros;

import Logic.LoginLogic;
import Pages.Cadastros.MenuCadastroPage;
import Pages.Cadastros.CadastroProdutosPage;
import Pages.LoginPage;
import Utils.Utils;
import org.openqa.selenium.WebDriver;
import Utils.Data;

public class CadastroProdutosLogic {

//     O sistema deve permitir:
//     Cadastrar um SKU com 1 digito numérico
//     Cadastrar um SKU com 50 dígitos alfanuméricos
//     Cadastrar um SKU com 50 dígitos alfanuméricos e pontos
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


    Utils utils = new Utils();
    LoginPage loginPage = new LoginPage();
    CadastroProdutosPage cadastroProdutosPage = new CadastroProdutosPage();
    MenuCadastroPage menuCadastroPage = new MenuCadastroPage();
    LoginLogic loginLogic = new LoginLogic();
    MenuCadastrosLogic menuCadastrosLogic = new MenuCadastrosLogic();
    Data data = new Data();


    public void acessoAoRastro() throws InterruptedException {

        utils.abrirNavegador(data.url());


        utils.pausa(2000);
        utils.preencher(loginPage.getCampoUsuario(), data.usuario());
        utils.preencher(loginPage.getCampoSenha(), data.senha());
        utils.clicar(loginPage.getBtnEntrar());

        utils.pausa(3000);
        utils.clicar(loginPage.getBtnEscolhaUmaTenant());
        utils.clicar(loginPage.getBtnTenant(data.tenant()));


        utils.pausa(1000);
        utils.clicar(loginPage.getBtnEscolhaUmSite());
        utils.clicar(loginPage.getBtnSite(data.site()));
        utils.clicar(loginPage.getBtnEntrarSite());



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

    public void cadastrarNovoProdutoGS1() throws InterruptedException {
        WebDriver driver;
        utils.pausa(5000);
        utils.clicar(cadastroProdutosPage.getBtnNovoProduto());
        utils.pausa(2000);
        utils.preencher(cadastroProdutosPage.getCampoSKU(), data.SKU());
        utils.preencher(cadastroProdutosPage.getCampoGTIN(), data.GTIN());
        utils.preencher(cadastroProdutosPage.getCampoDescricao(), data.descricao());
        utils.preencher(cadastroProdutosPage.getCampoCategoria(), data.categoria());
        utils.clicar(cadastroProdutosPage.getBtnSalvar());
    }

    public void cadastrarNovoProdutoSKU() throws InterruptedException {
        WebDriver driver;
        utils.pausa(2000);
        utils.clicar(cadastroProdutosPage.getBtnNovoProduto());
        utils.pausa(5000);
        utils.preencher(cadastroProdutosPage.getCampoSKU(), data.SKU());
        utils.preencher(cadastroProdutosPage.getCampoDescricao(), data.descricao());
        utils.preencher(cadastroProdutosPage.getCampoCategoria(), data.categoria());
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

    public void cadastrarNovoProdutoPrefixoSKU() throws InterruptedException {
        WebDriver driver;
        utils.pausa(2000);
        utils.clicar(cadastroProdutosPage.getBtnNovoProduto());
        utils.pausa(2000);
        utils.preencher(cadastroProdutosPage.getCampoSKU(), data.SKU());
        utils.preencher(cadastroProdutosPage.getCampoDescricao(), data.descricao());
        utils.preencher(cadastroProdutosPage.getCampoCategoria(), data.categoria());
        utils.preencher(cadastroProdutosPage.getCampoPrefixo(), data.prefixo());
        utils.clicar(cadastroProdutosPage.getBtnSalvar());
    }

    public void validarCdastroProdutoUsuarioNotAdmin() throws InterruptedException {
        utils.pausa(2000);
        utils.validarTexto(cadastroProdutosPage.getValidacaoUserNotAdmin(), "Esse perfil não tem permissão para realizar esta operação!");
        utils.fecharNavegador();
    }

    public void buscaDeProdutoPorDescricao() throws InterruptedException {
        utils.pausa(1000);
        utils.preencher(cadastroProdutosPage.getCampoFiltrar(), data.filtro());
        if (utils.validarTexto(cadastroProdutosPage.getValidarColunaDescricao(data.nomeProduto()), data.nomeProduto()));
        else {
            System.out.println("Produto não encontrado");

        }
    }



    public void validarProdutoJaCadastrado(){
        utils.validarTexto(cadastroProdutosPage.getValidacaoProdutoJaExistente(), "O produto cadastrado já existe! Por favor, verifique os dados inseridos!");
    }

    public void deletarProdutoPorNome(){
        utils.preencher(cadastroProdutosPage.getCampoFiltrar(), data.filtro());

        utils.clicar(cadastroProdutosPage.getBtnDeletarProduto(data.nomeProduto()));
    }

    public void confirmacaoExclusao() throws InterruptedException {
        utils.clicar(cadastroProdutosPage.getBtnConfirmarExclusaoProduto());
        utils.pausa(1000);
        utils.clicar(cadastroProdutosPage.getBtnOK());
    }

    public void mensagemNaoExclusaoProdutoUsuarioNotAdmin(){
        utils.validarTexto(cadastroProdutosPage.getAlertaProdutoNaoExcluidoUserNotAdmin(), "Esse perfil não tem permissão para realizar esta operação!");
    }

    public void cadastrarProdutoPorArquivo() throws InterruptedException {
        utils.pausa(2000);
        utils.inserirArquivo(cadastroProdutosPage.getBtnArquivo(), data.nomeArquivo());
    }
    public void validarUploadArquivo(){
        utils.validarTexto(cadastroProdutosPage.getValidarArquivoEnviado(), "Arquivo enviado com sucesso!");
        utils.clicar(cadastroProdutosPage.getBtnOK());
    }

    public void cacadastroProdutoComItens(){

    }

}
