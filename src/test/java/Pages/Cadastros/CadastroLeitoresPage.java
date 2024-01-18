package Pages.Cadastros;

import org.openqa.selenium.By;

public class CadastroLeitoresPage {






    private By subMenuLeitores =  By.xpath("//span[text()='Leitores']");
    private By btnNovoLeitor = By.id("button-new");
    private By campoNomeLeitor = By.id("txt-name");
    private By campoEnderecoIPLeitor = By.id("txt-ip");
    private By campoPortaLeitor = By.id("txt-port");
    private By campoMododaLista = By.xpath("//span[text()='Modo da Lista']");
    private By mododaListaUnique = By.xpath("//span[text()='UNIQUE']");
    private By mododaListaNormal = By.xpath("//span[text()='NORMAL']");
    private By campoLimitacaodaLista = By.xpath("//span[text()='Limitação da Lista']");
    private By limitacaoClear = By.xpath("//span[text()='CLEAR']");
    private By limitacaoStop = By.xpath("//span[text()='STOP']");
    private By campoModoLeitor = By.xpath("//span[text()='Modo do Leitor']");
    private By nomeModoLeitor = By.xpath("//span[text()='AutoSetStaticFast']");
    private By campoModoPesquisa = By.xpath("//span[text()='Modo de Pesquisa']");
    private By nomeModoPesquisa = By.xpath("//span[text()='SingleTarget']");
    private By campoSessaoLeitor = By.xpath("//span[text()='Sessão do Leitor']");
    private By nomeSessaoLeitor =  By.xpath("//span[text()='Sessão 1']");
    private By campoEstimativaTag = By.id("txt-tag-population-estimate");
    private By campoIDServidor = By.id("txt-server-id");
    private By campoIPServidor = By.id("txt-server-ip");
    private By campoIdentificacaoServidor = By.id("txt-server-identification");
    private By campoConfigOrigem = By.id("txt-origin-config");
    private By btnSalvarLeitor = By.id("button-save");
    private By validarCadastroLeitor = By.xpath("//p[text()='O leitor foi cadastrado com sucesso!']");





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

    public By getMododaListaUnique() {
        return mododaListaUnique;
    }

    public By getMododaListaNormal() {
        return mododaListaNormal;
    }

    public By getCampoLimitacaodaLista() {
        return campoLimitacaodaLista;
    }

    public By getLimitacaoClear() {
        return limitacaoClear;
    }

    public By getLimitacaoStop() {
        return limitacaoStop;
    }

    public By getCampoModoLeitor() {
        return campoModoLeitor;
    }

    public By getNomeModoLeitor() {
        return nomeModoLeitor;
    }

    public By getCampoModoPesquisa() {
        return campoModoPesquisa;
    }

    public By getNomeModoPesquisa() {
        return nomeModoPesquisa;
    }

    public By getCampoSessaoLeitor() {
        return campoSessaoLeitor;
    }

    public By getNomeSessaoLeitor() {
        return nomeSessaoLeitor;
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
