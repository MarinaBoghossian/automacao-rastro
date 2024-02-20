
@loginrastro
Feature: Login no Rastro
  I want to use this template for my feature file


  @login
  Scenario: Positivo - Login no Rastro
    Given que o usuario acesse a url
    And fazer o login com dados validos
    When escolher o site
    Then sera exibido o Dashboard

  @recuperacaosenha
  Scenario: Recuperação de Senha no Rastro
    Given que o usuario acesse a url
    When clicar no botao Esqueceu a senha e inserir o email para recuperacao de senha
    Then sera exibido o a mensagem e o email de recuparecao sera enviado para o endereco informado

  @senhainvalida
  Scenario: Negativo - tentativa de login com senha incorreta
    Given que o usuario acesse a url
    And fazer o login com email correto e senha incorreta
    When clicar no botao entrar
    Then sera exibido o alerta de credenciais invalidas

  @emailnaocadastrado
  Scenario: Negativo - tentativa de login com email nao cadastrado
    Given que o usuario acesse a url
    And fazer o login com email nao cadastrado e senha
    When clicar no botao entrar
    Then sera exibido o alerta de credenciais invalidas

  @loginsemsite
  Scenario: Negativo - tentativa de login sem selecionar um site
    Given que o usuario acesse a url
    When fazer o login com dados validos
    And não selecionar um site
    Then não deverá ser permitido seguir para o dashboard

  @senhaanteriorredefinida
  Scenario: Negativo - Tentativa de login com senha anterior a redefinida
    Given que o usuário resete sua senha
    When fizer o login novamente utilizando a senha antiga
    Then sera exibido o alerta de credenciais invalidas

  @recuperacaosenhasemcadastro
  Scenario: Negativo - Tentativa de recuperação de Senha no Rastro com um e-mail sem cadastro
    Given que o usuario acesse a url
    When clicar no botao Esqueceu a senha e inserir um email não cadstrao para recuperacao de senha
    Then sera exibido o alerta de que o usuario nao foi encontrado

  @redefiniçãodesenha
  Scenario: Positivo - Login com senha redefinida
    Given que o usuário resete sua senha
    When fizer o login com a nova senha e escolher o site
    Then sera exibido o Dashboard

  @redefinirsemconfirmacaodesenha
  Scenario: Negativo - Redefinição de senha sem preencher o campo confirmação de senha
    Given que o usuario esteja na redefinicao de senha
    When preencher os dados e NAO preencher a confirmacao de senha
    Then o botao salvar nao sera habilitado e a senha nao sera redefinida







