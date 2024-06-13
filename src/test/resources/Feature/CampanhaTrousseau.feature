@campanhatrousseau
Feature: Campanha Trousseau - teste especial com 16 usuário atuando simultaneamente em Campanha de inventário
  I want to use this template for my feature file

@cricaodenovacampanha
Scenario: Criação de uma nova campanha de inventário
  Given  que o usuário faça o login no Rastro e esteja no dashboard
  And ir em inventario e selecionar o submenu campanha
  When clicar em novo e inserir o nome da campanha
  Then clicar em salvar e a nova campanha será criada

@user1
Scenario Outline: Fazer uma leitura com 2 mil itens em uma campanha de inventario já existente - usuário 1
  Given que o usuário faça o login no Rastro  com o usuario <usuario> e esteja no dashboard
  And ir em inventario e selecionar o submenu campanha
  When acessar uma campanha existente <nome campanha> e realizar a leitura <nome portal> <nome leitura> dos itens
  And voltar aos portais, escolher um novo portal <nome portal2> e realizar leituras <nome leitura2> na mesma campanha por 5vezes em portais diferentes <nome portal3> <nome portal4> <nome portal5> <nome leitura3> <nome leitura4> <nome leitura5>
  Then cada leitura devera ser finalizada com no maximo 1500itens e no total devera ter por volta de 5000itens
  And fechar navegador
  Examples:
    | usuario                                     | nome portal    | nome leitura       | nome campanha | nome leitura2 | nome portal2   | nome leitura3 | nome portal3   | nome leitura4 | nome portal4   | nome leitura5 | nome portal5   |
    | "marina.lessa@rastreabilidadebrasil.com.br" | "Checkpoint 1" | "Primeira Leitura" | "Teste 8"     | "leitura 2"   | "Checkpoint 6" | "leitura 3"   | "Checkpoint 2" | "leitura 4"   | "Checkpoint 1" | "leitura 1"   | "Checkpoint 3" |
    | "marina.lessa@rastreabilidadebrasil.com.br" | "Checkpoint 2" | "Segunda Leitura"  | "Teste 8"     | "leitura 2"   | "Checkpoint 4" | "leitura 3"   | "Checkpoint 4" | "leitura 4"   | "Checkpoint 3" | "leitura 5"   | "Checkpoint 5" |
    | "marina.lessa@rastreabilidadebrasil.com.br" | "Checkpoint 3" | "Terceira Leitura" | "Teste 8"     | "leitura 2"   | "Checkpoint 3" | "leitura 3"   | "Checkpoint 6" | "leitura 4"   | "Checkpoint 5" | "leitura 5"   | "Checkpoint 8" |
    | "marina.lessa@rastreabilidadebrasil.com.br" | "Checkpoint 4" | "Quarta Leitura"   | "Teste 8"     | "leitura 2"   | "Checkpoint 1" | "leitura 3"   | "Checkpoint 8" | "leitura 4"   | "Checkpoint 7" | "leitura 5"   | "Checkpoint 6" |
    | "marina.lessa@rastreabilidadebrasil.com.br" | "Checkpoint 5" | "Quinta Leitura"   | "Teste 8"     | "leitura 2"   | "Checkpoint 8" | "leitura 3"   | "Checkpoint 1" | "leitura 4"   | "Checkpoint 8" | "leitura 5"   | "Checkpoint 7" |
    | "marina.lessa@rastreabilidadebrasil.com.br" | "Checkpoint 6" | "Sexta Leitura"    | "Teste 8"     | "leitura 2"   | "Checkpoint 2" | "leitura 3"   | "Checkpoint 3" | "leitura 4"   | "Checkpoint 6" | "leitura 5"   | "Checkpoint 2" |
    | "marina.lessa@rastreabilidadebrasil.com.br" | "Checkpoint 7" | "Setima Leitura"   | "Teste 8"     | "leitura 2"   | "Checkpoint 5" | "leitura 3"   | "Checkpoint 5" | "leitura 4"   | "Checkpoint 3" | "leitura 5"   | "Checkpoint 1" |
    | "marina.lessa@rastreabilidadebrasil.com.br" | "Checkpoint 8" | "Oitava Leitura"   | "Teste 8"     | "leitura 2"   | "Checkpoint 7" | "leitura 3"   | "Checkpoint 7" | "leitura 4"   | "Checkpoint 5" | "leitura 5"   | "Checkpoint 4" |
    | "marina.lessa@rastreabilidadebrasil.com.br" | "Checkpoint 1" | "Nona Leitura"     | "Teste 8"     | "leitura 2"   | "Checkpoint 6" | "leitura 3"   | "Checkpoint 5" | "leitura 4"   | "Checkpoint 4" | "leitura 5"   | "Checkpoint 5" |
    | "marina.lessa@rastreabilidadebrasil.com.br" | "Checkpoint 8" | "Decima Leitura"   | "Teste 8"     | "leitura 2"   | "Checkpoint 5" | "leitura 3"   | "Checkpoint 2" | "leitura 4"   | "Checkpoint 2" | "leitura 5"   | "Checkpoint 3" |


  @user2
  Scenario Outline: Fazer uma leitura com 2 mil itens em uma campanha de inventario já existente - usuário 2
    Given que o usuário faça o login no Rastro  com o usuario <usuario> e esteja no dashboard
    And ir em inventario e selecionar o submenu campanha
    When acessar uma campanha existente <nome campanha> e realizar a leitura <nome portal> <nome leitura> dos itens
    And voltar aos portais, escolher um novo portal <nome portal2> e realizar leituras <nome leitura2> na mesma campanha por 5vezes em portais diferentes <nome portal3> <nome portal4> <nome portal5> <nome leitura3> <nome leitura4> <nome leitura5>
    Then cada leitura devera ser finalizada com no maximo 1500itens e no total devera ter por volta de 5000itens
    And fechar navegador
    Examples:
      | usuario                           | nome portal     | nome leitura       | nome campanha | nome leitura2 | nome portal2    | nome leitura3 | nome portal3    | nome leitura4 | nome portal4    | nome leitura5 | nome portal5    |
      | "marina.user2@testetrousseau.com" | "Checkpoint 1"  | "Primeira Leitura" | Teste 2"      | "leitura 2"   | "Checkpoint 15" | "leitura 3"   | "Checkpoint 2"  | "leitura 4"   | "Checkpoint 1"  | "leitura 1"   | "Checkpoint 15" |
      | "marina.user2@testetrousseau.com" | "Checkpoint 2"  | "Primeira Leitura" | Teste 2"      | "leitura 2"   | "Checkpoint 14" | "leitura 3"   | "Checkpoint 4"  | "leitura 4"   | "Checkpoint 3"  | "leitura 5"   | "Checkpoint 15" |
      | "marina.user2@testetrousseau.com" | "Checkpoint 3"  | "Primeira Leitura" | Teste 2"      | "leitura 2"   | "Checkpoint 13" | "leitura 3"   | "Checkpoint 6"  | "leitura 4"   | "Checkpoint 5"  | "leitura 5"   | "Checkpoint 15" |
      | "marina.user2@testetrousseau.com" | "Checkpoint 4"  | "Primeira Leitura" | Teste 2"      | "leitura 2"   | "Checkpoint 12" | "leitura 3"   | "Checkpoint 8"  | "leitura 4"   | "Checkpoint 7"  | "leitura 5"   | "Checkpoint 15" |
      | "marina.user2@testetrousseau.com" | "Checkpoint 5"  | "Primeira Leitura" | Teste 2"      | "leitura 2"   | "Checkpoint 11" | "leitura 3"   | "Checkpoint 10" | "leitura 4"   | "Checkpoint 9"  | "leitura 5"   | "Checkpoint 15" |
      | "marina.user2@testetrousseau.com" | "Checkpoint 6"  | "Primeira Leitura" | Teste 2"      | "leitura 2"   | "Checkpoint 10" | "leitura 3"   | "Checkpoint 12" | "leitura 4"   | "Checkpoint 11" | "leitura 5"   | "Checkpoint 15" |
      | "marina.user2@testetrousseau.com" | "Checkpoint 7"  | "Primeira Leitura" | Teste 2"      | "leitura 2"   | "Checkpoint 9"  | "leitura 3"   | "Checkpoint 14" | "leitura 4"   | "Checkpoint 13" | "leitura 5"   | "Checkpoint 15" |
      | "marina.user2@testetrousseau.com" | "Checkpoint 8"  | "Primeira Leitura" | Teste 2"      | "leitura 2"   | "Checkpoint 7"  | "leitura 3"   | "Checkpoint 1"  | "leitura 4"   | "Checkpoint 15" | "leitura 5"   | "Checkpoint 15" |
      | "marina.user2@testetrousseau.com" | "Checkpoint 9"  | "Primeira Leitura" | Teste 2"      | "leitura 2"   | "Checkpoint 6"  | "leitura 3"   | "Checkpoint 15" | "leitura 4"   | "Checkpoint 14" | "leitura 5"   | "Checkpoint 15" |
      | "marina.user2@testetrousseau.com" | "Checkpoint 10" | "Primeira Leitura" | Teste 2"      | "leitura 2"   | "Checkpoint 5"  | "leitura 3"   | "Checkpoint 9"  | "leitura 4"   | "Checkpoint 12" | "leitura 5"   | "Checkpoint 15" |


  @user3
  Scenario Outline: Criar campanha invetario com 2 mil itens - usuário 3
    Given que o usuário faça o login no Rastro  com o usuario <usuario> e esteja no dashboard
    And ir em inventario e selecionar o submenu campanha
    When acessar uma campanha existente <nome campanha> e realizar a leitura <nome portal> <nome leitura> dos itens
    And voltar aos portais, escolher um novo portal <nome portal2> e realizar leituras <nome leitura2> na mesma campanha por 5vezes em portais diferentes <nome portal3> <nome portal4> <nome portal5> <nome leitura3> <nome leitura4> <nome leitura5>
    Then cada leitura devera ser finalizada com no maximo 1500itens e no total devera ter por volta de 5000itens
    And fechar navegador
    Examples:
      | usuario                           | nome portal     | nome leitura       | nome campanha | nome leitura2 | nome portal2    | nome leitura3 | nome portal3    | nome leitura4 | nome portal4    | nome leitura5 | nome portal5    |
      | "marina.user3@testetrousseau.com" | "Checkpoint 1"  | "Primeira Leitura" | "Marina"      | "leitura 2"   | "Checkpoint 15" | "leitura 3"   | "Checkpoint 2"  | "leitura 4"   | "Checkpoint 1"  | "leitura 1"   | "Checkpoint 15" |
      | "marina.user3@testetrousseau.com" | "Checkpoint 2"  | "Primeira Leitura" | "Marina"      | "leitura 2"   | "Checkpoint 14" | "leitura 3"   | "Checkpoint 4"  | "leitura 4"   | "Checkpoint 3"  | "leitura 5"   | "Checkpoint 15" |
      | "marina.user3@testetrousseau.com" | "Checkpoint 3"  | "Primeira Leitura" | "Marina"      | "leitura 2"   | "Checkpoint 13" | "leitura 3"   | "Checkpoint 6"  | "leitura 4"   | "Checkpoint 5"  | "leitura 5"   | "Checkpoint 15" |
      | "marina.user3@testetrousseau.com" | "Checkpoint 4"  | "Primeira Leitura" | "Marina"      | "leitura 2"   | "Checkpoint 12" | "leitura 3"   | "Checkpoint 8"  | "leitura 4"   | "Checkpoint 7"  | "leitura 5"   | "Checkpoint 15" |
      | "marina.user3@testetrousseau.com" | "Checkpoint 5"  | "Primeira Leitura" | "Marina"      | "leitura 2"   | "Checkpoint 11" | "leitura 3"   | "Checkpoint 10" | "leitura 4"   | "Checkpoint 9"  | "leitura 5"   | "Checkpoint 15" |
      | "marina.user3@testetrousseau.com" | "Checkpoint 6"  | "Primeira Leitura" | "Marina"      | "leitura 2"   | "Checkpoint 10" | "leitura 3"   | "Checkpoint 12" | "leitura 4"   | "Checkpoint 11" | "leitura 5"   | "Checkpoint 15" |
      | "marina.user3@testetrousseau.com" | "Checkpoint 7"  | "Primeira Leitura" | "Marina"      | "leitura 2"   | "Checkpoint 9"  | "leitura 3"   | "Checkpoint 14" | "leitura 4"   | "Checkpoint 13" | "leitura 5"   | "Checkpoint 15" |
      | "marina.user3@testetrousseau.com" | "Checkpoint 8"  | "Primeira Leitura" | "Marina"      | "leitura 2"   | "Checkpoint 7"  | "leitura 3"   | "Checkpoint 1"  | "leitura 4"   | "Checkpoint 15" | "leitura 5"   | "Checkpoint 15" |
      | "marina.user3@testetrousseau.com" | "Checkpoint 9"  | "Primeira Leitura" | "Marina"      | "leitura 2"   | "Checkpoint 6"  | "leitura 3"   | "Checkpoint 15" | "leitura 4"   | "Checkpoint 14" | "leitura 5"   | "Checkpoint 15" |
      | "marina.user3@testetrousseau.com" | "Checkpoint 10" | "Primeira Leitura" | "Marina"      | "leitura 2"   | "Checkpoint 5"  | "leitura 3"   | "Checkpoint 9"  | "leitura 4"   | "Checkpoint 12" | "leitura 5"   | "Checkpoint 15" |


  @user4
  Scenario Outline: Criar campanha invetario com 10 mil itens - usuário 4
    Given que o usuário faça o login no Rastro  com o usuario <usuario> e esteja no dashboard
    And ir em inventario e selecionar o submenu campanha
    When acessar uma campanha existente <nome campanha> e realizar a leitura <nome portal> <nome leitura> dos itens
    And voltar aos portais, escolher um novo portal <nome portal2> e realizar leituras <nome leitura2> na mesma campanha por 5vezes em portais diferentes <nome portal3> <nome portal4> <nome portal5> <nome leitura3> <nome leitura4> <nome leitura5>
    Then cada leitura devera ser finalizada com no maximo 1500itens e no total devera ter por volta de 5000itens
    And fechar navegador
    Examples:
      | usuario                           | nome portal     | nome leitura       | nome campanha | nome leitura2 | nome portal2    | nome leitura3 | nome portal3    | nome leitura4 | nome portal4    | nome leitura5 | nome portal5    |
      | "marina.user4@testetrousseau.com" | "Checkpoint 1"  | "Primeira Leitura" | "Marina"      | "leitura 2"   | "Checkpoint 15" | "leitura 3"   | "Checkpoint 2"  | "leitura 4"   | "Checkpoint 1"  | "leitura 1"   | "Checkpoint 15" |
      | "marina.user4@testetrousseau.com" | "Checkpoint 2"  | "Primeira Leitura" | "Marina"      | "leitura 2"   | "Checkpoint 14" | "leitura 3"   | "Checkpoint 4"  | "leitura 4"   | "Checkpoint 3"  | "leitura 5"   | "Checkpoint 15" |
      | "marina.user4@testetrousseau.com" | "Checkpoint 3"  | "Primeira Leitura" | "Marina"      | "leitura 2"   | "Checkpoint 13" | "leitura 3"   | "Checkpoint 6"  | "leitura 4"   | "Checkpoint 5"  | "leitura 5"   | "Checkpoint 15" |
      | "marina.user4@testetrousseau.com" | "Checkpoint 4"  | "Primeira Leitura" | "Marina"      | "leitura 2"   | "Checkpoint 12" | "leitura 3"   | "Checkpoint 8"  | "leitura 4"   | "Checkpoint 7"  | "leitura 5"   | "Checkpoint 15" |
      | "marina.user4@testetrousseau.com" | "Checkpoint 5"  | "Primeira Leitura" | "Marina"      | "leitura 2"   | "Checkpoint 11" | "leitura 3"   | "Checkpoint 10" | "leitura 4"   | "Checkpoint 9"  | "leitura 5"   | "Checkpoint 15" |
      | "marina.user4@testetrousseau.com" | "Checkpoint 6"  | "Primeira Leitura" | "Marina"      | "leitura 2"   | "Checkpoint 10" | "leitura 3"   | "Checkpoint 12" | "leitura 4"   | "Checkpoint 11" | "leitura 5"   | "Checkpoint 15" |
      | "marina.user4@testetrousseau.com" | "Checkpoint 7"  | "Primeira Leitura" | "Marina"      | "leitura 2"   | "Checkpoint 9"  | "leitura 3"   | "Checkpoint 14" | "leitura 4"   | "Checkpoint 13" | "leitura 5"   | "Checkpoint 15" |
      | "marina.user4@testetrousseau.com" | "Checkpoint 8"  | "Primeira Leitura" | "Marina"      | "leitura 2"   | "Checkpoint 7"  | "leitura 3"   | "Checkpoint 1"  | "leitura 4"   | "Checkpoint 15" | "leitura 5"   | "Checkpoint 15" |
      | "marina.user4@testetrousseau.com" | "Checkpoint 9"  | "Primeira Leitura" | "Marina"      | "leitura 2"   | "Checkpoint 6"  | "leitura 3"   | "Checkpoint 15" | "leitura 4"   | "Checkpoint 14" | "leitura 5"   | "Checkpoint 15" |
      | "marina.user4@testetrousseau.com" | "Checkpoint 10" | "Primeira Leitura" | "Marina"      | "leitura 2"   | "Checkpoint 5"  | "leitura 3"   | "Checkpoint 9"  | "leitura 4"   | "Checkpoint 12" | "leitura 5"   | "Checkpoint 15" |


  @user5
  Scenario Outline: Criar campanha invetario com 10 mil itens - usuário 5
    Given que o usuário faça o login no Rastro  com o usuario <usuario> e esteja no dashboard
    And ir em inventario e selecionar o submenu campanha
    When acessar uma campanha existente <nome campanha> e realizar a leitura <nome portal> <nome leitura> dos itens
    And voltar aos portais, escolher um novo portal <nome portal2> e realizar leituras <nome leitura2> na mesma campanha por 5vezes em portais diferentes <nome portal3> <nome portal4> <nome portal5> <nome leitura3> <nome leitura4> <nome leitura5>
    Then cada leitura devera ser finalizada com no maximo 1500itens e no total devera ter por volta de 5000itens
    And fechar navegador
    Examples:
      | usuario                          |nome portal        | nome leitura         | nome campanha              | nome leitura2      | nome portal2    | nome leitura3      | nome portal3    | nome leitura4   | nome portal4    | nome leitura5 | nome portal5      |
      |"marina.user5@testetrousseau.com" | "Checkpoint 5"    | "Quinta Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user5@testetrousseau.com" | "Checkpoint 5"    | "Quinta Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user5@testetrousseau.com" | "Checkpoint 5"    | "Quinta Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user5@testetrousseau.com" | "Checkpoint 5"    | "Quinta Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user5@testetrousseau.com" | "Checkpoint 5"    | "Quinta Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user5@testetrousseau.com" | "Checkpoint 5"    | "Quinta Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user5@testetrousseau.com" | "Checkpoint 5"    | "Quinta Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |



  @user6
  Scenario Outline: Criar campanha invetario com 10 mil itens - usuário 6
    Given que o usuário faça o login no Rastro  com o usuario <usuario> e esteja no dashboard
    And ir em inventario e selecionar o submenu campanha
    When acessar uma campanha existente <nome campanha> e realizar a leitura <nome portal> <nome leitura> dos itens
    And voltar aos portais, escolher um novo portal <nome portal2> e realizar leituras <nome leitura2> na mesma campanha por 5vezes em portais diferentes <nome portal3> <nome portal4> <nome portal5> <nome leitura3> <nome leitura4> <nome leitura5>
    Then cada leitura devera ser finalizada com no maximo 1500itens e no total devera ter por volta de 5000itens
    And fechar navegador
    Examples:
      | usuario                          |nome portal        | nome leitura         | nome campanha              | nome leitura2      | nome portal2    | nome leitura3      | nome portal3    | nome leitura4   | nome portal4    | nome leitura5 | nome portal5      |
      |"marina.user6@testetrousseau.com" | "Checkpoint 6"    | "Sexta leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user6@testetrousseau.com" | "Checkpoint 6"    | "Sexta leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user6@testetrousseau.com" | "Checkpoint 6"    | "Sexta leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user6@testetrousseau.com" | "Checkpoint 6"    | "Sexta leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user6@testetrousseau.com" | "Checkpoint 6"    | "Sexta leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user6@testetrousseau.com" | "Checkpoint 6"    | "Sexta leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user6@testetrousseau.com" | "Checkpoint 6"    | "Sexta leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |



  @user7
  Scenario Outline: Criar campanha invetario com 10 mil itens - usuário 7
    Given que o usuário faça o login no Rastro  com o usuario <usuario> e esteja no dashboard
    And ir em inventario e selecionar o submenu campanha
    When acessar uma campanha existente <nome campanha> e realizar a leitura <nome portal> <nome leitura> dos itens
    And voltar aos portais, escolher um novo portal <nome portal2> e realizar leituras <nome leitura2> na mesma campanha por 5vezes em portais diferentes <nome portal3> <nome portal4> <nome portal5> <nome leitura3> <nome leitura4> <nome leitura5>
    Then cada leitura devera ser finalizada com no maximo 1500itens e no total devera ter por volta de 5000itens
    And fechar navegador
    Examples:
      | usuario                          |nome portal        | nome leitura         | nome campanha              | nome leitura2      | nome portal2    | nome leitura3      | nome portal3    | nome leitura4   | nome portal4    | nome leitura5 | nome portal5      |
      |"marina.user7@testetrousseau.com" | "Checkpoint 7"    | "Setima Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user7@testetrousseau.com" | "Checkpoint 7"    | "Setima Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user7@testetrousseau.com" | "Checkpoint 7"    | "Setima Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user7@testetrousseau.com" | "Checkpoint 7"    | "Setima Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user7@testetrousseau.com" | "Checkpoint 7"    | "Setima Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user7@testetrousseau.com" | "Checkpoint 7"    | "Setima Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user7@testetrousseau.com" | "Checkpoint 7"    | "Setima Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |



  @user8
  Scenario Outline: Criar campanha invetario com 10 mil itens - usuário 8
    Given que o usuário faça o login no Rastro  com o usuario <usuario> e esteja no dashboard
    And ir em inventario e selecionar o submenu campanha
    When acessar uma campanha existente <nome campanha> e realizar a leitura <nome portal> <nome leitura> dos itens
    And voltar aos portais, escolher um novo portal <nome portal2> e realizar leituras <nome leitura2> na mesma campanha por 5vezes em portais diferentes <nome portal3> <nome portal4> <nome portal5> <nome leitura3> <nome leitura4> <nome leitura5>
    Then cada leitura devera ser finalizada com no maximo 1500itens e no total devera ter por volta de 5000itens
    And fechar navegador
    Examples:
      | usuario                          |nome portal        | nome leitura         | nome campanha              | nome leitura2      | nome portal2    | nome leitura3      | nome portal3    | nome leitura4   | nome portal4    | nome leitura5 | nome portal5      |
      |"marina.user8@testetrousseau.com" | "Checkpoint 8"    | "Oitava Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user8@testetrousseau.com" | "Checkpoint 8"    | "Oitava Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user8@testetrousseau.com" | "Checkpoint 8"    | "Oitava Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user8@testetrousseau.com" | "Checkpoint 8"    | "Oitava Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user8@testetrousseau.com" | "Checkpoint 8"    | "Oitava Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user8@testetrousseau.com" | "Checkpoint 8"    | "Oitava Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user8@testetrousseau.com" | "Checkpoint 8"    | "Oitava Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |



  @user9
  Scenario Outline: Criar campanha invetario com 10 mil itens - usuário 9
    Given que o usuário faça o login no Rastro  com o usuario <usuario> e esteja no dashboard
    And ir em inventario e selecionar o submenu campanha
    When acessar uma campanha existente <nome campanha> e realizar a leitura <nome portal> <nome leitura> dos itens
    And voltar aos portais, escolher um novo portal <nome portal2> e realizar leituras <nome leitura2> na mesma campanha por 5vezes em portais diferentes <nome portal3> <nome portal4> <nome portal5> <nome leitura3> <nome leitura4> <nome leitura5>
    Then cada leitura devera ser finalizada com no maximo 1500itens e no total devera ter por volta de 5000itens
    And fechar navegador
    Examples:
      | usuario                          |nome portal        | nome leitura         | nome campanha              | nome leitura2      | nome portal2    | nome leitura3      | nome portal3    | nome leitura4   | nome portal4    | nome leitura5 | nome portal5      |
      |"marina.user9@testetrousseau.com" | "Checkpoint 9"    | "Nona Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user9@testetrousseau.com" | "Checkpoint 9"    | "Nona Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user9@testetrousseau.com" | "Checkpoint 9"    | "Nona Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user9@testetrousseau.com" | "Checkpoint 9"    | "Nona Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user9@testetrousseau.com" | "Checkpoint 9"    | "Nona Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user9@testetrousseau.com" | "Checkpoint 9"    | "Nona Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user9@testetrousseau.com" | "Checkpoint 9"    | "Nona Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |



  @user10
  Scenario Outline: Criar campanha invetario com 10 mil itens - usuário 10
    Given que o usuário faça o login no Rastro  com o usuario <usuario> e esteja no dashboard
    And ir em inventario e selecionar o submenu campanha
    When acessar uma campanha existente <nome campanha> e realizar a leitura <nome portal> <nome leitura> dos itens
    And voltar aos portais, escolher um novo portal <nome portal2> e realizar leituras <nome leitura2> na mesma campanha por 5vezes em portais diferentes <nome portal3> <nome portal4> <nome portal5> <nome leitura3> <nome leitura4> <nome leitura5>
    Then cada leitura devera ser finalizada com no maximo 1500itens e no total devera ter por volta de 5000itens
    And fechar navegador
    Examples:
      | usuario                          |nome portal        | nome leitura         | nome campanha              | nome leitura2      | nome portal2    | nome leitura3      | nome portal3    | nome leitura4   | nome portal4    | nome leitura5 | nome portal5      |
      |"marina.user10@testetrousseau.com" | "Checkpoint 10"    | "Decima Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user10@testetrousseau.com" | "Checkpoint 10"    | "Decima Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user10@testetrousseau.com" | "Checkpoint 10"    | "Decima Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user10@testetrousseau.com" | "Checkpoint 10"    | "Decima Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user10@testetrousseau.com" | "Checkpoint 10"    | "Decima Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user10@testetrousseau.com" | "Checkpoint 10"    | "Decima Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user10@testetrousseau.com" | "Checkpoint 10"    | "Decima Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |


  @user11
  Scenario Outline: Criar campanha invetario com 10 mil itens - usuário 11
    Given que o usuário faça o login no Rastro  com o usuario <usuario> e esteja no dashboard
    And ir em inventario e selecionar o submenu campanha
    When acessar uma campanha existente <nome campanha> e realizar a leitura <nome portal> <nome leitura> dos itens
    And voltar aos portais, escolher um novo portal <nome portal2> e realizar leituras <nome leitura2> na mesma campanha por 5vezes em portais diferentes <nome portal3> <nome portal4> <nome portal5> <nome leitura3> <nome leitura4> <nome leitura5>
    Then cada leitura devera ser finalizada com no maximo 1500itens e no total devera ter por volta de 5000itens
    And fechar navegador
    Examples:
      | usuario                          |nome portal        | nome leitura         | nome campanha              | nome leitura2      | nome portal2    | nome leitura3      | nome portal3    | nome leitura4   | nome portal4    | nome leitura5 | nome portal5      |
      |"marina.user11@testetrousseau.com" | "Checkpoint 11"    | "Decima Primeira Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user11@testetrousseau.com" | "Checkpoint 11"    | "Decima Primeira Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user11@testetrousseau.com" | "Checkpoint 11"    | "Decima Primeira Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user11@testetrousseau.com" | "Checkpoint 11"    | "Decima Primeira Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user11@testetrousseau.com" | "Checkpoint 11"    | "Decima Primeira Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user11@testetrousseau.com" | "Checkpoint 11"    | "Decima Primeira Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user11@testetrousseau.com" | "Checkpoint 11"    | "Decima Primeira Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |



  @user12
  Scenario Outline: Criar campanha invetario com 10 mil itens - usuário 12
    Given que o usuário faça o login no Rastro  com o usuario <usuario> e esteja no dashboard
    And ir em inventario e selecionar o submenu campanha
    When acessar uma campanha existente <nome campanha> e realizar a leitura <nome portal> <nome leitura> dos itens
    And voltar aos portais, escolher um novo portal <nome portal2> e realizar leituras <nome leitura2> na mesma campanha por 5vezes em portais diferentes <nome portal3> <nome portal4> <nome portal5> <nome leitura3> <nome leitura4> <nome leitura5>
    Then cada leitura devera ser finalizada com no maximo 1500itens e no total devera ter por volta de 5000itens
    And fechar navegador
    Examples:
      | usuario                          |nome portal        | nome leitura         | nome campanha              | nome leitura2      | nome portal2    | nome leitura3      | nome portal3    | nome leitura4   | nome portal4    | nome leitura5 | nome portal5      |
      |"marina.user12@testetrousseau.com" | "Checkpoint 12"    | "Decima Segunda Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user12@testetrousseau.com" | "Checkpoint 12"    | "Decima Segunda Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user12@testetrousseau.com" | "Checkpoint 12"    | "Decima Segunda Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user12@testetrousseau.com" | "Checkpoint 12"    | "Decima Segunda Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user12@testetrousseau.com" | "Checkpoint 12"    | "Decima Segunda Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user12@testetrousseau.com" | "Checkpoint 12"    | "Decima Segunda Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user12@testetrousseau.com" | "Checkpoint 12"    | "Decima Segunda Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |



  @user13
  Scenario Outline: Criar campanha invetario com 10 mil itens - usuário 13
    Given que o usuário faça o login no Rastro  com o usuario <usuario> e esteja no dashboard
    And ir em inventario e selecionar o submenu campanha
    When acessar uma campanha existente <nome campanha> e realizar a leitura <nome portal> <nome leitura> dos itens
    And voltar aos portais, escolher um novo portal <nome portal2> e realizar leituras <nome leitura2> na mesma campanha por 5vezes em portais diferentes <nome portal3> <nome portal4> <nome portal5> <nome leitura3> <nome leitura4> <nome leitura5>
    Then cada leitura devera ser finalizada com no maximo 1500itens e no total devera ter por volta de 5000itens
    And fechar navegador
    Examples:
      | usuario                          |nome portal        | nome leitura         | nome campanha              | nome leitura2      | nome portal2    | nome leitura3      | nome portal3    | nome leitura4   | nome portal4    | nome leitura5 | nome portal5      |
      |"marina.user13@testetrousseau.com" | "Checkpoint 13"    | "Decima Terceira Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user13@testetrousseau.com" | "Checkpoint 13"    | "Decima Terceira Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user13@testetrousseau.com" | "Checkpoint 13"    | "Decima Terceira Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user13@testetrousseau.com" | "Checkpoint 13"    | "Decima Terceira Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user13@testetrousseau.com" | "Checkpoint 13"    | "Decima Terceira Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user13@testetrousseau.com" | "Checkpoint 13"    | "Decima Terceira Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user13@testetrousseau.com" | "Checkpoint 13"    | "Decima Terceira Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |



  @user14
  Scenario Outline: Criar campanha invetario com 10 mil itens - usuário 14
    Given que o usuário faça o login no Rastro  com o usuario <usuario> e esteja no dashboard
    And ir em inventario e selecionar o submenu campanha
    When acessar uma campanha existente <nome campanha> e realizar a leitura <nome portal> <nome leitura> dos itens
    And voltar aos portais, escolher um novo portal <nome portal2> e realizar leituras <nome leitura2> na mesma campanha por 5vezes em portais diferentes <nome portal3> <nome portal4> <nome portal5> <nome leitura3> <nome leitura4> <nome leitura5>
    Then cada leitura devera ser finalizada com no maximo 1500itens e no total devera ter por volta de 5000itens
    And fechar navegador
    Examples:
      | usuario                          |nome portal        | nome leitura         | nome campanha              | nome leitura2      | nome portal2    | nome leitura3      | nome portal3    | nome leitura4   | nome portal4    | nome leitura5 | nome portal5      |
      |"marina.user14@testetrousseau.com" | "Checkpoint 14"    | "Decima Quarta Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user14@testetrousseau.com" | "Checkpoint 14"    | "Decima Quarta Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user14@testetrousseau.com" | "Checkpoint 14"    | "Decima Quarta Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user14@testetrousseau.com" | "Checkpoint 14"    | "Decima Quarta Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user14@testetrousseau.com" | "Checkpoint 14"    | "Decima Quarta Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user14@testetrousseau.com" | "Checkpoint 14"    | "Decima Quarta Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user14@testetrousseau.com" | "Checkpoint 14"    | "Decima Quarta Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |



  @user15
  Scenario Outline: Criar campanha invetario com 5 mil itens - usuário 15
    Given que o usuário faça o login no Rastro  com o usuario <usuario> e esteja no dashboard
    And ir em inventario e selecionar o submenu campanha
    When acessar uma campanha existente <nome campanha> e realizar a leitura <nome portal> <nome leitura> dos itens
    And voltar aos portais, escolher um novo portal <nome portal2> e realizar leituras <nome leitura2> na mesma campanha por 5vezes em portais diferentes <nome portal3> <nome portal4> <nome portal5> <nome leitura3> <nome leitura4> <nome leitura5>
    Then cada leitura devera ser finalizada com no maximo 1500itens e no total devera ter por volta de 5000itens
    And fechar navegador
    Examples:
      | usuario                          |nome portal        | nome leitura         | nome campanha              | nome leitura2      | nome portal2    | nome leitura3      | nome portal3    | nome leitura4   | nome portal4    | nome leitura5 | nome portal5      |
      |"marina.user15@testetrousseau.com" | "Checkpoint 15"    | "Decima Quinta Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user15@testetrousseau.com" | "Checkpoint 15"    | "Decima Quinta Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user15@testetrousseau.com" | "Checkpoint 15"    | "Decima Quinta Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user15@testetrousseau.com" | "Checkpoint 15"    | "Decima Quinta Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user15@testetrousseau.com" | "Checkpoint 15"    | "Decima Quinta Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user15@testetrousseau.com" | "Checkpoint 15"    | "Decima Quinta Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |
      |"marina.user15@testetrousseau.com" | "Checkpoint 15"    | "Decima Quinta Leitura"   | "Marina"                   | "leitura 2"        | "Checkpoint 6"  | "leitura 3"        | "Checkpoint 10"  | "leitura 4"     | "Checkpoint 14" | "leitura 5"   | "Checkpoint 12"   |


@impressaoavulsatrousseau
Scenario Outline: gerar varias imporessoes avulsa e baixar o csv
  Given que o usuário faça o login no Rastro  com o usuario <usuario> e esteja no dashboard
  When ir em impressoes e selecionar a aba Impressao Avulsa
  And preencher as informacoes da impressao Avulsa  <SKU> <quantidade>
  And fechar navegador
  Examples:
    | usuario                           | SKU              | quantidade |
    | "marina.user1@testetrousseau.com" | "07908780808478" | "70"       |
    | "marina.user1@testetrousseau.com" | "07908780808485" | "70"       |
    | "marina.user1@testetrousseau.com" | "07908780808492" | "70"       |
    | "marina.user1@testetrousseau.com" | "07908780808508" | "70"       |
    | "marina.user1@testetrousseau.com" | "07908780808515" | "70"       |
    | "marina.user1@testetrousseau.com" | "07908780808522" | "70"       |
    | "marina.user1@testetrousseau.com" | "07908780808539" | "70"       |
    | "marina.user1@testetrousseau.com" | "07908780808546" | "70"       |
    | "marina.user1@testetrousseau.com" | "07908780808553" | "70"       |
    | "marina.user1@testetrousseau.com" | "07908780808560" | "70"       |
    | "marina.user1@testetrousseau.com" | "07908780808577" | "70"       |
    | "marina.user1@testetrousseau.com" | "07908780808584" | "70"       |
    | "marina.user1@testetrousseau.com" | "07908780808591" | "70"       |
    | "marina.user1@testetrousseau.com" | "07908780808607" | "70"       |
    | "marina.user1@testetrousseau.com" | "07908780808614" | "70"       |
