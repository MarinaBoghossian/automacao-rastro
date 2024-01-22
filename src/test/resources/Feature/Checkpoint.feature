
@checkpoint
Feature: Realizar Checkpoint no Rastro app
  I want to use this template for my feature file

  @novocheckpointsemleitor
  @negativo
  Scenario: Realizar novo checkpoint sem leitor conectado
    Given  que o usuário faça o login e selecione checkpoint
    When estiver no submenu Realizar checkpoint e iniciar um novo chekpoint sem leitor conectado
    Then o checkpoint não será realizado e aparecera a mensagem 'O agente de leitura não foi encontrado! Verifique se ele foi instalado e/ou está executando.'