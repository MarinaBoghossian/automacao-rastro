@regressivo
Feature: Cadastros no Rastro app
  I want to use this template for my feature file


@regressivo1
Scenario: Regressivo 1: passar por todas as telas de cadastros
  Given que o usuário faça login no Rastro e esteja no dashboard
  And cadastre um produto
  And cadastre um site
  And cadastre um usuario
  And cadastre uma impressora
  And cadastre um leitor
  And cadastre um spooler
  And cadastre uma etiqueta item
  And cadastre uma etiqueta agregacao
  And cadastre um checkpoint
  And cadastre um SLA
  When todos os ites forem cadastrados
  Then fazer a conferencia se os cadastros estao retornando corretamente em suas respectivas listas

@regressivo2
Scenario: Regressivo 2: passar por todas as telas de impressão
  Given que o usuário faça login no Rastro e esteja no dashboard
  And fazer uma impressao avulsa
  And subir um arquivo de impressão pendente
  And fazer uma Scan Print
  And fazer uma impressao recode
  And fazer uma associacao Recode
  And fazer uma agregacao