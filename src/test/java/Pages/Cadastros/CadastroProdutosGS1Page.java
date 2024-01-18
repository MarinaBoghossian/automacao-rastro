package Pages.Cadastros;

import org.openqa.selenium.By;

public class CadastroProdutosGS1Page {

    private By subMenuProduto = By.xpath("//span[text()='Produtos']");
    private By btnNovoProduto = By.id("button-new");
    private By campoSKU = By.id("txt-sku");
    private By campoGTIN = By.id("txt-gtin");
    private By campoDescricao = By.id("txt-description");
    private By btnSalvar = By.id("button-save");
    private By campoCategoria = By.id("txt-category");
    private By txtCadastroProduto = By.xpath("//p[text()='O produto foi cadastrado com sucesso!']");

    public By getCampoCategoria() {
        return campoCategoria;
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
}
