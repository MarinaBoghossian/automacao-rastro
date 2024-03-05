package Pages.Cadastros;

import org.openqa.selenium.By;

public class CadastroProdutosPage {

    private By subMenuProduto = By.xpath("//span[text()='Produtos']");
    private By btnNovoProduto = By.id("button-new");
    private By campoSKU = By.id("txt-sku");
    private By campoGTIN = By.id("txt-gtin");
    private By campoDescricao = By.id("txt-description");
    private By btnSalvar = By.id("button-save");
    private By campoCategoria = By.id("txt-category");
    private By campoPrefixo = By.xpath("//input[@formcontrolname='epcPrefix']");
    private  By btnDeletarProduto = By.id("button-delete");
    private By btnEditarProduto = By.id("");
    private  By btnAddVariavel = By.id("button-add");
    private By txtCadastroProduto = By.xpath("//p[text()='O produto foi cadastrado com sucesso!']");
    private By validacaoUserNotAdmin = By.xpath("//p[text()='Esse perfil não tem permissão para realizar esta operação!']");
    private By validacaoCadastroProdtoDescricao = By.xpath("");
    public By getValidarColunaDescricao(String nomeProduto) {
        return validacaoCadastroProdtoDescricao = By.xpath("//td[@id='column-description'][text()='" + nomeProduto + "']");}
    private By btnOK = By.id("button-ok");
    private By campoFiltrar = By.id("filter-txt");
    private By validacaoProdutoJaExistente = By.xpath("//p[text()='O produto cadastrado já existe! Por favor, verifique os dados inseridos!']");

    private By btnConfirmarExclusaoProduto = By.id("button-yes");

    private By alertaProdutoNaoExcluidoUserNotAdmin = By.xpath("//p[text()='Esse perfil não tem permissão para realizar esta operação!']");

    private By validarEdicaoProduto = By.xpath("");
    public By getValidarEdicaoProduto(String mensagem){
        return validarEdicaoProduto = By.xpath("//p[text()='" + mensagem + "']");
    }
    public By getBtnEditarProduto(String nomeProduto) {
        return btnEditarProduto = By.xpath("//td[text()='" + nomeProduto + "']//following::button[@icon='pi pi-pencil']");
    }
    public By getCampoCategoria() {
        return campoCategoria;
    }

    public By getBtnDeletarProduto(String nomeProduto) {
        return btnDeletarProduto = By.xpath("//td[text()='" + nomeProduto + "']//following::button[@id='button-delete']");}


    public By getCampoPrefixo() {
        return campoPrefixo;
    }

    public By getBtnDeletarProduto() {
        return btnDeletarProduto;
    }

    public By getBtnEditarProduto() {
        return btnEditarProduto;
    }

    public By getBtnAddVariavel() {
        return btnAddVariavel;
    }

    public By getSubMenuProduto() {
        return subMenuProduto;
    }

    public By getBtnNovoProduto() {
        return btnNovoProduto;
    }

    public By getCampoSKU() {
        return campoSKU;
    }

    public By getCampoGTIN() {
        return campoGTIN;
    }

    public By getCampoDescricao() {
        return campoDescricao;
    }

    public By getBtnSalvar() {
        return btnSalvar;
    }

    public By getTxtCadastroProduto() {
        return txtCadastroProduto;
    }

    public By getValidacaoUserNotAdmin() {
        return validacaoUserNotAdmin;
    }

    public By getValidacaoCadastroProdtoDescricao() {
        return validacaoCadastroProdtoDescricao;
    }

    public By getBtnOK() {
        return btnOK;
    }

    public By getCampoFiltrar() {
        return campoFiltrar;
    }

    public By getValidacaoProdutoJaExistente() {
        return validacaoProdutoJaExistente;
    }

    public By getBtnConfirmarExclusaoProduto() {
        return btnConfirmarExclusaoProduto;
    }

    public By getAlertaProdutoNaoExcluidoUserNotAdmin() {
        return alertaProdutoNaoExcluidoUserNotAdmin;
    }


}
