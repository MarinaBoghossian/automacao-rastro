package Pages.Impressões;

import org.openqa.selenium.By;

public class ImpressaoAvulsaPage {
    private By subMenuImpressaoAvulsa = By.xpath("//span[text()='Impressão Avulsa']");
    private By campoSKU = By.xpath("//input[@formcontrolname='sku']");
    private By campoGTIN = By.xpath("//input[@formcontrolname='gtin']");
    private By campoDescricaoProduto = By.xpath("//input[@formcontrolname='description']");
    private By btnBuscarSKU = By.xpath("//span[text()='Seleção do Produto']//following::span[text()='Buscar'][1]");
    private By campoCategoriaProduto = By.xpath("//input[@formcontrolname='category']");
    private By btnBuscarCategoriaProduto = By.xpath("//span[text()='Seleção do Produto']//following::span[text()='Buscar'][4]");
    private By btnBuscarDescricaoProduto = By.xpath("//span[text()='Seleção do Produto']//following::span[text()='Buscar'][3]");
    private By btnBuscarGTIN = By.xpath("//span[text()='Seleção do Produto']//following::span[text()='Buscar'][2]");


    private By campoConfirmarDadoDoProduto = By.xpath("");

    public By getConfirmarDadoDoProduto(String dadoDoProduto) {
        return campoConfirmarDadoDoProduto = By.xpath("//td[text()='" + dadoDoProduto + "']");}



    private By btnOK = By.xpath("//span[text()='OK']");
    private By btnProximo = By.xpath("//span[text()='Próximo']");
    private By campoLote = By.xpath("//input[@placeholder='Lote']");
    private By campoDataProd = By.xpath("//input[@placeholder='Data de Produção']");
    private By campoDataExpiracao = By.xpath("//input[@placeholder='Data de Expiração']");
    private By campoDocFiscal = By.xpath("//input[@placeholder='Documento Fiscal']");
    private By campoObservacoes = By.xpath("//input[@placeholder='Observações']");
    private By campoSelecionarEtiqueta = By.xpath("//span[text()='Selecione uma Etiqueta*']");

    private By campoNomeEtiqueta = By.xpath("");
    public By getCampoNomeEtiqueta(String nomeEtiqueta) {
        return campoNomeEtiqueta = By.xpath("//span[text()='" + nomeEtiqueta + "']");}
    private By campoSelecionarImpressora = By.xpath("//span[text()='Selecione uma Impressora*']");

    private By campoNomeImpressora = By.xpath("");

    public By getCampoNomeImpressora(String nomeImpressora) {
        return campoNomeImpressora = By.xpath("//span[text()='" + nomeImpressora + "']");}
    private By campoQuantidadeImpressao = By.id("withoutgrouping");
    private By btnImprimir = By.xpath("//span[text()='Imprimir']");
    private By validarImpressao = By.xpath("//p[text()='A etiqueta selecionada será impressa. Aguarde!']");
    private By clicarFora = By.xpath("/html/body/app-root/app-main/div/div[2]/app-single-prints/div/div/div/div[2]");

    public By getClicarFora() {
        return clicarFora;
    }

    public By getBtnOK() {
        return btnOK;
    }

    public By getSubMenuImpressaoAvulsa() {
        return subMenuImpressaoAvulsa;
    }

    public By getCampoSKU() {
        return campoSKU;
    }

    public By getCampoGTIN() {
        return campoGTIN;
    }

    public By getCampoDescricaoProduto() {
        return campoDescricaoProduto;
    }

    public By getBtnBuscarSKU() {
        return btnBuscarSKU;
    }

    public By getCampoCategoriaProduto() {
        return campoCategoriaProduto;
    }

    public By getBtnBuscarCategoriaProduto() {
        return btnBuscarCategoriaProduto;
    }





    public By getBtnProximo() {
        return btnProximo;
    }

    public By getCampoLote() {
        return campoLote;
    }

    public By getCampoDataProd() {
        return campoDataProd;
    }

    public By getCampoDataExpiracao() {
        return campoDataExpiracao;
    }

    public By getCampoDocFiscal() {
        return campoDocFiscal;
    }

    public By getCampoObservacoes() {
        return campoObservacoes;
    }

    public By getCampoSelecionarEtiqueta() {
        return campoSelecionarEtiqueta;
    }



    public By getCampoSelecionarImpressora() {
        return campoSelecionarImpressora;
    }



    public By getCampoQuantidadeImpressao() {
        return campoQuantidadeImpressao;
    }

    public By getBtnImprimir() {
        return btnImprimir;
    }

    public By getValidarImpressao() {
        return validarImpressao;
    }

    public By getBtnBuscarGTIN() {
        return btnBuscarGTIN;
    }
}
