
@checkpoint
Feature: Realizar Checkpoint no Rastro app
  I want to use this template for my feature file

  @cadastrocheckpoint
  Scenario: Cadastro de Checkpoint
    Given que o usuário faça o login no Rastro e esteja no dashboard
    When ir em cadastro e selecionar a aba Checkpoints
    And clicar em novo e inserir as informacoes do novo checkpoint
    Then o checkpoint será cadastrado com sucesso

  @novocheckpointsemleitor
  @negativo
  Scenario: Realizar novo checkpoint sem leitor conectado
    Given  que o usuário faça o login e selecione checkpoint
    When estiver no submenu Realizar checkpoint e iniciar um novo chekpoint sem leitor conectado
    Then o checkpoint não será realizado e aparecera a mensagem 'O agente de leitura não foi encontrado! Verifique se ele foi instalado e/ou está executando.'

  @cadastrocheckpointusernotadmin
  Scenario: Cadastro de Checkpoint com usuário not admin
    Given que um usuário not-admin faça login no Rastro
    When ir em cadastro e selecionar a aba Checkpoints
    And clicar em novo e inserir as informacoes do novo checkpoint
    Then devera aparecer a mensagem 'Esse perfil não tem permissão para realizar esta operação!'