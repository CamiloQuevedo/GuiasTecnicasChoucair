# Autor: Camilo Quevedo

  @stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate in screamplay at the Choucair Academy with the automation course

  @scenario1
  Scenario: Search for a automation course
    Given than Lorena wants to learn automation at the Academy Choucair
      | strUser    | strPassword  |
      | 1121939957 | Choucair2021* |
    When he search for the course Workshop de Automatizacion on the Choucair academy platform
      | strCourse                  |
      | Workshop de Automatizacion |
    Then he finds the course called resources Workshop de Automatizacion
      | strFinalText                                                            |
      | Workshop de Automatización |


