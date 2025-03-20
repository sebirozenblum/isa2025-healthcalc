@tag
Feature: Basal metabolic rate calculation
  As a user I want to calculate my basal metabolic rate (BMR) so that I can know more about my metabolism

  @tag1
  Scenario Outline: Calculando el BMR correctamente para genero femenino
    Given tengo una calculadora de salud
    And un peso <peso>
    And una altura <altura>
    And una edad <edad>
    And un genero <genero>
    When calculo el BMR
    Then el sistema devuelve <value>

    Examples:
      | peso    | altura   | edad  | genero | value  |
      | 50.0    | 150      | 20    | 'w'    | 1288   |
      | 55.0    | 155      | 25    | 'w'    | 1328   |
      | 60.0    | 160      | 30    | 'w'    | 1368   |
      | 65.0    | 165      | 35    | 'w'    | 1408   |
      | 70.0    | 170      | 40    | 'w'    | 1448   |
      | 75.0    | 175      | 45    | 'w'    | 1488   |

  @tag2
  Scenario Outline: Calculando el BMR correctamente para genero masculino
    Given tengo una calculadora de salud
    And un peso <peso>
    And una altura <altura>
    And una edad <edad>
    And un genero <genero>
    When calculo el BMR
    Then el sistema devuelve <value>

    Examples:
      | peso    | altura   | edad  | genero | value  |
      | 70.0    | 170      | 30    | 'm'    | 1672   |
      | 75.0    | 175      | 35    | 'm'    | 1734   |
      | 80.0    | 180      | 40    | 'm'    | 1797   |
      | 85.0    | 185      | 45    | 'm'    | 1859   |
      | 90.0    | 190      | 50    | 'm'    | 1922   |
      | 95.0    | 195      | 55    | 'm'    | 1985   |

  @tag3
  Scenario: Calculando el BMR con altura cero
    Given tengo una calculadora de salud
    When calculo el BMR con altura igual a cero
    Then el sistema lanza una Exception

  @tag4
  Scenario Outline: Calculando el BMR con altura negativa
    Given tengo una calculadora de salud
    When calculo el BMR con altura negativa <altura>
    Then el sistema lanza una Exception

    Examples:
      | altura |
      | -1     |
      | -5     |
      | -120   |

  @tag5
  Scenario Outline: Calculando el BMR con altura positiva pequeña
    Given tengo una calculadora de salud
    When calculo el BMR con altura positiva pequeña <altura>
    Then el sistema lanza una Exception

    Examples:
      | altura |
      | 10     |
      | 15     |
      | 20     |
      | 25     |

  @tag6
  Scenario Outline: Calculando el BMR con altura positiva grande
    Given tengo una calculadora de salud
    When calculo el BMR con altura positiva grande <altura>
    Then el sistema lanza una Exception

    Examples:
      | altura  |
      | 250     |
      | 275     |
      | 300     |
      | 500     |

  @tag7
  Scenario Outline: Calculando el BMR con genero no valido
    Given tengo una calculadora de salud
    When calculo el BMR con genero no valido <genero>
    Then el sistema lanza una Exception

    Examples:
      | genero  |
      | 'a'     |
      | 'b'     |
      | 'c'     |

  @tag8
  Scenario: Calculando el BMR con peso cero
    Given tengo una calculadora de salud
    When calculo el BMR con peso igual a cero
    Then el sistema lanza una Exception

  @tag9
  Scenario Outline: Calculando el BMR con peso negativo
    Given tengo una calculadora de salud
    When calculo el BMR con peso negativo <peso>
    Then el sistema lanza una Exception

    Examples:
      | peso   |
      | -1     |
      | -5     |
      | -120   |

  @tag10
  Scenario Outline: Calculando el BMR con peso positivo grande
    Given tengo una calculadora de salud
    When calculo el BMR con peso positivo grande <peso>
    Then el sistema lanza una Exception

    Examples:
      | peso  |
      | 250     |
      | 275     |
      | 300     |
      | 500     |

  @tag11
  Scenario: Calculando el BMR con edad cero
    Given tengo una calculadora de salud
    When calculo el BMR con edad igual a cero
    Then el sistema lanza una Exception

  @tag12
  Scenario Outline: Calculando el BMR con edad negativa
    Given tengo una calculadora de salud
    When calculo el BMR con edad negativa <edad>
    Then el sistema lanza una Exception

    Examples:
      | edad |
      | -1     |
      | -5     |
      | -45   |

  @tag13
  Scenario Outline: Calculando el BMR con edad positiva grande
    Given tengo una calculadora de salud
    When calculo el BMR con edad positiva grande <edad>
    Then el sistema lanza una Exception

    Examples:
      | edad  |
      | 250     |
      | 275     |
      | 300     |
      | 500     |