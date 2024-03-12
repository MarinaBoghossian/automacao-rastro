package Pages.Cadastros;

import org.openqa.selenium.By;

public class CadastroLeitoresPage {






    private By subMenuLeitores =  By.xpath("//span[text()='Leitores']");
    private By btnNovoLeitor = By.id("button-new");
    private By campoNomeLeitor = By.id("txt-name");
    private By campoEnderecoIPLeitor = By.id("txt-ip");
    private By campoPortaLeitor = By.id("txt-port");
    private By campoMododaLista = By.xpath("//span[text()='Modo da Lista']");
    private By modoDaLista = By.xpath("");

    private By campoLimitacaodaLista = By.xpath("//span[text()='Limitação da Lista']");
    private By nomeLimitacaoLista = By.xpath("");

    private By campoModoLeitor = By.xpath("//span[text()='Modo do Leitor']");
    private By nomeModoLeitor = By.xpath("");
    private By campoModoPesquisa = By.xpath("//span[text()='Modo de Pesquisa']");
    private By nomeModoPesquisa = By.xpath("");
    private By campoSessaoLeitor = By.xpath("//span[text()='Sessão do Leitor']");
    private By nomeSessaoLeitor =  By.xpath("");
    private By campoEstimativaTag = By.id("txt-tag-population-estimate");
    private By campoIDServidor = By.id("txt-server-id");
    private By campoIPServidor = By.id("txt-server-ip");
    private By campoIdentificacaoServidor = By.id("txt-server-identification");
    private By campoConfigOrigem = By.id("txt-origin-config");
    private By btnSalvarLeitor = By.id("button-save");
    private By validarCadastroLeitor = By.xpath("//p[text()='O leitor foi cadastrado com sucesso!']");
    private By btnHabilitarAntena = By.xpath("//p-inputswitch[@formcontrolname='rfidReaderImpinjAntenna4Enable']");
    private By btnIncluirFastID =  By.xpath("//p-inputswitch[@formcontrolname='includeFastId']");
    private By antena1 = By.xpath("//span[text()='Antena 1']");
    private By antena2 = By.xpath("//span[text()='Antena 2']");
    private By antena3 = By.xpath("//span[text()='Antena 3']");
    private By antena4 = By.xpath("//span[text()='Antena 4']");








    public By getSubMenuLeitores() {
        return subMenuLeitores;
    }

    public By getBtnNovoLeitor() {
        return btnNovoLeitor;
    }

    public By getCampoNomeLeitor() {
        return campoNomeLeitor;
    }

    public By getCampoEnderecoIPLeitor() {
        return campoEnderecoIPLeitor;
    }

    public By getCampoPortaLeitor() {
        return campoPortaLeitor;
    }

    public By getCampoMododaLista() {
        return campoMododaLista;
    }

    public By getModoDaLista(String nomeModoLista) {
        return modoDaLista = By.xpath("//span[text()='"+ nomeModoLista +"']");
    }




    public By getCampoLimitacaodaLista() {
        return campoLimitacaodaLista;
    }

    public By getNomeLimitacaoLista(String nomeLimitacao) {
        return nomeLimitacaoLista  = By.xpath("//span[text()='" + nomeLimitacao +"']");
    }



    public By getCampoModoLeitor() {
        return campoModoLeitor;
    }

    public By getNomeModoLeitor(String modoLeitor) {
        return nomeModoLeitor = By.xpath("//span[text()='" + modoLeitor +"']");
    }

    public By getCampoModoPesquisa() {
        return campoModoPesquisa;
    }

    public By getNomeModoPesquisa(String modoPesquisa) {
        return nomeModoPesquisa= By.xpath("//span[text()='" + modoPesquisa +"']");
    }

    public By getCampoSessaoLeitor() {
        return campoSessaoLeitor;
    }

    public By getNomeSessaoLeitor(String sessaoLeitor) {
        return nomeSessaoLeitor = By.xpath("//span[text()='" + sessaoLeitor +"']");
    }

    public By getCampoEstimativaTag() {
        return campoEstimativaTag;
    }

    public By getCampoIDServidor() {
        return campoIDServidor;
    }

    public By getCampoIPServidor() {
        return campoIPServidor;
    }

    public By getCampoIdentificacaoServidor() {
        return campoIdentificacaoServidor;
    }

    public By getCampoConfigOrigem() {
        return campoConfigOrigem;
    }

    public By getBtnSalvarLeitor() {
        return btnSalvarLeitor;
    }

    public By getValidarCadastroLeitor() {
        return validarCadastroLeitor;
    }

}
