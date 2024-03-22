@inventario
Feature: Inventario no Rastro app
  I want to use this template for my feature file

  @criarcampanhainventario
  Scenario: Criar nova Campanha de Inventário
    Given que o usuário faça o login no Rastro e esteja no dashboard
    When ir em inventario e selecionar o submenu campanha
    And criar uma nova campanha
    Then a campanha sera cadastrada com sucesso
    And fechar navegador

  @editarcampanhainventario
  Scenario: Editar uma campanha existente
    Given que o usuário faça o login no Rastro e esteja no dashboard
    When ir em inventario e selecionar o submenu campanha
    And clicar em editar e alterar os dados desejados
    Then a campanha será editada e deverá constar na listagem com o novo nome
    And fechar navegador


  @deletarcampanhainventario
  Scenario: Deletar campanha
    Given que o usuário faça o login no Rastro e esteja no dashboard
    When ir em inventario e selecionar o submenu campanha
    And clicar em deletar
    Then a campanha sera deletada com sucesso
    And fechar navegador


  @campanhaincentariotrouseeau500
  Scenario: Criar campanha invetario com 500 mil itens sem nenhuma falha
    Given que o usuário faça o login no Rastro e esteja no dashboard
    And ir em inventario e selecionar o submenu campanha
    When criar uma nova campanha com 500 mil itens
    And consolidar os itens lidos sem nenhum erro
    Then a campanha devera ser finalizada com sucesso
    And fechar navegador

    @novacontagem
  Scenario: Realizar nova contagem em uma campanha já existente
      Given que o usuário faça o login no Rastro e esteja no dashboard
      And ir em inventario e selecionar o submenu campanha
      When selecionar a campanha desejada
      Then iniciar uma nova contagem






