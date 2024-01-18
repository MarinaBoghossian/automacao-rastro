@impressoes
Feature: Impressoes no Rastro app
  I want to use this template for my feature file

@impressaoavulsa
Scenario: Impressão Avulsa
  Given que o usuário faça login no Rastro
  When ir em impressoes e selecionar a aba Impressao Avulsa
  And preencher as informacoes da impressao Avulsa
  Then a impressao avulsa sera enviada com sucesso

  @scanprint
  Scenario: Scan Print
    Given que o usuário faça login no Rastro
    When ir em impressoes e selecionar a aba Scan Print
    And preencher as informacoes da Scan Print
    Then a Scan Print sera enviada com sucesso

  @impressaorecode
  Scenario: Impressao de Recode
    Given que o usuário faça login no Rastro
    When ir em impressoes e selecionar a aba Recode
    And selecionar o submenu Impressao de Recode
    And preencher as informacoes da Etiqueta de Recode
    Then a impressao do recode sera enviada com sucesso

  @associacaorecode
  Scenario: Associação de Recode
    Given que o usuário faça login no Rastro
    When ir em impressoes e selecionar a aba Recode
    And selecionar o submenu Associacao de Recode
    And preencher as informacoes da Associacao de Recode
    Then a associacao do recode sera enviada com sucesso

  @impressaoagregacao
  Scenario: Impressão de Etiqueta de Agregação
    Given que o usuário faça login no Rastro
    When selecionar impressoes e a aba Agregcao
    And preencher as informacoes de impressao da Etiqueta de Agregacao
    Then sera exibido o alerta de impressao e a impressao sera enviada com sucesso



