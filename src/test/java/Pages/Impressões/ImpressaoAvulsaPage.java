package Pages.Impressões;

import org.openqa.selenium.By;

public class ImpressaoAvulsaPage {
    private By subMenuImpressaoAvulsa = By.xpath("//span[text()='Impressão Avulsa']");
    private By campoSKU = By.xpath("/html/body/app-root/app-main/div/div[2]/app-single-prints/div/div/div/div[2]/form[1]/div/div[1]/div[1]/div/div/div/input");
    private By campoGTIN = By.xpath("/html/body/app-root/app-main/div/div[2]/app-single-prints/div/div/div/div[2]/form[1]/div/div[1]/div[2]/div/input");
    private By campoDescricaoProduto = By.xpath("/html/body/app-root/app-main/div/div[2]/app-single-prints/div/div/div/div[2]/form[1]/div/div[2]/div[1]/div/input");
    private By btnBuscarDescricaoProduto = By.xpath("/html/body/app-root/app-main/div/div[2]/app-single-prints/div/div/div/div[2]/form[1]/div/div[2]/div[1]/div/button");
    private By campoCategoriaProduto = By.xpath("/html/body/app-root/app-main/div/div[2]/app-single-prints/div/div/div/div[2]/form[1]/div/div[2]/div[2]/div/input");
    private By btnBuscarCategoriaProduto = By.xpath("/html/body/app-root/app-main/div/div[2]/app-single-prints/div/div/div/div[2]/form[1]/div/div[2]/div[2]/div/button");
   //inserir nome do produto que deseja buscar após o span text
    private By campoConfirmarDescricaoProduto = By.xpath("//td[text()='produto teste automacao']");
    //inserir o nome da categoria do produto que deseja buscar após o span text
    private By campoConfirmarCategoriaProduto = By.xpath("//td[text()='categoria teste automacao']");
    private By btnOK = By.xpath("/html/body/app-root/app-main/div/div[2]/app-single-prints/p-dialog[2]/div/div/div[3]/p-footer/button");
    private By btnProximo = By.xpath("/html/body/app-root/app-main/div/div[2]/app-single-prints/div/div/div/div[3]/div/div/div/button[2]");
    private By campoLote = By.xpath("/html/body/app-root/app-main/div/div[2]/app-single-prints/div/div/div/div[2]/form[2]/div[1]/div[1]/input");
    private By campoDataProd = By.xpath("/html/body/app-root/app-main/div/div[2]/app-single-prints/div/div/div/div[2]/form[2]/div[1]/div[2]/p-calendar/span/input");
    private By campoDataExpiracao = By.xpath("/html/body/app-root/app-main/div/div[2]/app-single-prints/div/div/div/div[2]/form[2]/div[1]/div[3]/p-calendar/span/input");
    private By campoDocFiscal = By.xpath("/html/body/app-root/app-main/div/div[2]/app-single-prints/div/div/div/div[2]/form[2]/div[2]/div/input");
    private By campoObservacoes = By.xpath("/html/body/app-root/app-main/div/div[2]/app-single-prints/div/div/div/div[2]/form[2]/div[3]/div/textarea");
    private By campoSelecionarEtiqueta = By.xpath("//span[text()='Selecione uma Etiqueta*']");
    //inserir o nome da Etiqueta que deseja selecionar após o span text
    private By campoNomeEtiqueta = By.xpath("//span[text()='Teste Etiqueta 1']");
    private By campoSelecionarImpressora = By.xpath("//span[text()='Selecione uma Impressora*']");
    //inserir o nome da Impressora que deseja selecionar após o span text
    private By campoNomeImpressora = By.xpath("//span[text()='tetsss11']");
    private By campoQuantidadeImpressao = By.id("withoutgrouping");
    private By btnImprimir = By.xpath("/html/body/app-root/app-main/div/div[2]/app-single-prints/div/div/div/div[3]/div/div/div/p-button[3]/button");
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

    public By getBtnBuscarDescricaoProduto() {
        return btnBuscarDescricaoProduto;
    }

    public By getCampoCategoriaProduto() {
        return campoCategoriaProduto;
    }

    public By getBtnBuscarCategoriaProduto() {
        return btnBuscarCategoriaProduto;
    }

    public By getCampoConfirmarDescricaoProduto() {
        return campoConfirmarDescricaoProduto;
    }

    public By getCampoConfirmarCategoriaProduto() {
        return campoConfirmarCategoriaProduto;
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

    public By getCampoNomeEtiqueta() {
        return campoNomeEtiqueta;
    }

    public By getCampoSelecionarImpressora() {
        return campoSelecionarImpressora;
    }

    public By getCampoNomeImpressora() {
        return campoNomeImpressora;
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
}
