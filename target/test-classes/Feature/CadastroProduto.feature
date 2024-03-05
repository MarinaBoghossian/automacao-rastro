
@cadastros
Feature: Cadastros no Rastro app
  I want to use this template for my feature file



  @cadastroprodutoGS1
  Scenario: Cadastro de produto Tenant por GS1
    Given que o usuário faça o login no Rastro e esteja no dashboard
    When ir em cadastro e selecionar a aba produtos
    And ele ira selecionar novo e preencher os campos obrigatorios
    Then sera exibida a mensagem O produto foi cadastrado com sucesso

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

  @cadastroimpressora
  Scenario: Cadastro de Impressora
    Given que o usuário faça o login no Rastro e esteja no dashboard
    When ir em cadastro e selecionar a aba Impressoras
    And clicar em novo e inserir as informacoes da nova impressora
    Then a impressora será cadastrada com sucesso

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

  @cadastroprodutosemprefixo
  Scenario: Tentativa de cadastro de produto sem preencher prefixo
    Given que o usuário faça o login no Rastro e esteja no dashboard
    When ir em cadastro e selecionar a aba produtos
    And selecionar novo e preencher todos os campos obrigatorios exceto prefixo
    Then o botao salvar nao devera ser habilitado sem o prefixo

  @cadastroprodutousuarionotadm
  Scenario: Tentativa de cadastro de produto com um usuário not admin
    Given que o usuário não administrador faça login no rastro e esteja no dashboard
    When ir em cadastro e selecionar a aba produtos
    And ele ira selecionar novo e preencher os campos obrigatorios
    Then nao sera permitido cadastrar o produto

    @validacaocadastroprodutobuscadescricao
    Scenario: Validação de listagem e busca do produto após o cadastro
      Given que o usuario cadastre um produto
      When retornar a listagem e buscar o produto pela descricao
      Then o produto cadastrado deve constar na listagem de produtos

    @cadastroSKUigual
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

  @excluirproduto
  Scenario: Negativo - Exclusão de produto com usuario not-admin
    Given que um usuário not-admin faça login acesse um produto cadastrado
    When o usuário tentar excluir o produto
    Then ele nao devera ter permissao para excluir

  @edicaoprodutoGTINusuarioadmin
  Scenario: Edição do GTIN do produto com usuario admin
    Given que tenha um produto cadastrado
    When o usuário for editar o GTIN do produto
    Then devera aparecer a mensagem 'O produto foi atualizado com sucesso!'

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

  @edicaoprodutoprefixousuarioadmin
  Scenario: Edição do prefixo do produto com usuario admin
    Given que tenha um produto cadastrado
    When o usuário for editar o prefixo do produto
    Then devera aparecer a mensagem 'O produto foi atualizado com sucesso!'

  @edicaoprodutoGTINusuarionotadmin
  Scenario: Edição do GTIN do produto com usuario not admin
    Given que um usuário not-admin faça login acesse um produto cadastrado
    When o usuário for editar o GTIN do produto
    Then devera aparecer a mensagem 'Esse perfil não tem permissão para realizar esta operação!'

  @edicaoprodutoSKUNusuarionotadmin
  Scenario: Edição do SKU do produto com usuario not admin
    Given que um usuário not-admin faça login acesse um produto cadastrado
    When o usuário for editar o SKU do produto
    Then devera aparecer a mensagem 'Esse perfil não tem permissão para realizar esta operação!'

  @edicaoprodutodescricaousuarionotadmin
  Scenario: Edição da descricao do produto com usuario not admin
    Given que um usuário not-admin faça login acesse um produto cadastrado
    When o usuário for editar a descricao do produto
    Then devera aparecer a mensagem 'Esse perfil não tem permissão para realizar esta operação!'

  @edicaoprodutocategoriaNusuarionotadmin
  Scenario: Edição da categoria do produto com usuario not admin
    Given que um usuário not-admin faça login acesse um produto cadastrado
    When o usuário for editar a categoria do produto
    Then devera aparecer a mensagem 'Esse perfil não tem permissão para realizar esta operação!'

  @edicaoprodutoprefixousuarionotadmin
  Scenario: Edição do GTIN do produto com usuario not admin
    Given que um usuário not-admin faça login acesse um produto cadastrado
    When o usuário for editar o prefixo do produto
    Then devera aparecer a mensagem 'Esse perfil não tem permissão para realizar esta operação!'

  @edicaoprodutoGTINjacadastrado
  Scenario: Edição do GTIN do produto com um GTIN já cadastrado em outro produto
    Given que tenha um produto cadastrado
    When o usuário for editar o GTIN do produto
    Then devera aparecer a mensagem 'O produto cadastrado já existe! Por favor, verifique os dados inseridos!'

  @edicaoprodutoSKUjacadastrado
  Scenario: Edição do SKU do produto com um SKU já cadastrado em outro produto
    Given que tenha um produto cadastrado
    When o usuário for editar o SKU do produto
    Then devera aparecer a mensagem 'O produto cadastrado já existe! Por favor, verifique os dados inseridos!'












