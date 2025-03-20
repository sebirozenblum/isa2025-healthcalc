@tag
Feature: Ideal weight calculation
  As a user I want to calculate my ideal weight so that I can have a healthy life

  @tag1
  Scenario Outline: Calculando el ideal weight correctamente para genero femenino
    Given tengo una calculadora de salud
    And un genero <genero>
    And una altura <altura>
    When calculo el ideal weight
    Then el sistema devuelve <value>

    Examples:
      | genero | altura | value |
      | 'w'    | 155    | 53.0  |
      | 'w'    | 160    | 56.0  |
      | 'w'    | 165    | 59.0  |
      | 'w'    | 170    | 62.0  |
      | 'w'    | 175    | 65.0  |
      | 'w'    | 180    | 68.0  |

  @tag2
  Scenario Outline: Calculando el ideal weight correctamente para genero masculino
    Given tengo una calculadora de salud
    And un genero <genero>
    And una altura <altura>
    When calculo el ideal weight
    Then el sistema devuelve <value>

    Examples:
      | genero | altura | value |
      | 'm'    | 175    | 69.0  |
      | 'm'    | 180    | 73.0  |
      | 'm'    | 185    | 77.0  |
      | 'm'    | 190    | 80.0  |
      | 'm'    | 195    | 84.0  |
      | 'm'    | 200    | 88.0  |

  @tag3
  Scenario: Calculando el ideal weight con altura cero
    Given tengo una calculadora de salud
    When calculo el ideal weight con altura igual a cero
    Then el sistema lanza una Exception

  @tag4
  Scenario Outline: Calculando el ideal weight con altura negativa
    Given tengo una calculadora de salud
    When calculo el ideal weight con altura negativa <altura>
    Then el sistema lanza una Exception

    Examples:
      | altura |
      | -1     |
      | -5     |
      | -120   |

  @tag5
  Scenario Outline: Calculando el ideal weight con altura positiva pequeña
    Given tengo una calculadora de salud
    When calculo el ideal weight con altura positiva pequeña <altura>
    Then el sistema lanza una Exception

    Examples:
      | altura |
      | 10     |
      | 15     |
      | 20     |
      | 25     |

  @tag6
  Scenario Outline: Calculando el ideal weight con altura positiva grande
    Given tengo una calculadora de salud
    When calculo el ideal weight con altura positiva grande <altura>
    Then el sistema lanza una Exception

    Examples:
      | altura  |
      | 250     |
      | 275     |
      | 300     |
      | 500     |

  @tag7
  Scenario Outline: Calculando el ideal weight con genero no valido
      Given tengo una calculadora de salud
      When calculo el ideal weight con genero no valido <genero>
      Then el sistema lanza una Exception

   	Examples:
      | genero  |
      | 'a'     |
      | 'b'     |
      | 'c'     |

