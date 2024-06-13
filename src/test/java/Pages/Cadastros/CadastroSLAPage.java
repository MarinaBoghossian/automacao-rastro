package Pages.Cadastros;

import org.openqa.selenium.By;

public class CadastroSLAPage {

    private By subMenuSLA = By.xpath("//span[text()='SLA']");
    private By btnNovoSLA = By.id("button-new");
    private By campoTipo = By.id("pr_id_68_label");
    private By selectTipo = By.xpath("");
    private By selectDiasAntecedencia = By.xpath("");
    private By campoDiasAntecedecia = By.id("pr_id_69_label");
    private By campoDias = By.xpath("//input[@formcontrolname='typeOrderDay']");
    private By campoSLA = By.xpath("//input[@formcontrolname='slaRuleDay']");
    private  By btnSalvar = By.xpath("//span[text()='Salvar']");
    private By confirmacaoRegistroSLA = By.xpath("//span[text()='SLA foi registrado com sucesso']");
    private By btnDeletar = By.xpath("");
    private By btnEditar = By.xpath("");
    private By confirmarExcusao = By.id("button-yes");
    public By getBtnDeletar(String nomeTipo) {
        return btnDeletar = By.xpath("//td[text()='" + nomeTipo + "']//following::button[@ptooltip='Excluir SLA']");}
    public By getBtnEditar(String nomeTipo) {
        return btnEditar = By.xpath("//td[text()='" + nomeTipo + "']//following::button[@ptooltip='Editar SLA']");}
    public By getSelectDiasAntecedencia(String nomeDiasAnt) {
        return selectDiasAntecedencia = By.xpath("//span[@id='pr_id_69_label']//div[text()='" + nomeDiasAnt + "']");}
    public By getSelectTipo(String nomeTipo) {
    return selectTipo = By.xpath("//span[@id='pr_id_68_label']//div[text()='" + nomeTipo + "']");}

    public By getSubMenuSLA() {
        return subMenuSLA;
    }

    public By getBtnNovoSLA() {
        return btnNovoSLA;
    }

    public By getCampoTipo() {
        return campoTipo;
    }

    public By getCampoDiasAntecedecia() {
        return campoDiasAntecedecia;
    }

    public By getCampoDias() {
        return campoDias;
    }

    public By getCampoSLA() {
        return campoSLA;
    }

    public By getBtnSalvar() {
        return btnSalvar;
    }

    public By getConfirmacaoRegistroSLA() {
        return confirmacaoRegistroSLA;
    }

    public By getConfirmarExcusao() {
        return confirmarExcusao;
    }

}
