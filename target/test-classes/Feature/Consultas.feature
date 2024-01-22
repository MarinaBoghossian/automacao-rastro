@consultas
Feature: Consultas no Rastro app
  I want to use this template for my feature file



  @consultaagregacao
  Scenario: Consulta de Agregação
    Given que o usuário faça o login no Rastro e esteja no dashboard
    When ir em consulta e selecionar a aba agregação
    And ele ira preencher as informações da consulta de agregacao
    Then a consulta de agregacao será realizada

  @consultaconferencia
  Scenario: Consulta de Conferencia
    Given que o usuário faça o login no Rastro e esteja no dashboard
    When ir em consulta e selecionar a aba conferencia
    And ele ira preencher as informações da consulta de Conferencia
    Then a consulta de Conferencia será realizada

  @consultaconferenciadata
  Scenario: Consulta de Conferencia por data
    Given que o usuário faça o login no Rastro e esteja no dashboard
    When ir em consulta e selecionar a aba Conferencia por data
    And ele ira preencher as informações da consulta de Conferencia por data
    Then a consulta de Conferencia por data será realizada

  @consultaevento
  Scenario: Consulta de Evento
    Given que o usuário faça o login no Rastro e esteja no dashboard
    When ir em consulta e selecionar a aba evento
    And ele ira preencher as informações da consulta de evento
    Then a consulta de evento será realizada

  @consultaepc
  Scenario: Consulta de EPC
    Given que o usuário faça o login no Rastro e esteja no dashboard
    When ir em consulta e selecionar a aba EPC
    And ele ira preencher as informações da consulta de EPC
    Then a consulta de EPC será realizada

  @consultaserial
  Scenario: Consulta de Serial
    Given que o usuário faça o login no Rastro e esteja no dashboard
    When ir em consulta e selecionar a aba Serial
    And ele ira preencher as informações da consulta de Serial
    Then a consulta de Serial será realizada

  @consultalote
  Scenario: Consulta de Lote
    Given que o usuário faça o login no Rastro e esteja no dashboard
    When ir em consulta e selecionar a aba Lote
    And ele ira preencher as informações da consulta de Lote
    Then a consulta de Lote será realizada

  @consultajob
  Scenario: Consulta de Job
    Given que o usuário faça o login no Rastro e esteja no dashboard
    When ir em consulta e selecionar a aba Job
    And ele ira preencher as informações da consulta de Job
    Then a consulta de Job será realizada