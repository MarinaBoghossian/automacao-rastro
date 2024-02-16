
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







