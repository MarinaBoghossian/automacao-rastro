Feature: Run de testes no Rastro app
  I want to use this template for my feature file


  @cadastroprodutoGS1
  Scenario: Cadastro de produto Tenant por GS1
    Given que o usuário faça o login no Rastro e esteja no dashboard
    When ir em cadastro e selecionar a aba produtos
    And ele ira selecionar novo e preencher os campos obrigatorios
    Then sera exibida a mensagem O produto foi cadastrado com sucesso
    And retornar a listagem e buscar o produto pela descricao
    And o produto cadastrado deve constar na listagem de produtos


  @cadastrosite
  Scenario: Cadastro de site
    Given que o usuário faça o login no Rastro e esteja no dashboard
    When ir em cadastro e selecionar a aba sites
    And clilcar em novo e inserir os dados solicitados
    Then aparecera a mensagem "O site foi cadastrado com sucesso!"


  @cadastroleitor
  Scenario: Cadastro de Leitor
    Given que o usuário faça login no Rastro e esteja no dashboard
    When ir em cadastro e selecionar a aba leitores
    And clicar em novo e inserir os dados do leitor
    Then o leitor será cadastrado com sucesso

  @cadastrospooler
  Scenario: Cadastro de Spooler
    Given que o usuário faça o login no Rastro e esteja no dashboard
    When ir em cadastro e selecionar a aba Spoolers de Impressão
    And clicar em novo e inserir as informaçoes do novo Spooler
    Then o Spooler será cadastrado com sucesso
  @cadastrocheckpoint
  Scenario: Cadastro de Checkpoint
    Given que o usuário faça o login no Rastro e esteja no dashboard
    When ir em cadastro e selecionar a aba Checkpoints
    And clicar em novo e inserir as informacoes do novo checkpoint
    Then o checkpoint será cadastrado com sucesso


  @cadastroetiquetaitem
  Scenario: Cadastro de Etiqueta por Item
    Given que o usuário faça o login no Rastro e esteja no dashboard
    When ir em cadastro, selecionar a aba Etiquetas e selecionar Item
    And clicar em novo e inserir as informacoes da nova etiqueta
    Then a etiqueta por item sera cadastrada com sucesso

  @cadastroetiquetaagregacao
  Scenario: Cadastro de Etiqueta por Agregação
    Given que o usuário faça login no Rastro e esteja no dashboard
    When ir em cadastro, selecionar a aba Etiquetas e selecionar agregacao
    And  clicar em novo e inserir as informacoes da nova etiqueta
    Then a etiqueta por item sera cadastrada com sucesso


  @cadastroportal
  Scenario: Cadastro de Portal
    Given que o usuário faça login no Rastro e esteja no dashboard
    When ir em cadastro e selecionar a aba Portal
    And clicar em novo e inserir as informacoes do novo portal
    Then o portal será cadastrado com sucesso

  @cadastrousuario
  Scenario: Cadastro de Usuario
    Given que o usuário faça o login no Rastro e esteja no dashboard
    When ir em cadastro e selecionar a aba Usuarios
    And clicar em novo e inserir as informacoes do novo usuario
    Then o usuario será cadastrado com sucesso


  @cadastroprodutosemSKU
  Scenario: Tentativa de cadastro de produto sem preencher SKU
    Given que o usuário faça o login no Rastro e esteja no dashboard
    When ir em cadastro e selecionar a aba produtos
    And selecionar novo e preencher todos os campos obrigatorios exceto SKU
    Then o botao salvar nao devera ser habilitado sem SKU

  @cadastroprodutosemGTIN
  Scenario: Tentativa de cadastro de produto sem preencher GTIN
    Given que o usuário faça o login no Rastro e esteja no dashboard
    When ir em cadastro e selecionar a aba produtos
    And selecionar novo e preencher todos os campos obrigatorios exceto GTIN
    Then o botao salvar nao devera ser habilitado sem GTIN

  @cadastroprodutosemdescricao
  Scenario: Tentativa de cadastro de produto sem preencher Descrição
    Given que o usuário faça o login no Rastro e esteja no dashboard
    When ir em cadastro e selecionar a aba produtos
    And selecionar novo e preencher todos os campos obrigatorios exceto descricao
    Then o botao salvar nao devera ser habilitado sem descricao

  @cadastroprodutosemcategoria
  Scenario: Tentativa de cadastro de produto sem preencher categoria
    Given que o usuário faça o login no Rastro e esteja no dashboard
    When ir em cadastro e selecionar a aba produtos
    And selecionar novo e preencher todos os campos obrigatorios exceto categoria
    Then o botao salvar nao devera ser habilitado sem categoria





  @cadastroSKUigualkç
  Scenario: Tentativa de cadastro de produto com um SKU já cadastrado
    Given que o usuário faça o login no Rastro e esteja no dashboard
    When ir em cadastro e selecionar a aba produtos
    And ele ira selecionar novo e preencher os campos obrigatorios com um SKU ja cadastrado anteriomente
    Then sera exibida a mensagem que O cadastro do produto ja existe

  @casastroGTINigual
  Scenario: Tentativa de cadastro de produto com um GTIN já cadastrado
    Given que o usuário faça o login no Rastro e esteja no dashboard
    When ir em cadastro e selecionar a aba produtos
    And ele ira selecionar novo e preencher os campos obrigatorios com um GTIN ja cadastrado anteriomente
    Then sera exibida a mensagem que O cadastro do produto ja existe


  @excluirproduto
  Scenario: Exclusão de produto
    Given que tenha um produto cadastrado
    When o usuário excluir o produto
    Then ele nao devera aparecer mais na lista

  @cadastroprodutoexcluido
  Scenario: Inclusão de um produto que foi excluido anteriormente
    Given que tenha um produto cadastrado
    And o usuário excluir o produto
    When ele incluir novamente o produto com os mesmos dados do anterior
    Then o produto devera ser cadastrado com sucesso e ser exibido na lista



  @edicaoprodutoSKUusuarioadmin
  Scenario: Edição do SKU do produto com usuario admin
    Given que tenha um produto cadastrado
    When o usuário for editar o SKU do produto
    Then devera aparecer a mensagem 'O produto foi atualizado com sucesso!'

  @edicaoprodutodescricaousuarioadmin
  Scenario: Edição da descricao do produto com usuario admin
    Given que tenha um produto cadastrado
    When o usuário for editar a descricao do produto
    Then devera aparecer a mensagem 'O produto foi atualizado com sucesso!'

  @edicaoprodutocategoriausuarioadmin
  Scenario: Edição da categoria do produto com usuario admin
    Given que tenha um produto cadastrado
    When o usuário for editar a categoria do produto
    Then devera aparecer a mensagem 'O produto foi atualizado com sucesso!'



  @edicaoprodutoSKUjacadastrado
  Scenario: Edição do SKU do produto com um SKU já cadastrado em outro produto
    Given que tenha um produto cadastrado
    When o usuário for editar o SKU do produto
    Then devera aparecer a mensagem 'O produto cadastrado já existe! Por favor, verifique os dados inseridos!'


  @cadastroprodutoporarquivo
  Scenario: Cadastro de produto por arquivo
    Given que o usuário faça o login no Rastro e esteja no dashboard
    When ir em cadastro e selecionar a aba produtos
    And selecionar +Arquivo e fazer o upload do arquivo
    Then sera exibida a mensagem 'Arquivo enviado com sucesso'
    And o produto cadastrado deve constar na listagem de produtos


  @cricaodenovacampanha
  Scenario: Criação de uma nova campanha de inventário
    Given  que o usuário faça o login no Rastro e esteja no dashboard
    And ir em inventario e selecionar o submenu campanha
    When clicar em novo e inserir o nome da campanha
    Then clicar em salvar e a nova campanha será criada

  @campanhateste
  Scenario Outline: Fazer uma leitura uma campanha de inventario já existente
    Given que o usuário faça o login no Rastro  com o usuario <usuario> e esteja no dashboard
    And ir em inventario e selecionar o submenu campanha
    When acessar uma campanha existente <nome campanha> e realizar a leitura <nome portal> <nome leitura> dos itens
    Then fechar navegador
    Examples:
      | usuario|nome portal | nome leitura | nome campanha            |
      |"marina.user1@testetrousseau.com"| "Checkpoint 1"    | "leitura 1"   | "Marina" |

