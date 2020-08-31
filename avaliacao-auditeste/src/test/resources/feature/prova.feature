#Author: junior@gmail.com
Feature: Prova AudiTeste
  Como candidato 
  Quero navegar nos menus e submenus
  Para entregar a prova

  Background: Acessa o site
    Given que eu acesse o site


  Scenario Outline: Validacao dos menus superiores
    When clicar no <menu> no header do site
    Then valido <pagina> acessada

    Examples: 
     |menu                | pagina                           |
     | "Quem somos"       | "Quem somos - Auditeste"          |
     | "Cases de Sucesso" | "Cases de Sucesso - Auditeste"    |
     | "Trabalhe Conosco" | "Trabalhe Conosco - Auditeste"    |
     | "Blog"             | "Blog - Auditeste"                |
    
