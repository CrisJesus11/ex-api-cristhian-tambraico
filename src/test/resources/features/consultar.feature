Feature: Consultar

  @test1
  Scenario: Consultar game
    When tengo los parametros platform "pc",category "shooter"
    Then el codigo de respuesta es 200